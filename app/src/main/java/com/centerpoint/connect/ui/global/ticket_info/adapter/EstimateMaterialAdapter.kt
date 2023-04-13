package com.centerpoint.connect.ui.global.ticket_info.adapter

import com.centerpoint.connect.R
import com.centerpoint.connect.base.BaseAdapter
import com.centerpoint.connect.base.listeners.BaseAdapterListener
import com.centerpoint.connect.databinding.ItemEstimateMaterialBinding

class EstimateMaterialAdapter(private val adapterListeners: BaseAdapterListener? = null) :
    BaseAdapter<ItemEstimateMaterialBinding, BaseAdapterListener>() {
    override fun layout(position: Int): Int = R.layout.item_estimate_material
    override fun getListener(): BaseAdapterListener? = adapterListeners

    init {
        addData(listOf("", "", ""))
    }
}