package com.centerpoint.connect.ui.landing.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0013\u001a\u00020\u0014R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/centerpoint/connect/ui/landing/login/LoginViewModel;", "Lcom/centerpoint/connect/base/BaseViewModel;", "remoteRepo", "Lcom/centerpoint/connect/repository/LoginRepository;", "sharedPreferences", "Lcom/centerpoint/connect/util/EncryptSharedPref;", "(Lcom/centerpoint/connect/repository/LoginRepository;Lcom/centerpoint/connect/util/EncryptSharedPref;)V", "_loginResultLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/centerpoint/connect/api/Result;", "Lcom/centerpoint/connect/models/response/login/LoginResponse;", "loginResultLiveData", "Landroidx/lifecycle/MediatorLiveData;", "getLoginResultLiveData", "()Landroidx/lifecycle/MediatorLiveData;", "requestParams", "Lcom/centerpoint/connect/models/request/LoginRP;", "getRequestParams", "()Lcom/centerpoint/connect/models/request/LoginRP;", "login", "", "app_debug"})
public final class LoginViewModel extends com.centerpoint.connect.base.BaseViewModel {
    private final com.centerpoint.connect.repository.LoginRepository remoteRepo = null;
    private final com.centerpoint.connect.util.EncryptSharedPref sharedPreferences = null;
    @org.jetbrains.annotations.NotNull()
    private final com.centerpoint.connect.models.request.LoginRP requestParams = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<com.centerpoint.connect.api.Result<com.centerpoint.connect.models.response.login.LoginResponse>> loginResultLiveData = null;
    private androidx.lifecycle.MutableLiveData<com.centerpoint.connect.api.Result<com.centerpoint.connect.models.response.login.LoginResponse>> _loginResultLiveData;
    
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    com.centerpoint.connect.repository.LoginRepository remoteRepo, @org.jetbrains.annotations.NotNull()
    com.centerpoint.connect.util.EncryptSharedPref sharedPreferences) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.centerpoint.connect.models.request.LoginRP getRequestParams() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.centerpoint.connect.api.Result<com.centerpoint.connect.models.response.login.LoginResponse>> getLoginResultLiveData() {
        return null;
    }
    
    public final void login() {
    }
}