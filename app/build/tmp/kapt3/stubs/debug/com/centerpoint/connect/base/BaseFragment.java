package com.centerpoint.connect.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00ac\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001cH\u0002J\b\u0010!\u001a\u00020\u001fH\u0002J\u000f\u0010\"\u001a\u0004\u0018\u00010#H\u0016\u00a2\u0006\u0002\u0010$J\b\u0010%\u001a\u0004\u0018\u00010&J\n\u0010\'\u001a\u0004\u0018\u00010(H&J\b\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020*H\u0002J\u000f\u0010,\u001a\u0004\u0018\u00010*H\u0002\u00a2\u0006\u0002\u0010-J\u0010\u0010.\u001a\u00020*2\u0006\u0010/\u001a\u00020\u0015H\u0016J\u0006\u00100\u001a\u00020*J\u0010\u00101\u001a\u00020*2\u0006\u00102\u001a\u000203H\u0016J\u0018\u00101\u001a\u00020*2\u0006\u00104\u001a\u00020#2\u0006\u00105\u001a\u000206H\u0016J\u0018\u00101\u001a\u00020*2\u0006\u00104\u001a\u00020#2\u0006\u00107\u001a\u00020\u0015H\u0016J\b\u00108\u001a\u00020*H\u0016J\u0012\u00109\u001a\u00020*2\b\u0010:\u001a\u0004\u0018\u000106H\u0016J\u0010\u0010;\u001a\u00020*2\u0006\u0010<\u001a\u00020=H\u0016J\u0010\u0010>\u001a\u00020*2\u0006\u0010?\u001a\u00020@H\u0016J\b\u0010A\u001a\u00020*H\u0016J\u0010\u0010B\u001a\u00020*2\u0006\u0010C\u001a\u00020DH\u0016J&\u0010E\u001a\u0004\u0018\u00010F2\u0006\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010J2\b\u0010:\u001a\u0004\u0018\u000106H\u0016J\u001c\u0010K\u001a\u00020*2\u0012\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00150MH\u0016J\b\u0010N\u001a\u00020*H\u0016J\u0010\u0010O\u001a\u00020*2\b\u0010P\u001a\u0004\u0018\u00010&J\b\u0010Q\u001a\u00020*H\u0016J\u0010\u0010R\u001a\u00020*2\u0006\u0010S\u001a\u00020#H\u0016J\b\u0010T\u001a\u00020\u0015H\u0016J\u0010\u0010U\u001a\u00020*2\u0006\u0010V\u001a\u00020WH\u0016J\u0012\u0010X\u001a\u00020*2\b\u0010Y\u001a\u0004\u0018\u00010\u001cH\u0016J\n\u0010Z\u001a\u0004\u0018\u00010\u001cH\u0016J\u0006\u0010[\u001a\u00020\u001fR\u0014\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u00028\u0000X\u0086.\u00a2\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000fX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u000fX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013\u00a8\u0006\\"}, d2 = {"Lcom/centerpoint/connect/base/BaseFragment;", "B", "Landroidx/databinding/ViewDataBinding;", "Landroidx/fragment/app/Fragment;", "Lcom/centerpoint/connect/base/BaseView;", "()V", "activity", "Lcom/centerpoint/connect/base/BaseActivity;", "binding", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "setBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "cameraActivityLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "getCameraActivityLauncher", "()Landroidx/activity/result/ActivityResultLauncher;", "firstTime", "", "getFirstTime", "()Z", "setFirstTime", "(Z)V", "permissionActivityLauncher", "", "", "getPermissionActivityLauncher", "changeTitle", "Lcom/centerpoint/connect/databinding/ActivityGlobalNavigationBinding;", "str", "checkForToolbar", "getNavHostId", "", "()Ljava/lang/Integer;", "getUserData", "Lcom/centerpoint/connect/models/helper/User;", "getViewModel", "Lcom/centerpoint/connect/base/BaseViewModel;", "hideKeyboard", "", "initFragment", "initViewModelCallback", "()Lkotlin/Unit;", "loaderVisibility", "visibility", "logoutUser", "navigateToDestination", "direction", "Landroidx/navigation/NavDirections;", "id", "args", "Landroid/os/Bundle;", "clearStack", "noConnectivity", "onActivityCreated", "savedInstanceState", "onApiResponse", "callback", "Lcom/centerpoint/connect/models/helper/ResponseCallback;", "onAttach", "context", "Landroid/content/Context;", "onBackPress", "onCameraLauncherResult", "result", "Landroidx/activity/result/ActivityResult;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onPermissionsLauncherResult", "permission", "", "onResume", "onUserUpdated", "user", "resetSoftInputMode", "setSoftInputMode", "mode", "showBackButton", "showKeyboard", "editText", "Landroidx/appcompat/widget/AppCompatEditText;", "showToast", "message", "title", "toggleDrawer", "app_debug"})
public abstract class BaseFragment<B extends androidx.databinding.ViewDataBinding> extends androidx.fragment.app.Fragment implements com.centerpoint.connect.base.BaseView {
    public B binding;
    private com.centerpoint.connect.base.BaseActivity<?> activity;
    private boolean firstTime = true;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String[]> permissionActivityLauncher = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> cameraActivityLauncher = null;
    private java.util.HashMap _$_findViewCache;
    
    public BaseFragment() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.centerpoint.connect.base.BaseViewModel getViewModel();
    
    public boolean showBackButton() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String title() {
        return null;
    }
    
    public void onBackPress() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.centerpoint.connect.databinding.ActivityGlobalNavigationBinding toggleDrawer() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.centerpoint.connect.models.helper.User getUserData() {
        return null;
    }
    
    public final void logoutUser() {
    }
    
    public final void onUserUpdated(@org.jetbrains.annotations.Nullable()
    com.centerpoint.connect.models.helper.User user) {
    }
    
    public void onPermissionsLauncherResult(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Boolean> permission) {
    }
    
    public void onCameraLauncherResult(@org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResult result) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final B getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    B p0) {
    }
    
    protected final boolean getFirstTime() {
        return false;
    }
    
    protected final void setFirstTime(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final androidx.activity.result.ActivityResultLauncher<java.lang.String[]> getPermissionActivityLauncher() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final androidx.activity.result.ActivityResultLauncher<android.content.Intent> getCameraActivityLauncher() {
        return null;
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
    
    private final kotlin.Unit initViewModelCallback() {
        return null;
    }
    
    private final com.centerpoint.connect.databinding.ActivityGlobalNavigationBinding checkForToolbar() {
        return null;
    }
    
    private final com.centerpoint.connect.databinding.ActivityGlobalNavigationBinding changeTitle(java.lang.String str) {
        return null;
    }
    
    @java.lang.Override()
    public void onResume() {
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
}