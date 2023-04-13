package com.centerpoint.connect.models.response.services

data class ServicesResponse(
    val list: ArrayList<Service>? = arrayListOf()
) : java.io.Serializable
