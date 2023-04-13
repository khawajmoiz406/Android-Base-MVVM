package com.centerpoint.connect.ui.global.update_profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0013\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0006\u0010\u0016\u001a\u00020\u0017R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0018"}, d2 = {"Lcom/centerpoint/connect/ui/global/update_profile/UpdateProfileViewModel;", "Lcom/centerpoint/connect/base/BaseViewModel;", "remoteRepo", "Lcom/centerpoint/connect/repository/UpdateProfileRepository;", "sharedPreferences", "Lcom/centerpoint/connect/util/EncryptSharedPref;", "(Lcom/centerpoint/connect/repository/UpdateProfileRepository;Lcom/centerpoint/connect/util/EncryptSharedPref;)V", "_updateResultLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/centerpoint/connect/api/Result;", "Lcom/centerpoint/connect/models/response/login/LoginResponse;", "requestParams", "Lcom/centerpoint/connect/models/request/UpdateProfileRP;", "getRequestParams", "()Lcom/centerpoint/connect/models/request/UpdateProfileRP;", "updateResultLiveData", "Landroidx/lifecycle/MediatorLiveData;", "getUpdateResultLiveData", "()Landroidx/lifecycle/MediatorLiveData;", "populateRequestParams", "user", "Lcom/centerpoint/connect/models/helper/User;", "updateProfile", "", "app_debug"})
public final class UpdateProfileViewModel extends com.centerpoint.connect.base.BaseViewModel {
    private final com.centerpoint.connect.repository.UpdateProfileRepository remoteRepo = null;
    private final com.centerpoint.connect.util.EncryptSharedPref sharedPreferences = null;
    @org.jetbrains.annotations.NotNull()
    private final com.centerpoint.connect.models.request.UpdateProfileRP requestParams = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<com.centerpoint.connect.api.Result<com.centerpoint.connect.models.response.login.LoginResponse>> updateResultLiveData = null;
    private androidx.lifecycle.MutableLiveData<com.centerpoint.connect.api.Result<com.centerpoint.connect.models.response.login.LoginResponse>> _updateResultLiveData;
    
    public UpdateProfileViewModel(@org.jetbrains.annotations.NotNull()
    com.centerpoint.connect.repository.UpdateProfileRepository remoteRepo, @org.jetbrains.annotations.NotNull()
    com.centerpoint.connect.util.EncryptSharedPref sharedPreferences) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.centerpoint.connect.models.request.UpdateProfileRP getRequestParams() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.centerpoint.connect.api.Result<com.centerpoint.connect.models.response.login.LoginResponse>> getUpdateResultLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.centerpoint.connect.models.request.UpdateProfileRP populateRequestParams(@org.jetbrains.annotations.Nullable()
    com.centerpoint.connect.models.helper.User user) {
        return null;
    }
    
    public final void updateProfile() {
    }
}