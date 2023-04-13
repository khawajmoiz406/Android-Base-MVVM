package com.centerpoint.connect.ui.global.service_info.review_work

import android.content.Context
import android.os.Bundle
import android.view.View
import com.centerpoint.connect.R
import com.centerpoint.connect.base.BaseFragment
import com.centerpoint.connect.base.BaseViewModel
import com.centerpoint.connect.constants.CONFIRMATION_REQUEST_CODE
import com.centerpoint.connect.constants.REPAIR_DETAIL_REQUEST_CODE
import com.centerpoint.connect.constants.REVIEW_WORK_REQUEST_CODE
import com.centerpoint.connect.databinding.FragmentReviewWorkBinding
import com.centerpoint.connect.models.helper.RepairTab
import com.centerpoint.connect.models.response.repair.Repair
import com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailFragment
import com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailViewModel

class ReviewWorkFragment : BaseFragment<FragmentReviewWorkBinding>() {

    override fun getViewModel(): BaseViewModel = viewModel
    override fun getLayoutId(): Int = R.layout.fragment_review_work
    override fun title(): String = getString(R.string.review_work_completed)
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
            .updateTabAccordingly(REVIEW_WORK_REQUEST_CODE, RepairTab.State.SELECTED)
    }

    /*
     * CLICK LISTENERS
     */
    fun onConfirmationClicked() = (parentFragment as ServiceInfoDetailFragment).apply {
        updateTabAccordingly(REVIEW_WORK_REQUEST_CODE, RepairTab.State.COMPLETED)
        replaceFragmentAccordingly(CONFIRMATION_REQUEST_CODE, Bundle().apply {
            putSerializable("ITEM", repair as Repair)
        })
    }
}