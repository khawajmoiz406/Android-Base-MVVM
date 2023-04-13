package com.centerpoint.connect.models.response.repair

data class Repair(
    val managerName: String = "",
    val quantity: String = "",
    val unit: String = "",
    val description: String = "",
    val correction: String = "",
    val roofPenetrate: Boolean = false,
    var repairUrl: String = "",
    var location: String? = "",
) : java.io.Serializable
