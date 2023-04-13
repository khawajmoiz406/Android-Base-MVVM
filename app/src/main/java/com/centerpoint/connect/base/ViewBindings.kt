package com.centerpoint.connect.base

import android.graphics.Bitmap
import android.graphics.drawable.GradientDrawable
import android.view.View
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.appcompat.widget.AppCompatImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.centerpoint.connect.base.listeners.BaseAdapterListener
import com.centerpoint.connect.classes.expandable_view.ExpandableView
import com.centerpoint.connect.util.Paginator

@BindingAdapter("loadImage")
fun loadImageWithGlide(view: AppCompatImageView, url: String?) {
    if (!url.isNullOrEmpty()) {
        Glide.with(view.context)
            .load(url)
            .into(view)
    }
}

@BindingAdapter("adapter")
fun bindRecyclerViewAdapter(recyclerView: RecyclerView, adapter: BaseAdapter<*, *>) {
    recyclerView.adapter = recyclerView.adapter ?: adapter
}

@BindingAdapter("paginator")
fun RecyclerView.bindPagination(listeners: BaseAdapterListener) {
    Paginator(
        this,
        isLoading = { return@Paginator listeners.isLoading() },
        loadMore = { listeners.onLoadMore(it) }
    ).run {
        currentPage = 1
    }
}

@BindingAdapter("setImageRes", requireAll = false)
fun AppCompatImageView.bindImageWithResId(@DrawableRes id: Int?) {
    id?.let { setImageResource(it) }
}

@BindingAdapter("setImageBitmap", requireAll = false)
fun AppCompatImageView.bindImageWithBitmap(bitmap: Bitmap?) {
    bitmap?.let { setImageBitmap(it) }
}

@BindingAdapter("visible", requireAll = false)
fun View.bindVisibility(visible: Boolean?) = visible?.let {
    visibility = if (it) View.VISIBLE else View.GONE
}

@BindingAdapter("invisible", requireAll = false)
fun View.bindInVisibility(invisible: Boolean?) = invisible?.let {
    visibility = if (it) View.INVISIBLE else View.VISIBLE
}

@BindingAdapter(
    value = [
        "setSubHeading", "setSubHeadingColor", "setSubHeadingDesc"
    ], requireAll = false
)
fun ExpandableView.bindValues(subHeading: String?, subHeadingColor: Int?, subHeadingDesc: String?) {
    subHeading?.let { mSubHeading = it }
    subHeadingColor?.let { mSubHeadingColor = it }
    subHeadingDesc?.let { mSubHeadingDesc = it }
}

@BindingAdapter(
    value = ["backgroundColor", "strokeColor", "strokeWidth", "topCorners", "bottomCorners"],
    requireAll = false
)
fun View.bindCustomBackground(
    @ColorRes backgroundColor: Int?,
    @ColorRes strokeColor: Int?,
    strokeWidth: Float?,
    topCorners: Float?,
    bottomCorners: Float?
) {
    this.background = GradientDrawable().apply {
        backgroundColor?.let {
            setColor(it)
        }
        strokeColor?.let {
            setStroke(strokeWidth?.toInt() ?: 4, it)
        }
        if (topCorners != null && bottomCorners != null) {
            cornerRadii = floatArrayOf(
                //top left
                topCorners,
                topCorners,
                //top right
                topCorners,
                topCorners,
                //bottom right
                bottomCorners,
                bottomCorners,
                //bottom left
                bottomCorners,
                bottomCorners
            )
        } else if (topCorners != null) {
            cornerRadii = floatArrayOf(
                //top left
                topCorners,
                topCorners,
                //top right
                topCorners,
                topCorners,
                //bottom right
                0f,
                0f,
                //bottom left
                0f,
                0f,
            )
        } else if (bottomCorners != null) {
            cornerRadii = floatArrayOf(
                //top left
                0f,
                0f,
                //top right
                0f,
                0f,
                //bottom right
                bottomCorners,
                bottomCorners,
                //bottom left
                bottomCorners,
                bottomCorners
            )
        }
    }
}