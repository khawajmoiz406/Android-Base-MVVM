package com.centerpoint.connect.base;

import java.lang.System;

/**
 * @author Salman Aziz
 * created on 2/22/21
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0007\b\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0001H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J-\u0010\b\u001a\u0012\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00030\n0\t2\u0006\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0016\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/centerpoint/connect/base/BaseRepository;", "Response", "Params", "", "()V", "fetchFromNetwork", "params", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "start", "Landroidx/lifecycle/LiveData;", "Lcom/centerpoint/connect/api/Result;", "job", "Lkotlinx/coroutines/Job;", "(Ljava/lang/Object;Lkotlinx/coroutines/Job;)Landroidx/lifecycle/LiveData;", "app_debug"})
public abstract class BaseRepository<Response extends java.lang.Object, Params extends java.lang.Object> {
    
    public BaseRepository() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchFromNetwork(Params params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super Response> continuation);
    
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.LiveData<com.centerpoint.connect.api.Result<? extends java.lang.Object>> start(Params params, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.Job job) {
        return null;
    }
}