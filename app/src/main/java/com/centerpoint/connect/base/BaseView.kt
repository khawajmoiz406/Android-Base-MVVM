package com.centerpoint.connect.base

import android.os.Bundle
import androidx.appcompat.widget.AppCompatEditText
import androidx.navigation.NavDirections
import com.centerpoint.connect.models.helper.ResponseCallback

/**
@author Salman Aziz
created on 2/22/21
 **/

interface BaseView {
    fun setSoftInputMode(mode: Int)
    fun resetSoftInputMode()
    fun showKeyboard(editText: AppCompatEditText)
    fun hideKeyboard()
    fun noConnectivity()
    fun loaderVisibility(visibility: Boolean)
    fun showToast(message: String?)
    fun onApiResponse(callback: ResponseCallback)
    fun navigateToDestination(direction: NavDirections)
    fun navigateToDestination(id: Int, args: Bundle)
    fun navigateToDestination(id: Int, clearStack: Boolean)
    fun getNavHostId(): Int?
    fun getLayoutId(): Int
}