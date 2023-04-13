package com.centerpoint.connect.ui.global.service_schedule

import android.os.Bundle
import android.view.View
import com.centerpoint.connect.R
import com.centerpoint.connect.base.BaseFragment
import com.centerpoint.connect.base.BaseViewModel
import com.centerpoint.connect.base.listeners.BaseAdapterListener
import com.centerpoint.connect.databinding.FragmentServiceScheduleBinding
import com.centerpoint.connect.ui.global.service_schedule.adapter.ServicesAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

class ServicesFragment : BaseFragment<FragmentServiceScheduleBinding>(), BaseAdapterListener {

    override fun getViewModel(): BaseViewModel = viewModel
    override fun getLayoutId(): Int = R.layout.fragment_service_schedule

    private val viewModel by viewModel<ServicesViewModel>()

    val adapter by lazy { ServicesAdapter(this) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() {
        linkLiveData()
        viewModel.getAllServices(1)
    }

    private fun linkLiveData() = viewModel.apply {
        servicesResultLiveData.observe(viewLifecycleOwner) {
            when (it) {
                is com.centerpoint.connect.api.Result.Success -> {
                    adapter.addData(it.data.list?.toList() ?: listOf())
                }
                else -> {}
            }
        }
    }


    /*
     * Adapter Listeners
     */
    override fun onItemClick(position: Int, item: Any) {
        navigateToDestination(R.id.ticketInfoFragment, Bundle())
    }

    override fun onLoadMore(pageNo: Int) {
        viewModel.getAllServices(pageNo)
    }

    override fun isLoading(): Boolean =
        viewModel.outcomeLiveData.value is com.centerpoint.connect.api.Result.Loading
}