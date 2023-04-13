package com.centerpoint.connect.classes.expandable_view;

import java.lang.System;

/**
 * @author Khawaja Moiz
 * created on 1/18/23
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 <2\u00020\u0001:\u0001<B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001a\u0010+\u001a\u00020,2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020/H\u0002J\b\u00100\u001a\u00020,H\u0002J\u0018\u00101\u001a\u00020,2\u0006\u00102\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u0007H\u0014J\u0012\u00104\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u00020\u0011H\u0002J\u0010\u00107\u001a\u00020,2\u0006\u00108\u001a\u000209H\u0003J\u0010\u0010:\u001a\u00020,2\u0006\u0010;\u001a\u00020\u0011H\u0003R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00078F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010 \u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006="}, d2 = {"Lcom/centerpoint/connect/classes/expandable_view/ExpandableView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bgColor", "cornerRadius", "", "expandableView", "Lcom/centerpoint/connect/databinding/LayoutExpandableBinding;", "heading", "", "headingAllCaps", "", "headingColor", "isExpandable", "isExpanded", "value", "mSubHeading", "getMSubHeading", "()Ljava/lang/String;", "setMSubHeading", "(Ljava/lang/String;)V", "mSubHeadingColor", "getMSubHeadingColor", "()I", "setMSubHeadingColor", "(I)V", "mSubHeadingDesc", "getMSubHeadingDesc", "setMSubHeadingDesc", "rootBinding", "Lcom/centerpoint/connect/databinding/LayoutHeadingExpandableBinding;", "showDropDownIcon", "subDescription", "subHeading", "subHeadingColor", "subHeadingEnabled", "viewAdded", "init", "", "initAttrs", "typedArray", "Landroid/content/res/TypedArray;", "initView", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "toggleExpandableLayout", "Lnet/cachapa/expandablelayout/ExpandableLayout;", "show", "updateInsideView", "view", "Landroid/view/View;", "updateViews", "expanded", "Companion", "app_debug"})
public final class ExpandableView extends android.widget.LinearLayout {
    private com.centerpoint.connect.databinding.LayoutHeadingExpandableBinding rootBinding;
    private com.centerpoint.connect.databinding.LayoutExpandableBinding expandableView;
    private java.lang.String heading = "";
    private java.lang.String subHeading = "";
    private java.lang.String subDescription = "";
    private boolean headingAllCaps = false;
    private int headingColor = -16777216;
    private int subHeadingColor = -16777216;
    private boolean isExpanded = false;
    private boolean isExpandable = true;
    private boolean subHeadingEnabled = false;
    private boolean showDropDownIcon = true;
    private int bgColor = -1;
    private float cornerRadius = 20.0F;
    private boolean viewAdded = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.centerpoint.connect.classes.expandable_view.ExpandableView.Companion Companion = null;
    private static final java.lang.String DEFAULT_HEADING = "";
    private static final java.lang.String DEFAULT_SUB_HEADING = "";
    private static final java.lang.String DEFAULT_SUB_DESCRIPTION = "";
    private static final int DEFAULT_HEADING_COLOR = android.graphics.Color.BLACK;
    private static final int DEFAULT_SUB_HEADING_COLOR = android.graphics.Color.BLACK;
    private static final boolean DEFAULT_HEADING_ALL_CAPS = false;
    private static final boolean DEFAULT_EXPANDED = false;
    private static final boolean DEFAULT_EXPANDABLE = true;
    private static final boolean DEFAULT_SHOW_ICON = true;
    private static final boolean DEFAULT_SUB_HEADING_ENABLED = false;
    private static final int DEFAULT_BACKGROUND_COLOR = android.graphics.Color.WHITE;
    private static final float DEFAULT_CORNER_RADIUS = 20.0F;
    private java.util.HashMap _$_findViewCache;
    
    @kotlin.jvm.JvmOverloads()
    public ExpandableView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public ExpandableView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public ExpandableView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    private final void init(android.util.AttributeSet attrs, int defStyleAttr) {
    }
    
    private final void initAttrs(android.content.res.TypedArray typedArray) {
    }
    
    @java.lang.Override()
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }
    
    private final void initView() {
    }
    
    private final net.cachapa.expandablelayout.ExpandableLayout toggleExpandableLayout(boolean show) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"ResourceType"})
    private final void updateViews(boolean expanded) {
    }
    
    @android.annotation.SuppressLint(value = {"ResourceType"})
    private final void updateInsideView(android.view.View view) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMSubHeading() {
        return null;
    }
    
    public final void setMSubHeading(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    public final int getMSubHeadingColor() {
        return 0;
    }
    
    public final void setMSubHeadingColor(int value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMSubHeadingDesc() {
        return null;
    }
    
    public final void setMSubHeadingDesc(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/centerpoint/connect/classes/expandable_view/ExpandableView$Companion;", "", "()V", "DEFAULT_BACKGROUND_COLOR", "", "DEFAULT_CORNER_RADIUS", "", "DEFAULT_EXPANDABLE", "", "DEFAULT_EXPANDED", "DEFAULT_HEADING", "", "DEFAULT_HEADING_ALL_CAPS", "DEFAULT_HEADING_COLOR", "DEFAULT_SHOW_ICON", "DEFAULT_SUB_DESCRIPTION", "DEFAULT_SUB_HEADING", "DEFAULT_SUB_HEADING_COLOR", "DEFAULT_SUB_HEADING_ENABLED", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}