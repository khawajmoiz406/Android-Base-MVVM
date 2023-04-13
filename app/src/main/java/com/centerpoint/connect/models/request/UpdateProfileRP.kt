package com.centerpoint.connect.models.request

import androidx.databinding.ObservableField
import com.centerpoint.connect.base.BaseRequestParams

data class UpdateProfileRP(
    val email: ObservableField<String> = ObservableField(""),
    val officePhone: ObservableField<String> = ObservableField(""),
    val mobilePhone: ObservableField<String> = ObservableField("")
) : BaseRequestParams() {
    override fun toMap() = mapOf(
        "Email" to (email.get() ?: ""),
        "OfficePhone" to (officePhone.get() ?: ""),
        "MobilePhone" to (mobilePhone.get() ?: ""),
    )
}