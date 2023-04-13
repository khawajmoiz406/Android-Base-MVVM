package com.centerpoint.connect.base


import android.app.Dialog
import android.content.Context
import android.net.ConnectivityManager
import android.net.Network
import android.net.NetworkCapabilities
import android.net.NetworkRequest
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatEditText
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.navigation.NavController
import androidx.navigation.NavDirections
import androidx.navigation.fragment.NavHostFragment
import com.centerpoint.connect.BR
import com.centerpoint.connect.R
import com.centerpoint.connect.models.helper.ResponseCallback
import com.centerpoint.connect.models.helper.User
import com.centerpoint.connect.ui.dialogs.CallbackResponseDialog
import com.centerpoint.connect.util.DialogUtils
import com.centerpoint.connect.util.EncryptSharedPref
import org.koin.android.ext.android.inject


/**
@author Salman Aziz
created on 2/22/21
 **/

abstract class  BaseActivity<B : ViewDataBinding> : AppCompatActivity(), BaseView {
    abstract fun hasConnectivity(connectivity: Boolean)
    abstract fun getViewModel(): BaseViewModel?

    private lateinit var dialog: Dialog
    lateinit var binding: B
    private var originalSoftInputMode: Int? = null
    private lateinit var inputManager: InputMethodManager
    private lateinit var connectivityManager: ConnectivityManager
    private var availableNetwork: Network? = null
    protected val sharedPref: EncryptSharedPref by inject()
    var user: User? = null
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, getLayoutId())
        binding.setVariable(BR.activity, this)
        user = sharedPref.getModel(User.TYPE)
        dialog = DialogUtils.createProgressDialog(this, false)
        inputManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        connectivityManager = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        initViewModelCallback()
        registerNetworkCallback()
        getNavHostId()?.let {
            val navHostFragment = supportFragmentManager.findFragmentById(it) as NavHostFragment
            navController = navHostFragment.navController
        }
    }

    private fun initViewModelCallback() = getViewModel()?.outcomeLiveData?.observe(this) {
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

    private fun showCallbackDialog(callback: ResponseCallback) =
        CallbackResponseDialog(callback).apply {
            show(supportFragmentManager, CallbackResponseDialog::class.java.simpleName)
        }

    override fun onDestroy() {
        unregisterNetworkCallback()
        super.onDestroy()
    }

    override fun setSoftInputMode(mode: Int) {
        originalSoftInputMode = window.attributes.softInputMode
        window.setSoftInputMode(mode)
    }

    override fun resetSoftInputMode() {
        originalSoftInputMode?.let {
            window.setSoftInputMode(it)
        }
    }

    override fun showKeyboard(editText: AppCompatEditText) {
        editText.post {
            editText.requestFocus()
            inputManager.showSoftInput(editText.rootView, InputMethodManager.SHOW_FORCED)
        }
    }

    override fun hideKeyboard() {
        this.currentFocus?.let {
            inputManager.hideSoftInputFromWindow(it.applicationWindowToken, 0)
        }
    }


    override fun noConnectivity() {
        showCallbackDialog(ResponseCallback.getErrorCallback(getString(R.string.no_internet_connectivity)))
    }

    override fun loaderVisibility(visibility: Boolean) {
        if (::dialog.isInitialized) {
            if (visibility) {
                if (!dialog.isShowing)
                    dialog.show()
            } else {
                dialog.dismiss()
            }
        }
    }

    override fun showToast(message: String?) {
        message?.let {
            Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
        }
    }

    override fun onApiResponse(callback: ResponseCallback) {
        showCallbackDialog(callback)
    }

    override fun navigateToDestination(direction: NavDirections) {
        if (::navController.isInitialized) {
            navController.navigate(direction)
        } else {
            throw IllegalAccessException("Nav Controller not set in activity")
        }

    }

    override fun navigateToDestination(id: Int, args: Bundle) {
        if (::navController.isInitialized && navController.currentDestination?.id != id) {
            navController.navigate(id, args)
        }
    }

    override fun navigateToDestination(id: Int, clearStack: Boolean) {
        if (::navController.isInitialized && navController.currentDestination?.id != id) {
            navController.popBackStack(id, !clearStack)
        }
    }


    private val networkCallback = object : ConnectivityManager.NetworkCallback() {
        override fun onAvailable(network: Network) {
            super.onAvailable(network)
            availableNetwork = network
            runOnUiThread { hasConnectivity(true) }
        }

        override fun onLost(network: Network) {
            super.onLost(network)
            if (network == availableNetwork) {
                runOnUiThread { hasConnectivity(false) }
            }
        }
    }

    private fun registerNetworkCallback() {
        val networkRequest = NetworkRequest.Builder()
            .addCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET)
            .build()
        connectivityManager.registerNetworkCallback(networkRequest, networkCallback)
    }

    private fun unregisterNetworkCallback() {
        connectivityManager.unregisterNetworkCallback(networkCallback)
    }
}