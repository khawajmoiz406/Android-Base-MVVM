package com.centerpoint.connect.ui.global.ticket_info

import android.os.Bundle
import android.view.View
import com.centerpoint.connect.R
import com.centerpoint.connect.base.BaseFragment
import com.centerpoint.connect.base.BaseViewModel
import com.centerpoint.connect.databinding.FragmentTicketInfoBinding
import com.centerpoint.connect.ui.global.ticket_info.adapter.EstimateMaterialAdapter
import com.centerpoint.connect.ui.global.ticket_info.adapter.ServiceRepairAdapter
import com.centerpoint.connect.ui.global.ticket_info.adapter.TimeKeepingAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

class TicketInfoFragment : BaseFragment<FragmentTicketInfoBinding>() {

    override fun getViewModel(): BaseViewModel = viewModel
    override fun getLayoutId(): Int = R.layout.fragment_ticket_info
    override fun showBackButton(): Boolean = true

    private val viewModel by viewModel<TicketInfoViewModel>()

    val tkAdapter by lazy { TimeKeepingAdapter() }
    val srAdapter by lazy { ServiceRepairAdapter() }
    val emAdapter by lazy { EstimateMaterialAdapter() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() = binding.apply {}

    fun gotoCheckInFragment() {
        navigateToDestination(R.id.checkInFragment, Bundle())
    }

    fun gotoLocationDetailFragment() {
        navigateToDestination(R.id.locationDetailsFragment, Bundle())
    }
}