package com.centerpoint.connect.repository

import com.centerpoint.connect.base.BaseRequestParams
import com.centerpoint.connect.models.response.repair.RepairsResponse
import kotlinx.coroutines.Job

interface ServiceInfoDetailRepository {
    suspend fun getAllRepairs(
        requestParams: BaseRequestParams,
        job: Job
    ): RepairsResponse
}