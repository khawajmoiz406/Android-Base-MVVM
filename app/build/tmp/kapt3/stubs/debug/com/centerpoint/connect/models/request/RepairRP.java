package com.centerpoint.connect.models.request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\bH\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\fH\u00c6\u0003Jc\u0010\'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\fH\u00c6\u0001J\u0013\u0010(\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010*H\u00d6\u0003J\t\u0010+\u001a\u00020,H\u00d6\u0001J\u0014\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030.H\u0016J\t\u0010/\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0010\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0014R\"\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e\u00a8\u00060"}, d2 = {"Lcom/centerpoint/connect/models/request/RepairRP;", "Lcom/centerpoint/connect/base/BaseRequestParams;", "managerName", "", "quantity", "description", "correction", "roofPenetrate", "", "repairUrl", "location", "resolutionBitmap", "Landroidx/databinding/ObservableField;", "Landroid/graphics/Bitmap;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Landroidx/databinding/ObservableField;)V", "getCorrection", "()Ljava/lang/String;", "getDescription", "getLocation", "setLocation", "(Ljava/lang/String;)V", "getManagerName", "getQuantity", "getRepairUrl", "setRepairUrl", "getResolutionBitmap", "()Landroidx/databinding/ObservableField;", "setResolutionBitmap", "(Landroidx/databinding/ObservableField;)V", "getRoofPenetrate", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "", "toMap", "", "toString", "app_debug"})
public final class RepairRP extends com.centerpoint.connect.base.BaseRequestParams {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String managerName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String quantity = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String description = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String correction = null;
    private final boolean roofPenetrate = false;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String repairUrl;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String location;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<android.graphics.Bitmap> resolutionBitmap;
    
    @org.jetbrains.annotations.NotNull()
    public final com.centerpoint.connect.models.request.RepairRP copy(@org.jetbrains.annotations.NotNull()
    java.lang.String managerName, @org.jetbrains.annotations.NotNull()
    java.lang.String quantity, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String correction, boolean roofPenetrate, @org.jetbrains.annotations.NotNull()
    java.lang.String repairUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String location, @org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<android.graphics.Bitmap> resolutionBitmap) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public RepairRP() {
        super();
    }
    
    public RepairRP(@org.jetbrains.annotations.NotNull()
    java.lang.String managerName, @org.jetbrains.annotations.NotNull()
    java.lang.String quantity, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String correction, boolean roofPenetrate, @org.jetbrains.annotations.NotNull()
    java.lang.String repairUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String location, @org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<android.graphics.Bitmap> resolutionBitmap) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getManagerName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getQuantity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCorrection() {
        return null;
    }
    
    public final boolean component5() {
        return false;
    }
    
    public final boolean getRoofPenetrate() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRepairUrl() {
        return null;
    }
    
    public final void setRepairUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLocation() {
        return null;
    }
    
    public final void setLocation(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<android.graphics.Bitmap> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<android.graphics.Bitmap> getResolutionBitmap() {
        return null;
    }
    
    public final void setResolutionBitmap(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<android.graphics.Bitmap> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Map<java.lang.String, java.lang.String> toMap() {
        return null;
    }
}