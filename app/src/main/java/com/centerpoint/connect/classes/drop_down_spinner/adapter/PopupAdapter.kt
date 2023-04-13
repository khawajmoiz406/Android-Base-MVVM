package com.centerpoint.connect.classes.drop_down_spinner.adapter

import com.centerpoint.connect.R
import com.centerpoint.connect.base.BaseAdapter
import com.centerpoint.connect.base.listeners.BaseAdapterListener
import com.centerpoint.connect.databinding.ItemPopupBinding

class PopupAdapter(private val adapterListeners: BaseAdapterListener? = null) :
    BaseAdapter<ItemPopupBinding, BaseAdapterListener>() {
    override fun layout(position: Int): Int = R.layout.item_popup
    override fun getListener(): BaseAdapterListener? = adapterListeners
}