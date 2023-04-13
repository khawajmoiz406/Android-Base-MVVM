package com.centerpoint.connect.models.request

import androidx.databinding.ObservableField
import com.centerpoint.connect.base.BaseRequestParams
import com.centerpoint.connect.constants.CHECK_IN

data class CheckInRP(
    var managerName: ObservableField<String> = ObservableField(""),
    var notes: ObservableField<String> = ObservableField("")
) : BaseRequestParams() {
    override fun toMap() = mapOf(
        "managerName" to (managerName.get() ?: ""),
        "notes" to (notes.get() ?: "")
    )
}