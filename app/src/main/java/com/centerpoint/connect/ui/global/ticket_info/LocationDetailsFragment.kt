package com.centerpoint.connect.ui.global.ticket_info

import android.os.Bundle
import android.view.View
import com.centerpoint.connect.R
import com.centerpoint.connect.base.BaseFragment
import com.centerpoint.connect.base.BaseViewModel
import com.centerpoint.connect.databinding.FragmentLocationDetailsBinding

class LocationDetailsFragment : BaseFragment<FragmentLocationDetailsBinding>() {

    override fun getViewModel(): BaseViewModel? = null
    override fun getLayoutId(): Int = R.layout.fragment_location_details

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() = binding.apply {}
}