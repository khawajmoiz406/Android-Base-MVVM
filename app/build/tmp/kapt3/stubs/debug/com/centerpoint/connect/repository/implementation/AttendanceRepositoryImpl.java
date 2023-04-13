package com.centerpoint.connect.repository.implementation;

import java.lang.System;

@kotlin.Suppress(names = {"UNCHECKED_CAST"})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J!\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ!\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/centerpoint/connect/repository/implementation/AttendanceRepositoryImpl;", "Lcom/centerpoint/connect/repository/AttendanceRepository;", "apis", "Lcom/centerpoint/connect/api/Apis;", "(Lcom/centerpoint/connect/api/Apis;)V", "getCostCodes", "Lcom/centerpoint/connect/models/response/attendance/CostCodesResponse;", "requestParams", "Lcom/centerpoint/connect/base/BaseRequestParams;", "job", "Lkotlinx/coroutines/Job;", "(Lcom/centerpoint/connect/base/BaseRequestParams;Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markAttendance", "Lcom/centerpoint/connect/models/response/attendance/AttendanceResponse;", "Lcom/centerpoint/connect/models/request/AttendanceRP;", "(Lcom/centerpoint/connect/models/request/AttendanceRP;Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class AttendanceRepositoryImpl implements com.centerpoint.connect.repository.AttendanceRepository {
    private final com.centerpoint.connect.api.Apis apis = null;
    
    public AttendanceRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.centerpoint.connect.api.Apis apis) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getCostCodes(@org.jetbrains.annotations.NotNull()
    com.centerpoint.connect.base.BaseRequestParams requestParams, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.Job job, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.centerpoint.connect.models.response.attendance.CostCodesResponse> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object markAttendance(@org.jetbrains.annotations.NotNull()
    com.centerpoint.connect.models.request.AttendanceRP requestParams, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.Job job, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.centerpoint.connect.models.response.attendance.AttendanceResponse> continuation) {
        return null;
    }
}