// Generated by data binding compiler. Do not edit!
package com.centerpoint.connect.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.centerpoint.connect.R;
import com.centerpoint.connect.base.listeners.NavigationListeners;
import com.centerpoint.connect.models.helper.User;
import com.centerpoint.connect.ui.global.drawer.DrawerAdapter;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class IncludeSideDrawerBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView ivUser;

  @NonNull
  public final RelativeLayout rlBack;

  @NonNull
  public final RecyclerView rvItems;

  @NonNull
  public final TextView tvUserEmail;

  @NonNull
  public final TextView tvUserName;

  @Bindable
  protected DrawerAdapter mAdapter;

  @Bindable
  protected NavigationListeners mListeners;

  @Bindable
  protected User mUser;

  protected IncludeSideDrawerBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatImageView ivUser, RelativeLayout rlBack, RecyclerView rvItems, TextView tvUserEmail,
      TextView tvUserName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ivUser = ivUser;
    this.rlBack = rlBack;
    this.rvItems = rvItems;
    this.tvUserEmail = tvUserEmail;
    this.tvUserName = tvUserName;
  }

  public abstract void setAdapter(@Nullable DrawerAdapter adapter);

  @Nullable
  public DrawerAdapter getAdapter() {
    return mAdapter;
  }

  public abstract void setListeners(@Nullable NavigationListeners listeners);

  @Nullable
  public NavigationListeners getListeners() {
    return mListeners;
  }

  public abstract void setUser(@Nullable User user);

  @Nullable
  public User getUser() {
    return mUser;
  }

  @NonNull
  public static IncludeSideDrawerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.include_side_drawer, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static IncludeSideDrawerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<IncludeSideDrawerBinding>inflateInternal(inflater, R.layout.include_side_drawer, root, attachToRoot, component);
  }

  @NonNull
  public static IncludeSideDrawerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.include_side_drawer, null, false, component)
   */
  @NonNull
  @Deprecated
  public static IncludeSideDrawerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<IncludeSideDrawerBinding>inflateInternal(inflater, R.layout.include_side_drawer, null, false, component);
  }

  public static IncludeSideDrawerBinding bind(@NonNull View view) {
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
  public static IncludeSideDrawerBinding bind(@NonNull View view, @Nullable Object component) {
    return (IncludeSideDrawerBinding)bind(component, view, R.layout.include_side_drawer);
  }
}
