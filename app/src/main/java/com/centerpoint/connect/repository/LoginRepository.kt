package com.centerpoint.connect.repository

import androidx.lifecycle.MutableLiveData
import com.centerpoint.connect.api.Result
import com.centerpoint.connect.models.request.LoginRP
import com.centerpoint.connect.models.response.login.LoginResponse
import kotlinx.coroutines.Job

interface LoginRepository {
    fun login(requestParams: LoginRP, job: Job): MutableLiveData<Result<LoginResponse>>
}