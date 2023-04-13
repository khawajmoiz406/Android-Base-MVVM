package com.centerpoint.connect.ui.global.update_profile

import android.os.Bundle
import android.view.View
import com.centerpoint.connect.R
import com.centerpoint.connect.base.BaseFragment
import com.centerpoint.connect.base.BaseViewModel
import com.centerpoint.connect.databinding.FragmentUpdateProfileBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class UpdateProfileFragment : BaseFragment<FragmentUpdateProfileBinding>() {

    override fun getViewModel(): BaseViewModel = viewModel
    override fun getLayoutId(): Int = R.layout.fragment_update_profile

    private val viewModel by viewModel<UpdateProfileViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() {
        viewModel.populateRequestParams(getUserData())
        linkLiveData()
    }

    private fun linkLiveData() = viewModel.apply {
        updateResultLiveData.observe(viewLifecycleOwner) {
            when (it) {
                is com.centerpoint.connect.api.Result.Success -> {
                    showToast(getString(R.string.profile_update_successfully))
                    onBackPress()
                }
                else -> {}
            }
        }
    }

    fun verifyFields() = viewModel.requestParams.apply {
        when {
            email.get().isNullOrEmpty() -> showToast(getString(R.string.enter_email_hint))
            mobilePhone.get().isNullOrEmpty() -> showToast(getString(R.string.enter_mobile_number_hint))
            officePhone.get().isNullOrEmpty() -> showToast(getString(R.string.enter_office_number_hint))
            else -> viewModel.updateProfile()
        }
    }
}