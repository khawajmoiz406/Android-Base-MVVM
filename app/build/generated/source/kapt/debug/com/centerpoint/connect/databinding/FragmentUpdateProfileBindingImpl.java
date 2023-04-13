package com.centerpoint.connect.databinding;
import com.centerpoint.connect.R;
import com.centerpoint.connect.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentUpdateProfileBindingImpl extends FragmentUpdateProfileBinding implements com.centerpoint.connect.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(13);
        sIncludes.setIncludes(0, 
            new String[] {"include_bg_landing"},
            new int[] {9},
            new int[] {com.centerpoint.connect.R.layout.include_bg_landing});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tvEmailHeading, 10);
        sViewsWithIds.put(R.id.tvMobileNo, 11);
        sViewsWithIds.put(R.id.tvOfficeNo, 12);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback42;
    @Nullable
    private final android.view.View.OnClickListener mCallback41;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etEmailandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.requestParams.email.get()
            //         is viewModel.requestParams.email.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etEmail);
            // localize variables for thread safety
            // viewModel.requestParams.email.get()
            java.lang.String viewModelRequestParamsEmailGet = null;
            // viewModel.requestParams.email
            androidx.databinding.ObservableField<java.lang.String> viewModelRequestParamsEmail = null;
            // viewModel.requestParams.email != null
            boolean viewModelRequestParamsEmailJavaLangObjectNull = false;
            // viewModel.requestParams != null
            boolean viewModelRequestParamsJavaLangObjectNull = false;
            // viewModel
            com.centerpoint.connect.ui.global.update_profile.UpdateProfileViewModel viewModel = mViewModel;
            // viewModel.requestParams
            com.centerpoint.connect.models.request.UpdateProfileRP viewModelRequestParams = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelRequestParams = viewModel.getRequestParams();

                viewModelRequestParamsJavaLangObjectNull = (viewModelRequestParams) != (null);
                if (viewModelRequestParamsJavaLangObjectNull) {


                    viewModelRequestParamsEmail = viewModelRequestParams.getEmail();

                    viewModelRequestParamsEmailJavaLangObjectNull = (viewModelRequestParamsEmail) != (null);
                    if (viewModelRequestParamsEmailJavaLangObjectNull) {




                        viewModelRequestParamsEmail.set(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etMobilePhoneandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.requestParams.mobilePhone.get()
            //         is viewModel.requestParams.mobilePhone.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etMobilePhone);
            // localize variables for thread safety
            // viewModel.requestParams.mobilePhone
            androidx.databinding.ObservableField<java.lang.String> viewModelRequestParamsMobilePhone = null;
            // viewModel.requestParams.mobilePhone.get()
            java.lang.String viewModelRequestParamsMobilePhoneGet = null;
            // viewModel.requestParams != null
            boolean viewModelRequestParamsJavaLangObjectNull = false;
            // viewModel
            com.centerpoint.connect.ui.global.update_profile.UpdateProfileViewModel viewModel = mViewModel;
            // viewModel.requestParams
            com.centerpoint.connect.models.request.UpdateProfileRP viewModelRequestParams = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.requestParams.mobilePhone != null
            boolean viewModelRequestParamsMobilePhoneJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelRequestParams = viewModel.getRequestParams();

                viewModelRequestParamsJavaLangObjectNull = (viewModelRequestParams) != (null);
                if (viewModelRequestParamsJavaLangObjectNull) {


                    viewModelRequestParamsMobilePhone = viewModelRequestParams.getMobilePhone();

                    viewModelRequestParamsMobilePhoneJavaLangObjectNull = (viewModelRequestParamsMobilePhone) != (null);
                    if (viewModelRequestParamsMobilePhoneJavaLangObjectNull) {




                        viewModelRequestParamsMobilePhone.set(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etOfficeNoandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.requestParams.officePhone.get()
            //         is viewModel.requestParams.officePhone.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etOfficeNo);
            // localize variables for thread safety
            // viewModel.requestParams.officePhone
            androidx.databinding.ObservableField<java.lang.String> viewModelRequestParamsOfficePhone = null;
            // viewModel.requestParams.officePhone.get()
            java.lang.String viewModelRequestParamsOfficePhoneGet = null;
            // viewModel.requestParams != null
            boolean viewModelRequestParamsJavaLangObjectNull = false;
            // viewModel
            com.centerpoint.connect.ui.global.update_profile.UpdateProfileViewModel viewModel = mViewModel;
            // viewModel.requestParams
            com.centerpoint.connect.models.request.UpdateProfileRP viewModelRequestParams = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.requestParams.officePhone != null
            boolean viewModelRequestParamsOfficePhoneJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelRequestParams = viewModel.getRequestParams();

                viewModelRequestParamsJavaLangObjectNull = (viewModelRequestParams) != (null);
                if (viewModelRequestParamsJavaLangObjectNull) {


                    viewModelRequestParamsOfficePhone = viewModelRequestParams.getOfficePhone();

                    viewModelRequestParamsOfficePhoneJavaLangObjectNull = (viewModelRequestParamsOfficePhone) != (null);
                    if (viewModelRequestParamsOfficePhoneJavaLangObjectNull) {




                        viewModelRequestParamsOfficePhone.set(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };

    public FragmentUpdateProfileBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private FragmentUpdateProfileBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (com.google.android.material.button.MaterialButton) bindings[7]
            , (com.google.android.material.button.MaterialButton) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[4]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[5]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[6]
            , (com.centerpoint.connect.databinding.IncludeBgLandingBinding) bindings[9]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[2]
            );
        this.btnCancel.setTag(null);
        this.btnUpdate.setTag(null);
        this.cvCard.setTag(null);
        this.etEmail.setTag(null);
        this.etMobilePhone.setTag(null);
        this.etOfficeNo.setTag(null);
        setContainedBinding(this.include);
        this.ivUser.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvUserName.setTag(null);
        setRootTag(root);
        // listeners
        mCallback42 = new com.centerpoint.connect.generated.callback.OnClickListener(this, 2);
        mCallback41 = new com.centerpoint.connect.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
        }
        include.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (include.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.fragment == variableId) {
            setFragment((com.centerpoint.connect.ui.global.update_profile.UpdateProfileFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.centerpoint.connect.ui.global.update_profile.UpdateProfileViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFragment(@Nullable com.centerpoint.connect.ui.global.update_profile.UpdateProfileFragment Fragment) {
        this.mFragment = Fragment;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.fragment);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.centerpoint.connect.ui.global.update_profile.UpdateProfileViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        include.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelRequestParamsOfficePhone((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelRequestParamsMobilePhone((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeInclude((com.centerpoint.connect.databinding.IncludeBgLandingBinding) object, fieldId);
            case 3 :
                return onChangeViewModelRequestParamsEmail((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelRequestParamsOfficePhone(androidx.databinding.ObservableField<java.lang.String> ViewModelRequestParamsOfficePhone, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelRequestParamsMobilePhone(androidx.databinding.ObservableField<java.lang.String> ViewModelRequestParamsMobilePhone, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeInclude(com.centerpoint.connect.databinding.IncludeBgLandingBinding Include, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelRequestParamsEmail(androidx.databinding.ObservableField<java.lang.String> ViewModelRequestParamsEmail, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        java.lang.String viewModelRequestParamsEmailGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelRequestParamsOfficePhone = null;
        com.centerpoint.connect.ui.global.update_profile.UpdateProfileFragment fragment = mFragment;
        com.centerpoint.connect.models.helper.User fragmentUserData = null;
        java.lang.String fragmentUserDataName = null;
        java.lang.String viewModelRequestParamsOfficePhoneGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelRequestParamsMobilePhone = null;
        java.lang.String viewModelRequestParamsMobilePhoneGet = null;
        com.centerpoint.connect.models.request.UpdateProfileRP viewModelRequestParams = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelRequestParamsEmail = null;
        com.centerpoint.connect.ui.global.update_profile.UpdateProfileViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x50L) != 0) {



                if (fragment != null) {
                    // read fragment.userData
                    fragmentUserData = fragment.getUserData();
                }


                if (fragmentUserData != null) {
                    // read fragment.userData.name
                    fragmentUserDataName = fragmentUserData.getName();
                }
        }
        if ((dirtyFlags & 0x6bL) != 0) {



                if (viewModel != null) {
                    // read viewModel.requestParams
                    viewModelRequestParams = viewModel.getRequestParams();
                }

            if ((dirtyFlags & 0x61L) != 0) {

                    if (viewModelRequestParams != null) {
                        // read viewModel.requestParams.officePhone
                        viewModelRequestParamsOfficePhone = viewModelRequestParams.getOfficePhone();
                    }
                    updateRegistration(0, viewModelRequestParamsOfficePhone);


                    if (viewModelRequestParamsOfficePhone != null) {
                        // read viewModel.requestParams.officePhone.get()
                        viewModelRequestParamsOfficePhoneGet = viewModelRequestParamsOfficePhone.get();
                    }
            }
            if ((dirtyFlags & 0x62L) != 0) {

                    if (viewModelRequestParams != null) {
                        // read viewModel.requestParams.mobilePhone
                        viewModelRequestParamsMobilePhone = viewModelRequestParams.getMobilePhone();
                    }
                    updateRegistration(1, viewModelRequestParamsMobilePhone);


                    if (viewModelRequestParamsMobilePhone != null) {
                        // read viewModel.requestParams.mobilePhone.get()
                        viewModelRequestParamsMobilePhoneGet = viewModelRequestParamsMobilePhone.get();
                    }
            }
            if ((dirtyFlags & 0x68L) != 0) {

                    if (viewModelRequestParams != null) {
                        // read viewModel.requestParams.email
                        viewModelRequestParamsEmail = viewModelRequestParams.getEmail();
                    }
                    updateRegistration(3, viewModelRequestParamsEmail);


                    if (viewModelRequestParamsEmail != null) {
                        // read viewModel.requestParams.email.get()
                        viewModelRequestParamsEmailGet = viewModelRequestParamsEmail.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.btnCancel.setOnClickListener(mCallback41);
            this.btnUpdate.setOnClickListener(mCallback42);
            com.centerpoint.connect.base.ViewBindingsKt.bindCustomBackground(this.cvCard, getColorFromResource(cvCard, R.color.white), (java.lang.Integer)null, (java.lang.Float)null, cvCard.getResources().getDimension(R.dimen._20sdp), cvCard.getResources().getDimension(R.dimen._20sdp));
            com.centerpoint.connect.base.ViewBindingsKt.bindCustomBackground(this.etEmail, getColorFromResource(etEmail, R.color.white), getColorFromResource(etEmail, R.color.border_silver), etEmail.getResources().getDimension(R.dimen._1sdp), etEmail.getResources().getDimension(R.dimen._40sdp), etEmail.getResources().getDimension(R.dimen._40sdp));
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etEmail, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etEmailandroidTextAttrChanged);
            com.centerpoint.connect.base.ViewBindingsKt.bindCustomBackground(this.etMobilePhone, getColorFromResource(etMobilePhone, R.color.white), getColorFromResource(etMobilePhone, R.color.border_silver), etMobilePhone.getResources().getDimension(R.dimen._1sdp), etMobilePhone.getResources().getDimension(R.dimen._40sdp), etMobilePhone.getResources().getDimension(R.dimen._40sdp));
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etMobilePhone, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etMobilePhoneandroidTextAttrChanged);
            com.centerpoint.connect.base.ViewBindingsKt.bindCustomBackground(this.etOfficeNo, getColorFromResource(etOfficeNo, R.color.white), getColorFromResource(etOfficeNo, R.color.border_silver), etOfficeNo.getResources().getDimension(R.dimen._1sdp), etOfficeNo.getResources().getDimension(R.dimen._40sdp), etOfficeNo.getResources().getDimension(R.dimen._40sdp));
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etOfficeNo, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etOfficeNoandroidTextAttrChanged);
            com.centerpoint.connect.base.ViewBindingsKt.bindCustomBackground(this.ivUser, getColorFromResource(ivUser, R.color.white), (java.lang.Integer)null, (java.lang.Float)null, ivUser.getResources().getDimension(R.dimen._45sdp), ivUser.getResources().getDimension(R.dimen._45sdp));
        }
        if ((dirtyFlags & 0x68L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etEmail, viewModelRequestParamsEmailGet);
        }
        if ((dirtyFlags & 0x62L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etMobilePhone, viewModelRequestParamsMobilePhoneGet);
        }
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etOfficeNo, viewModelRequestParamsOfficePhoneGet);
        }
        if ((dirtyFlags & 0x50L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvUserName, fragmentUserDataName);
        }
        executeBindingsOn(include);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // fragment
                com.centerpoint.connect.ui.global.update_profile.UpdateProfileFragment fragment = mFragment;
                // fragment.verifyFields()
                com.centerpoint.connect.models.request.UpdateProfileRP fragmentVerifyFields = null;
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
                com.centerpoint.connect.ui.global.update_profile.UpdateProfileFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.logoutUser();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.requestParams.officePhone
        flag 1 (0x2L): viewModel.requestParams.mobilePhone
        flag 2 (0x3L): include
        flag 3 (0x4L): viewModel.requestParams.email
        flag 4 (0x5L): fragment
        flag 5 (0x6L): viewModel
        flag 6 (0x7L): null
    flag mapping end*/
    //end
}