package com.centerpoint.connect.base

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.*
import androidx.appcompat.widget.AppCompatEditText
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.DialogFragment
import androidx.navigation.NavDirections
import com.centerpoint.connect.R
import com.centerpoint.connect.base.listeners.ToolbarListeners
import com.centerpoint.connect.models.helper.ResponseCallback
import com.centerpoint.connect.ui.global.GlobalNavigationActivity
import com.centerpoint.connect.util.WindowsUtils

abstract class BaseDialogFragment<B : ViewDataBinding> : DialogFragment(), BaseView,
    ToolbarListeners {

    abstract fun getViewModel(): BaseViewModel?

    open fun wrapHeight(): Boolean = true
    open fun wrapWidth(): Boolean = true
    open fun cancelable(): Boolean = true
    open fun fullScreen(): Boolean = false
    open fun dimAmount(): Float? = null
    open fun sizePercentage(): Double = 0.9
    open fun gravity(): Int = Gravity.CENTER

    lateinit var binding: B
    private var activity: BaseActivity<*>? = null

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
            dialog?.window?.apply {
                requestFeature(Window.FEATURE_NO_TITLE)
                setGravity(gravity())
            }
        }
    }

    override fun onStart() {
        super.onStart()
        val widthPercentageAccordingly =
            if (WindowsUtils.isXLargeScreen(requireContext())) 0.80 else sizePercentage()
        val width =
            if (wrapWidth()) ViewGroup.LayoutParams.WRAP_CONTENT else (WindowsUtils.width.toFloat() * if (fullScreen()) 1.0 else widthPercentageAccordingly).toInt()
        val height =
            if (wrapHeight()) ViewGroup.LayoutParams.WRAP_CONTENT else (WindowsUtils.height.toFloat() * if (fullScreen()) 1.0 else widthPercentageAccordingly).toInt()

        dialog?.window?.apply {
            setLayout(width, height)
            setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            isCancelable = cancelable()
            dimAmount()?.let { setDimAmount(it) }
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

    /*
     * Toolbar Listeners
     */
    override fun onStartIconClicked() {
        if (requireActivity() is GlobalNavigationActivity)
            (requireActivity() as GlobalNavigationActivity).toggleDrawer()
    }

    override fun onEndIconClicked() {
        showToast(getString(R.string.under_development))
    }

    override fun onClockClicked() {
        activity?.navigateToDestination(R.id.startDayFragment, Bundle())
    }
}