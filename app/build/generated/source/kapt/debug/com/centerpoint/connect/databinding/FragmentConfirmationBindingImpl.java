package com.centerpoint.connect.databinding;
import com.centerpoint.connect.R;
import com.centerpoint.connect.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentConfirmationBindingImpl extends FragmentConfirmationBinding implements com.centerpoint.connect.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tvManagerNameHeading, 5);
        sViewsWithIds.put(R.id.llButtons, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView3;
    @NonNull
    private final com.google.android.material.button.MaterialButton mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etManagerNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.updateRepairRequestParams.managerName.get()
            //         is viewModel.updateRepairRequestParams.managerName.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etManagerName);
            // localize variables for thread safety
            // viewModel.updateRepairRequestParams.managerName.get()
            java.lang.String viewModelUpdateRepairRequestParamsManagerNameGet = null;
            // viewModel.updateRepairRequestParams.managerName != null
            boolean viewModelUpdateRepairRequestParamsManagerNameJavaLangObjectNull = false;
            // viewModel.updateRepairRequestParams
            com.centerpoint.connect.models.request.UpdateRepairRP viewModelUpdateRepairRequestParams = null;
            // viewModel.updateRepairRequestParams != null
            boolean viewModelUpdateRepairRequestParamsJavaLangObjectNull = false;
            // viewModel
            com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.updateRepairRequestParams.managerName
            androidx.databinding.ObservableField<java.lang.String> viewModelUpdateRepairRequestParamsManagerName = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelUpdateRepairRequestParams = viewModel.getUpdateRepairRequestParams();

                viewModelUpdateRepairRequestParamsJavaLangObjectNull = (viewModelUpdateRepairRequestParams) != (null);
                if (viewModelUpdateRepairRequestParamsJavaLangObjectNull) {


                    viewModelUpdateRepairRequestParamsManagerName = viewModelUpdateRepairRequestParams.getManagerName();

                    viewModelUpdateRepairRequestParamsManagerNameJavaLangObjectNull = (viewModelUpdateRepairRequestParamsManagerName) != (null);
                    if (viewModelUpdateRepairRequestParamsManagerNameJavaLangObjectNull) {




                        viewModelUpdateRepairRequestParamsManagerName.set(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };

    public FragmentConfirmationBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentConfirmationBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (android.widget.TextView) bindings[5]
            );
        this.cvCard.setTag(null);
        this.etManagerName.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (androidx.appcompat.widget.AppCompatImageView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (com.google.android.material.button.MaterialButton) bindings[4];
        this.mboundView4.setTag(null);
        setRootTag(root);
        // listeners
        mCallback10 = new com.centerpoint.connect.generated.callback.OnClickListener(this, 1);
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
            setFragment((com.centerpoint.connect.ui.global.service_info.confirmation.ConfirmationFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFragment(@Nullable com.centerpoint.connect.ui.global.service_info.confirmation.ConfirmationFragment Fragment) {
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
                return onChangeViewModelUpdateRepairRequestParamsSignatureBitmap((androidx.databinding.ObservableField<android.graphics.Bitmap>) object, fieldId);
            case 1 :
                return onChangeViewModelUpdateRepairRequestParamsManagerName((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelUpdateRepairRequestParamsSignatureBitmap(androidx.databinding.ObservableField<android.graphics.Bitmap> ViewModelUpdateRepairRequestParamsSignatureBitmap, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelUpdateRepairRequestParamsManagerName(androidx.databinding.ObservableField<java.lang.String> ViewModelUpdateRepairRequestParamsManagerName, int fieldId) {
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
        androidx.databinding.ObservableField<android.graphics.Bitmap> viewModelUpdateRepairRequestParamsSignatureBitmap = null;
        com.centerpoint.connect.ui.global.service_info.confirmation.ConfirmationFragment fragment = mFragment;
        boolean viewModelUpdateRepairRequestParamsSignatureBitmapJavaLangObjectNull = false;
        boolean ViewModelUpdateRepairRequestParamsSignatureBitmapJavaLangObjectNull1 = false;
        java.lang.String viewModelUpdateRepairRequestParamsManagerNameGet = null;
        java.lang.String viewModelUpdateRepairRequestParamsSignatureBitmapJavaLangObjectNullMboundView4AndroidStringCaptureSignatureMboundView4AndroidStringUpdateTicket = null;
        com.centerpoint.connect.models.request.UpdateRepairRP viewModelUpdateRepairRequestParams = null;
        com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailViewModel viewModel = mViewModel;
        android.graphics.Bitmap viewModelUpdateRepairRequestParamsSignatureBitmapGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelUpdateRepairRequestParamsManagerName = null;

        if ((dirtyFlags & 0x1bL) != 0) {



                if (viewModel != null) {
                    // read viewModel.updateRepairRequestParams
                    viewModelUpdateRepairRequestParams = viewModel.getUpdateRepairRequestParams();
                }

            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModelUpdateRepairRequestParams != null) {
                        // read viewModel.updateRepairRequestParams.signatureBitmap
                        viewModelUpdateRepairRequestParamsSignatureBitmap = viewModelUpdateRepairRequestParams.getSignatureBitmap();
                    }
                    updateRegistration(0, viewModelUpdateRepairRequestParamsSignatureBitmap);


                    if (viewModelUpdateRepairRequestParamsSignatureBitmap != null) {
                        // read viewModel.updateRepairRequestParams.signatureBitmap.get()
                        viewModelUpdateRepairRequestParamsSignatureBitmapGet = viewModelUpdateRepairRequestParamsSignatureBitmap.get();
                    }


                    // read viewModel.updateRepairRequestParams.signatureBitmap.get() != null
                    viewModelUpdateRepairRequestParamsSignatureBitmapJavaLangObjectNull = (viewModelUpdateRepairRequestParamsSignatureBitmapGet) != (null);
                    // read viewModel.updateRepairRequestParams.signatureBitmap.get() == null
                    ViewModelUpdateRepairRequestParamsSignatureBitmapJavaLangObjectNull1 = (viewModelUpdateRepairRequestParamsSignatureBitmapGet) == (null);
                if((dirtyFlags & 0x19L) != 0) {
                    if(ViewModelUpdateRepairRequestParamsSignatureBitmapJavaLangObjectNull1) {
                            dirtyFlags |= 0x40L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                    }
                }


                    // read viewModel.updateRepairRequestParams.signatureBitmap.get() == null ? @android:string/capture_signature : @android:string/update_ticket
                    viewModelUpdateRepairRequestParamsSignatureBitmapJavaLangObjectNullMboundView4AndroidStringCaptureSignatureMboundView4AndroidStringUpdateTicket = ((ViewModelUpdateRepairRequestParamsSignatureBitmapJavaLangObjectNull1) ? (mboundView4.getResources().getString(R.string.capture_signature)) : (mboundView4.getResources().getString(R.string.update_ticket)));
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModelUpdateRepairRequestParams != null) {
                        // read viewModel.updateRepairRequestParams.managerName
                        viewModelUpdateRepairRequestParamsManagerName = viewModelUpdateRepairRequestParams.getManagerName();
                    }
                    updateRegistration(1, viewModelUpdateRepairRequestParamsManagerName);


                    if (viewModelUpdateRepairRequestParamsManagerName != null) {
                        // read viewModel.updateRepairRequestParams.managerName.get()
                        viewModelUpdateRepairRequestParamsManagerNameGet = viewModelUpdateRepairRequestParamsManagerName.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            com.centerpoint.connect.base.ViewBindingsKt.bindCustomBackground(this.cvCard, getColorFromResource(cvCard, R.color.white), (java.lang.Integer)null, (java.lang.Float)null, cvCard.getResources().getDimension(R.dimen.ticket_info_card_corners), cvCard.getResources().getDimension(R.dimen.ticket_info_card_corners));
            com.centerpoint.connect.base.ViewBindingsKt.bindCustomBackground(this.etManagerName, getColorFromResource(etManagerName, R.color.white), getColorFromResource(etManagerName, R.color.border_silver), etManagerName.getResources().getDimension(R.dimen._1sdp), etManagerName.getResources().getDimension(R.dimen._40sdp), etManagerName.getResources().getDimension(R.dimen._40sdp));
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etManagerName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etManagerNameandroidTextAttrChanged);
            this.mboundView4.setOnClickListener(mCallback10);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etManagerName, viewModelUpdateRepairRequestParamsManagerNameGet);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            com.centerpoint.connect.base.ViewBindingsKt.bindImageWithBitmap(this.mboundView3, viewModelUpdateRepairRequestParamsSignatureBitmapGet);
            com.centerpoint.connect.base.ViewBindingsKt.bindVisibility(this.mboundView3, viewModelUpdateRepairRequestParamsSignatureBitmapJavaLangObjectNull);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewModelUpdateRepairRequestParamsSignatureBitmapJavaLangObjectNullMboundView4AndroidStringCaptureSignatureMboundView4AndroidStringUpdateTicket);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // fragment.onSubmitClicked()
        com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailFragment fragmentOnSubmitClicked = null;
        // fragment
        com.centerpoint.connect.ui.global.service_info.confirmation.ConfirmationFragment fragment = mFragment;
        // fragment != null
        boolean fragmentJavaLangObjectNull = false;



        fragmentJavaLangObjectNull = (fragment) != (null);
        if (fragmentJavaLangObjectNull) {


            fragmentOnSubmitClicked = fragment.onSubmitClicked();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.updateRepairRequestParams.signatureBitmap
        flag 1 (0x2L): viewModel.updateRepairRequestParams.managerName
        flag 2 (0x3L): fragment
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
        flag 5 (0x6L): viewModel.updateRepairRequestParams.signatureBitmap.get() == null ? @android:string/capture_signature : @android:string/update_ticket
        flag 6 (0x7L): viewModel.updateRepairRequestParams.signatureBitmap.get() == null ? @android:string/capture_signature : @android:string/update_ticket
    flag mapping end*/
    //end
}