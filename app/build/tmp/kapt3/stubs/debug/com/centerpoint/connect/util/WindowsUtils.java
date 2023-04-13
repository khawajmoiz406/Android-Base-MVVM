package com.centerpoint.connect.util;

import java.lang.System;

/**
 * @author Khawaja Moiz
 * created on 1/17/23
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u000e\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0019\u001a\u00020\u0004J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0007R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\u0006\u00a8\u0006\u001b"}, d2 = {"Lcom/centerpoint/connect/util/WindowsUtils;", "", "()V", "height", "", "getHeight", "()I", "width", "getWidth", "changeInputMethod", "", "activity", "Landroid/app/Activity;", "action", "rootView", "Landroid/view/View;", "isEdgeToEdgeEnabled", "context", "Landroid/content/Context;", "isNavigationBarEnabled", "", "isXLargeScreen", "navigationBarHeight", "setNoLimits", "setStatusBarColor", "colorId", "statusBarHeight", "app_debug"})
public final class WindowsUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.centerpoint.connect.util.WindowsUtils INSTANCE = null;
    
    private WindowsUtils() {
        super();
    }
    
    public final int getWidth() {
        return 0;
    }
    
    public final int getHeight() {
        return 0;
    }
    
    public final void setStatusBarColor(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @androidx.annotation.ColorInt()
    int colorId) {
    }
    
    private final int isEdgeToEdgeEnabled(android.content.Context context) {
        return 0;
    }
    
    public final boolean isNavigationBarEnabled(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    @android.annotation.SuppressLint(value = {"InternalInsetResource"})
    public final int statusBarHeight(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"InternalInsetResource"})
    public final int navigationBarHeight(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0;
    }
    
    public final void setNoLimits(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    public final boolean isXLargeScreen(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public final void changeInputMethod(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, int action, @org.jetbrains.annotations.Nullable()
    android.view.View rootView) {
    }
}