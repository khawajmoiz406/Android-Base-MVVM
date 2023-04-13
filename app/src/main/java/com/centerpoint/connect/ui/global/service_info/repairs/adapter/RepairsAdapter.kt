package com.centerpoint.connect.ui.global.service_info.repairs.adapter

import com.centerpoint.connect.R
import com.centerpoint.connect.base.BaseAdapter
import com.centerpoint.connect.base.listeners.BaseAdapterListener
import com.centerpoint.connect.databinding.ItemRepairsBinding

class RepairsAdapter(private val adapterListeners: BaseAdapterListener? = null) :
    BaseAdapter<ItemRepairsBinding, BaseAdapterListener>() {
    override fun layout(position: Int): Int = R.layout.item_repairs
    override fun getListener(): BaseAdapterListener? = adapterListeners
}