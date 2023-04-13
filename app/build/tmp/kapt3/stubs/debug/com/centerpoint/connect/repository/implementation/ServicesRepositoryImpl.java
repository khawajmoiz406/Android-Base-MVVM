package com.centerpoint.connect.repository.implementation;

import java.lang.System;

@kotlin.Suppress(names = {"UNCHECKED_CAST"})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/centerpoint/connect/repository/implementation/ServicesRepositoryImpl;", "Lcom/centerpoint/connect/repository/ServicesRepository;", "apis", "Lcom/centerpoint/connect/api/Apis;", "(Lcom/centerpoint/connect/api/Apis;)V", "getAllServices", "Landroidx/lifecycle/MutableLiveData;", "Lcom/centerpoint/connect/api/Result;", "Lcom/centerpoint/connect/models/response/services/ServicesResponse;", "requestParams", "Lcom/centerpoint/connect/base/BaseRequestParams;", "job", "Lkotlinx/coroutines/Job;", "app_debug"})
public final class ServicesRepositoryImpl implements com.centerpoint.connect.repository.ServicesRepository {
    private final com.centerpoint.connect.api.Apis apis = null;
    
    public ServicesRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.centerpoint.connect.api.Apis apis) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.MutableLiveData<com.centerpoint.connect.api.Result<com.centerpoint.connect.models.response.services.ServicesResponse>> getAllServices(@org.jetbrains.annotations.NotNull()
    com.centerpoint.connect.base.BaseRequestParams requestParams, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.Job job) {
        return null;
    }
}