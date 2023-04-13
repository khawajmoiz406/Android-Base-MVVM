// Generated by data binding compiler. Do not edit!
package com.centerpoint.connect.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.centerpoint.connect.R;
import com.centerpoint.connect.base.listeners.BaseAdapterListener;
import com.centerpoint.connect.models.helper.Drawer;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemDrawerBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView ivDrawerItem;

  @NonNull
  public final TextView tvDrawerItem;

  @NonNull
  public final View viewLine;

  @Bindable
  protected Drawer mData;

  @Bindable
  protected Integer mItemCount;

  @Bindable
  protected Integer mPosition;

  @Bindable
  protected BaseAdapterListener mListeners;

  protected ItemDrawerBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatImageView ivDrawerItem, TextView tvDrawerItem, View viewLine) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ivDrawerItem = ivDrawerItem;
    this.tvDrawerItem = tvDrawerItem;
    this.viewLine = viewLine;
  }

  public abstract void setData(@Nullable Drawer data);

  @Nullable
  public Drawer getData() {
    return mData;
  }

  public abstract void setItemCount(@Nullable Integer itemCount);

  @Nullable
  public Integer getItemCount() {
    return mItemCount;
  }

  public abstract void setPosition(@Nullable Integer position);

  @Nullable
  public Integer getPosition() {
    return mPosition;
  }

  public abstract void setListeners(@Nullable BaseAdapterListener listeners);

  @Nullable
  public BaseAdapterListener getListeners() {
    return mListeners;
  }

  @NonNull
  public static ItemDrawerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_drawer, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemDrawerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemDrawerBinding>inflateInternal(inflater, R.layout.item_drawer, root, attachToRoot, component);
  }

  @NonNull
  public static ItemDrawerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_drawer, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemDrawerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemDrawerBinding>inflateInternal(inflater, R.layout.item_drawer, null, false, component);
  }

  public static ItemDrawerBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemDrawerBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemDrawerBinding)bind(component, view, R.layout.item_drawer);
  }
}
