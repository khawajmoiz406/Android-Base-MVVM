package com.centerpoint.connect.ui.global.service_schedule.adapter

import com.centerpoint.connect.R
import com.centerpoint.connect.base.BaseAdapter
import com.centerpoint.connect.base.listeners.BaseAdapterListener
import com.centerpoint.connect.databinding.ItemServicesBinding

class ServicesAdapter(private val adapterListeners: BaseAdapterListener? = null) :
    BaseAdapter<ItemServicesBinding, BaseAdapterListener>() {
    override fun layout(position: Int): Int = R.layout.item_services
    override fun getListener(): BaseAdapterListener? = adapterListeners
}