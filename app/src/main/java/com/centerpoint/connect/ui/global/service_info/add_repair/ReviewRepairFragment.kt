package com.centerpoint.connect.ui.global.service_info.add_repair

import android.content.Context
import android.os.Bundle
import android.view.View
import com.centerpoint.connect.R
import com.centerpoint.connect.base.BaseFragment
import com.centerpoint.connect.base.BaseViewModel
import com.centerpoint.connect.constants.ADD_SITE_BID_REQUEST_CODE
import com.centerpoint.connect.constants.REPAIRS_REQUEST_CODE
import com.centerpoint.connect.databinding.FragmentReviewRepairBinding
import com.centerpoint.connect.models.helper.RepairTab
import com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailFragment
import com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailViewModel

class ReviewRepairFragment : BaseFragment<FragmentReviewRepairBinding>() {

    override fun getViewModel(): BaseViewModel = viewModel
    override fun getLayoutId(): Int = R.layout.fragment_review_repair
    override fun title(): String = getString(R.string.repair_heading)
    override fun showBackButton(): Boolean = true

    private lateinit var viewModel: ServiceInfoDetailViewModel

    override fun onAttach(context: Context) {
        super.onAttach(context)
        viewModel = (parentFragment as ServiceInfoDetailFragment).viewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() {
    }

    /*
     * CLICK LISTENERS
     */
    fun onSubmitClicked() = (parentFragment as ServiceInfoDetailFragment).apply {
        if (getSelectedTabId().requestCode == ADD_SITE_BID_REQUEST_CODE)
            updateTabAccordingly(ADD_SITE_BID_REQUEST_CODE, RepairTab.State.COMPLETED)
        replaceFragmentAccordingly(REPAIRS_REQUEST_CODE)
    }

}