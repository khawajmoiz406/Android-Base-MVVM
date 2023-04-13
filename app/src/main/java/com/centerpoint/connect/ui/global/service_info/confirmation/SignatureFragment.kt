package com.centerpoint.connect.ui.global.service_info.confirmation

import android.os.Bundle
import android.view.View
import com.centerpoint.connect.R
import com.centerpoint.connect.base.BaseFragment
import com.centerpoint.connect.base.BaseViewModel
import com.centerpoint.connect.databinding.FragmentSignatureBinding
import com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailFragment

class SignatureFragment : BaseFragment<FragmentSignatureBinding>() {

    override fun getViewModel(): BaseViewModel? = null
    override fun getLayoutId(): Int = R.layout.fragment_signature

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() {
        (parentFragment as ServiceInfoDetailFragment).toggleStopwatchView(false)
        (parentFragment as ServiceInfoDetailFragment).toggleTabs(false)
    }

    override fun onDestroy() {
        (parentFragment as ServiceInfoDetailFragment).toggleStopwatchView(true)
        (parentFragment as ServiceInfoDetailFragment).toggleTabs(true)
        super.onDestroy()
    }

    /*
     * CLICK LISTENERS
     */
    fun onCancelClicked() {
        binding.sp.clear()
        onBackPress()
    }

    fun onDoneClicked() {
        requireActivity().supportFragmentManager.setFragmentResult("SIGNATURE", Bundle().apply {
            putParcelable("BITMAP", binding.sp.transparentSignatureBitmap)
        })
        onBackPress()
    }
}