package com.centerpoint.connect.repository.implementation

import com.centerpoint.connect.api.Apis
import com.centerpoint.connect.api.Result
import com.centerpoint.connect.base.BaseRequestParams
import com.centerpoint.connect.constants.CHECK_IN
import com.centerpoint.connect.constants.CHECK_OUT
import com.centerpoint.connect.models.request.AttendanceRP
import com.centerpoint.connect.models.response.attendance.AttendanceResponse
import com.centerpoint.connect.models.response.attendance.CostCode
import com.centerpoint.connect.models.response.attendance.CostCodesResponse
import com.centerpoint.connect.repository.AttendanceRepository
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay

@Suppress("UNCHECKED_CAST")
class AttendanceRepositoryImpl(private val apis: Apis) : AttendanceRepository {

    override suspend fun getCostCodes(
        requestParams: BaseRequestParams,
        job: Job
    ): CostCodesResponse {
        //        return object : BaseRepository<NewsResponse, Map<String, String>>() {
//            override suspend fun fetchFromNetwork(params: Map<String, String>): NewsResponse {
//                return apis.getAllNews(params)
//            }
//        }.start(requestParams.toMap(), job) as MutableLiveData<Result<NewsResponse>>
        delay(1000L)
        return CostCodesResponse(
            list = arrayListOf(
                CostCode(1, "R 403 (SERVICE TECH)"),
                CostCode(2, "TR 400 (TRAVEL)"),
                CostCode(3, "R 401 (LABOUR)"),
                CostCode(4, "R 402 (NON - BILLABLE)"),
            )
        )
    }

    override suspend fun markAttendance(
        requestParams: AttendanceRP,
        job: Job
    ): AttendanceResponse {
        return AttendanceResponse(
            attendance = requestParams.attendanceType
        )
    }

}