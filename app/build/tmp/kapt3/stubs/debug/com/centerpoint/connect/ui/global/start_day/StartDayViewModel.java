package com.centerpoint.connect.ui.global.start_day;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/centerpoint/connect/ui/global/start_day/StartDayViewModel;", "Lcom/centerpoint/connect/base/BaseViewModel;", "remoteRepo", "Lcom/centerpoint/connect/repository/AttendanceRepository;", "sharedPreferences", "Lcom/centerpoint/connect/util/EncryptSharedPref;", "(Lcom/centerpoint/connect/repository/AttendanceRepository;Lcom/centerpoint/connect/util/EncryptSharedPref;)V", "attendanceLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/centerpoint/connect/models/response/attendance/AttendanceResponse;", "getAttendanceLiveData", "()Landroidx/lifecycle/MutableLiveData;", "costCodesLiveData", "Lcom/centerpoint/connect/models/response/attendance/CostCodesResponse;", "getCostCodesLiveData", "requestParams", "Lcom/centerpoint/connect/models/request/AttendanceRP;", "getRequestParams", "()Lcom/centerpoint/connect/models/request/AttendanceRP;", "getCostCodeList", "Lkotlinx/coroutines/Job;", "markAttendance", "type", "", "app_debug"})
public final class StartDayViewModel extends com.centerpoint.connect.base.BaseViewModel {
    private final com.centerpoint.connect.repository.AttendanceRepository remoteRepo = null;
    private final com.centerpoint.connect.util.EncryptSharedPref sharedPreferences = null;
    @org.jetbrains.annotations.NotNull()
    private final com.centerpoint.connect.models.request.AttendanceRP requestParams = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.centerpoint.connect.models.response.attendance.AttendanceResponse> attendanceLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.centerpoint.connect.models.response.attendance.CostCodesResponse> costCodesLiveData = null;
    
    public StartDayViewModel(@org.jetbrains.annotations.NotNull()
    com.centerpoint.connect.repository.AttendanceRepository remoteRepo, @org.jetbrains.annotations.NotNull()
    com.centerpoint.connect.util.EncryptSharedPref sharedPreferences) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.centerpoint.connect.models.request.AttendanceRP getRequestParams() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.centerpoint.connect.models.response.attendance.AttendanceResponse> getAttendanceLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.centerpoint.connect.models.response.attendance.CostCodesResponse> getCostCodesLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job markAttendance(int type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getCostCodeList() {
        return null;
    }
}