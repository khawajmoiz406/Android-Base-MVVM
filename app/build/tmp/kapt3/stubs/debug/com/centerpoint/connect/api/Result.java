package com.centerpoint.connect.api;

import java.lang.System;

/**
 * @author Salman Aziz
 * created on 2/22/21
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0004\u0004\u0005\u0006\u0007B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b\u00a8\u0006\f"}, d2 = {"Lcom/centerpoint/connect/api/Result;", "T", "", "()V", "Failure", "Loading", "NetworkError", "Success", "Lcom/centerpoint/connect/api/Result$Loading;", "Lcom/centerpoint/connect/api/Result$Success;", "Lcom/centerpoint/connect/api/Result$Failure;", "Lcom/centerpoint/connect/api/Result$NetworkError;", "app_debug"})
public abstract class Result<T extends java.lang.Object> {
    
    private Result() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005\u00a8\u0006\t"}, d2 = {"Lcom/centerpoint/connect/api/Result$Loading;", "T", "Lcom/centerpoint/connect/api/Result;", "showLoader", "", "(Z)V", "getShowLoader", "()Z", "setShowLoader", "app_debug"})
    public static final class Loading<T extends java.lang.Object> extends com.centerpoint.connect.api.Result<T> {
        private boolean showLoader;
        
        public Loading() {
            super();
        }
        
        public Loading(boolean showLoader) {
            super();
        }
        
        public final boolean getShowLoader() {
            return false;
        }
        
        public final void setShowLoader(boolean p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0004R\u001c\u0010\u0003\u001a\u00028\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\b\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\t"}, d2 = {"Lcom/centerpoint/connect/api/Result$Success;", "T", "Lcom/centerpoint/connect/api/Result;", "data", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "setData", "Ljava/lang/Object;", "app_debug"})
    public static final class Success<T extends java.lang.Object> extends com.centerpoint.connect.api.Result<T> {
        private T data;
        
        public Success(T data) {
            super();
        }
        
        public final T getData() {
            return null;
        }
        
        public final void setData(T p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/centerpoint/connect/api/Result$Failure;", "E", "Lcom/centerpoint/connect/api/Result;", "e", "Lcom/centerpoint/connect/models/helper/ErrorDescription;", "(Lcom/centerpoint/connect/models/helper/ErrorDescription;)V", "getE", "()Lcom/centerpoint/connect/models/helper/ErrorDescription;", "app_debug"})
    public static final class Failure<E extends java.lang.Object> extends com.centerpoint.connect.api.Result<E> {
        @org.jetbrains.annotations.Nullable()
        private final com.centerpoint.connect.models.helper.ErrorDescription e = null;
        
        public Failure(@org.jetbrains.annotations.Nullable()
        com.centerpoint.connect.models.helper.ErrorDescription e) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.centerpoint.connect.models.helper.ErrorDescription getE() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/centerpoint/connect/api/Result$NetworkError;", "E", "Lcom/centerpoint/connect/api/Result;", "e", "Lcom/centerpoint/connect/models/helper/ErrorDescription;", "(Lcom/centerpoint/connect/models/helper/ErrorDescription;)V", "getE", "()Lcom/centerpoint/connect/models/helper/ErrorDescription;", "app_debug"})
    public static final class NetworkError<E extends java.lang.Object> extends com.centerpoint.connect.api.Result<E> {
        @org.jetbrains.annotations.Nullable()
        private final com.centerpoint.connect.models.helper.ErrorDescription e = null;
        
        public NetworkError(@org.jetbrains.annotations.Nullable()
        com.centerpoint.connect.models.helper.ErrorDescription e) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.centerpoint.connect.models.helper.ErrorDescription getE() {
            return null;
        }
    }
}