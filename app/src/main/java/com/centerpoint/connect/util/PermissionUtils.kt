package com.centerpoint.connect.util

import android.Manifest
import android.app.Activity
import android.content.pm.PackageManager
import androidx.core.content.ContextCompat

/**
@author Khawaja Moiz
created on 1/24/23
 **/
object PermissionUtils {

    val cameraPermissions = arrayOf(Manifest.permission.CAMERA)

    @JvmStatic
    fun allPermissionsGranted(activity: Activity, permissions: Array<String>): Boolean {
        var allGranted = true

        permissions.forEach {
            if (ContextCompat.checkSelfPermission(activity, it) !=
                PackageManager.PERMISSION_GRANTED && it != Manifest.permission.WRITE_EXTERNAL_STORAGE
            ) {
                allGranted = false
                return@forEach
            }
        }
        return allGranted
    }
}