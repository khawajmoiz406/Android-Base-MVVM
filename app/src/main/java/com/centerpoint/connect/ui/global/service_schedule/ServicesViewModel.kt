package com.centerpoint.connect.ui.global.service_schedule

import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import com.centerpoint.connect.api.Result
import com.centerpoint.connect.base.BaseRequestParams
import com.centerpoint.connect.base.BaseViewModel
import com.centerpoint.connect.models.response.services.ServicesResponse
import com.centerpoint.connect.repository.ServicesRepository
import com.centerpoint.connect.util.EncryptSharedPref

class ServicesViewModel(
    private val remoteRepo: ServicesRepository,
    private val sharedPreferences: EncryptSharedPref
) : BaseViewModel() {

    val servicesResultLiveData: MediatorLiveData<Result<ServicesResponse>> = MediatorLiveData()
    private lateinit var _servicesResultLiveData: MutableLiveData<Result<ServicesResponse>>

    fun getAllServices(pageNo: Int) {
        if (::_servicesResultLiveData.isInitialized)
            servicesResultLiveData.removeSource(_servicesResultLiveData)

        _servicesResultLiveData = remoteRepo.getAllServices(BaseRequestParams(), job)

        servicesResultLiveData.addSource(_servicesResultLiveData) { outcome ->
            outcomeLiveData.value = outcome
            outcome.let {
                servicesResultLiveData.value = it
            }
        }
    }
}