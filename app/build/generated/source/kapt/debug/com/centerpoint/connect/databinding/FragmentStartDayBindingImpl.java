package com.centerpoint.connect.databinding;
import com.centerpoint.connect.R;
import com.centerpoint.connect.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentStartDayBindingImpl extends FragmentStartDayBinding implements com.centerpoint.connect.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tvCostCode, 5);
        sViewsWithIds.put(R.id.dsvCostCode, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback37;
    @Nullable
    private final android.view.View.OnClickListener mCallback36;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentStartDayBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentStartDayBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (com.centerpoint.connect.classes.drop_down_spinner.DialogSelectionView) bindings[6]
            , (android.widget.RelativeLayout) bindings[1]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[2]
            );
        this.btnLogin.setTag(null);
        this.cvCard.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rlBack.setTag(null);
        this.tvHeading.setTag(null);
        setRootTag(root);
        // listeners
        mCallback37 = new com.centerpoint.connect.generated.callback.OnClickListener(this, 2);
        mCallback36 = new com.centerpoint.connect.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
            setFragment((com.centerpoint.connect.ui.global.start_day.StartDayFragment) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFragment(@Nullable com.centerpoint.connect.ui.global.start_day.StartDayFragment Fragment) {
        this.mFragment = Fragment;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.fragment);
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
        com.centerpoint.connect.ui.global.start_day.StartDayFragment fragment = mFragment;
        int androidxDatabindingViewDataBindingSafeUnboxFragmentUserDataAttendance = 0;
        java.lang.Integer fragmentUserDataAttendance = null;
        java.lang.String fragmentUserDataAttendanceConstantsKtCHECKOUTBtnLoginAndroidStringClockInBtnLoginAndroidStringClockOut = null;
        com.centerpoint.connect.models.helper.User fragmentUserData = null;
        java.lang.String fragmentUserDataAttendanceConstantsKtCHECKOUTTvHeadingAndroidStringStartYourDayTvHeadingAndroidStringEndYourDay = null;
        boolean fragmentUserDataAttendanceConstantsKtCHECKOUT = false;

        if ((dirtyFlags & 0x3L) != 0) {



                if (fragment != null) {
                    // read fragment.userData
                    fragmentUserData = fragment.getUserData();
                }


                if (fragmentUserData != null) {
                    // read fragment.userData.attendance
                    fragmentUserDataAttendance = fragmentUserData.getAttendance();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(fragment.userData.attendance)
                androidxDatabindingViewDataBindingSafeUnboxFragmentUserDataAttendance = androidx.databinding.ViewDataBinding.safeUnbox(fragmentUserDataAttendance);


                // read androidx.databinding.ViewDataBinding.safeUnbox(fragment.userData.attendance) == ConstantsKt.CHECK_OUT
                fragmentUserDataAttendanceConstantsKtCHECKOUT = (androidxDatabindingViewDataBindingSafeUnboxFragmentUserDataAttendance) == (com.centerpoint.connect.constants.ConstantsKt.CHECK_OUT);
            if((dirtyFlags & 0x3L) != 0) {
                if(fragmentUserDataAttendanceConstantsKtCHECKOUT) {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x4L;
                        dirtyFlags |= 0x10L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(fragment.userData.attendance) == ConstantsKt.CHECK_OUT ? @android:string/clock_in : @android:string/clock_out
                fragmentUserDataAttendanceConstantsKtCHECKOUTBtnLoginAndroidStringClockInBtnLoginAndroidStringClockOut = ((fragmentUserDataAttendanceConstantsKtCHECKOUT) ? (btnLogin.getResources().getString(R.string.clock_in)) : (btnLogin.getResources().getString(R.string.clock_out)));
                // read androidx.databinding.ViewDataBinding.safeUnbox(fragment.userData.attendance) == ConstantsKt.CHECK_OUT ? @android:string/start_your_day : @android:string/end_your_day
                fragmentUserDataAttendanceConstantsKtCHECKOUTTvHeadingAndroidStringStartYourDayTvHeadingAndroidStringEndYourDay = ((fragmentUserDataAttendanceConstantsKtCHECKOUT) ? (tvHeading.getResources().getString(R.string.start_your_day)) : (tvHeading.getResources().getString(R.string.end_your_day)));
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.btnLogin.setOnClickListener(mCallback37);
            com.centerpoint.connect.base.ViewBindingsKt.bindCustomBackground(this.btnLogin, getColorFromResource(btnLogin, R.color.text_color_grey), (java.lang.Integer)null, (java.lang.Float)null, btnLogin.getResources().getDimension(R.dimen._40sdp), btnLogin.getResources().getDimension(R.dimen._40sdp));
            com.centerpoint.connect.base.ViewBindingsKt.bindCustomBackground(this.cvCard, getColorFromResource(cvCard, R.color.white), (java.lang.Integer)null, (java.lang.Float)null, cvCard.getResources().getDimension(R.dimen._20sdp), cvCard.getResources().getDimension(R.dimen._20sdp));
            this.rlBack.setOnClickListener(mCallback36);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.btnLogin, fragmentUserDataAttendanceConstantsKtCHECKOUTBtnLoginAndroidStringClockInBtnLoginAndroidStringClockOut);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvHeading, fragmentUserDataAttendanceConstantsKtCHECKOUTTvHeadingAndroidStringStartYourDayTvHeadingAndroidStringEndYourDay);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // fragment
                com.centerpoint.connect.ui.global.start_day.StartDayFragment fragment = mFragment;
                // fragment.verifyFields()
                java.lang.Object fragmentVerifyFields = null;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragmentVerifyFields = fragment.verifyFields();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // fragment
                com.centerpoint.connect.ui.global.start_day.StartDayFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.onBackPress();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): fragment
        flag 1 (0x2L): null
        flag 2 (0x3L): androidx.databinding.ViewDataBinding.safeUnbox(fragment.userData.attendance) == ConstantsKt.CHECK_OUT ? @android:string/clock_in : @android:string/clock_out
        flag 3 (0x4L): androidx.databinding.ViewDataBinding.safeUnbox(fragment.userData.attendance) == ConstantsKt.CHECK_OUT ? @android:string/clock_in : @android:string/clock_out
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(fragment.userData.attendance) == ConstantsKt.CHECK_OUT ? @android:string/start_your_day : @android:string/end_your_day
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(fragment.userData.attendance) == ConstantsKt.CHECK_OUT ? @android:string/start_your_day : @android:string/end_your_day
    flag mapping end*/
    //end
}