package com.centerpoint.connect.models.helper

import androidx.annotation.DrawableRes

data class RepairTab(
    var requestCode: Int,
    @DrawableRes var imageRes: Int,
    var state: State = State.DISABLED,
    var selectable: Boolean = false,
) : java.io.Serializable {

    enum class State {
        DISABLED,
        SELECTED,
        COMPLETED
    }
}