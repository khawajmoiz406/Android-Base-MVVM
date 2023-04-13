package com.centerpoint.connect.repository.implementation

import androidx.lifecycle.MutableLiveData
import com.centerpoint.connect.api.Apis
import com.centerpoint.connect.api.Result
import com.centerpoint.connect.models.request.UpdateProfileRP
import com.centerpoint.connect.models.response.login.LoginResponse
import com.centerpoint.connect.repository.UpdateProfileRepository
import kotlinx.coroutines.Job

@Suppress("UNCHECKED_CAST")
class UpdateProfileRepositoryImpl(private val apis: Apis) : UpdateProfileRepository {

    override fun updateProfile(
        requestParams: UpdateProfileRP, job: Job
    ): MutableLiveData<Result<LoginResponse>> {
        //        return object : BaseRepository<NewsResponse, Map<String, String>>() {
//            override suspend fun fetchFromNetwork(params: Map<String, String>): NewsResponse {
//                return apis.getAllNews(params)
//            }
//        }.start(requestParams.toMap(), job) as MutableLiveData<Result<NewsResponse>>
        return MutableLiveData(Result.Success(LoginResponse()))
    }

}