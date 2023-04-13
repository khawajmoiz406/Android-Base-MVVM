package com.centerpoint.connect.ui.global.service_info.parent;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\"\u001a\u00020#R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001f\u0010\r\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u00140\u00140\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u00a8\u0006$"}, d2 = {"Lcom/centerpoint/connect/ui/global/service_info/parent/ServiceInfoDetailViewModel;", "Lcom/centerpoint/connect/base/BaseViewModel;", "remoteRepo", "Lcom/centerpoint/connect/repository/ServiceInfoDetailRepository;", "sharedPreferences", "Lcom/centerpoint/connect/util/EncryptSharedPref;", "(Lcom/centerpoint/connect/repository/ServiceInfoDetailRepository;Lcom/centerpoint/connect/util/EncryptSharedPref;)V", "addRepairRequestParams", "Lcom/centerpoint/connect/models/request/AddRepairRP;", "getAddRepairRequestParams", "()Lcom/centerpoint/connect/models/request/AddRepairRP;", "setAddRepairRequestParams", "(Lcom/centerpoint/connect/models/request/AddRepairRP;)V", "clockTime", "Landroidx/databinding/ObservableField;", "", "kotlin.jvm.PlatformType", "getClockTime", "()Landroidx/databinding/ObservableField;", "isWatchRunning", "", "repairsLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/centerpoint/connect/models/response/repair/RepairsResponse;", "getRepairsLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setRepairsLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "updateRepairRequestParams", "Lcom/centerpoint/connect/models/request/UpdateRepairRP;", "getUpdateRepairRequestParams", "()Lcom/centerpoint/connect/models/request/UpdateRepairRP;", "setUpdateRepairRequestParams", "(Lcom/centerpoint/connect/models/request/UpdateRepairRP;)V", "getAllRepairs", "Lkotlinx/coroutines/Job;", "app_debug"})
public final class ServiceInfoDetailViewModel extends com.centerpoint.connect.base.BaseViewModel {
    private final com.centerpoint.connect.repository.ServiceInfoDetailRepository remoteRepo = null;
    private final com.centerpoint.connect.util.EncryptSharedPref sharedPreferences = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.String> clockTime = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.Boolean> isWatchRunning = null;
    @org.jetbrains.annotations.NotNull()
    private com.centerpoint.connect.models.request.AddRepairRP addRepairRequestParams;
    @org.jetbrains.annotations.NotNull()
    private com.centerpoint.connect.models.request.UpdateRepairRP updateRepairRequestParams;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.centerpoint.connect.models.response.repair.RepairsResponse> repairsLiveData;
    
    public ServiceInfoDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.centerpoint.connect.repository.ServiceInfoDetailRepository remoteRepo, @org.jetbrains.annotations.NotNull()
    com.centerpoint.connect.util.EncryptSharedPref sharedPreferences) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getClockTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Boolean> isWatchRunning() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.centerpoint.connect.models.request.AddRepairRP getAddRepairRequestParams() {
        return null;
    }
    
    public final void setAddRepairRequestParams(@org.jetbrains.annotations.NotNull()
    com.centerpoint.connect.models.request.AddRepairRP p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.centerpoint.connect.models.request.UpdateRepairRP getUpdateRepairRequestParams() {
        return null;
    }
    
    public final void setUpdateRepairRequestParams(@org.jetbrains.annotations.NotNull()
    com.centerpoint.connect.models.request.UpdateRepairRP p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.centerpoint.connect.models.response.repair.RepairsResponse> getRepairsLiveData() {
        return null;
    }
    
    public final void setRepairsLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.centerpoint.connect.models.response.repair.RepairsResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getAllRepairs() {
        return null;
    }
}