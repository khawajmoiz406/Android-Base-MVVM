package com.centerpoint.connect.repository

import androidx.lifecycle.MutableLiveData
import com.centerpoint.connect.api.Result
import com.centerpoint.connect.base.BaseRequestParams
import com.centerpoint.connect.models.request.UpdateProfileRP
import com.centerpoint.connect.models.response.login.LoginResponse
import com.centerpoint.connect.models.response.services.ServicesResponse
import kotlinx.coroutines.Job

interface UpdateProfileRepository {
    fun updateProfile(
        requestParams: UpdateProfileRP,
        job: Job
    ): MutableLiveData<Result<LoginResponse>>
}