package com.centerpoint.connect.repository.implementation

import com.centerpoint.connect.api.Apis
import com.centerpoint.connect.base.BaseRequestParams
import com.centerpoint.connect.models.response.repair.Repair
import com.centerpoint.connect.models.response.repair.RepairsResponse
import com.centerpoint.connect.repository.ServiceInfoDetailRepository
import kotlinx.coroutines.Job

@Suppress("UNCHECKED_CAST")
class ServiceInfoDetailRepositoryImpl(private val apis: Apis) : ServiceInfoDetailRepository {

    override suspend fun getAllRepairs(
        requestParams: BaseRequestParams,
        job: Job
    ): RepairsResponse {
        return RepairsResponse(
            arrayListOf(
                Repair(
                    "Curbs - Flashing Failure",
                    "4",
                    "EA",
                    "The flashing or membrane around the curb is failing and needs to be re-flashed.",
                    "Removed existing material and re-installed new curb and flash appropriately per manufacturers specifications.",
                    false,
                    "https://picsum.photos/id/870/200/300?grayscale&blur=2"
                ),
                Repair(
                    "Curbs - Flashing Failure",
                    "4",
                    "EA",
                    "The flashing or membrane around the curb is failing and needs to be re-flashed.",
                    "Removed existing material and re-installed new curb and flash appropriately per manufacturers specifications.",
                    true,
                    "https://picsum.photos/id/870/200/300?grayscale&blur=2"
                ),
            )
        )
    }
}