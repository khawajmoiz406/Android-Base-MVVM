package com.centerpoint.connect.ui.global.service_info.repairs

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
import com.centerpoint.connect.constants.PROBLEM_PICTURE
import com.centerpoint.connect.constants.REPAIR_DETAIL_REQUEST_CODE
import com.centerpoint.connect.constants.RESOLUTION_PICTURE
import com.centerpoint.connect.constants.REVIEW_WORK_REQUEST_CODE
import com.centerpoint.connect.databinding.FragmentRepairDetailBinding
import com.centerpoint.connect.models.helper.RepairTab
import com.centerpoint.connect.models.helper.ResponseCallback
import com.centerpoint.connect.models.response.repair.Repair
import com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailFragment
import com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailViewModel
import com.centerpoint.connect.util.PermissionUtils
import com.centerpoint.connect.util.PermissionUtils.cameraPermissions

class RepairsDetailFragment : BaseFragment<FragmentRepairDetailBinding>() {

    override fun getViewModel(): BaseViewModel = viewModel
    override fun getLayoutId(): Int = R.layout.fragment_repair_detail
    override fun title(): String = getString(R.string.repairs)
    override fun showBackButton(): Boolean = true

    private lateinit var viewModel: ServiceInfoDetailViewModel

    var repair: Repair? = null
    private var requestCode = -1

    override fun onAttach(context: Context) {
        super.onAttach(context)
        viewModel = (parentFragment as ServiceInfoDetailFragment).viewModel
        arguments?.let {
            repair = it.getSerializable("ITEM") as Repair
        }
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

    private fun init() = binding.apply {
        (parentFragment as ServiceInfoDetailFragment)
            .updateTabAccordingly(REPAIR_DETAIL_REQUEST_CODE, RepairTab.State.SELECTED)

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
                when (requestCode) {
                    PROBLEM_PICTURE -> viewModel
                        .updateRepairRequestParams
                        .repairBitmap
                        .set(it)
                    RESOLUTION_PICTURE -> viewModel
                        .updateRepairRequestParams
                        .resolutionBitmap
                        .set(it)
                }
                requestCode = -1
            } ?: Log.i("Capture Result:", "FAILED")
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        viewModel.updateRepairRequestParams.clearFields()
    }

    /*
     * CLICK LISTENERS
     */
    fun onCameraClicked(requestCode: Int) =
        permissionActivityLauncher.launch(cameraPermissions).also {
            this@RepairsDetailFragment.requestCode = requestCode
        }

    fun onReviewWorkClicked() = (parentFragment as ServiceInfoDetailFragment).apply {
        updateTabAccordingly(REPAIR_DETAIL_REQUEST_CODE, RepairTab.State.COMPLETED)
        replaceFragmentAccordingly(REVIEW_WORK_REQUEST_CODE, Bundle().apply {
            putSerializable("ITEM", repair)
        })
    }
}