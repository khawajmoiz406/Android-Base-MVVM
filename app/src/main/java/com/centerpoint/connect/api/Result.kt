package com.centerpoint.connect.api

import com.centerpoint.connect.models.helper.ErrorDescription
/**
@author Salman Aziz
created on 2/22/21
 **/

sealed class Result<T> {

    class Loading<T>(var showLoader: Boolean=false):Result<T>()
    class Success<T>(var data: T) : Result<T>()
    class Failure<E>(val e: ErrorDescription?) : Result<E>()
    class NetworkError<E>(val e: ErrorDescription?) : Result<E>()

}