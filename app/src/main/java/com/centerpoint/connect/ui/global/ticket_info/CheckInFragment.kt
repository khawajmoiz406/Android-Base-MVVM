package com.centerpoint.connect.ui.global.ticket_info

import android.os.Bundle
import android.view.View
import com.centerpoint.connect.R
import com.centerpoint.connect.base.BaseFragment
import com.centerpoint.connect.base.BaseViewModel
import com.centerpoint.connect.databinding.FragmentCheckInBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class CheckInFragment : BaseFragment<FragmentCheckInBinding>() {

    override fun getViewModel(): BaseViewModel = viewModel
    override fun getLayoutId(): Int = R.layout.fragment_check_in
    override fun showBackButton(): Boolean = true

    private val viewModel by viewModel<TicketInfoViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() = binding.apply {}

    fun onCheckInClicked() {
        navigateToDestination(R.id.serviceInfoDetailFragment, Bundle())
    }
}