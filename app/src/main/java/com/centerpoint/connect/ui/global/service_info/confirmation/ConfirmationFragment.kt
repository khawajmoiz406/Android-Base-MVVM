package com.centerpoint.connect.ui.global.service_info.confirmation

import android.content.Context
import android.os.Bundle
import android.view.View
import com.centerpoint.connect.R
import com.centerpoint.connect.base.BaseFragment
import com.centerpoint.connect.base.BaseViewModel
import com.centerpoint.connect.constants.CONFIRMATION_REQUEST_CODE
import com.centerpoint.connect.constants.REPAIR_DETAIL_REQUEST_CODE
import com.centerpoint.connect.constants.SIGNATURE_REQUEST_CODE
import com.centerpoint.connect.databinding.FragmentConfirmationBinding
import com.centerpoint.connect.models.helper.RepairTab
import com.centerpoint.connect.models.response.repair.Repair
import com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailFragment
import com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailViewModel

class ConfirmationFragment : BaseFragment<FragmentConfirmationBinding>() {

    override fun getViewModel(): BaseViewModel = viewModel
    override fun getLayoutId(): Int = R.layout.fragment_confirmation
    override fun title(): String = getString(R.string.confirmation)
    override fun showBackButton(): Boolean = true

    private lateinit var viewModel: ServiceInfoDetailViewModel

    var repair: Repair? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        viewModel = (parentFragment as ServiceInfoDetailFragment).viewModel
        arguments?.let {
            repair = it.getSerializable("ITEM") as Repair
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() = binding.apply {
        (parentFragment as ServiceInfoDetailFragment)
            .updateTabAccordingly(CONFIRMATION_REQUEST_CODE, RepairTab.State.SELECTED)
    }

    override fun onDestroy() {
        super.onDestroy()
        viewModel.updateRepairRequestParams.clearConfirmation()
    }


    /*
     * CLICK LISTENERS
     */
    fun onSubmitClicked() = (parentFragment as ServiceInfoDetailFragment).apply {
        viewModel.updateRepairRequestParams.signatureBitmap.get()?.let {
            updateTabAccordingly(CONFIRMATION_REQUEST_CODE, RepairTab.State.COMPLETED)
            //goto next fragment
        } ?: run {
            requireActivity().supportFragmentManager.setFragmentResultListener("SIGNATURE", viewLifecycleOwner) { key, bundle ->
                viewModel.updateRepairRequestParams.signatureBitmap.set(
                    bundle.getParcelable("BITMAP")
                )
            }
            replaceFragmentAccordingly(SIGNATURE_REQUEST_CODE, Bundle())
        }
    }
}