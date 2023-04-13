// Generated by data binding compiler. Do not edit!
package com.centerpoint.connect.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.centerpoint.connect.R;
import com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailFragment;
import com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentServiceInfoDetailBinding extends ViewDataBinding {
  @NonNull
  public final FrameLayout fragmentContainer;

  @NonNull
  public final IncludeTicketInfoHeaderTimerBinding includeHeader;

  @NonNull
  public final RecyclerView rvTabs;

  @Bindable
  protected ServiceInfoDetailFragment mFragment;

  @Bindable
  protected ServiceInfoDetailViewModel mViewModel;

  protected FragmentServiceInfoDetailBinding(Object _bindingComponent, View _root,
      int _localFieldCount, FrameLayout fragmentContainer,
      IncludeTicketInfoHeaderTimerBinding includeHeader, RecyclerView rvTabs) {
    super(_bindingComponent, _root, _localFieldCount);
    this.fragmentContainer = fragmentContainer;
    this.includeHeader = includeHeader;
    this.rvTabs = rvTabs;
  }

  public abstract void setFragment(@Nullable ServiceInfoDetailFragment fragment);

  @Nullable
  public ServiceInfoDetailFragment getFragment() {
    return mFragment;
  }

  public abstract void setViewModel(@Nullable ServiceInfoDetailViewModel viewModel);

  @Nullable
  public ServiceInfoDetailViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentServiceInfoDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_service_info_detail, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentServiceInfoDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentServiceInfoDetailBinding>inflateInternal(inflater, R.layout.fragment_service_info_detail, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentServiceInfoDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_service_info_detail, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentServiceInfoDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentServiceInfoDetailBinding>inflateInternal(inflater, R.layout.fragment_service_info_detail, null, false, component);
  }

  public static FragmentServiceInfoDetailBinding bind(@NonNull View view) {
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
  public static FragmentServiceInfoDetailBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (FragmentServiceInfoDetailBinding)bind(component, view, R.layout.fragment_service_info_detail);
  }
}
