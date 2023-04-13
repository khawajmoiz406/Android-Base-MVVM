package com.centerpoint.connect.ui.global.ticket_info.adapter

import com.centerpoint.connect.R
import com.centerpoint.connect.base.BaseAdapter
import com.centerpoint.connect.base.listeners.BaseAdapterListener
import com.centerpoint.connect.databinding.ItemServiceRepairsBinding

class ServiceRepairAdapter(private val adapterListeners: BaseAdapterListener? = null) :
    BaseAdapter<ItemServiceRepairsBinding, BaseAdapterListener>() {
    override fun layout(position: Int): Int = R.layout.item_service_repairs
    override fun getListener(): BaseAdapterListener? = adapterListeners

    init {
        addData(listOf("", ""))
    }
}