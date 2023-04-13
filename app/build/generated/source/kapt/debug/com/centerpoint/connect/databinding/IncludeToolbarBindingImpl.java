package com.centerpoint.connect.databinding;
import com.centerpoint.connect.R;
import com.centerpoint.connect.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class IncludeToolbarBindingImpl extends IncludeToolbarBinding implements com.centerpoint.connect.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tvTitle, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView2;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback15;
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    @Nullable
    private final android.view.View.OnClickListener mCallback16;
    @Nullable
    private final android.view.View.OnClickListener mCallback14;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public IncludeToolbarBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private IncludeToolbarBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.RelativeLayout) bindings[5]
            , (android.widget.RelativeLayout) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[6]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (androidx.appcompat.widget.AppCompatImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView4 = (androidx.appcompat.widget.AppCompatImageView) bindings[4];
        this.mboundView4.setTag(null);
        this.rlEnd.setTag(null);
        this.rlStart.setTag(null);
        this.tvAttendanceStatus.setTag(null);
        setRootTag(root);
        // listeners
        mCallback15 = new com.centerpoint.connect.generated.callback.OnClickListener(this, 3);
        mCallback13 = new com.centerpoint.connect.generated.callback.OnClickListener(this, 1);
        mCallback16 = new com.centerpoint.connect.generated.callback.OnClickListener(this, 4);
        mCallback14 = new com.centerpoint.connect.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.listeners == variableId) {
            setListeners((com.centerpoint.connect.base.listeners.ToolbarListeners) variable);
        }
        else if (BR.showBack == variableId) {
            setShowBack((java.lang.Boolean) variable);
        }
        else if (BR.user == variableId) {
            setUser((com.centerpoint.connect.models.helper.User) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setListeners(@Nullable com.centerpoint.connect.base.listeners.ToolbarListeners Listeners) {
        this.mListeners = Listeners;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.listeners);
        super.requestRebind();
    }
    public void setShowBack(@Nullable java.lang.Boolean ShowBack) {
        this.mShowBack = ShowBack;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.showBack);
        super.requestRebind();
    }
    public void setUser(@Nullable com.centerpoint.connect.models.helper.User User) {
        this.mUser = User;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.user);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        boolean userAttendanceConstantsKtCHECKOUT = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxShowBack = false;
        com.centerpoint.connect.base.listeners.ToolbarListeners listeners = mListeners;
        android.graphics.drawable.Drawable showBackBooleanTrueMboundView2AndroidDrawableIcBackMboundView2AndroidDrawableIcDrawer = null;
        boolean showBackBooleanTrue = false;
        java.lang.Boolean showBack = mShowBack;
        float showBackBooleanTrueMboundView2AndroidDimen3sdpMboundView2AndroidDimenZeroDp = 0f;
        android.widget.ImageView.ScaleType showBackBooleanTrueScaleTypeFITSTARTScaleTypeFITCENTER = null;
        java.lang.Integer userAttendance = null;
        com.centerpoint.connect.models.helper.User user = mUser;
        int androidxDatabindingViewDataBindingSafeUnboxUserAttendance = 0;
        java.lang.String userAttendanceConstantsKtCHECKOUTTvAttendanceStatusAndroidStringStartYourDayTvAttendanceStatusAndroidStringClockOut = null;

        if ((dirtyFlags & 0xaL) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(showBack)
                androidxDatabindingViewDataBindingSafeUnboxShowBack = androidx.databinding.ViewDataBinding.safeUnbox(showBack);


                // read androidx.databinding.ViewDataBinding.safeUnbox(showBack) == true
                showBackBooleanTrue = (androidxDatabindingViewDataBindingSafeUnboxShowBack) == (true);
            if((dirtyFlags & 0xaL) != 0) {
                if(showBackBooleanTrue) {
                        dirtyFlags |= 0x20L;
                        dirtyFlags |= 0x80L;
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x40L;
                        dirtyFlags |= 0x100L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(showBack) == true ? @android:drawable/ic_back : @android:drawable/ic_drawer
                showBackBooleanTrueMboundView2AndroidDrawableIcBackMboundView2AndroidDrawableIcDrawer = ((showBackBooleanTrue) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView2.getContext(), R.drawable.ic_back)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView2.getContext(), R.drawable.ic_drawer)));
                // read androidx.databinding.ViewDataBinding.safeUnbox(showBack) == true ? @android:dimen/_3sdp : @android:dimen/zero_dp
                showBackBooleanTrueMboundView2AndroidDimen3sdpMboundView2AndroidDimenZeroDp = ((showBackBooleanTrue) ? (mboundView2.getResources().getDimension(R.dimen._3sdp)) : (mboundView2.getResources().getDimension(R.dimen.zero_dp)));
                // read androidx.databinding.ViewDataBinding.safeUnbox(showBack) == true ? ScaleType.FIT_START : ScaleType.FIT_CENTER
                showBackBooleanTrueScaleTypeFITSTARTScaleTypeFITCENTER = ((showBackBooleanTrue) ? (android.widget.ImageView.ScaleType.FIT_START) : (android.widget.ImageView.ScaleType.FIT_CENTER));
        }
        if ((dirtyFlags & 0xcL) != 0) {



                if (user != null) {
                    // read user.attendance
                    userAttendance = user.getAttendance();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(user.attendance)
                androidxDatabindingViewDataBindingSafeUnboxUserAttendance = androidx.databinding.ViewDataBinding.safeUnbox(userAttendance);


                // read androidx.databinding.ViewDataBinding.safeUnbox(user.attendance) == ConstantsKt.CHECK_OUT
                userAttendanceConstantsKtCHECKOUT = (androidxDatabindingViewDataBindingSafeUnboxUserAttendance) == (com.centerpoint.connect.constants.ConstantsKt.CHECK_OUT);
            if((dirtyFlags & 0xcL) != 0) {
                if(userAttendanceConstantsKtCHECKOUT) {
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x400L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(user.attendance) == ConstantsKt.CHECK_OUT ? @android:string/start_your_day : @android:string/clock_out
                userAttendanceConstantsKtCHECKOUTTvAttendanceStatusAndroidStringStartYourDayTvAttendanceStatusAndroidStringClockOut = ((userAttendanceConstantsKtCHECKOUT) ? (tvAttendanceStatus.getResources().getString(R.string.start_your_day)) : (tvAttendanceStatus.getResources().getString(R.string.clock_out)));
        }
        // batch finished
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setPadding(this.mboundView2, showBackBooleanTrueMboundView2AndroidDimen3sdpMboundView2AndroidDimenZeroDp);
            this.mboundView2.setScaleType(showBackBooleanTrueScaleTypeFITSTARTScaleTypeFITCENTER);
            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.mboundView2, showBackBooleanTrueMboundView2AndroidDrawableIcBackMboundView2AndroidDrawableIcDrawer);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.mboundView4.setOnClickListener(mCallback15);
            this.rlEnd.setOnClickListener(mCallback16);
            this.rlStart.setOnClickListener(mCallback13);
            this.tvAttendanceStatus.setOnClickListener(mCallback14);
            com.centerpoint.connect.base.ViewBindingsKt.bindCustomBackground(this.tvAttendanceStatus, getColorFromResource(tvAttendanceStatus, R.color.colorPrimaryDark), getColorFromResource(tvAttendanceStatus, R.color.white), tvAttendanceStatus.getResources().getDimension(R.dimen._1sdp), tvAttendanceStatus.getResources().getDimension(R.dimen._20sdp), tvAttendanceStatus.getResources().getDimension(R.dimen._20sdp));
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvAttendanceStatus, userAttendanceConstantsKtCHECKOUTTvAttendanceStatusAndroidStringStartYourDayTvAttendanceStatusAndroidStringClockOut);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // listeners != null
                boolean listenersJavaLangObjectNull = false;
                // listeners
                com.centerpoint.connect.base.listeners.ToolbarListeners listeners = mListeners;



                listenersJavaLangObjectNull = (listeners) != (null);
                if (listenersJavaLangObjectNull) {


                    listeners.onClockClicked();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // listeners != null
                boolean listenersJavaLangObjectNull = false;
                // listeners
                com.centerpoint.connect.base.listeners.ToolbarListeners listeners = mListeners;



                listenersJavaLangObjectNull = (listeners) != (null);
                if (listenersJavaLangObjectNull) {


                    listeners.onStartIconClicked();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // listeners != null
                boolean listenersJavaLangObjectNull = false;
                // listeners
                com.centerpoint.connect.base.listeners.ToolbarListeners listeners = mListeners;



                listenersJavaLangObjectNull = (listeners) != (null);
                if (listenersJavaLangObjectNull) {


                    listeners.onEndIconClicked();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // listeners != null
                boolean listenersJavaLangObjectNull = false;
                // listeners
                com.centerpoint.connect.base.listeners.ToolbarListeners listeners = mListeners;



                listenersJavaLangObjectNull = (listeners) != (null);
                if (listenersJavaLangObjectNull) {


                    listeners.onClockClicked();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): listeners
        flag 1 (0x2L): showBack
        flag 2 (0x3L): user
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(showBack) == true ? @android:drawable/ic_back : @android:drawable/ic_drawer
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(showBack) == true ? @android:drawable/ic_back : @android:drawable/ic_drawer
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(showBack) == true ? @android:dimen/_3sdp : @android:dimen/zero_dp
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(showBack) == true ? @android:dimen/_3sdp : @android:dimen/zero_dp
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(showBack) == true ? ScaleType.FIT_START : ScaleType.FIT_CENTER
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(showBack) == true ? ScaleType.FIT_START : ScaleType.FIT_CENTER
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(user.attendance) == ConstantsKt.CHECK_OUT ? @android:string/start_your_day : @android:string/clock_out
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(user.attendance) == ConstantsKt.CHECK_OUT ? @android:string/start_your_day : @android:string/clock_out
    flag mapping end*/
    //end
}