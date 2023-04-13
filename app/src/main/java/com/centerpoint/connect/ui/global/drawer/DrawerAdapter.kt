package com.centerpoint.connect.ui.global.drawer

import com.centerpoint.connect.R
import com.centerpoint.connect.base.BaseAdapter
import com.centerpoint.connect.base.listeners.BaseAdapterListener
import com.centerpoint.connect.constants.ITEM_LOGOUT
import com.centerpoint.connect.databinding.ItemDrawerBinding
import com.centerpoint.connect.models.helper.Drawer

class DrawerAdapter(private val adapterListeners: BaseAdapterListener? = null) :
    BaseAdapter<ItemDrawerBinding, BaseAdapterListener>() {
    override fun layout(position: Int): Int = R.layout.item_drawer
    override fun getListener(): BaseAdapterListener? = adapterListeners

    private val items = arrayListOf(
        Drawer(R.drawable.ic_projects, R.string.projects, R.id.projectsFragment, false),
        Drawer(R.drawable.ic_service_schedule, R.string.service_schedule, R.id.servicesFragment, true),
        Drawer(R.drawable.ic_crm, R.string.crm_schedule, R.id.projectsFragment, false),
        Drawer(R.drawable.ic_logout, R.string.logout, ITEM_LOGOUT, false),
    )

    init {
        addData(items)
    }
}