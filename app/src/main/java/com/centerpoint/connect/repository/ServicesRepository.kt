package com.centerpoint.connect.repository

import androidx.lifecycle.MutableLiveData
import com.centerpoint.connect.api.Result
import com.centerpoint.connect.base.BaseRequestParams
import com.centerpoint.connect.models.response.services.ServicesResponse
import kotlinx.coroutines.Job

interface ServicesRepository {
    fun getAllServices(
        requestParams: BaseRequestParams,
        job: Job
    ): MutableLiveData<Result<ServicesResponse>>
}