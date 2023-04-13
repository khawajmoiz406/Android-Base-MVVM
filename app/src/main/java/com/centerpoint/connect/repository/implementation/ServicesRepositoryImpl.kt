package com.centerpoint.connect.repository.implementation

import androidx.lifecycle.MutableLiveData
import com.centerpoint.connect.api.Apis
import com.centerpoint.connect.api.Result
import com.centerpoint.connect.base.BaseRequestParams
import com.centerpoint.connect.models.response.services.Service
import com.centerpoint.connect.models.response.services.ServicesResponse
import com.centerpoint.connect.repository.ServicesRepository
import kotlinx.coroutines.Job

@Suppress("UNCHECKED_CAST")
class ServicesRepositoryImpl(private val apis: Apis) : ServicesRepository {

    override fun getAllServices(
        requestParams: BaseRequestParams,
        job: Job
    ): MutableLiveData<Result<ServicesResponse>> {
        //        return object : BaseRepository<NewsResponse, Map<String, String>>() {
//            override suspend fun fetchFromNetwork(params: Map<String, String>): NewsResponse {
//                return apis.getAllNews(params)
//            }
//        }.start(requestParams.toMap(), job) as MutableLiveData<Result<NewsResponse>>
        return MutableLiveData(Result.Success(ServicesResponse().apply {
            list?.apply {
                add(Service())
                add(Service())
                add(Service())
                add(Service())
                add(Service())
                add(Service())
                add(Service())
                add(Service())
                add(Service())
                add(Service())
                add(Service())
            }
        }))
    }

}