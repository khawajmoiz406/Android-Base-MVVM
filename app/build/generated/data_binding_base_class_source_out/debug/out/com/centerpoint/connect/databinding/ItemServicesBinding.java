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
import com.centerpoint.connect.models.response.services.Service;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemServicesBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView ivLocation;

  @NonNull
  public final TextView tvAddress;

  @NonNull
  public final TextView tvEtaDate;

  @NonNull
  public final TextView tvEtaHeading;

  @NonNull
  public final TextView tvEtaTime;

  @NonNull
  public final TextView tvRegion;

  @NonNull
  public final TextView tvStage;

  @NonNull
  public final TextView tvStageHeading;

  @NonNull
  public final View viewLine;

  @Bindable
  protected Service mData;

  @Bindable
  protected Integer mItemCount;

  @Bindable
  protected Integer mPosition;

  @Bindable
  protected BaseAdapterListener mListeners;

  protected ItemServicesBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatImageView ivLocation, TextView tvAddress, TextView tvEtaDate, TextView tvEtaHeading,
      TextView tvEtaTime, TextView tvRegion, TextView tvStage, TextView tvStageHeading,
      View viewLine) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ivLocation = ivLocation;
    this.tvAddress = tvAddress;
    this.tvEtaDate = tvEtaDate;
    this.tvEtaHeading = tvEtaHeading;
    this.tvEtaTime = tvEtaTime;
    this.tvRegion = tvRegion;
    this.tvStage = tvStage;
    this.tvStageHeading = tvStageHeading;
    this.viewLine = viewLine;
  }

  public abstract void setData(@Nullable Service data);

  @Nullable
  public Service getData() {
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
  public static ItemServicesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_services, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemServicesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemServicesBinding>inflateInternal(inflater, R.layout.item_services, root, attachToRoot, component);
  }

  @NonNull
  public static ItemServicesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_services, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemServicesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemServicesBinding>inflateInternal(inflater, R.layout.item_services, null, false, component);
  }

  public static ItemServicesBinding bind(@NonNull View view) {
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
  public static ItemServicesBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemServicesBinding)bind(component, view, R.layout.item_services);
  }
}