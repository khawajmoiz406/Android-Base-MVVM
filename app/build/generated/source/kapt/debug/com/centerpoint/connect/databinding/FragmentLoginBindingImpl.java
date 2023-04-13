package com.centerpoint.connect.databinding;
import com.centerpoint.connect.R;
import com.centerpoint.connect.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentLoginBindingImpl extends FragmentLoginBinding implements com.centerpoint.connect.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(8);
        sIncludes.setIncludes(0, 
            new String[] {"include_bg_landing"},
            new int[] {4},
            new int[] {com.centerpoint.connect.R.layout.include_bg_landing});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ivAppLogo, 5);
        sViewsWithIds.put(R.id.tvNameHeading, 6);
        sViewsWithIds.put(R.id.tvPassword, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback17;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.requestParams.email.get()
            //         is viewModel.requestParams.email.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etName);
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
            com.centerpoint.connect.ui.landing.login.LoginViewModel viewModel = mViewModel;
            // viewModel.requestParams
            com.centerpoint.connect.models.request.LoginRP viewModelRequestParams = null;
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
    private androidx.databinding.InverseBindingListener etPasswordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.requestParams.password.get()
            //         is viewModel.requestParams.password.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etPassword);
            // localize variables for thread safety
            // viewModel.requestParams.password.get()
            java.lang.String viewModelRequestParamsPasswordGet = null;
            // viewModel.requestParams.password != null
            boolean viewModelRequestParamsPasswordJavaLangObjectNull = false;
            // viewModel.requestParams != null
            boolean viewModelRequestParamsJavaLangObjectNull = false;
            // viewModel.requestParams.password
            androidx.databinding.ObservableField<java.lang.String> viewModelRequestParamsPassword = null;
            // viewModel
            com.centerpoint.connect.ui.landing.login.LoginViewModel viewModel = mViewModel;
            // viewModel.requestParams
            com.centerpoint.connect.models.request.LoginRP viewModelRequestParams = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelRequestParams = viewModel.getRequestParams();

                viewModelRequestParamsJavaLangObjectNull = (viewModelRequestParams) != (null);
                if (viewModelRequestParamsJavaLangObjectNull) {


                    viewModelRequestParamsPassword = viewModelRequestParams.getPassword();

                    viewModelRequestParamsPasswordJavaLangObjectNull = (viewModelRequestParamsPassword) != (null);
                    if (viewModelRequestParamsPasswordJavaLangObjectNull) {




                        viewModelRequestParamsPassword.set(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };

    public FragmentLoginBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentLoginBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (com.google.android.material.button.MaterialButton) bindings[3]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[1]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[2]
            , (com.centerpoint.connect.databinding.IncludeBgLandingBinding) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[7]
            );
        this.btnLogin.setTag(null);
        this.etName.setTag(null);
        this.etPassword.setTag(null);
        setContainedBinding(this.include);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback17 = new com.centerpoint.connect.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
            setFragment((com.centerpoint.connect.ui.landing.login.LoginFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.centerpoint.connect.ui.landing.login.LoginViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFragment(@Nullable com.centerpoint.connect.ui.landing.login.LoginFragment Fragment) {
        this.mFragment = Fragment;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.fragment);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.centerpoint.connect.ui.landing.login.LoginViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
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
                return onChangeInclude((com.centerpoint.connect.databinding.IncludeBgLandingBinding) object, fieldId);
            case 1 :
                return onChangeViewModelRequestParamsEmail((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelRequestParamsPassword((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeInclude(com.centerpoint.connect.databinding.IncludeBgLandingBinding Include, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelRequestParamsEmail(androidx.databinding.ObservableField<java.lang.String> ViewModelRequestParamsEmail, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelRequestParamsPassword(androidx.databinding.ObservableField<java.lang.String> ViewModelRequestParamsPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        com.centerpoint.connect.ui.landing.login.LoginFragment fragment = mFragment;
        com.centerpoint.connect.models.request.LoginRP viewModelRequestParams = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelRequestParamsEmail = null;
        java.lang.String viewModelRequestParamsPasswordGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelRequestParamsPassword = null;
        com.centerpoint.connect.ui.landing.login.LoginViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x36L) != 0) {



                if (viewModel != null) {
                    // read viewModel.requestParams
                    viewModelRequestParams = viewModel.getRequestParams();
                }

            if ((dirtyFlags & 0x32L) != 0) {

                    if (viewModelRequestParams != null) {
                        // read viewModel.requestParams.email
                        viewModelRequestParamsEmail = viewModelRequestParams.getEmail();
                    }
                    updateRegistration(1, viewModelRequestParamsEmail);


                    if (viewModelRequestParamsEmail != null) {
                        // read viewModel.requestParams.email.get()
                        viewModelRequestParamsEmailGet = viewModelRequestParamsEmail.get();
                    }
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (viewModelRequestParams != null) {
                        // read viewModel.requestParams.password
                        viewModelRequestParamsPassword = viewModelRequestParams.getPassword();
                    }
                    updateRegistration(2, viewModelRequestParamsPassword);


                    if (viewModelRequestParamsPassword != null) {
                        // read viewModel.requestParams.password.get()
                        viewModelRequestParamsPasswordGet = viewModelRequestParamsPassword.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.btnLogin.setOnClickListener(mCallback17);
            com.centerpoint.connect.base.ViewBindingsKt.bindCustomBackground(this.etName, getColorFromResource(etName, R.color.white), (java.lang.Integer)null, (java.lang.Float)null, etName.getResources().getDimension(R.dimen._40sdp), etName.getResources().getDimension(R.dimen._40sdp));
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etNameandroidTextAttrChanged);
            com.centerpoint.connect.base.ViewBindingsKt.bindCustomBackground(this.etPassword, getColorFromResource(etPassword, R.color.white), (java.lang.Integer)null, (java.lang.Float)null, etPassword.getResources().getDimension(R.dimen._40sdp), etPassword.getResources().getDimension(R.dimen._40sdp));
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etPassword, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etPasswordandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etName, viewModelRequestParamsEmailGet);
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etPassword, viewModelRequestParamsPasswordGet);
        }
        executeBindingsOn(include);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // fragment
        com.centerpoint.connect.ui.landing.login.LoginFragment fragment = mFragment;
        // fragment.verifyFields()
        com.centerpoint.connect.models.request.LoginRP fragmentVerifyFields = null;
        // fragment != null
        boolean fragmentJavaLangObjectNull = false;



        fragmentJavaLangObjectNull = (fragment) != (null);
        if (fragmentJavaLangObjectNull) {


            fragmentVerifyFields = fragment.verifyFields();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): include
        flag 1 (0x2L): viewModel.requestParams.email
        flag 2 (0x3L): viewModel.requestParams.password
        flag 3 (0x4L): fragment
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}