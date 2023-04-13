package com.centerpoint.connect.base;

import java.lang.System;

/**
 * @author Salman Aziz
 * created on 2/22/21
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0014R$\u0010\u0003\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\r"}, d2 = {"Lcom/centerpoint/connect/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "outcomeLiveData", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/centerpoint/connect/api/Result;", "getOutcomeLiveData", "()Landroidx/lifecycle/MediatorLiveData;", "setOutcomeLiveData", "(Landroidx/lifecycle/MediatorLiveData;)V", "onCleared", "", "Companion", "app_debug"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    public static final com.centerpoint.connect.base.BaseViewModel.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static kotlinx.coroutines.CompletableJob job;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MediatorLiveData<com.centerpoint.connect.api.Result<?>> outcomeLiveData;
    
    public BaseViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.centerpoint.connect.api.Result<?>> getOutcomeLiveData() {
        return null;
    }
    
    public final void setOutcomeLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MediatorLiveData<com.centerpoint.connect.api.Result<?>> p0) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/centerpoint/connect/base/BaseViewModel$Companion;", "", "()V", "job", "Lkotlinx/coroutines/CompletableJob;", "getJob", "()Lkotlinx/coroutines/CompletableJob;", "setJob", "(Lkotlinx/coroutines/CompletableJob;)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.coroutines.CompletableJob getJob() {
            return null;
        }
        
        public final void setJob(@org.jetbrains.annotations.NotNull()
        kotlinx.coroutines.CompletableJob p0) {
        }
    }
}