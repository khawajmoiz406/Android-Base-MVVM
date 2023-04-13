package com.centerpoint.connect.base;

import java.lang.System;

/**
 * @author Salman Aziz
 * created on 2/22/21
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u000f\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH&J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\nH&J\b\u0010\u0012\u001a\u00020\u0007H&J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0015H&J\b\u0010\u0016\u001a\u00020\u0007H&J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0003H&J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001bH&J\u0012\u0010\u001c\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH&\u00a8\u0006\u001f"}, d2 = {"Lcom/centerpoint/connect/base/BaseView;", "", "getLayoutId", "", "getNavHostId", "()Ljava/lang/Integer;", "hideKeyboard", "", "loaderVisibility", "visibility", "", "navigateToDestination", "direction", "Landroidx/navigation/NavDirections;", "id", "args", "Landroid/os/Bundle;", "clearStack", "noConnectivity", "onApiResponse", "callback", "Lcom/centerpoint/connect/models/helper/ResponseCallback;", "resetSoftInputMode", "setSoftInputMode", "mode", "showKeyboard", "editText", "Landroidx/appcompat/widget/AppCompatEditText;", "showToast", "message", "", "app_debug"})
public abstract interface BaseView {
    
    public abstract void setSoftInputMode(int mode);
    
    public abstract void resetSoftInputMode();
    
    public abstract void showKeyboard(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatEditText editText);
    
    public abstract void hideKeyboard();
    
    public abstract void noConnectivity();
    
    public abstract void loaderVisibility(boolean visibility);
    
    public abstract void showToast(@org.jetbrains.annotations.Nullable()
    java.lang.String message);
    
    public abstract void onApiResponse(@org.jetbrains.annotations.NotNull()
    com.centerpoint.connect.models.helper.ResponseCallback callback);
    
    public abstract void navigateToDestination(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavDirections direction);
    
    public abstract void navigateToDestination(int id, @org.jetbrains.annotations.NotNull()
    android.os.Bundle args);
    
    public abstract void navigateToDestination(int id, boolean clearStack);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Integer getNavHostId();
    
    public abstract int getLayoutId();
}