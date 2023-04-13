package com.centerpoint.connect.ui.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016J\r\u0010\u000e\u001a\u00020\u000fH\u0016\u00a2\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0012H\u0016J\u001a\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\rH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u00a8\u0006%"}, d2 = {"Lcom/centerpoint/connect/ui/dialogs/CallbackResponseDialog;", "Lcom/centerpoint/connect/base/BaseDialogFragment;", "Lcom/centerpoint/connect/databinding/DialogCallbackResponseBinding;", "callback", "Lcom/centerpoint/connect/models/helper/ResponseCallback;", "(Lcom/centerpoint/connect/models/helper/ResponseCallback;)V", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "handler$delegate", "Lkotlin/Lazy;", "cancelable", "", "dimAmount", "", "()Ljava/lang/Float;", "getLayoutId", "", "getTheme", "getViewModel", "Lcom/centerpoint/connect/base/BaseViewModel;", "gravity", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "show", "manager", "Landroidx/fragment/app/FragmentManager;", "tag", "", "sizePercentage", "", "wrapWidth", "app_debug"})
public final class CallbackResponseDialog extends com.centerpoint.connect.base.BaseDialogFragment<com.centerpoint.connect.databinding.DialogCallbackResponseBinding> {
    private com.centerpoint.connect.models.helper.ResponseCallback callback;
    private final kotlin.Lazy handler$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public CallbackResponseDialog() {
        super();
    }
    
    public CallbackResponseDialog(@org.jetbrains.annotations.Nullable()
    com.centerpoint.connect.models.helper.ResponseCallback callback) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.centerpoint.connect.base.BaseViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean cancelable() {
        return false;
    }
    
    @java.lang.Override()
    public boolean wrapWidth() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Float dimAmount() {
        return null;
    }
    
    @java.lang.Override()
    public int gravity() {
        return 0;
    }
    
    @java.lang.Override()
    public double sizePercentage() {
        return 0.0;
    }
    
    @java.lang.Override()
    public int getTheme() {
        return 0;
    }
    
    private final android.os.Handler getHandler() {
        return null;
    }
    
    @java.lang.Override()
    public void show(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager manager, @org.jetbrains.annotations.Nullable()
    java.lang.String tag) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
}