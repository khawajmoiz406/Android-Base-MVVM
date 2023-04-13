package com.centerpoint.connect.ui.global.service_info.add_repair

import android.content.Context
import android.os.Bundle
import android.view.View
import com.centerpoint.connect.R
import com.centerpoint.connect.base.BaseFragment
import com.centerpoint.connect.base.BaseViewModel
import com.centerpoint.connect.constants.REVIEW_REPAIR_REQUEST_CODE
import com.centerpoint.connect.databinding.FragmentDropLocationBinding
import com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailFragment
import com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailViewModel

class DropLocationFragment : BaseFragment<FragmentDropLocationBinding>() {

    override fun getViewModel(): BaseViewModel = viewModel
    override fun getLayoutId(): Int = R.layout.fragment_drop_location
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
    fun onSaveClicked() = (parentFragment as ServiceInfoDetailFragment).apply {
        replaceFragmentAccordingly(REVIEW_REPAIR_REQUEST_CODE)
    }
}