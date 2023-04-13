package com.centerpoint.connect.repository.implementation

import androidx.lifecycle.MutableLiveData
import com.centerpoint.connect.api.Apis
import com.centerpoint.connect.api.Result
import com.centerpoint.connect.models.helper.User
import com.centerpoint.connect.models.request.LoginRP
import com.centerpoint.connect.models.response.login.LoginResponse
import com.centerpoint.connect.repository.LoginRepository
import kotlinx.coroutines.Job

@Suppress("UNCHECKED_CAST")
class LoginRepositoryImpl(private val apis: Apis) : LoginRepository {

    override fun login(
        requestParams: LoginRP, job: Job
    ): MutableLiveData<Result<LoginResponse>> {
//        return object : BaseRepository<NewsResponse, Map<String, String>>() {
//            override suspend fun fetchFromNetwork(params: Map<String, String>): NewsResponse {
//                return apis.getAllNews(params)
//            }
//        }.start(requestParams.toMap(), job) as MutableLiveData<Result<NewsResponse>>
        return MutableLiveData(Result.Success(LoginResponse().apply {
            user = User(
                userId = 1,
                name = "Andrew Jackson",
                email = "andrew.jackson@centerpoint.com",
                password = "1234",
                mobileNo = "+00 000 00 000 000",
                officeNo = "+00 000 00 000 000",
            )
        }))
    }

}