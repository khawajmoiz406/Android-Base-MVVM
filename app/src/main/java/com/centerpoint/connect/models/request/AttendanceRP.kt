package com.centerpoint.connect.models.request

import androidx.databinding.ObservableField
import com.centerpoint.connect.base.BaseRequestParams
import com.centerpoint.connect.constants.CHECK_IN

data class AttendanceRP(
    var attendanceType: Int = CHECK_IN
) : BaseRequestParams() {
    override fun toMap() = mapOf(
        "attendanceType" to attendanceType.toString()
    )
}