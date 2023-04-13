package com.centerpoint.connect.ui.global.service_info.parent

import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.centerpoint.connect.base.BaseRequestParams
import com.centerpoint.connect.base.BaseViewModel
import com.centerpoint.connect.models.request.AddRepairRP
import com.centerpoint.connect.models.request.UpdateRepairRP
import com.centerpoint.connect.models.response.repair.RepairsResponse
import com.centerpoint.connect.repository.ServiceInfoDetailRepository
import com.centerpoint.connect.util.EncryptSharedPref
import kotlinx.coroutines.launch

class ServiceInfoDetailViewModel(
    private val remoteRepo: ServiceInfoDetailRepository,
    private val sharedPreferences: EncryptSharedPref
) : BaseViewModel() {

    val clockTime = ObservableField("00:00")
    val isWatchRunning = ObservableField(false)

    var addRepairRequestParams = AddRepairRP()
    var updateRepairRequestParams = UpdateRepairRP()

    var repairsLiveData: MutableLiveData<RepairsResponse> = MutableLiveData()

    fun getAllRepairs() = viewModelScope.launch {
        val response = remoteRepo.getAllRepairs(BaseRequestParams(), job)
        repairsLiveData.value = response
    }
}