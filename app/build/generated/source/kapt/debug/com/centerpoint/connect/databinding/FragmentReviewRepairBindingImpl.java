package com.centerpoint.connect.databinding;
import com.centerpoint.connect.R;
import com.centerpoint.connect.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentReviewRepairBindingImpl extends FragmentReviewRepairBinding implements com.centerpoint.connect.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cvImage, 8);
        sViewsWithIds.put(R.id.tvNameOfManagerHeading, 9);
        sViewsWithIds.put(R.id.tvQuantityHeading, 10);
        sViewsWithIds.put(R.id.tvDescriptionHeading, 11);
        sViewsWithIds.put(R.id.tvCorrectionHeading, 12);
        sViewsWithIds.put(R.id.llButtons, 13);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final com.google.android.material.button.MaterialButton mboundView7;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentReviewRepairBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private FragmentReviewRepairBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (androidx.cardview.widget.CardView) bindings[8]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[13]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[4]
            );
        this.cvCard.setTag(null);
        this.ivCapturedImage.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView7 = (com.google.android.material.button.MaterialButton) bindings[7];
        this.mboundView7.setTag(null);
        this.tvCorrectionValue.setTag(null);
        this.tvDescriptionValue.setTag(null);
        this.tvNameOfManagerValue.setTag(null);
        this.tvQuantityValue.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.centerpoint.connect.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100L;
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
            setFragment((com.centerpoint.connect.ui.global.service_info.add_repair.ReviewRepairFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFragment(@Nullable com.centerpoint.connect.ui.global.service_info.add_repair.ReviewRepairFragment Fragment) {
        this.mFragment = Fragment;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.fragment);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelAddRepairRequestParamsDescription((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelAddRepairRequestParamsUnit((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelAddRepairRequestParamsRepairBitmap((androidx.databinding.ObservableField<android.graphics.Bitmap>) object, fieldId);
            case 3 :
                return onChangeViewModelAddRepairRequestParamsQuantity((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModelAddRepairRequestParamsCorrection((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewModelAddRepairRequestParamsManagerName((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelAddRepairRequestParamsDescription(androidx.databinding.ObservableField<java.lang.String> ViewModelAddRepairRequestParamsDescription, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAddRepairRequestParamsUnit(androidx.databinding.ObservableField<java.lang.String> ViewModelAddRepairRequestParamsUnit, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAddRepairRequestParamsRepairBitmap(androidx.databinding.ObservableField<android.graphics.Bitmap> ViewModelAddRepairRequestParamsRepairBitmap, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAddRepairRequestParamsQuantity(androidx.databinding.ObservableField<java.lang.String> ViewModelAddRepairRequestParamsQuantity, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAddRepairRequestParamsCorrection(androidx.databinding.ObservableField<java.lang.String> ViewModelAddRepairRequestParamsCorrection, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAddRepairRequestParamsManagerName(androidx.databinding.ObservableField<java.lang.String> ViewModelAddRepairRequestParamsManagerName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
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
        com.centerpoint.connect.ui.global.service_info.add_repair.ReviewRepairFragment fragment = mFragment;
        androidx.databinding.ObservableField<java.lang.String> viewModelAddRepairRequestParamsDescription = null;
        java.lang.String viewModelAddRepairRequestParamsCorrectionGet = null;
        java.lang.String viewModelAddRepairRequestParamsQuantityJavaLangString = null;
        java.lang.String viewModelAddRepairRequestParamsManagerNameGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelAddRepairRequestParamsUnit = null;
        androidx.databinding.ObservableField<android.graphics.Bitmap> viewModelAddRepairRequestParamsRepairBitmap = null;
        java.lang.String viewModelAddRepairRequestParamsUnitGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelAddRepairRequestParamsQuantity = null;
        java.lang.String viewModelAddRepairRequestParamsQuantityJavaLangStringViewModelAddRepairRequestParamsUnit = null;
        java.lang.String viewModelAddRepairRequestParamsQuantityGet = null;
        com.centerpoint.connect.models.request.AddRepairRP viewModelAddRepairRequestParams = null;
        android.graphics.Bitmap viewModelAddRepairRequestParamsRepairBitmapGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelAddRepairRequestParamsCorrection = null;
        java.lang.String viewModelAddRepairRequestParamsDescriptionGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelAddRepairRequestParamsManagerName = null;
        com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x1bfL) != 0) {



                if (viewModel != null) {
                    // read viewModel.addRepairRequestParams
                    viewModelAddRepairRequestParams = viewModel.getAddRepairRequestParams();
                }

            if ((dirtyFlags & 0x181L) != 0) {

                    if (viewModelAddRepairRequestParams != null) {
                        // read viewModel.addRepairRequestParams.description
                        viewModelAddRepairRequestParamsDescription = viewModelAddRepairRequestParams.getDescription();
                    }
                    updateRegistration(0, viewModelAddRepairRequestParamsDescription);


                    if (viewModelAddRepairRequestParamsDescription != null) {
                        // read viewModel.addRepairRequestParams.description.get()
                        viewModelAddRepairRequestParamsDescriptionGet = viewModelAddRepairRequestParamsDescription.get();
                    }
            }
            if ((dirtyFlags & 0x18aL) != 0) {

                    if (viewModelAddRepairRequestParams != null) {
                        // read viewModel.addRepairRequestParams.unit
                        viewModelAddRepairRequestParamsUnit = viewModelAddRepairRequestParams.getUnit();
                        // read viewModel.addRepairRequestParams.quantity
                        viewModelAddRepairRequestParamsQuantity = viewModelAddRepairRequestParams.getQuantity();
                    }
                    updateRegistration(1, viewModelAddRepairRequestParamsUnit);
                    updateRegistration(3, viewModelAddRepairRequestParamsQuantity);


                    if (viewModelAddRepairRequestParamsUnit != null) {
                        // read viewModel.addRepairRequestParams.unit.get()
                        viewModelAddRepairRequestParamsUnitGet = viewModelAddRepairRequestParamsUnit.get();
                    }
                    if (viewModelAddRepairRequestParamsQuantity != null) {
                        // read viewModel.addRepairRequestParams.quantity.get()
                        viewModelAddRepairRequestParamsQuantityGet = viewModelAddRepairRequestParamsQuantity.get();
                    }


                    // read (viewModel.addRepairRequestParams.quantity.get()) + (" ")
                    viewModelAddRepairRequestParamsQuantityJavaLangString = (viewModelAddRepairRequestParamsQuantityGet) + (" ");


                    // read ((viewModel.addRepairRequestParams.quantity.get()) + (" ")) + (viewModel.addRepairRequestParams.unit.get())
                    viewModelAddRepairRequestParamsQuantityJavaLangStringViewModelAddRepairRequestParamsUnit = (viewModelAddRepairRequestParamsQuantityJavaLangString) + (viewModelAddRepairRequestParamsUnitGet);
            }
            if ((dirtyFlags & 0x184L) != 0) {

                    if (viewModelAddRepairRequestParams != null) {
                        // read viewModel.addRepairRequestParams.repairBitmap
                        viewModelAddRepairRequestParamsRepairBitmap = viewModelAddRepairRequestParams.getRepairBitmap();
                    }
                    updateRegistration(2, viewModelAddRepairRequestParamsRepairBitmap);


                    if (viewModelAddRepairRequestParamsRepairBitmap != null) {
                        // read viewModel.addRepairRequestParams.repairBitmap.get()
                        viewModelAddRepairRequestParamsRepairBitmapGet = viewModelAddRepairRequestParamsRepairBitmap.get();
                    }
            }
            if ((dirtyFlags & 0x190L) != 0) {

                    if (viewModelAddRepairRequestParams != null) {
                        // read viewModel.addRepairRequestParams.correction
                        viewModelAddRepairRequestParamsCorrection = viewModelAddRepairRequestParams.getCorrection();
                    }
                    updateRegistration(4, viewModelAddRepairRequestParamsCorrection);


                    if (viewModelAddRepairRequestParamsCorrection != null) {
                        // read viewModel.addRepairRequestParams.correction.get()
                        viewModelAddRepairRequestParamsCorrectionGet = viewModelAddRepairRequestParamsCorrection.get();
                    }
            }
            if ((dirtyFlags & 0x1a0L) != 0) {

                    if (viewModelAddRepairRequestParams != null) {
                        // read viewModel.addRepairRequestParams.managerName
                        viewModelAddRepairRequestParamsManagerName = viewModelAddRepairRequestParams.getManagerName();
                    }
                    updateRegistration(5, viewModelAddRepairRequestParamsManagerName);


                    if (viewModelAddRepairRequestParamsManagerName != null) {
                        // read viewModel.addRepairRequestParams.managerName.get()
                        viewModelAddRepairRequestParamsManagerNameGet = viewModelAddRepairRequestParamsManagerName.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x100L) != 0) {
            // api target 1

            com.centerpoint.connect.base.ViewBindingsKt.bindCustomBackground(this.cvCard, getColorFromResource(cvCard, R.color.white), (java.lang.Integer)null, (java.lang.Float)null, cvCard.getResources().getDimension(R.dimen.ticket_info_card_corners), cvCard.getResources().getDimension(R.dimen.ticket_info_card_corners));
            this.mboundView7.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x184L) != 0) {
            // api target 1

            com.centerpoint.connect.base.ViewBindingsKt.bindImageWithBitmap(this.ivCapturedImage, viewModelAddRepairRequestParamsRepairBitmapGet);
        }
        if ((dirtyFlags & 0x190L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCorrectionValue, viewModelAddRepairRequestParamsCorrectionGet);
        }
        if ((dirtyFlags & 0x181L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDescriptionValue, viewModelAddRepairRequestParamsDescriptionGet);
        }
        if ((dirtyFlags & 0x1a0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvNameOfManagerValue, viewModelAddRepairRequestParamsManagerNameGet);
        }
        if ((dirtyFlags & 0x18aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvQuantityValue, viewModelAddRepairRequestParamsQuantityJavaLangStringViewModelAddRepairRequestParamsUnit);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // fragment.onSubmitClicked()
        com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailFragment fragmentOnSubmitClicked = null;
        // fragment
        com.centerpoint.connect.ui.global.service_info.add_repair.ReviewRepairFragment fragment = mFragment;
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
        flag 0 (0x1L): viewModel.addRepairRequestParams.description
        flag 1 (0x2L): viewModel.addRepairRequestParams.unit
        flag 2 (0x3L): viewModel.addRepairRequestParams.repairBitmap
        flag 3 (0x4L): viewModel.addRepairRequestParams.quantity
        flag 4 (0x5L): viewModel.addRepairRequestParams.correction
        flag 5 (0x6L): viewModel.addRepairRequestParams.managerName
        flag 6 (0x7L): fragment
        flag 7 (0x8L): viewModel
        flag 8 (0x9L): null
    flag mapping end*/
    //end
}