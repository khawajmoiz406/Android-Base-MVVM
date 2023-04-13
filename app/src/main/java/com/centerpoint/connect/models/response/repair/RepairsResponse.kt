package com.centerpoint.connect.models.response.repair

data class RepairsResponse(
    val list: ArrayList<Repair>? = arrayListOf()
) : java.io.Serializable
