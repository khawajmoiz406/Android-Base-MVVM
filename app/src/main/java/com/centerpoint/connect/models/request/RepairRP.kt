package com.centerpoint.connect.models.request

import android.graphics.Bitmap
import androidx.databinding.ObservableField
import com.centerpoint.connect.base.BaseRequestParams

data class RepairRP(
    val managerName: String = "",
    val quantity: String = "",
    val description: String = "",
    val correction: String = "",
    val roofPenetrate: Boolean = false,
    var repairUrl: String = "",
    var location: String? = "",
    var resolutionBitmap: ObservableField<Bitmap?> = ObservableField(),
) : BaseRequestParams() {
    override fun toMap() = mapOf(
        "" to ""
    )
}