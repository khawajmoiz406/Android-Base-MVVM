package com.centerpoint.connect.models.helper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\fB\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2 = {"Lcom/centerpoint/connect/models/helper/ResponseCallback;", "", "message", "", "type", "Lcom/centerpoint/connect/models/helper/ResponseCallback$Type;", "(Ljava/lang/String;Lcom/centerpoint/connect/models/helper/ResponseCallback$Type;)V", "getMessage", "()Ljava/lang/String;", "getType", "()Lcom/centerpoint/connect/models/helper/ResponseCallback$Type;", "Companion", "Type", "app_debug"})
public final class ResponseCallback {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String message = null;
    @org.jetbrains.annotations.NotNull()
    private final com.centerpoint.connect.models.helper.ResponseCallback.Type type = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.centerpoint.connect.models.helper.ResponseCallback.Companion Companion = null;
    
    public ResponseCallback(@org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    com.centerpoint.connect.models.helper.ResponseCallback.Type type) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.centerpoint.connect.models.helper.ResponseCallback.Type getType() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/centerpoint/connect/models/helper/ResponseCallback$Type;", "", "(Ljava/lang/String;I)V", "SUCCESS", "FAILURE", "app_debug"})
    public static enum Type {
        /*public static final*/ SUCCESS /* = new SUCCESS() */,
        /*public static final*/ FAILURE /* = new FAILURE() */;
        
        Type() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/centerpoint/connect/models/helper/ResponseCallback$Companion;", "", "()V", "getErrorCallback", "Lcom/centerpoint/connect/models/helper/ResponseCallback;", "message", "", "getSuccessCallback", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.centerpoint.connect.models.helper.ResponseCallback getErrorCallback(@org.jetbrains.annotations.Nullable()
        java.lang.String message) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.centerpoint.connect.models.helper.ResponseCallback getSuccessCallback(@org.jetbrains.annotations.Nullable()
        java.lang.String message) {
            return null;
        }
    }
}