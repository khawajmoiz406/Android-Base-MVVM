package com.centerpoint.connect.ui.global.ticket_info;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u0016\u001a\u00020\u001bH\u0016J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u001dJ\b\u0010\u001f\u001a\u00020\u0002H\u0002J\u001a\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020&H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000f\u001a\u00020\u00108FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\'"}, d2 = {"Lcom/centerpoint/connect/ui/global/ticket_info/TicketInfoFragment;", "Lcom/centerpoint/connect/base/BaseFragment;", "Lcom/centerpoint/connect/databinding/FragmentTicketInfoBinding;", "()V", "emAdapter", "Lcom/centerpoint/connect/ui/global/ticket_info/adapter/EstimateMaterialAdapter;", "getEmAdapter", "()Lcom/centerpoint/connect/ui/global/ticket_info/adapter/EstimateMaterialAdapter;", "emAdapter$delegate", "Lkotlin/Lazy;", "srAdapter", "Lcom/centerpoint/connect/ui/global/ticket_info/adapter/ServiceRepairAdapter;", "getSrAdapter", "()Lcom/centerpoint/connect/ui/global/ticket_info/adapter/ServiceRepairAdapter;", "srAdapter$delegate", "tkAdapter", "Lcom/centerpoint/connect/ui/global/ticket_info/adapter/TimeKeepingAdapter;", "getTkAdapter", "()Lcom/centerpoint/connect/ui/global/ticket_info/adapter/TimeKeepingAdapter;", "tkAdapter$delegate", "viewModel", "Lcom/centerpoint/connect/ui/global/ticket_info/TicketInfoViewModel;", "getViewModel", "()Lcom/centerpoint/connect/ui/global/ticket_info/TicketInfoViewModel;", "viewModel$delegate", "getLayoutId", "", "Lcom/centerpoint/connect/base/BaseViewModel;", "gotoCheckInFragment", "", "gotoLocationDetailFragment", "init", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showBackButton", "", "app_debug"})
public final class TicketInfoFragment extends com.centerpoint.connect.base.BaseFragment<com.centerpoint.connect.databinding.FragmentTicketInfoBinding> {
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy tkAdapter$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy srAdapter$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy emAdapter$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public TicketInfoFragment() {
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
    
    private final com.centerpoint.connect.ui.global.ticket_info.TicketInfoViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.centerpoint.connect.ui.global.ticket_info.adapter.TimeKeepingAdapter getTkAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.centerpoint.connect.ui.global.ticket_info.adapter.ServiceRepairAdapter getSrAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.centerpoint.connect.ui.global.ticket_info.adapter.EstimateMaterialAdapter getEmAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final com.centerpoint.connect.databinding.FragmentTicketInfoBinding init() {
        return null;
    }
    
    public final void gotoCheckInFragment() {
    }
    
    public final void gotoLocationDetailFragment() {
    }
}