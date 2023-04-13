package com.centerpoint.connect.ui.global.service_info.parent;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\fH\u0016J\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u000f\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\u0018\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$H\u0002J0\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\'2\b\b\u0002\u0010(\u001a\u00020$2\b\b\u0002\u0010)\u001a\u00020$2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010!H\u0002J\u001a\u0010+\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010!J\b\u0010,\u001a\u00020$H\u0016J\u0006\u0010-\u001a\u00020\u0017J\u0015\u0010.\u001a\u0004\u0018\u00010\u00172\u0006\u0010/\u001a\u00020$\u00a2\u0006\u0002\u00100J\u0015\u00101\u001a\u0004\u0018\u00010\u00172\u0006\u0010/\u001a\u00020$\u00a2\u0006\u0002\u00100J\u0016\u00102\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\f2\u0006\u00103\u001a\u000204R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u000f\u0010\u0010\u00a8\u00065"}, d2 = {"Lcom/centerpoint/connect/ui/global/service_info/parent/ServiceInfoDetailFragment;", "Lcom/centerpoint/connect/base/BaseFragment;", "Lcom/centerpoint/connect/databinding/FragmentServiceInfoDetailBinding;", "Lcom/centerpoint/connect/base/listeners/BaseAdapterListener;", "()V", "adapter", "Lcom/centerpoint/connect/ui/global/service_info/parent/adapter/RepairTabAdapter;", "getAdapter", "()Lcom/centerpoint/connect/ui/global/service_info/parent/adapter/RepairTabAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "requestCode", "", "viewModel", "Lcom/centerpoint/connect/ui/global/service_info/parent/ServiceInfoDetailViewModel;", "getViewModel", "()Lcom/centerpoint/connect/ui/global/service_info/parent/ServiceInfoDetailViewModel;", "viewModel$delegate", "getLayoutId", "getSelectedTabId", "Lcom/centerpoint/connect/models/helper/RepairTab;", "Lcom/centerpoint/connect/base/BaseViewModel;", "init", "", "onDestroy", "onItemClick", "position", "item", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "playPauseStopwatch", "start", "", "replaceFragment", "fragment", "Landroidx/fragment/app/Fragment;", "addToBackStack", "clearStack", "bundle", "replaceFragmentAccordingly", "showBackButton", "toggleStopwatch", "toggleStopwatchView", "visible", "(Z)Lkotlin/Unit;", "toggleTabs", "updateTabAccordingly", "state", "Lcom/centerpoint/connect/models/helper/RepairTab$State;", "app_debug"})
public final class ServiceInfoDetailFragment extends com.centerpoint.connect.base.BaseFragment<com.centerpoint.connect.databinding.FragmentServiceInfoDetailBinding> implements com.centerpoint.connect.base.listeners.BaseAdapterListener {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy adapter$delegate = null;
    private int requestCode = 0;
    private java.util.HashMap _$_findViewCache;
    
    public ServiceInfoDetailFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.centerpoint.connect.base.BaseViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean showBackButton() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.centerpoint.connect.ui.global.service_info.parent.adapter.RepairTabAdapter getAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void init() {
    }
    
    private final void playPauseStopwatch(boolean start) {
    }
    
    private final void replaceFragment(androidx.fragment.app.Fragment fragment, boolean addToBackStack, boolean clearStack, android.os.Bundle bundle) {
    }
    
    public final void replaceFragmentAccordingly(int requestCode, @org.jetbrains.annotations.Nullable()
    android.os.Bundle bundle) {
    }
    
    public final void updateTabAccordingly(int requestCode, @org.jetbrains.annotations.NotNull()
    com.centerpoint.connect.models.helper.RepairTab.State state) {
    }
    
    public final void toggleStopwatch() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Unit toggleStopwatchView(boolean visible) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Unit toggleTabs(boolean visible) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.centerpoint.connect.models.helper.RepairTab getSelectedTabId() {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroy() {
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