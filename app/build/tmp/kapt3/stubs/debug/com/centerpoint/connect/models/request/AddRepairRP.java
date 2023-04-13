package com.centerpoint.connect.models.request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u000eJ\u0006\u0010#\u001a\u00020$J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\n0\u0003H\u00c6\u0003J\u0011\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0003H\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0087\u0001\u0010-\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001J\u0013\u0010.\u001a\u00020\n2\b\u0010/\u001a\u0004\u0018\u000100H\u00d6\u0003J\t\u00101\u001a\u000202H\u00d6\u0001J\u0014\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000404H\u0016J\t\u00105\u001a\u00020\u0004H\u00d6\u0001R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0012R\"\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0010\"\u0004\b \u0010\u0012R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010\u0012\u00a8\u00066"}, d2 = {"Lcom/centerpoint/connect/models/request/AddRepairRP;", "Lcom/centerpoint/connect/base/BaseRequestParams;", "managerName", "Landroidx/databinding/ObservableField;", "", "quantity", "unit", "description", "correction", "roofPenetrate", "", "repairBitmap", "Landroid/graphics/Bitmap;", "location", "(Landroidx/databinding/ObservableField;Landroidx/databinding/ObservableField;Landroidx/databinding/ObservableField;Landroidx/databinding/ObservableField;Landroidx/databinding/ObservableField;Landroidx/databinding/ObservableField;Landroidx/databinding/ObservableField;Ljava/lang/String;)V", "getCorrection", "()Landroidx/databinding/ObservableField;", "setCorrection", "(Landroidx/databinding/ObservableField;)V", "getDescription", "setDescription", "getLocation", "()Ljava/lang/String;", "setLocation", "(Ljava/lang/String;)V", "getManagerName", "setManagerName", "getQuantity", "setQuantity", "getRepairBitmap", "setRepairBitmap", "getRoofPenetrate", "setRoofPenetrate", "getUnit", "setUnit", "clearFields", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "", "toMap", "", "toString", "app_debug"})
public final class AddRepairRP extends com.centerpoint.connect.base.BaseRequestParams {
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> managerName;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> quantity;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> unit;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> description;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> correction;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.Boolean> roofPenetrate;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<android.graphics.Bitmap> repairBitmap;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String location;
    
    @org.jetbrains.annotations.NotNull()
    public final com.centerpoint.connect.models.request.AddRepairRP copy(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> managerName, @org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> quantity, @org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> unit, @org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> description, @org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> correction, @org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.Boolean> roofPenetrate, @org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<android.graphics.Bitmap> repairBitmap, @org.jetbrains.annotations.Nullable()
    java.lang.String location) {
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
    
    public AddRepairRP() {
        super();
    }
    
    public AddRepairRP(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> managerName, @org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> quantity, @org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> unit, @org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> description, @org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> correction, @org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.Boolean> roofPenetrate, @org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<android.graphics.Bitmap> repairBitmap, @org.jetbrains.annotations.Nullable()
    java.lang.String location) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getManagerName() {
        return null;
    }
    
    public final void setManagerName(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getQuantity() {
        return null;
    }
    
    public final void setQuantity(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getUnit() {
        return null;
    }
    
    public final void setUnit(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getCorrection() {
        return null;
    }
    
    public final void setCorrection(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Boolean> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Boolean> getRoofPenetrate() {
        return null;
    }
    
    public final void setRoofPenetrate(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<android.graphics.Bitmap> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<android.graphics.Bitmap> getRepairBitmap() {
        return null;
    }
    
    public final void setRepairBitmap(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<android.graphics.Bitmap> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
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
    @java.lang.Override()
    public java.util.Map<java.lang.String, java.lang.String> toMap() {
        return null;
    }
    
    public final void clearFields() {
    }
}