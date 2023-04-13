package com.centerpoint.connect.base.listeners

interface BaseAdapterListener {
    fun onItemClick(position: Int, item: Any)
    fun onLoadMore(pageNo: Int) {}
    fun isLoading(): Boolean { return false }
}