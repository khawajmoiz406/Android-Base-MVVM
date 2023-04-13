package com.centerpoint.connect.models.helper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001#B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\bH\u00c6\u0003J1\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u00d6\u0003J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001J\t\u0010!\u001a\u00020\"H\u00d6\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006$"}, d2 = {"Lcom/centerpoint/connect/models/helper/RepairTab;", "Ljava/io/Serializable;", "requestCode", "", "imageRes", "state", "Lcom/centerpoint/connect/models/helper/RepairTab$State;", "selectable", "", "(IILcom/centerpoint/connect/models/helper/RepairTab$State;Z)V", "getImageRes", "()I", "setImageRes", "(I)V", "getRequestCode", "setRequestCode", "getSelectable", "()Z", "setSelectable", "(Z)V", "getState", "()Lcom/centerpoint/connect/models/helper/RepairTab$State;", "setState", "(Lcom/centerpoint/connect/models/helper/RepairTab$State;)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "toString", "", "State", "app_debug"})
public final class RepairTab implements java.io.Serializable {
    private int requestCode;
    private int imageRes;
    @org.jetbrains.annotations.NotNull()
    private com.centerpoint.connect.models.helper.RepairTab.State state;
    private boolean selectable;
    
    @org.jetbrains.annotations.NotNull()
    public final com.centerpoint.connect.models.helper.RepairTab copy(int requestCode, @androidx.annotation.DrawableRes()
    int imageRes, @org.jetbrains.annotations.NotNull()
    com.centerpoint.connect.models.helper.RepairTab.State state, boolean selectable) {
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
    
    public RepairTab(int requestCode, @androidx.annotation.DrawableRes()
    int imageRes, @org.jetbrains.annotations.NotNull()
    com.centerpoint.connect.models.helper.RepairTab.State state, boolean selectable) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getRequestCode() {
        return 0;
    }
    
    public final void setRequestCode(int p0) {
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getImageRes() {
        return 0;
    }
    
    public final void setImageRes(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.centerpoint.connect.models.helper.RepairTab.State component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.centerpoint.connect.models.helper.RepairTab.State getState() {
        return null;
    }
    
    public final void setState(@org.jetbrains.annotations.NotNull()
    com.centerpoint.connect.models.helper.RepairTab.State p0) {
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final boolean getSelectable() {
        return false;
    }
    
    public final void setSelectable(boolean p0) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/centerpoint/connect/models/helper/RepairTab$State;", "", "(Ljava/lang/String;I)V", "DISABLED", "SELECTED", "COMPLETED", "app_debug"})
    public static enum State {
        /*public static final*/ DISABLED /* = new DISABLED() */,
        /*public static final*/ SELECTED /* = new SELECTED() */,
        /*public static final*/ COMPLETED /* = new COMPLETED() */;
        
        State() {
        }
    }
}