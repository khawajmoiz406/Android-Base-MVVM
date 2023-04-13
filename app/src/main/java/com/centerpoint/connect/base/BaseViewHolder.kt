package com.centerpoint.connect.base

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

/**
@author Khawaja Moiz
created on 12/01/23
 **/

open class BaseViewHolder<V : ViewDataBinding>(val binding: ViewDataBinding) :
    RecyclerView.ViewHolder(binding.root)