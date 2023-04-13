package com.centerpoint.connect.base

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.centerpoint.connect.BR
import com.centerpoint.connect.base.listeners.BaseAdapterListener
import java.util.ArrayList
/**
@author Salman Aziz
created on 2/22/21
 **/

abstract class BaseAdapter<B:ViewDataBinding, L: BaseAdapterListener> : RecyclerView.Adapter<BaseViewHolder<B>>() {
    private var data = mutableListOf<Any>()
    var totalCount:Int=0

    fun data(): MutableList<Any> {
        return data
    }

    fun <T> addData(data: List<T>) {
        data().addAll(ArrayList<Any>(data))
    }

    @SuppressLint("NotifyDataSetChanged")
    fun <T> updateDate(list: List<T>){
        data = ArrayList(list)
        notifyDataSetChanged()
    }

    protected abstract fun layout(position: Int): Int
    protected abstract fun getListener(): L?

    open fun bind(holder: BaseViewHolder<B> , item: Any, position: Int) {}

    override fun onCreateViewHolder(parent: ViewGroup,  @LayoutRes layout: Int): BaseViewHolder<B> {
        val view = inflateView(parent, layout)
        return BaseViewHolder(view)
    }

    override fun getItemCount(): Int {
        return  data().size
    }

    override fun onBindViewHolder(viewHolder: BaseViewHolder<B>, position: Int) {
        val data = data()[position]
        try {
            viewHolder.apply {
                binding.setVariable(BR.data , data)
                binding.setVariable(BR.itemCount , data().size)
                binding.setVariable(BR.position , position)
                binding.setVariable(BR.listeners , getListener())
                bind(viewHolder, data, position)
                binding.executePendingBindings()
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    override fun getItemViewType(position: Int): Int {
        return layout(position)
    }

    private fun inflateView(viewGroup: ViewGroup, @LayoutRes viewType: Int): B {
        return DataBindingUtil.inflate(
            LayoutInflater.from(viewGroup.context),
            viewType,
            viewGroup,
            false
        )

    }
}