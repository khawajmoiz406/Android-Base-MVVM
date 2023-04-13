package com.centerpoint.connect.ui.global.service_info.add_repair

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.view.View
import androidx.activity.result.ActivityResult
import com.centerpoint.connect.R
import com.centerpoint.connect.base.BaseFragment
import com.centerpoint.connect.base.BaseViewModel
import com.centerpoint.connect.constants.DROP_LOCATION_REQUEST_CODE
import com.centerpoint.connect.databinding.FragmentAddRepairBinding
import com.centerpoint.connect.models.helper.ResponseCallback
import com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailFragment
import com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailViewModel
import com.centerpoint.connect.util.PermissionUtils
import com.centerpoint.connect.util.PermissionUtils.cameraPermissions

class AddRepairFragment : BaseFragment<FragmentAddRepairBinding>() {

    override fun getViewModel(): BaseViewModel = viewModel
    override fun getLayoutId(): Int = R.layout.fragment_add_repair
    override fun title(): String = getString(R.string.repair_heading)
    override fun showBackButton(): Boolean = true

    private lateinit var viewModel: ServiceInfoDetailViewModel

    override fun onAttach(context: Context) {
        super.onAttach(context)
        viewModel = (parentFragment as ServiceInfoDetailFragment).viewModel
    }

    override fun onPermissionsLauncherResult(permission: Map<String, Boolean>) {
        checkPermissionAndLaunchCamera()
    }

    override fun onCameraLauncherResult(result: ActivityResult) {
        onCaptureResult(result)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() {
    }

    private fun checkPermissionAndLaunchCamera() {
        if (!PermissionUtils.allPermissionsGranted(requireActivity(), cameraPermissions))
            onApiResponse(ResponseCallback.getErrorCallback(getString(R.string.you_must_accept_permission)))
        else openCamera()
    }

    private fun openCamera() {
        val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        cameraActivityLauncher.launch(cameraIntent)
    }

    private fun onCaptureResult(it: ActivityResult) {
        if (it.resultCode == Activity.RESULT_OK && it.data != null) {
            val bitmap = it.data?.extras?.get("data") as Bitmap?
            bitmap?.let {
                Log.i("Capture Result:", "SUCCESS")
                viewModel.addRepairRequestParams.repairBitmap.set(it)
            } ?: Log.i("Capture Result:", "FAILED")
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        viewModel.addRepairRequestParams.clearFields()
    }

    /*
     * CLICK LISTENERS
     */
    fun onCameraClicked() = permissionActivityLauncher.launch(cameraPermissions)

    fun onNextClicked() = (parentFragment as ServiceInfoDetailFragment).apply {
        replaceFragmentAccordingly(DROP_LOCATION_REQUEST_CODE)
    }

}