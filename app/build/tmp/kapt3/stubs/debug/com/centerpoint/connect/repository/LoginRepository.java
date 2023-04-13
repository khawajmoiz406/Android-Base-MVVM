package com.centerpoint.connect.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lcom/centerpoint/connect/repository/LoginRepository;", "", "login", "Landroidx/lifecycle/MutableLiveData;", "Lcom/centerpoint/connect/api/Result;", "Lcom/centerpoint/connect/models/response/login/LoginResponse;", "requestParams", "Lcom/centerpoint/connect/models/request/LoginRP;", "job", "Lkotlinx/coroutines/Job;", "app_debug"})
public abstract interface LoginRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.MutableLiveData<com.centerpoint.connect.api.Result<com.centerpoint.connect.models.response.login.LoginResponse>> login(@org.jetbrains.annotations.NotNull()
    com.centerpoint.connect.models.request.LoginRP requestParams, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.Job job);
}