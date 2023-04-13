package com.centerpoint.connect.ui.global.service_info.repairs

import android.os.Bundle
import android.view.View
import com.centerpoint.connect.R
import com.centerpoint.connect.base.BaseFragment
import com.centerpoint.connect.base.BaseViewModel
import com.centerpoint.connect.base.listeners.BaseAdapterListener
import com.centerpoint.connect.constants.ADD_REPAIR_REQUEST_CODE
import com.centerpoint.connect.constants.REPAIR_DETAIL_REQUEST_CODE
import com.centerpoint.connect.databinding.FragmentRepairsBinding
import com.centerpoint.connect.models.response.repair.Repair
import com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailFragment
import com.centerpoint.connect.ui.global.service_info.repairs.adapter.RepairsAdapter

class RepairsFragment : BaseFragment<FragmentRepairsBinding>(), BaseAdapterListener {

    override fun getViewModel(): BaseViewModel? = null
    override fun getLayoutId(): Int = R.layout.fragment_repairs
    override fun title(): String = getString(R.string.repairs)
    override fun showBackButton(): Boolean = true

    val adapter: RepairsAdapter by lazy { RepairsAdapter(this) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() {
        linkLiveData()
        callRepairsApi()
    }

    private fun linkLiveData() = (parentFragment as ServiceInfoDetailFragment)
        .viewModel
        .repairsLiveData
        .observe(viewLifecycleOwner) {
            it.list?.let { data -> adapter.addData(data.toList()) }
        }

    private fun callRepairsApi() = (parentFragment as ServiceInfoDetailFragment)
        .viewModel.getAllRepairs()

    /*
     * CLICK LISTENERS
     */
    fun onAddRepairClicked() = (parentFragment as ServiceInfoDetailFragment).apply {
        replaceFragmentAccordingly(ADD_REPAIR_REQUEST_CODE)
    }

    /*
     * Adapter Listeners
     */
    override fun onItemClick(position: Int, item: Any) {
        (parentFragment as ServiceInfoDetailFragment).apply {
            replaceFragmentAccordingly(REPAIR_DETAIL_REQUEST_CODE, Bundle().apply {
                putSerializable("ITEM", item as Repair)
            })
        }
    }


}