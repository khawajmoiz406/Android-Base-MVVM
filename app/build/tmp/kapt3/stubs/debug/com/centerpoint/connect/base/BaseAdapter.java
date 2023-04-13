package com.centerpoint.connect.base;

import java.lang.System;

/**
 * @author Salman Aziz
 * created on 2/22/21
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00060\u0005B\u0005\u00a2\u0006\u0002\u0010\u0007J\u001a\u0010\u0011\u001a\u00020\u0012\"\u0004\b\u0002\u0010\u00132\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0014J&\u0010\u0015\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\fH\u0016J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\b\u0010\u0019\u001a\u00020\fH\u0016J\u0010\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\fH\u0016J\u000f\u0010\u001b\u001a\u0004\u0018\u00018\u0001H$\u00a2\u0006\u0002\u0010\u001cJ\u001f\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\b\b\u0001\u0010 \u001a\u00020\fH\u0002\u00a2\u0006\u0002\u0010!J\u0010\u0010\"\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\fH$J\u001e\u0010#\u001a\u00020\u00122\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u0018\u001a\u00020\fH\u0016J \u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010&\u001a\u00020\u001f2\b\b\u0001\u0010\"\u001a\u00020\fH\u0016J\u001c\u0010\'\u001a\u00020\u0012\"\u0004\b\u0002\u0010\u00132\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0014H\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006)"}, d2 = {"Lcom/centerpoint/connect/base/BaseAdapter;", "B", "Landroidx/databinding/ViewDataBinding;", "L", "Lcom/centerpoint/connect/base/listeners/BaseAdapterListener;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/centerpoint/connect/base/BaseViewHolder;", "()V", "data", "", "", "totalCount", "", "getTotalCount", "()I", "setTotalCount", "(I)V", "addData", "", "T", "", "bind", "holder", "item", "position", "getItemCount", "getItemViewType", "getListener", "()Lcom/centerpoint/connect/base/listeners/BaseAdapterListener;", "inflateView", "viewGroup", "Landroid/view/ViewGroup;", "viewType", "(Landroid/view/ViewGroup;I)Landroidx/databinding/ViewDataBinding;", "layout", "onBindViewHolder", "viewHolder", "onCreateViewHolder", "parent", "updateDate", "list", "app_debug"})
public abstract class BaseAdapter<B extends androidx.databinding.ViewDataBinding, L extends com.centerpoint.connect.base.listeners.BaseAdapterListener> extends androidx.recyclerview.widget.RecyclerView.Adapter<com.centerpoint.connect.base.BaseViewHolder<B>> {
    private java.util.List<java.lang.Object> data;
    private int totalCount = 0;
    
    public BaseAdapter() {
        super();
    }
    
    public final int getTotalCount() {
        return 0;
    }
    
    public final void setTotalCount(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> data() {
        return null;
    }
    
    public final <T extends java.lang.Object>void addData(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> data) {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final <T extends java.lang.Object>void updateDate(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> list) {
    }
    
    protected abstract int layout(int position);
    
    @org.jetbrains.annotations.Nullable()
    protected abstract L getListener();
    
    public void bind(@org.jetbrains.annotations.NotNull()
    com.centerpoint.connect.base.BaseViewHolder<B> holder, @org.jetbrains.annotations.NotNull()
    java.lang.Object item, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.centerpoint.connect.base.BaseViewHolder<B> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, @androidx.annotation.LayoutRes()
    int layout) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.centerpoint.connect.base.BaseViewHolder<B> viewHolder, int position) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    private final B inflateView(android.view.ViewGroup viewGroup, @androidx.annotation.LayoutRes()
    int viewType) {
        return null;
    }
}