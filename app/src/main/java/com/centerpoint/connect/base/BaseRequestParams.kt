package com.centerpoint.connect.base

open class BaseRequestParams : java.io.Serializable {
    open fun toMap(): Map<String, String> = mapOf()
}
