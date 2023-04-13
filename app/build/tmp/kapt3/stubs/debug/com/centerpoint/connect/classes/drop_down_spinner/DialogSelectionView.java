package com.centerpoint.connect.classes.drop_down_spinner;

import java.lang.System;

/**
 * @author Khawaja Moiz
 * created on 1/17/23
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 42\u00020\u00012\u00020\u0002:\u00014B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010&\u001a\u00020\u0013H\u0002J\u001a\u0010\'\u001a\u00020(2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020+H\u0002J\b\u0010,\u001a\u00020(H\u0002J\b\u0010-\u001a\u00020(H\u0002J\u0018\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u00020\b2\u0006\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u00020(H\u0002J\b\u00103\u001a\u00020(H\u0002R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R0\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00158F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lcom/centerpoint/connect/classes/drop_down_spinner/DialogSelectionView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/centerpoint/connect/base/listeners/BaseAdapterListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "adapter", "Lcom/centerpoint/connect/classes/drop_down_spinner/adapter/PopupAdapter;", "getAdapter", "()Lcom/centerpoint/connect/classes/drop_down_spinner/adapter/PopupAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "autoSelectFirst", "", "hint", "", "itemsList", "", "value", "mItemsList", "getMItemsList", "()Ljava/util/List;", "setMItemsList", "(Ljava/util/List;)V", "mSelected", "getMSelected", "()Ljava/lang/String;", "popup", "Landroid/widget/PopupWindow;", "popupBinding", "Lcom/centerpoint/connect/databinding/LayoutPopupViewBinding;", "rootBinding", "Lcom/centerpoint/connect/databinding/LayoutSelectedViewBinding;", "showHint", "getSelectionTextAccordingly", "init", "", "initAttrs", "typedArray", "Landroid/content/res/TypedArray;", "initPopup", "initView", "onItemClick", "position", "item", "", "onListChanged", "showPopup", "Companion", "app_debug"})
public final class DialogSelectionView extends androidx.constraintlayout.widget.ConstraintLayout implements com.centerpoint.connect.base.listeners.BaseAdapterListener {
    private com.centerpoint.connect.databinding.LayoutSelectedViewBinding rootBinding;
    private com.centerpoint.connect.databinding.LayoutPopupViewBinding popupBinding;
    private android.widget.PopupWindow popup;
    private final kotlin.Lazy adapter$delegate = null;
    private java.lang.String hint = "";
    private boolean showHint = false;
    private boolean autoSelectFirst = false;
    private java.util.List<java.lang.String> itemsList;
    @org.jetbrains.annotations.NotNull()
    public static final com.centerpoint.connect.classes.drop_down_spinner.DialogSelectionView.Companion Companion = null;
    private static final java.lang.String DEFAULT_SELECTION_HINT = "";
    private static final boolean DEFAULT_SHOW_SELECTION_HINT = false;
    private static final boolean DEFAULT_AUTO_SELECT_FIRST = false;
    private java.util.HashMap _$_findViewCache;
    
    @kotlin.jvm.JvmOverloads()
    public DialogSelectionView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public DialogSelectionView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public DialogSelectionView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    private final com.centerpoint.connect.classes.drop_down_spinner.adapter.PopupAdapter getAdapter() {
        return null;
    }
    
    private final void init(android.util.AttributeSet attrs, int defStyleAttr) {
    }
    
    private final void initAttrs(android.content.res.TypedArray typedArray) {
    }
    
    private final void initView() {
    }
    
    private final java.lang.String getSelectionTextAccordingly() {
        return null;
    }
    
    private final void initPopup() {
    }
    
    private final void onListChanged() {
    }
    
    private final void showPopup() {
    }
    
    @java.lang.Override()
    public void onItemClick(int position, @org.jetbrains.annotations.NotNull()
    java.lang.Object item) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getMItemsList() {
        return null;
    }
    
    public final void setMItemsList(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMSelected() {
        return null;
    }
    
    public boolean isLoading() {
        return false;
    }
    
    public void onLoadMore(int pageNo) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/centerpoint/connect/classes/drop_down_spinner/DialogSelectionView$Companion;", "", "()V", "DEFAULT_AUTO_SELECT_FIRST", "", "DEFAULT_SELECTION_HINT", "", "DEFAULT_SHOW_SELECTION_HINT", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}