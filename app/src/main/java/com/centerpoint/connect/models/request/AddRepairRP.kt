package com.centerpoint.connect.models.request

import android.graphics.Bitmap
import androidx.databinding.ObservableField
import com.centerpoint.connect.base.BaseRequestParams

data class AddRepairRP(
    var managerName: ObservableField<String> = ObservableField(""),
    var quantity: ObservableField<String> = ObservableField(""),
    var unit: ObservableField<String> = ObservableField(""),
    var description: ObservableField<String> = ObservableField(""),
    var correction: ObservableField<String> = ObservableField(""),
    var roofPenetrate: ObservableField<Boolean> = ObservableField(false),
    var repairBitmap: ObservableField<Bitmap?> = ObservableField(),
    var location: String? = "",
) : BaseRequestParams() {
    override fun toMap() = mapOf(
        "managerName" to (managerName.get() ?: ""),
        "quantity" to (quantity.get() + (unit.get())),
        "description" to (description.get() ?: ""),
        "correction" to (correction.get() ?: ""),
        "roofPenetrate" to (roofPenetrate.get() ?: false).toString()
    )

    fun clearFields() {
        managerName = ObservableField()
        quantity = ObservableField()
        unit = ObservableField()
        description = ObservableField()
        correction = ObservableField()
        roofPenetrate = ObservableField(false)
        repairBitmap = ObservableField()
        location = ""
    }
}