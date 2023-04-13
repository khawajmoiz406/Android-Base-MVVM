package com.centerpoint.connect.models.helper

class ResponseCallback(
    val message: String?,
    val type: Type
) {
    enum class Type {
        SUCCESS,
        FAILURE
    }

    companion object {
        fun getErrorCallback(message: String?) = ResponseCallback(
            message = message,
            type = Type.FAILURE
        )

        fun getSuccessCallback(message: String?) = ResponseCallback(
            message = message,
            type = Type.SUCCESS
        )
    }
}