package com.centerpoint.connect.ui.global.start_day

import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.centerpoint.connect.api.Result
import com.centerpoint.connect.base.BaseRequestParams
import com.centerpoint.connect.base.BaseViewModel
import com.centerpoint.connect.models.request.AttendanceRP
import com.centerpoint.connect.models.response.attendance.AttendanceResponse
import com.centerpoint.connect.models.response.attendance.CostCodesResponse
import com.centerpoint.connect.repository.AttendanceRepository
import com.centerpoint.connect.util.EncryptSharedPref
import kotlinx.coroutines.launch

class StartDayViewModel(
    private val remoteRepo: AttendanceRepository,
    private val sharedPreferences: EncryptSharedPref
) : BaseViewModel() {

    val requestParams = AttendanceRP()
    val attendanceLiveData: MutableLiveData<AttendanceResponse> = MediatorLiveData()
    val costCodesLiveData: MutableLiveData<CostCodesResponse> = MediatorLiveData()

    fun markAttendance(type: Int) = viewModelScope.launch {
        val response = remoteRepo.markAttendance(requestParams.apply {
            attendanceType = type
        }, job)
        attendanceLiveData.value = response
    }

    fun getCostCodeList() = viewModelScope.launch {
        val response = remoteRepo.getCostCodes(BaseRequestParams(), job)
        costCodesLiveData.value = response
    }
}