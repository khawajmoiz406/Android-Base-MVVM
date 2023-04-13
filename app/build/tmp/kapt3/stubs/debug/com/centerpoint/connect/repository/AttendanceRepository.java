package com.centerpoint.connect.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ!\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/centerpoint/connect/repository/AttendanceRepository;", "", "getCostCodes", "Lcom/centerpoint/connect/models/response/attendance/CostCodesResponse;", "requestParams", "Lcom/centerpoint/connect/base/BaseRequestParams;", "job", "Lkotlinx/coroutines/Job;", "(Lcom/centerpoint/connect/base/BaseRequestParams;Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markAttendance", "Lcom/centerpoint/connect/models/response/attendance/AttendanceResponse;", "Lcom/centerpoint/connect/models/request/AttendanceRP;", "(Lcom/centerpoint/connect/models/request/AttendanceRP;Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface AttendanceRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCostCodes(@org.jetbrains.annotations.NotNull()
    com.centerpoint.connect.base.BaseRequestParams requestParams, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.Job job, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.centerpoint.connect.models.response.attendance.CostCodesResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object markAttendance(@org.jetbrains.annotations.NotNull()
    com.centerpoint.connect.models.request.AttendanceRP requestParams, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.Job job, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.centerpoint.connect.models.response.attendance.AttendanceResponse> continuation);
}