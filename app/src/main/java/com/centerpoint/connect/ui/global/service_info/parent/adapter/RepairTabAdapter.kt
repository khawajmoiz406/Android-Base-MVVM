package com.centerpoint.connect.ui.global.service_info.parent.adapter

import com.centerpoint.connect.R
import com.centerpoint.connect.base.BaseAdapter
import com.centerpoint.connect.base.listeners.BaseAdapterListener
import com.centerpoint.connect.constants.*
import com.centerpoint.connect.databinding.ItemRepairsTabBinding
import com.centerpoint.connect.models.helper.RepairTab

class RepairTabAdapter(private val adapterListeners: BaseAdapterListener? = null) :
    BaseAdapter<ItemRepairsTabBinding, BaseAdapterListener>() {
    override fun layout(position: Int): Int = R.layout.item_repairs_tab
    override fun getListener(): BaseAdapterListener? = adapterListeners

    init {
        addData(
            listOf(
                RepairTab(101, R.drawable.ic_clock, RepairTab.State.COMPLETED),
                RepairTab(111, R.drawable.ic_clock, RepairTab.State.COMPLETED),
                RepairTab(ADD_SITE_BID_REQUEST_CODE, R.drawable.ic_clock, RepairTab.State.DISABLED, selectable = true),
                RepairTab(REPAIR_DETAIL_REQUEST_CODE, R.drawable.ic_clock, RepairTab.State.DISABLED),
                RepairTab(REVIEW_WORK_REQUEST_CODE, R.drawable.ic_clock, RepairTab.State.DISABLED),
                RepairTab(CONFIRMATION_REQUEST_CODE, R.drawable.ic_clock, RepairTab.State.DISABLED),
                RepairTab(102, R.drawable.ic_clock, RepairTab.State.DISABLED),
            )
        )
    }
}