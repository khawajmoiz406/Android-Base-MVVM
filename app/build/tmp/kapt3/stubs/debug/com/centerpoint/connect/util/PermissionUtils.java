package com.centerpoint.connect.util;

import java.lang.System;

/**
 * @author Khawaja Moiz
 * created on 1/24/23
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J#\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007\u00a2\u0006\u0002\u0010\u000eR\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/centerpoint/connect/util/PermissionUtils;", "", "()V", "cameraPermissions", "", "", "getCameraPermissions", "()[Ljava/lang/String;", "[Ljava/lang/String;", "allPermissionsGranted", "", "activity", "Landroid/app/Activity;", "permissions", "(Landroid/app/Activity;[Ljava/lang/String;)Z", "app_debug"})
public final class PermissionUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.centerpoint.connect.util.PermissionUtils INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String[] cameraPermissions = {"android.permission.CAMERA"};
    
    private PermissionUtils() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] getCameraPermissions() {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final boolean allPermissionsGranted(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions) {
        return false;
    }
}