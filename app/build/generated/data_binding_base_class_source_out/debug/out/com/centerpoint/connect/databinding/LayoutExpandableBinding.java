// Generated by data binding compiler. Do not edit!
package com.centerpoint.connect.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.centerpoint.connect.R;
import java.lang.Deprecated;
import java.lang.Object;
import net.cachapa.expandablelayout.ExpandableLayout;

public abstract class LayoutExpandableBinding extends ViewDataBinding {
  @NonNull
  public final ExpandableLayout expandableLayout;

  protected LayoutExpandableBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ExpandableLayout expandableLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.expandableLayout = expandableLayout;
  }

  @NonNull
  public static LayoutExpandableBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_expandable, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static LayoutExpandableBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<LayoutExpandableBinding>inflateInternal(inflater, R.layout.layout_expandable, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutExpandableBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_expandable, null, false, component)
   */
  @NonNull
  @Deprecated
  public static LayoutExpandableBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<LayoutExpandableBinding>inflateInternal(inflater, R.layout.layout_expandable, null, false, component);
  }

  public static LayoutExpandableBinding bind(@NonNull View view) {
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
  public static LayoutExpandableBinding bind(@NonNull View view, @Nullable Object component) {
    return (LayoutExpandableBinding)bind(component, view, R.layout.layout_expandable);
  }
}
