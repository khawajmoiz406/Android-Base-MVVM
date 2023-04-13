package com.centerpoint.connect.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000V\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0005H\u0007\u001a\u001a\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007\u001aG\u0010\u000b\u001a\u00020\u0001*\u00020\f2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011H\u0007\u00a2\u0006\u0002\u0010\u0014\u001a\u0016\u0010\u0015\u001a\u00020\u0001*\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0007\u001a\u001d\u0010\u0018\u001a\u00020\u0001*\u00020\b2\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u000eH\u0007\u00a2\u0006\u0002\u0010\u001a\u001a\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u0001*\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0007\u00a2\u0006\u0002\u0010\u001e\u001a\u0014\u0010\u001f\u001a\u00020\u0001*\u00020\u00032\u0006\u0010 \u001a\u00020!H\u0007\u001a/\u0010\"\u001a\u00020\u0001*\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\n2\b\u0010%\u001a\u0004\u0018\u00010\u000e2\b\u0010&\u001a\u0004\u0018\u00010\nH\u0007\u00a2\u0006\u0002\u0010\'\u001a\u001d\u0010(\u001a\u0004\u0018\u00010\u0001*\u00020\f2\b\u0010)\u001a\u0004\u0018\u00010\u001dH\u0007\u00a2\u0006\u0002\u0010\u001e\u00a8\u0006*"}, d2 = {"bindRecyclerViewAdapter", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "adapter", "Lcom/centerpoint/connect/base/BaseAdapter;", "loadImageWithGlide", "view", "Landroidx/appcompat/widget/AppCompatImageView;", "url", "", "bindCustomBackground", "Landroid/view/View;", "backgroundColor", "", "strokeColor", "strokeWidth", "", "topCorners", "bottomCorners", "(Landroid/view/View;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "bindImageWithBitmap", "bitmap", "Landroid/graphics/Bitmap;", "bindImageWithResId", "id", "(Landroidx/appcompat/widget/AppCompatImageView;Ljava/lang/Integer;)V", "bindInVisibility", "invisible", "", "(Landroid/view/View;Ljava/lang/Boolean;)Lkotlin/Unit;", "bindPagination", "listeners", "Lcom/centerpoint/connect/base/listeners/BaseAdapterListener;", "bindValues", "Lcom/centerpoint/connect/classes/expandable_view/ExpandableView;", "subHeading", "subHeadingColor", "subHeadingDesc", "(Lcom/centerpoint/connect/classes/expandable_view/ExpandableView;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "bindVisibility", "visible", "app_debug"})
public final class ViewBindingsKt {
    
    @androidx.databinding.BindingAdapter(value = {"loadImage"})
    public static final void loadImageWithGlide(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatImageView view, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"adapter"})
    public static final void bindRecyclerViewAdapter(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    com.centerpoint.connect.base.BaseAdapter<?, ?> adapter) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"paginator"})
    public static final void bindPagination(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$bindPagination, @org.jetbrains.annotations.NotNull()
    com.centerpoint.connect.base.listeners.BaseAdapterListener listeners) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setImageRes"}, requireAll = false)
    public static final void bindImageWithResId(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatImageView $this$bindImageWithResId, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.DrawableRes()
    java.lang.Integer id) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setImageBitmap"}, requireAll = false)
    public static final void bindImageWithBitmap(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatImageView $this$bindImageWithBitmap, @org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap bitmap) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.BindingAdapter(value = {"visible"}, requireAll = false)
    public static final kotlin.Unit bindVisibility(@org.jetbrains.annotations.NotNull()
    android.view.View $this$bindVisibility, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean visible) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.BindingAdapter(value = {"invisible"}, requireAll = false)
    public static final kotlin.Unit bindInVisibility(@org.jetbrains.annotations.NotNull()
    android.view.View $this$bindInVisibility, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean invisible) {
        return null;
    }
    
    @androidx.databinding.BindingAdapter(value = {"setSubHeading", "setSubHeadingColor", "setSubHeadingDesc"}, requireAll = false)
    public static final void bindValues(@org.jetbrains.annotations.NotNull()
    com.centerpoint.connect.classes.expandable_view.ExpandableView $this$bindValues, @org.jetbrains.annotations.Nullable()
    java.lang.String subHeading, @org.jetbrains.annotations.Nullable()
    java.lang.Integer subHeadingColor, @org.jetbrains.annotations.Nullable()
    java.lang.String subHeadingDesc) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"backgroundColor", "strokeColor", "strokeWidth", "topCorners", "bottomCorners"}, requireAll = false)
    public static final void bindCustomBackground(@org.jetbrains.annotations.NotNull()
    android.view.View $this$bindCustomBackground, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.ColorRes()
    java.lang.Integer backgroundColor, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.ColorRes()
    java.lang.Integer strokeColor, @org.jetbrains.annotations.Nullable()
    java.lang.Float strokeWidth, @org.jetbrains.annotations.Nullable()
    java.lang.Float topCorners, @org.jetbrains.annotations.Nullable()
    java.lang.Float bottomCorners) {
    }
}