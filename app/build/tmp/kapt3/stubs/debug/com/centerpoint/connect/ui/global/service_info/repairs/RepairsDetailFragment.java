package com.centerpoint.connect.ui.global.service_info.repairs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000bH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0002H\u0002J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u000e\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001aH\u0002J\b\u0010\u001d\u001a\u00020\u000fH\u0016J\u001c\u0010\u001e\u001a\u00020\u000f2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 H\u0016J\u0006\u0010#\u001a\u00020$J\u001a\u0010%\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020\u000fH\u0002J\b\u0010+\u001a\u00020\"H\u0016J\b\u0010,\u001a\u00020!H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/centerpoint/connect/ui/global/service_info/repairs/RepairsDetailFragment;", "Lcom/centerpoint/connect/base/BaseFragment;", "Lcom/centerpoint/connect/databinding/FragmentRepairDetailBinding;", "()V", "repair", "Lcom/centerpoint/connect/models/response/repair/Repair;", "getRepair", "()Lcom/centerpoint/connect/models/response/repair/Repair;", "setRepair", "(Lcom/centerpoint/connect/models/response/repair/Repair;)V", "requestCode", "", "viewModel", "Lcom/centerpoint/connect/ui/global/service_info/parent/ServiceInfoDetailViewModel;", "checkPermissionAndLaunchCamera", "", "getLayoutId", "getViewModel", "Lcom/centerpoint/connect/base/BaseViewModel;", "init", "onAttach", "context", "Landroid/content/Context;", "onCameraClicked", "onCameraLauncherResult", "result", "Landroidx/activity/result/ActivityResult;", "onCaptureResult", "it", "onDestroy", "onPermissionsLauncherResult", "permission", "", "", "", "onReviewWorkClicked", "Lcom/centerpoint/connect/ui/global/service_info/parent/ServiceInfoDetailFragment;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "openCamera", "showBackButton", "title", "app_debug"})
public final class RepairsDetailFragment extends com.centerpoint.connect.base.BaseFragment<com.centerpoint.connect.databinding.FragmentRepairDetailBinding> {
    private com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailViewModel viewModel;
    @org.jetbrains.annotations.Nullable()
    private com.centerpoint.connect.models.response.repair.Repair repair;
    private int requestCode = -1;
    private java.util.HashMap _$_findViewCache;
    
    public RepairsDetailFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.centerpoint.connect.base.BaseViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String title() {
        return null;
    }
    
    @java.lang.Override()
    public boolean showBackButton() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.centerpoint.connect.models.response.repair.Repair getRepair() {
        return null;
    }
    
    public final void setRepair(@org.jetbrains.annotations.Nullable()
    com.centerpoint.connect.models.response.repair.Repair p0) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onPermissionsLauncherResult(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Boolean> permission) {
    }
    
    @java.lang.Override()
    public void onCameraLauncherResult(@org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResult result) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final com.centerpoint.connect.databinding.FragmentRepairDetailBinding init() {
        return null;
    }
    
    private final void checkPermissionAndLaunchCamera() {
    }
    
    private final void openCamera() {
    }
    
    private final void onCaptureResult(androidx.activity.result.ActivityResult it) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    public final void onCameraClicked(int requestCode) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailFragment onReviewWorkClicked() {
        return null;
    }
}