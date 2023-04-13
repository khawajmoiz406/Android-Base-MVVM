package com.centerpoint.connect.base

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.widget.AppCompatEditText
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import com.centerpoint.connect.BR
import com.centerpoint.connect.models.helper.ResponseCallback
import com.centerpoint.connect.models.helper.User
import com.centerpoint.connect.ui.global.GlobalNavigationActivity
import com.centerpoint.connect.ui.global.service_info.confirmation.SignatureFragment
import com.centerpoint.connect.ui.global.start_day.StartDayFragment
import com.centerpoint.connect.ui.global.ticket_info.LocationDetailsFragment
import com.centerpoint.connect.ui.global.update_profile.UpdateProfileFragment

abstract class BaseFragment<B : ViewDataBinding> : Fragment(), BaseView {

    abstract fun getViewModel(): BaseViewModel?
    open fun showBackButton(): Boolean = false
    open fun title(): String? = null
    open fun onBackPress() = (activity as BaseActivity<*>).onBackPressed()

    fun toggleDrawer() = (activity as GlobalNavigationActivity).toggleDrawer()
    fun getUserData() = (activity as GlobalNavigationActivity).user
    fun logoutUser() = (activity as GlobalNavigationActivity).logoutUser()
    fun onUserUpdated(user: User?) = (activity as GlobalNavigationActivity).onUserDataUpdated(user)

    open fun onPermissionsLauncherResult(permission: Map<String, Boolean>) {}
    open fun onCameraLauncherResult(result: ActivityResult) {}

    lateinit var binding: B
    private var activity: BaseActivity<*>? = null
    protected var firstTime = true

    protected val permissionActivityLauncher =
        registerForActivityResult(ActivityResultContracts.RequestMultiplePermissions()) {
            onPermissionsLauncherResult(it)
        }
    protected val cameraActivityLauncher =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
            onCameraLauncherResult(it)
        }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return if (!this::binding.isInitialized) {
            DataBindingUtil.inflate<B>(
                inflater,
                getLayoutId(),
                container, false
            ).apply {
                binding = this
                initFragment()
            }.root
        } else binding.root


    }

    private fun initFragment() {
        if (binding.lifecycleOwner == null) {
            binding.apply {
                lifecycleOwner = this@BaseFragment
                binding.setVariable(BR.viewModel, getViewModel())
                binding.setVariable(BR.fragment, this@BaseFragment)
                if (requireActivity() is GlobalNavigationActivity)
                    (requireActivity() as GlobalNavigationActivity?)?.let {
                        binding.setVariable(BR.user, it.user)
                    }
            }
        }
    }

    private fun initViewModelCallback() =
        getViewModel()?.outcomeLiveData?.observe(viewLifecycleOwner) {
            when (it) {
                is com.centerpoint.connect.api.Result.Loading -> {
                    if (it.showLoader)
                        loaderVisibility(true)
                }
                is com.centerpoint.connect.api.Result.Success -> {
                    loaderVisibility(false)
                }
                is com.centerpoint.connect.api.Result.Failure -> {
                    onApiResponse(ResponseCallback.getErrorCallback(it.e?.message))
                    loaderVisibility(false)
                }
                is com.centerpoint.connect.api.Result.NetworkError -> {
                    onApiResponse(ResponseCallback.getErrorCallback(it.e?.message))
                    loaderVisibility(false)
                }
            }

        }

    private fun checkForToolbar() = (activity as GlobalNavigationActivity).toggleToolbar(
        this !is StartDayFragment && this !is UpdateProfileFragment && this !is LocationDetailsFragment && this !is SignatureFragment,
        showBackButton()
    )

    private fun changeTitle(str: String) = (activity as GlobalNavigationActivity).changeTitle(str)

    override fun onResume() {
        super.onResume()
        if (requireActivity() is GlobalNavigationActivity) {
            checkForToolbar()
            title()?.let { changeTitle(it) }
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        hideKeyboard()
        initViewModelCallback()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is BaseActivity<*>) {
            activity = context
        }
    }


    override fun setSoftInputMode(mode: Int) {
        activity?.setSoftInputMode(mode)
    }

    override fun resetSoftInputMode() {
        activity?.resetSoftInputMode()
    }

    override fun showKeyboard(editText: AppCompatEditText) {
        activity?.showKeyboard(editText)
    }

    override fun hideKeyboard() {
        activity?.hideKeyboard()
    }


    override fun noConnectivity() {
        activity?.noConnectivity()
    }

    override fun loaderVisibility(visibility: Boolean) {
        activity?.loaderVisibility(visibility)
    }

    override fun showToast(message: String?) {
        activity?.showToast(message)
    }

    override fun onApiResponse(callback: ResponseCallback) {
        activity?.onApiResponse(callback)
    }

    override fun navigateToDestination(direction: NavDirections) {
        activity?.navigateToDestination(direction)
    }

    override fun navigateToDestination(id: Int, args: Bundle) {
        activity?.navigateToDestination(id, args)
    }

    override fun navigateToDestination(id: Int, clearStack: Boolean) {
        activity?.navigateToDestination(id, clearStack)
    }

    override fun getNavHostId(): Int? {
        return activity?.getNavHostId()
    }
}