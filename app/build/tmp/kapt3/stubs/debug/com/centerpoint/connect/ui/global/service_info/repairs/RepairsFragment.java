package com.centerpoint.connect.ui.global.service_info.repairs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\u0006\u0010\u0014\u001a\u00020\u0015J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\"H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006#"}, d2 = {"Lcom/centerpoint/connect/ui/global/service_info/repairs/RepairsFragment;", "Lcom/centerpoint/connect/base/BaseFragment;", "Lcom/centerpoint/connect/databinding/FragmentRepairsBinding;", "Lcom/centerpoint/connect/base/listeners/BaseAdapterListener;", "()V", "adapter", "Lcom/centerpoint/connect/ui/global/service_info/repairs/adapter/RepairsAdapter;", "getAdapter", "()Lcom/centerpoint/connect/ui/global/service_info/repairs/adapter/RepairsAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "callRepairsApi", "Lkotlinx/coroutines/Job;", "getLayoutId", "", "getViewModel", "Lcom/centerpoint/connect/base/BaseViewModel;", "init", "", "linkLiveData", "onAddRepairClicked", "Lcom/centerpoint/connect/ui/global/service_info/parent/ServiceInfoDetailFragment;", "onItemClick", "position", "item", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showBackButton", "", "title", "", "app_debug"})
public final class RepairsFragment extends com.centerpoint.connect.base.BaseFragment<com.centerpoint.connect.databinding.FragmentRepairsBinding> implements com.centerpoint.connect.base.listeners.BaseAdapterListener {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy adapter$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public RepairsFragment() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.centerpoint.connect.base.BaseViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String title() {
        return null;
    }
    
    @java.lang.Override()
    public boolean showBackButton() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.centerpoint.connect.ui.global.service_info.repairs.adapter.RepairsAdapter getAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void init() {
    }
    
    private final void linkLiveData() {
    }
    
    private final kotlinx.coroutines.Job callRepairsApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailFragment onAddRepairClicked() {
        return null;
    }
    
    @java.lang.Override()
    public void onItemClick(int position, @org.jetbrains.annotations.NotNull()
    java.lang.Object item) {
    }
    
    public boolean isLoading() {
        return false;
    }
    
    public void onLoadMore(int pageNo) {
    }
}