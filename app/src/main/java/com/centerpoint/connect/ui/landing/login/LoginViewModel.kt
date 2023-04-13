package com.centerpoint.connect.ui.landing.login

import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import com.centerpoint.connect.api.Result
import com.centerpoint.connect.base.BaseViewModel
import com.centerpoint.connect.models.helper.User
import com.centerpoint.connect.models.request.LoginRP
import com.centerpoint.connect.models.response.login.LoginResponse
import com.centerpoint.connect.repository.LoginRepository
import com.centerpoint.connect.util.EncryptSharedPref

class LoginViewModel(
    private val remoteRepo: LoginRepository,
    private val sharedPreferences: EncryptSharedPref
) : BaseViewModel() {

    val requestParams = LoginRP()
    val loginResultLiveData: MediatorLiveData<Result<LoginResponse>> = MediatorLiveData()
    private lateinit var _loginResultLiveData: MutableLiveData<Result<LoginResponse>>

    fun login() {
        if (::_loginResultLiveData.isInitialized)
            loginResultLiveData.removeSource(_loginResultLiveData)

        _loginResultLiveData = remoteRepo.login(requestParams, job)

        loginResultLiveData.addSource(_loginResultLiveData) { outcome ->
            outcomeLiveData.value = outcome
            outcome.let {
                if (it is Result.Success)
                    sharedPreferences.saveModel(it.data.user, User.TYPE)
                loginResultLiveData.value = it
            }
        }
    }
}