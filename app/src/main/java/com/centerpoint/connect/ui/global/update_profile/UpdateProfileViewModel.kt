package com.centerpoint.connect.ui.global.update_profile

import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import com.centerpoint.connect.api.Result
import com.centerpoint.connect.base.BaseViewModel
import com.centerpoint.connect.models.helper.User
import com.centerpoint.connect.models.request.UpdateProfileRP
import com.centerpoint.connect.models.response.login.LoginResponse
import com.centerpoint.connect.repository.UpdateProfileRepository
import com.centerpoint.connect.util.EncryptSharedPref

class UpdateProfileViewModel(
    private val remoteRepo: UpdateProfileRepository,
    private val sharedPreferences: EncryptSharedPref
) : BaseViewModel() {

    val requestParams = UpdateProfileRP()
    val updateResultLiveData: MediatorLiveData<Result<LoginResponse>> = MediatorLiveData()
    private lateinit var _updateResultLiveData: MutableLiveData<Result<LoginResponse>>

    fun populateRequestParams(user: User?) = requestParams.apply {
        email.set(user?.email ?: "")
        mobilePhone.set(user?.mobileNo ?: "")
        officePhone.set(user?.officeNo ?: "")
    }

    fun updateProfile() {
        if (::_updateResultLiveData.isInitialized)
            updateResultLiveData.removeSource(_updateResultLiveData)

        _updateResultLiveData = remoteRepo.updateProfile(requestParams, job)

        updateResultLiveData.addSource(_updateResultLiveData) { outcome ->
            outcomeLiveData.value = outcome
            outcome.let {
                updateResultLiveData.value = it
            }
        }
    }
}