package com.centerpoint.connect.models.response.services

data class Service(
    var estimateTime: String? = "",
    var stage: String? = "",
    var serviceId: Int? = 1234,
    var region: String? = "",
    var address: String? = "",
) : java.io.Serializable