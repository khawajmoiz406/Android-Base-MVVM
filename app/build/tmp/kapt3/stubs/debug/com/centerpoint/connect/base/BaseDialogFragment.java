package com.centerpoint.connect.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u000f\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016\u00a2\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016\u00a2\u0006\u0002\u0010\u0017J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0019H&J\b\u0010\u001a\u001a\u00020\u0016H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0002J\u000f\u0010\u001e\u001a\u0004\u0018\u00010\u001cH\u0002\u00a2\u0006\u0002\u0010\u001fJ\u0010\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u0010H\u0016J\u0010\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$H\u0016J\u0018\u0010\"\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\'H\u0016J\u0018\u0010\"\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u0010H\u0016J\b\u0010)\u001a\u00020\u001cH\u0016J\u0012\u0010*\u001a\u00020\u001c2\b\u0010+\u001a\u0004\u0018\u00010\'H\u0016J\u0010\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020.H\u0016J\u0010\u0010/\u001a\u00020\u001c2\u0006\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u00020\u001cH\u0016J&\u00103\u001a\u0004\u0018\u0001042\u0006\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u0001082\b\u0010+\u001a\u0004\u0018\u00010\'H\u0016J\b\u00109\u001a\u00020\u001cH\u0016J\b\u0010:\u001a\u00020\u001cH\u0016J\b\u0010;\u001a\u00020\u001cH\u0016J\b\u0010<\u001a\u00020\u001cH\u0016J\u0010\u0010=\u001a\u00020\u001c2\u0006\u0010>\u001a\u00020\u0016H\u0016J\u0010\u0010?\u001a\u00020\u001c2\u0006\u0010@\u001a\u00020AH\u0016J\u0012\u0010B\u001a\u00020\u001c2\b\u0010C\u001a\u0004\u0018\u00010DH\u0016J\b\u0010E\u001a\u00020FH\u0016J\b\u0010G\u001a\u00020\u0010H\u0016J\b\u0010H\u001a\u00020\u0010H\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u00028\u0000X\u0086.\u00a2\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006I"}, d2 = {"Lcom/centerpoint/connect/base/BaseDialogFragment;", "B", "Landroidx/databinding/ViewDataBinding;", "Landroidx/fragment/app/DialogFragment;", "Lcom/centerpoint/connect/base/BaseView;", "Lcom/centerpoint/connect/base/listeners/ToolbarListeners;", "()V", "activity", "Lcom/centerpoint/connect/base/BaseActivity;", "binding", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "setBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "cancelable", "", "dimAmount", "", "()Ljava/lang/Float;", "fullScreen", "getNavHostId", "", "()Ljava/lang/Integer;", "getViewModel", "Lcom/centerpoint/connect/base/BaseViewModel;", "gravity", "hideKeyboard", "", "initFragment", "initViewModelCallback", "()Lkotlin/Unit;", "loaderVisibility", "visibility", "navigateToDestination", "direction", "Landroidx/navigation/NavDirections;", "id", "args", "Landroid/os/Bundle;", "clearStack", "noConnectivity", "onActivityCreated", "savedInstanceState", "onApiResponse", "callback", "Lcom/centerpoint/connect/models/helper/ResponseCallback;", "onAttach", "context", "Landroid/content/Context;", "onClockClicked", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onEndIconClicked", "onStart", "onStartIconClicked", "resetSoftInputMode", "setSoftInputMode", "mode", "showKeyboard", "editText", "Landroidx/appcompat/widget/AppCompatEditText;", "showToast", "message", "", "sizePercentage", "", "wrapHeight", "wrapWidth", "app_debug"})
public abstract class BaseDialogFragment<B extends androidx.databinding.ViewDataBinding> extends androidx.fragment.app.DialogFragment implements com.centerpoint.connect.base.BaseView, com.centerpoint.connect.base.listeners.ToolbarListeners {
    public B binding;
    private com.centerpoint.connect.base.BaseActivity<?> activity;
    private java.util.HashMap _$_findViewCache;
    
    public BaseDialogFragment() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.centerpoint.connect.base.BaseViewModel getViewModel();
    
    public boolean wrapHeight() {
        return false;
    }
    
    public boolean wrapWidth() {
        return false;
    }
    
    public boolean cancelable() {
        return false;
    }
    
    public boolean fullScreen() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.Float dimAmount() {
        return null;
    }
    
    public double sizePercentage() {
        return 0.0;
    }
    
    public int gravity() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final B getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    B p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void initFragment() {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    private final kotlin.Unit initViewModelCallback() {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void setSoftInputMode(int mode) {
    }
    
    @java.lang.Override()
    public void resetSoftInputMode() {
    }
    
    @java.lang.Override()
    public void showKeyboard(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatEditText editText) {
    }
    
    @java.lang.Override()
    public void hideKeyboard() {
    }
    
    @java.lang.Override()
    public void noConnectivity() {
    }
    
    @java.lang.Override()
    public void loaderVisibility(boolean visibility) {
    }
    
    @java.lang.Override()
    public void showToast(@org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void onApiResponse(@org.jetbrains.annotations.NotNull()
    com.centerpoint.connect.models.helper.ResponseCallback callback) {
    }
    
    @java.lang.Override()
    public void navigateToDestination(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavDirections direction) {
    }
    
    @java.lang.Override()
    public void navigateToDestination(int id, @org.jetbrains.annotations.NotNull()
    android.os.Bundle args) {
    }
    
    @java.lang.Override()
    public void navigateToDestination(int id, boolean clearStack) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Integer getNavHostId() {
        return null;
    }
    
    @java.lang.Override()
    public void onStartIconClicked() {
    }
    
    @java.lang.Override()
    public void onEndIconClicked() {
    }
    
    @java.lang.Override()
    public void onClockClicked() {
    }
}