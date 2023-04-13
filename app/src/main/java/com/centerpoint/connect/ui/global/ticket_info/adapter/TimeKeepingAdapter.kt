package com.centerpoint.connect.ui.global.ticket_info.adapter

import com.centerpoint.connect.R
import com.centerpoint.connect.base.BaseAdapter
import com.centerpoint.connect.base.listeners.BaseAdapterListener
import com.centerpoint.connect.databinding.ItemTimeKeepingBinding

class TimeKeepingAdapter(private val adapterListeners: BaseAdapterListener? = null) :
    BaseAdapter<ItemTimeKeepingBinding, BaseAdapterListener>() {
    override fun layout(position: Int): Int = R.layout.item_time_keeping
    override fun getListener(): BaseAdapterListener? = adapterListeners

    init {
        addData(listOf("", ""))
    }
}