package com.centerpoint.connect.base;

import java.lang.System;

/**
 * @author Salman Aziz
 * created on 2/22/21
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\n\u0010+\u001a\u0004\u0018\u00010,H&J\u0010\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H&J\b\u00101\u001a\u00020.H\u0016J\u000f\u00102\u001a\u0004\u0018\u00010.H\u0002\u00a2\u0006\u0002\u00103J\u0010\u00104\u001a\u00020.2\u0006\u00105\u001a\u000200H\u0016J\u0010\u00106\u001a\u00020.2\u0006\u00107\u001a\u000208H\u0016J\u0018\u00106\u001a\u00020.2\u0006\u00109\u001a\u00020\u001d2\u0006\u0010:\u001a\u00020;H\u0016J\u0018\u00106\u001a\u00020.2\u0006\u00109\u001a\u00020\u001d2\u0006\u0010<\u001a\u000200H\u0016J\b\u0010=\u001a\u00020.H\u0016J\u0010\u0010>\u001a\u00020.2\u0006\u0010?\u001a\u00020@H\u0016J\u0012\u0010A\u001a\u00020.2\b\u0010B\u001a\u0004\u0018\u00010;H\u0014J\b\u0010C\u001a\u00020.H\u0014J\b\u0010D\u001a\u00020.H\u0002J\b\u0010E\u001a\u00020.H\u0016J\u0010\u0010F\u001a\u00020.2\u0006\u0010G\u001a\u00020\u001dH\u0016J\u0010\u0010H\u001a\u00020I2\u0006\u0010?\u001a\u00020@H\u0002J\u0010\u0010J\u001a\u00020.2\u0006\u0010K\u001a\u00020LH\u0016J\u0012\u0010M\u001a\u00020.2\b\u0010N\u001a\u0004\u0018\u00010OH\u0016J\b\u0010P\u001a\u00020.H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u00028\u0000X\u0086.\u00a2\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u001eR\u001b\u0010\u001f\u001a\u00020 8DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\u001c\u0010%\u001a\u0004\u0018\u00010&X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*\u00a8\u0006Q"}, d2 = {"Lcom/centerpoint/connect/base/BaseActivity;", "B", "Landroidx/databinding/ViewDataBinding;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/centerpoint/connect/base/BaseView;", "()V", "availableNetwork", "Landroid/net/Network;", "binding", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "setBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "connectivityManager", "Landroid/net/ConnectivityManager;", "dialog", "Landroid/app/Dialog;", "inputManager", "Landroid/view/inputmethod/InputMethodManager;", "navController", "Landroidx/navigation/NavController;", "getNavController", "()Landroidx/navigation/NavController;", "setNavController", "(Landroidx/navigation/NavController;)V", "networkCallback", "Landroid/net/ConnectivityManager$NetworkCallback;", "originalSoftInputMode", "", "Ljava/lang/Integer;", "sharedPref", "Lcom/centerpoint/connect/util/EncryptSharedPref;", "getSharedPref", "()Lcom/centerpoint/connect/util/EncryptSharedPref;", "sharedPref$delegate", "Lkotlin/Lazy;", "user", "Lcom/centerpoint/connect/models/helper/User;", "getUser", "()Lcom/centerpoint/connect/models/helper/User;", "setUser", "(Lcom/centerpoint/connect/models/helper/User;)V", "getViewModel", "Lcom/centerpoint/connect/base/BaseViewModel;", "hasConnectivity", "", "connectivity", "", "hideKeyboard", "initViewModelCallback", "()Lkotlin/Unit;", "loaderVisibility", "visibility", "navigateToDestination", "direction", "Landroidx/navigation/NavDirections;", "id", "args", "Landroid/os/Bundle;", "clearStack", "noConnectivity", "onApiResponse", "callback", "Lcom/centerpoint/connect/models/helper/ResponseCallback;", "onCreate", "savedInstanceState", "onDestroy", "registerNetworkCallback", "resetSoftInputMode", "setSoftInputMode", "mode", "showCallbackDialog", "Lcom/centerpoint/connect/ui/dialogs/CallbackResponseDialog;", "showKeyboard", "editText", "Landroidx/appcompat/widget/AppCompatEditText;", "showToast", "message", "", "unregisterNetworkCallback", "app_debug"})
public abstract class BaseActivity<B extends androidx.databinding.ViewDataBinding> extends androidx.appcompat.app.AppCompatActivity implements com.centerpoint.connect.base.BaseView {
    private android.app.Dialog dialog;
    public B binding;
    private java.lang.Integer originalSoftInputMode;
    private android.view.inputmethod.InputMethodManager inputManager;
    private android.net.ConnectivityManager connectivityManager;
    private android.net.Network availableNetwork;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy sharedPref$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private com.centerpoint.connect.models.helper.User user;
    public androidx.navigation.NavController navController;
    private final android.net.ConnectivityManager.NetworkCallback networkCallback = null;
    private java.util.HashMap _$_findViewCache;
    
    public BaseActivity() {
        super();
    }
    
    public abstract void hasConnectivity(boolean connectivity);
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.centerpoint.connect.base.BaseViewModel getViewModel();
    
    @org.jetbrains.annotations.NotNull()
    public final B getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    B p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.centerpoint.connect.util.EncryptSharedPref getSharedPref() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.centerpoint.connect.models.helper.User getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.Nullable()
    com.centerpoint.connect.models.helper.User p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.navigation.NavController getNavController() {
        return null;
    }
    
    public final void setNavController(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final kotlin.Unit initViewModelCallback() {
        return null;
    }
    
    private final com.centerpoint.connect.ui.dialogs.CallbackResponseDialog showCallbackDialog(com.centerpoint.connect.models.helper.ResponseCallback callback) {
        return null;
    }
    
    @java.lang.Override()
    protected void onDestroy() {
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
    
    private final void registerNetworkCallback() {
    }
    
    private final void unregisterNetworkCallback() {
    }
}