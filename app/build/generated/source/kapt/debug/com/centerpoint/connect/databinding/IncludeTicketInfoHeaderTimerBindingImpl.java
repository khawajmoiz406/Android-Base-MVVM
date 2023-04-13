package com.centerpoint.connect.databinding;
import com.centerpoint.connect.R;
import com.centerpoint.connect.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class IncludeTicketInfoHeaderTimerBindingImpl extends IncludeTicketInfoHeaderTimerBinding implements com.centerpoint.connect.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.viewTop, 3);
        sViewsWithIds.put(R.id.tvOrderIdHeading, 4);
        sViewsWithIds.put(R.id.tvOrderIdValue, 5);
        sViewsWithIds.put(R.id.ivDropDown, 6);
        sViewsWithIds.put(R.id.viewBottom, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback43;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public IncludeTicketInfoHeaderTimerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private IncludeTicketInfoHeaderTimerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[6]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[2]
            , (android.view.View) bindings[7]
            , (android.view.View) bindings[3]
            );
        this.ivClockButton.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvTimerValue.setTag(null);
        setRootTag(root);
        // listeners
        mCallback43 = new com.centerpoint.connect.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.fragment == variableId) {
            setFragment((com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFragment(@Nullable com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailFragment Fragment) {
        this.mFragment = Fragment;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.fragment);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelClockTime((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelIsWatchRunning((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelClockTime(androidx.databinding.ObservableField<java.lang.String> ViewModelClockTime, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsWatchRunning(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelIsWatchRunning, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailFragment fragment = mFragment;
        java.lang.Boolean viewModelIsWatchRunningGet = null;
        java.lang.String viewModelClockTimeGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelClockTime = null;
        androidx.databinding.ObservableField<java.lang.Boolean> viewModelIsWatchRunning = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsWatchRunningGet = false;
        android.graphics.drawable.Drawable viewModelIsWatchRunningIvClockButtonAndroidDrawableIcPauseClockIvClockButtonAndroidDrawableIcPlayClock = null;
        com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x1bL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.clockTime
                        viewModelClockTime = viewModel.getClockTime();
                    }
                    updateRegistration(0, viewModelClockTime);


                    if (viewModelClockTime != null) {
                        // read viewModel.clockTime.get()
                        viewModelClockTimeGet = viewModelClockTime.get();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isWatchRunning
                        viewModelIsWatchRunning = viewModel.isWatchRunning();
                    }
                    updateRegistration(1, viewModelIsWatchRunning);


                    if (viewModelIsWatchRunning != null) {
                        // read viewModel.isWatchRunning.get()
                        viewModelIsWatchRunningGet = viewModelIsWatchRunning.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isWatchRunning.get())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsWatchRunningGet = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsWatchRunningGet);
                if((dirtyFlags & 0x1aL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsWatchRunningGet) {
                            dirtyFlags |= 0x40L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isWatchRunning.get()) ? @android:drawable/ic_pause_clock : @android:drawable/ic_play_clock
                    viewModelIsWatchRunningIvClockButtonAndroidDrawableIcPauseClockIvClockButtonAndroidDrawableIcPlayClock = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsWatchRunningGet) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(ivClockButton.getContext(), R.drawable.ic_pause_clock)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(ivClockButton.getContext(), R.drawable.ic_play_clock)));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.ivClockButton.setOnClickListener(mCallback43);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.ivClockButton, viewModelIsWatchRunningIvClockButtonAndroidDrawableIcPauseClockIvClockButtonAndroidDrawableIcPlayClock);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTimerValue, viewModelClockTimeGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // fragment
        com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailFragment fragment = mFragment;
        // fragment != null
        boolean fragmentJavaLangObjectNull = false;



        fragmentJavaLangObjectNull = (fragment) != (null);
        if (fragmentJavaLangObjectNull) {


            fragment.toggleStopwatch();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.clockTime
        flag 1 (0x2L): viewModel.isWatchRunning
        flag 2 (0x3L): fragment
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isWatchRunning.get()) ? @android:drawable/ic_pause_clock : @android:drawable/ic_play_clock
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isWatchRunning.get()) ? @android:drawable/ic_pause_clock : @android:drawable/ic_play_clock
    flag mapping end*/
    //end
}