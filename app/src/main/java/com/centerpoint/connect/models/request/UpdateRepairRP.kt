package com.centerpoint.connect.models.request

import android.graphics.Bitmap
import androidx.databinding.ObservableField
import com.centerpoint.connect.base.BaseRequestParams

data class UpdateRepairRP(
    var repairBitmap: ObservableField<Bitmap?> = ObservableField(),
    var resolutionBitmap: ObservableField<Bitmap?> = ObservableField(),
    var signatureBitmap: ObservableField<Bitmap?> = ObservableField(),
    var managerName: ObservableField<String> = ObservableField("")
) : BaseRequestParams() {
    override fun toMap() = mapOf(
        "" to ""
    )

    fun clearConfirmation() {
        signatureBitmap = ObservableField()
        managerName = ObservableField()
    }

    fun clearFields() {
        repairBitmap = ObservableField()
        resolutionBitmap = ObservableField()
        signatureBitmap = ObservableField()
        managerName = ObservableField("")
    }
}