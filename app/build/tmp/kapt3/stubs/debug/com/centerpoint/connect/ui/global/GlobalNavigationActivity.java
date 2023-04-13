package com.centerpoint.connect.ui.global;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\r\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0002\u0010\u0013J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0002H\u0002J\u0006\u0010\u001b\u001a\u00020\u0017J\b\u0010\u001c\u001a\u00020\u0017H\u0016J\b\u0010\u001d\u001a\u00020\u0017H\u0016J\u0012\u0010\u001e\u001a\u00020\u00172\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\b\u0010!\u001a\u00020\u0017H\u0016J\u0018\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u0017H\u0016J\b\u0010\'\u001a\u00020\u0017H\u0016J\u0010\u0010(\u001a\u00020\u00172\b\u0010)\u001a\u0004\u0018\u00010*J\u0006\u0010+\u001a\u00020\u0002J\u0016\u0010,\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\u0019R\u001b\u0010\u0007\u001a\u00020\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006/"}, d2 = {"Lcom/centerpoint/connect/ui/global/GlobalNavigationActivity;", "Lcom/centerpoint/connect/base/BaseActivity;", "Lcom/centerpoint/connect/databinding/ActivityGlobalNavigationBinding;", "Lcom/centerpoint/connect/base/listeners/BaseAdapterListener;", "Lcom/centerpoint/connect/base/listeners/NavigationListeners;", "Lcom/centerpoint/connect/base/listeners/ToolbarListeners;", "()V", "adapter", "Lcom/centerpoint/connect/ui/global/drawer/DrawerAdapter;", "getAdapter", "()Lcom/centerpoint/connect/ui/global/drawer/DrawerAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "changeTitle", "str", "", "getLayoutId", "", "getNavHostId", "()Ljava/lang/Integer;", "getViewModel", "Lcom/centerpoint/connect/base/BaseViewModel;", "hasConnectivity", "", "connectivity", "", "initToolbar", "logoutUser", "onBackClicked", "onClockClicked", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onEndIconClicked", "onItemClick", "position", "item", "", "onProfileClicked", "onStartIconClicked", "onUserDataUpdated", "user", "Lcom/centerpoint/connect/models/helper/User;", "toggleDrawer", "toggleToolbar", "visible", "showBackButton", "app_debug"})
public final class GlobalNavigationActivity extends com.centerpoint.connect.base.BaseActivity<com.centerpoint.connect.databinding.ActivityGlobalNavigationBinding> implements com.centerpoint.connect.base.listeners.BaseAdapterListener, com.centerpoint.connect.base.listeners.NavigationListeners, com.centerpoint.connect.base.listeners.ToolbarListeners {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy adapter$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public GlobalNavigationActivity() {
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
    public java.lang.Integer getNavHostId() {
        return null;
    }
    
    @java.lang.Override()
    public void hasConnectivity(boolean connectivity) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.centerpoint.connect.ui.global.drawer.DrawerAdapter getAdapter() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final com.centerpoint.connect.databinding.ActivityGlobalNavigationBinding initToolbar() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.centerpoint.connect.databinding.ActivityGlobalNavigationBinding toggleDrawer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.centerpoint.connect.databinding.ActivityGlobalNavigationBinding toggleToolbar(boolean visible, boolean showBackButton) {
        return null;
    }
    
    public final void logoutUser() {
    }
    
    public final void onUserDataUpdated(@org.jetbrains.annotations.Nullable()
    com.centerpoint.connect.models.helper.User user) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.centerpoint.connect.databinding.ActivityGlobalNavigationBinding changeTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String str) {
        return null;
    }
    
    @java.lang.Override()
    public void onItemClick(int position, @org.jetbrains.annotations.NotNull()
    java.lang.Object item) {
    }
    
    @java.lang.Override()
    public void onBackClicked() {
    }
    
    @java.lang.Override()
    public void onProfileClicked() {
    }
    
    @java.lang.Override()
    public void onStartIconClicked() {
    }
    
    @java.lang.Override()
    public void onEndIconClicked() {
    }
    
    @java.lang.Override()
    public void onClockClicked() {
    }
    
    public boolean isLoading() {
        return false;
    }
    
    public void onLoadMore(int pageNo) {
    }
}