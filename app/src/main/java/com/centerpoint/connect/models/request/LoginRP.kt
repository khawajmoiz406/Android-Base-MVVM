package com.centerpoint.connect.models.request

import androidx.databinding.ObservableField
import com.centerpoint.connect.base.BaseRequestParams

data class LoginRP(
    val email: ObservableField<String> = ObservableField(""),
    val password: ObservableField<String> = ObservableField("")
) : BaseRequestParams() {
    override fun toMap() = mapOf(
        "Email" to (email.get() ?: ""),
        "Password" to (password.get() ?: ""),
    )
}