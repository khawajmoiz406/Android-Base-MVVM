package com.centerpoint.connect.repository

import androidx.lifecycle.MutableLiveData
import com.centerpoint.connect.api.Result
import com.centerpoint.connect.base.BaseRequestParams
import com.centerpoint.connect.models.request.AttendanceRP
import com.centerpoint.connect.models.response.attendance.AttendanceResponse
import com.centerpoint.connect.models.response.attendance.CostCodesResponse
import kotlinx.coroutines.Job

interface AttendanceRepository {
    suspend fun getCostCodes(
        requestParams: BaseRequestParams,
        job: Job
    ): CostCodesResponse

    suspend fun markAttendance(
        requestParams: AttendanceRP,
        job: Job
    ): AttendanceResponse
}