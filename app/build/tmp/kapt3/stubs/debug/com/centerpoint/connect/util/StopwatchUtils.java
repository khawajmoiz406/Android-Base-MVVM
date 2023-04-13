package com.centerpoint.connect.util;

import java.lang.System;

/**
 * @author Khawaja Moiz
 * created on 1/23/23
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J%\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0006\u0010\u000e\u001a\u00020\u000fJ\"\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\fJ\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/centerpoint/connect/util/StopwatchUtils;", "", "()V", "time", "", "watch", "Lkotlinx/coroutines/Job;", "getStopwatchTime", "", "increment", "", "onIncrement", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isWatchRunning", "", "start", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "stop", "reset", "app_debug"})
public final class StopwatchUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.centerpoint.connect.util.StopwatchUtils INSTANCE = null;
    private static kotlinx.coroutines.Job watch;
    private static long time = 0L;
    
    private StopwatchUtils() {
        super();
    }
    
    public final void start(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext coroutineContext, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onIncrement) {
    }
    
    public final void stop(boolean reset) {
    }
    
    public final boolean isWatchRunning() {
        return false;
    }
    
    private final java.lang.String getStopwatchTime() {
        return null;
    }
    
    private final java.lang.Object increment(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onIncrement, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}