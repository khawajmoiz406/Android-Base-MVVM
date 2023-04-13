package com.centerpoint.connect.ui.landing.login

import android.location.Location
import android.os.Bundle
import android.util.Log
import android.view.View
import com.centerpoint.connect.R
import com.centerpoint.connect.base.BaseFragment
import com.centerpoint.connect.base.BaseViewModel
import com.centerpoint.connect.databinding.FragmentLoginBinding
import com.centerpoint.connect.ui.landing.LandingActivity
import org.koin.androidx.viewmodel.ext.android.viewModel


class LoginFragment : BaseFragment<FragmentLoginBinding>() {

    override fun getViewModel(): BaseViewModel = viewModel
    override fun getLayoutId(): Int = R.layout.fragment_login

    private val viewModel by viewModel<LoginViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        linkLiveData()
    }

    private fun linkLiveData() = viewModel.apply {
        loginResultLiveData.observe(viewLifecycleOwner) {
            when (it) {
                is com.centerpoint.connect.api.Result.Success ->
                    (requireActivity() as LandingActivity).gotoGlobalActivity()
                else -> {}
            }
        }
    }

    fun verifyFields() = viewModel.requestParams.apply {
        when {
            email.get().isNullOrEmpty() -> showToast(getString(R.string.enter_name_hint))
            password.get().isNullOrEmpty() -> showToast(getString(R.string.enter_password_hint))
            else -> viewModel.login()
        }
    }

    fun calculateDistance() {
        val startPoint = Location("locationA")
        startPoint.latitude = 17.372102
        startPoint.longitude = 78.484196

        val endPoint = Location("locationA")
        endPoint.latitude = 17.375775
        endPoint.longitude = 78.469218

        val distance = startPoint.distanceTo(endPoint)
        val speed = distance / 720 // unit is in m/s becasue distance is meter and time in second
        val speedKmH = speed * 3.6 // converted to km/h
    }
}