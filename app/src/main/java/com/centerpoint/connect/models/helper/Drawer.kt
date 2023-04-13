package com.centerpoint.connect.models.helper

import androidx.annotation.DrawableRes
import androidx.annotation.IdRes
import androidx.annotation.StringRes

data class Drawer(
    @DrawableRes var icon: Int,
    @StringRes var title: Int,
    @IdRes var fragment: Int,
    var selected: Boolean
) : java.io.Serializable