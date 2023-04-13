package com.centerpoint.connect.databinding;
import com.centerpoint.connect.R;
import com.centerpoint.connect.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAddRepairBindingImpl extends FragmentAddRepairBinding implements com.centerpoint.connect.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cvHeader, 16);
        sViewsWithIds.put(R.id.tvManagerNameHeading, 17);
        sViewsWithIds.put(R.id.tvQuantityHeading, 18);
        sViewsWithIds.put(R.id.tvDescriptionHeading, 19);
        sViewsWithIds.put(R.id.tvCorrectionHeading, 20);
        sViewsWithIds.put(R.id.tvWaterProofHeading, 21);
        sViewsWithIds.put(R.id.llButtons, 22);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.appcompat.widget.SwitchCompat mboundView12;
    @NonNull
    private final com.google.android.material.button.MaterialButton mboundView13;
    @NonNull
    private final androidx.cardview.widget.CardView mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback23;
    @Nullable
    private final android.view.View.OnClickListener mCallback24;
    @Nullable
    private final android.view.View.OnClickListener mCallback21;
    @Nullable
    private final android.view.View.OnClickListener mCallback20;
    @Nullable
    private final android.view.View.OnClickListener mCallback22;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etManagerNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.addRepairRequestParams.managerName.get()
            //         is viewModel.addRepairRequestParams.managerName.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etManagerName);
            // localize variables for thread safety
            // viewModel.addRepairRequestParams != null
            boolean viewModelAddRepairRequestParamsJavaLangObjectNull = false;
            // viewModel.addRepairRequestParams
            com.centerpoint.connect.models.request.AddRepairRP viewModelAddRepairRequestParams = null;
            // viewModel.addRepairRequestParams.managerName.get()
            java.lang.String viewModelAddRepairRequestParamsManagerNameGet = null;
            // viewModel.addRepairRequestParams.managerName != null
            boolean viewModelAddRepairRequestParamsManagerNameJavaLangObjectNull = false;
            // viewModel.addRepairRequestParams.managerName
            androidx.databinding.ObservableField<java.lang.String> viewModelAddRepairRequestParamsManagerName = null;
            // viewModel
            com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelAddRepairRequestParams = viewModel.getAddRepairRequestParams();

                viewModelAddRepairRequestParamsJavaLangObjectNull = (viewModelAddRepairRequestParams) != (null);
                if (viewModelAddRepairRequestParamsJavaLangObjectNull) {


                    viewModelAddRepairRequestParamsManagerName = viewModelAddRepairRequestParams.getManagerName();

                    viewModelAddRepairRequestParamsManagerNameJavaLangObjectNull = (viewModelAddRepairRequestParamsManagerName) != (null);
                    if (viewModelAddRepairRequestParamsManagerNameJavaLangObjectNull) {




                        viewModelAddRepairRequestParamsManagerName.set(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etQuantityUnitandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.addRepairRequestParams.unit.get()
            //         is viewModel.addRepairRequestParams.unit.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etQuantityUnit);
            // localize variables for thread safety
            // viewModel.addRepairRequestParams != null
            boolean viewModelAddRepairRequestParamsJavaLangObjectNull = false;
            // viewModel.addRepairRequestParams.unit.get()
            java.lang.String viewModelAddRepairRequestParamsUnitGet = null;
            // viewModel.addRepairRequestParams
            com.centerpoint.connect.models.request.AddRepairRP viewModelAddRepairRequestParams = null;
            // viewModel
            com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.addRepairRequestParams.unit != null
            boolean viewModelAddRepairRequestParamsUnitJavaLangObjectNull = false;
            // viewModel.addRepairRequestParams.unit
            androidx.databinding.ObservableField<java.lang.String> viewModelAddRepairRequestParamsUnit = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelAddRepairRequestParams = viewModel.getAddRepairRequestParams();

                viewModelAddRepairRequestParamsJavaLangObjectNull = (viewModelAddRepairRequestParams) != (null);
                if (viewModelAddRepairRequestParamsJavaLangObjectNull) {


                    viewModelAddRepairRequestParamsUnit = viewModelAddRepairRequestParams.getUnit();

                    viewModelAddRepairRequestParamsUnitJavaLangObjectNull = (viewModelAddRepairRequestParamsUnit) != (null);
                    if (viewModelAddRepairRequestParamsUnitJavaLangObjectNull) {




                        viewModelAddRepairRequestParamsUnit.set(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etQuantityValueandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.addRepairRequestParams.quantity.get()
            //         is viewModel.addRepairRequestParams.quantity.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etQuantityValue);
            // localize variables for thread safety
            // viewModel.addRepairRequestParams.quantity.get()
            java.lang.String viewModelAddRepairRequestParamsQuantityGet = null;
            // viewModel.addRepairRequestParams.quantity != null
            boolean viewModelAddRepairRequestParamsQuantityJavaLangObjectNull = false;
            // viewModel.addRepairRequestParams != null
            boolean viewModelAddRepairRequestParamsJavaLangObjectNull = false;
            // viewModel.addRepairRequestParams
            com.centerpoint.connect.models.request.AddRepairRP viewModelAddRepairRequestParams = null;
            // viewModel.addRepairRequestParams.quantity
            androidx.databinding.ObservableField<java.lang.String> viewModelAddRepairRequestParamsQuantity = null;
            // viewModel
            com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelAddRepairRequestParams = viewModel.getAddRepairRequestParams();

                viewModelAddRepairRequestParamsJavaLangObjectNull = (viewModelAddRepairRequestParams) != (null);
                if (viewModelAddRepairRequestParamsJavaLangObjectNull) {


                    viewModelAddRepairRequestParamsQuantity = viewModelAddRepairRequestParams.getQuantity();

                    viewModelAddRepairRequestParamsQuantityJavaLangObjectNull = (viewModelAddRepairRequestParamsQuantity) != (null);
                    if (viewModelAddRepairRequestParamsQuantityJavaLangObjectNull) {




                        viewModelAddRepairRequestParamsQuantity.set(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView12androidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.addRepairRequestParams.roofPenetrate.get()
            //         is viewModel.addRepairRequestParams.roofPenetrate.set((java.lang.Boolean) callbackArg_0)
            boolean callbackArg_0 = mboundView12.isChecked();
            // localize variables for thread safety
            // viewModel.addRepairRequestParams.roofPenetrate
            androidx.databinding.ObservableField<java.lang.Boolean> viewModelAddRepairRequestParamsRoofPenetrate = null;
            // viewModel.addRepairRequestParams != null
            boolean viewModelAddRepairRequestParamsJavaLangObjectNull = false;
            // viewModel.addRepairRequestParams
            com.centerpoint.connect.models.request.AddRepairRP viewModelAddRepairRequestParams = null;
            // viewModel
            com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailViewModel viewModel = mViewModel;
            // viewModel.addRepairRequestParams.roofPenetrate != null
            boolean viewModelAddRepairRequestParamsRoofPenetrateJavaLangObjectNull = false;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.addRepairRequestParams.roofPenetrate.get()
            java.lang.Boolean viewModelAddRepairRequestParamsRoofPenetrateGet = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelAddRepairRequestParams = viewModel.getAddRepairRequestParams();

                viewModelAddRepairRequestParamsJavaLangObjectNull = (viewModelAddRepairRequestParams) != (null);
                if (viewModelAddRepairRequestParamsJavaLangObjectNull) {


                    viewModelAddRepairRequestParamsRoofPenetrate = viewModelAddRepairRequestParams.getRoofPenetrate();

                    viewModelAddRepairRequestParamsRoofPenetrateJavaLangObjectNull = (viewModelAddRepairRequestParamsRoofPenetrate) != (null);
                    if (viewModelAddRepairRequestParamsRoofPenetrateJavaLangObjectNull) {




                        viewModelAddRepairRequestParamsRoofPenetrate.set(((java.lang.Boolean) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener tvCorrectionValueandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.addRepairRequestParams.correction.get()
            //         is viewModel.addRepairRequestParams.correction.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvCorrectionValue);
            // localize variables for thread safety
            // viewModel.addRepairRequestParams.correction.get()
            java.lang.String viewModelAddRepairRequestParamsCorrectionGet = null;
            // viewModel.addRepairRequestParams != null
            boolean viewModelAddRepairRequestParamsJavaLangObjectNull = false;
            // viewModel.addRepairRequestParams
            com.centerpoint.connect.models.request.AddRepairRP viewModelAddRepairRequestParams = null;
            // viewModel.addRepairRequestParams.correction
            androidx.databinding.ObservableField<java.lang.String> viewModelAddRepairRequestParamsCorrection = null;
            // viewModel
            com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.addRepairRequestParams.correction != null
            boolean viewModelAddRepairRequestParamsCorrectionJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelAddRepairRequestParams = viewModel.getAddRepairRequestParams();

                viewModelAddRepairRequestParamsJavaLangObjectNull = (viewModelAddRepairRequestParams) != (null);
                if (viewModelAddRepairRequestParamsJavaLangObjectNull) {


                    viewModelAddRepairRequestParamsCorrection = viewModelAddRepairRequestParams.getCorrection();

                    viewModelAddRepairRequestParamsCorrectionJavaLangObjectNull = (viewModelAddRepairRequestParamsCorrection) != (null);
                    if (viewModelAddRepairRequestParamsCorrectionJavaLangObjectNull) {




                        viewModelAddRepairRequestParamsCorrection.set(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener tvDescriptionValueandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.addRepairRequestParams.description.get()
            //         is viewModel.addRepairRequestParams.description.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvDescriptionValue);
            // localize variables for thread safety
            // viewModel.addRepairRequestParams != null
            boolean viewModelAddRepairRequestParamsJavaLangObjectNull = false;
            // viewModel.addRepairRequestParams
            com.centerpoint.connect.models.request.AddRepairRP viewModelAddRepairRequestParams = null;
            // viewModel.addRepairRequestParams.description.get()
            java.lang.String viewModelAddRepairRequestParamsDescriptionGet = null;
            // viewModel
            com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.addRepairRequestParams.description
            androidx.databinding.ObservableField<java.lang.String> viewModelAddRepairRequestParamsDescription = null;
            // viewModel.addRepairRequestParams.description != null
            boolean viewModelAddRepairRequestParamsDescriptionJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelAddRepairRequestParams = viewModel.getAddRepairRequestParams();

                viewModelAddRepairRequestParamsJavaLangObjectNull = (viewModelAddRepairRequestParams) != (null);
                if (viewModelAddRepairRequestParamsJavaLangObjectNull) {


                    viewModelAddRepairRequestParamsDescription = viewModelAddRepairRequestParams.getDescription();

                    viewModelAddRepairRequestParamsDescriptionJavaLangObjectNull = (viewModelAddRepairRequestParamsDescription) != (null);
                    if (viewModelAddRepairRequestParamsDescriptionJavaLangObjectNull) {




                        viewModelAddRepairRequestParamsDescription.set(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };

    public FragmentAddRepairBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 23, sIncludes, sViewsWithIds));
    }
    private FragmentAddRepairBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 7
            , (com.google.android.material.button.MaterialButton) bindings[14]
            , (com.google.android.material.button.MaterialButton) bindings[15]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[16]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[7]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[9]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[8]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[6]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[22]
            , (android.widget.TextView) bindings[20]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[11]
            , (android.widget.TextView) bindings[19]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[10]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[21]
            );
        this.btnCancel.setTag(null);
        this.btnNext.setTag(null);
        this.cvCard.setTag(null);
        this.etManagerName.setTag(null);
        this.etQuantityUnit.setTag(null);
        this.etQuantityValue.setTag(null);
        this.etSearchRepair.setTag(null);
        this.ivCamera.setTag(null);
        this.ivCapturedImage.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView12 = (androidx.appcompat.widget.SwitchCompat) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView13 = (com.google.android.material.button.MaterialButton) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView4 = (androidx.cardview.widget.CardView) bindings[4];
        this.mboundView4.setTag(null);
        this.tvCorrectionValue.setTag(null);
        this.tvDescriptionValue.setTag(null);
        this.tvHeading.setTag(null);
        setRootTag(root);
        // listeners
        mCallback23 = new com.centerpoint.connect.generated.callback.OnClickListener(this, 4);
        mCallback24 = new com.centerpoint.connect.generated.callback.OnClickListener(this, 5);
        mCallback21 = new com.centerpoint.connect.generated.callback.OnClickListener(this, 2);
        mCallback20 = new com.centerpoint.connect.generated.callback.OnClickListener(this, 1);
        mCallback22 = new com.centerpoint.connect.generated.callback.OnClickListener(this, 3);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x200L;
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
            setFragment((com.centerpoint.connect.ui.global.service_info.add_repair.AddRepairFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFragment(@Nullable com.centerpoint.connect.ui.global.service_info.add_repair.AddRepairFragment Fragment) {
        this.mFragment = Fragment;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.fragment);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelAddRepairRequestParamsRoofPenetrate((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelAddRepairRequestParamsDescription((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelAddRepairRequestParamsRepairBitmap((androidx.databinding.ObservableField<android.graphics.Bitmap>) object, fieldId);
            case 3 :
                return onChangeViewModelAddRepairRequestParamsQuantity((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModelAddRepairRequestParamsCorrection((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewModelAddRepairRequestParamsManagerName((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeViewModelAddRepairRequestParamsUnit((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelAddRepairRequestParamsRoofPenetrate(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelAddRepairRequestParamsRoofPenetrate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAddRepairRequestParamsDescription(androidx.databinding.ObservableField<java.lang.String> ViewModelAddRepairRequestParamsDescription, int fieldId) {
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
    private boolean onChangeViewModelAddRepairRequestParamsUnit(androidx.databinding.ObservableField<java.lang.String> ViewModelAddRepairRequestParamsUnit, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
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
        androidx.databinding.ObservableField<java.lang.Boolean> viewModelAddRepairRequestParamsRoofPenetrate = null;
        com.centerpoint.connect.ui.global.service_info.add_repair.AddRepairFragment fragment = mFragment;
        androidx.databinding.ObservableField<java.lang.String> viewModelAddRepairRequestParamsDescription = null;
        java.lang.String viewModelAddRepairRequestParamsManagerNameGet = null;
        androidx.databinding.ObservableField<android.graphics.Bitmap> viewModelAddRepairRequestParamsRepairBitmap = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelAddRepairRequestParamsQuantity = null;
        java.lang.Boolean viewModelAddRepairRequestParamsRoofPenetrateGet = null;
        android.graphics.Bitmap viewModelAddRepairRequestParamsRepairBitmapGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelAddRepairRequestParamsCorrection = null;
        java.lang.String viewModelAddRepairRequestParamsDescriptionGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelAddRepairRequestParamsManagerName = null;
        boolean viewModelAddRepairRequestParamsRepairBitmapJavaLangObjectNull = false;
        java.lang.String viewModelAddRepairRequestParamsCorrectionGet = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelAddRepairRequestParamsRoofPenetrateGet = false;
        androidx.databinding.ObservableField<java.lang.String> viewModelAddRepairRequestParamsUnit = null;
        java.lang.String viewModelAddRepairRequestParamsUnitGet = null;
        java.lang.String viewModelAddRepairRequestParamsQuantityGet = null;
        boolean ViewModelAddRepairRequestParamsRepairBitmapJavaLangObjectNull1 = false;
        com.centerpoint.connect.models.request.AddRepairRP viewModelAddRepairRequestParams = null;
        com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x37fL) != 0) {



                if (viewModel != null) {
                    // read viewModel.addRepairRequestParams
                    viewModelAddRepairRequestParams = viewModel.getAddRepairRequestParams();
                }

            if ((dirtyFlags & 0x301L) != 0) {

                    if (viewModelAddRepairRequestParams != null) {
                        // read viewModel.addRepairRequestParams.roofPenetrate
                        viewModelAddRepairRequestParamsRoofPenetrate = viewModelAddRepairRequestParams.getRoofPenetrate();
                    }
                    updateRegistration(0, viewModelAddRepairRequestParamsRoofPenetrate);


                    if (viewModelAddRepairRequestParamsRoofPenetrate != null) {
                        // read viewModel.addRepairRequestParams.roofPenetrate.get()
                        viewModelAddRepairRequestParamsRoofPenetrateGet = viewModelAddRepairRequestParamsRoofPenetrate.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.addRepairRequestParams.roofPenetrate.get())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelAddRepairRequestParamsRoofPenetrateGet = androidx.databinding.ViewDataBinding.safeUnbox(viewModelAddRepairRequestParamsRoofPenetrateGet);
            }
            if ((dirtyFlags & 0x302L) != 0) {

                    if (viewModelAddRepairRequestParams != null) {
                        // read viewModel.addRepairRequestParams.description
                        viewModelAddRepairRequestParamsDescription = viewModelAddRepairRequestParams.getDescription();
                    }
                    updateRegistration(1, viewModelAddRepairRequestParamsDescription);


                    if (viewModelAddRepairRequestParamsDescription != null) {
                        // read viewModel.addRepairRequestParams.description.get()
                        viewModelAddRepairRequestParamsDescriptionGet = viewModelAddRepairRequestParamsDescription.get();
                    }
            }
            if ((dirtyFlags & 0x304L) != 0) {

                    if (viewModelAddRepairRequestParams != null) {
                        // read viewModel.addRepairRequestParams.repairBitmap
                        viewModelAddRepairRequestParamsRepairBitmap = viewModelAddRepairRequestParams.getRepairBitmap();
                    }
                    updateRegistration(2, viewModelAddRepairRequestParamsRepairBitmap);


                    if (viewModelAddRepairRequestParamsRepairBitmap != null) {
                        // read viewModel.addRepairRequestParams.repairBitmap.get()
                        viewModelAddRepairRequestParamsRepairBitmapGet = viewModelAddRepairRequestParamsRepairBitmap.get();
                    }


                    // read viewModel.addRepairRequestParams.repairBitmap.get() != null
                    viewModelAddRepairRequestParamsRepairBitmapJavaLangObjectNull = (viewModelAddRepairRequestParamsRepairBitmapGet) != (null);
                    // read viewModel.addRepairRequestParams.repairBitmap.get() == null
                    ViewModelAddRepairRequestParamsRepairBitmapJavaLangObjectNull1 = (viewModelAddRepairRequestParamsRepairBitmapGet) == (null);
            }
            if ((dirtyFlags & 0x308L) != 0) {

                    if (viewModelAddRepairRequestParams != null) {
                        // read viewModel.addRepairRequestParams.quantity
                        viewModelAddRepairRequestParamsQuantity = viewModelAddRepairRequestParams.getQuantity();
                    }
                    updateRegistration(3, viewModelAddRepairRequestParamsQuantity);


                    if (viewModelAddRepairRequestParamsQuantity != null) {
                        // read viewModel.addRepairRequestParams.quantity.get()
                        viewModelAddRepairRequestParamsQuantityGet = viewModelAddRepairRequestParamsQuantity.get();
                    }
            }
            if ((dirtyFlags & 0x310L) != 0) {

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
            if ((dirtyFlags & 0x320L) != 0) {

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
            if ((dirtyFlags & 0x340L) != 0) {

                    if (viewModelAddRepairRequestParams != null) {
                        // read viewModel.addRepairRequestParams.unit
                        viewModelAddRepairRequestParamsUnit = viewModelAddRepairRequestParams.getUnit();
                    }
                    updateRegistration(6, viewModelAddRepairRequestParamsUnit);


                    if (viewModelAddRepairRequestParamsUnit != null) {
                        // read viewModel.addRepairRequestParams.unit.get()
                        viewModelAddRepairRequestParamsUnitGet = viewModelAddRepairRequestParamsUnit.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x200L) != 0) {
            // api target 1

            this.btnCancel.setOnClickListener(mCallback23);
            this.btnNext.setOnClickListener(mCallback24);
            com.centerpoint.connect.base.ViewBindingsKt.bindCustomBackground(this.cvCard, getColorFromResource(cvCard, R.color.white), (java.lang.Integer)null, (java.lang.Float)null, cvCard.getResources().getDimension(R.dimen.ticket_info_card_corners), cvCard.getResources().getDimension(R.dimen.ticket_info_card_corners));
            com.centerpoint.connect.base.ViewBindingsKt.bindCustomBackground(this.etManagerName, getColorFromResource(etManagerName, R.color.white), getColorFromResource(etManagerName, R.color.border_silver), etManagerName.getResources().getDimension(R.dimen._1sdp), etManagerName.getResources().getDimension(R.dimen._40sdp), etManagerName.getResources().getDimension(R.dimen._40sdp));
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etManagerName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etManagerNameandroidTextAttrChanged);
            com.centerpoint.connect.base.ViewBindingsKt.bindCustomBackground(this.etQuantityUnit, getColorFromResource(etQuantityUnit, R.color.white), getColorFromResource(etQuantityUnit, R.color.border_silver), etQuantityUnit.getResources().getDimension(R.dimen._1sdp), etQuantityUnit.getResources().getDimension(R.dimen._40sdp), etQuantityUnit.getResources().getDimension(R.dimen._40sdp));
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etQuantityUnit, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etQuantityUnitandroidTextAttrChanged);
            com.centerpoint.connect.base.ViewBindingsKt.bindCustomBackground(this.etQuantityValue, getColorFromResource(etQuantityValue, R.color.white), getColorFromResource(etQuantityValue, R.color.border_silver), etQuantityValue.getResources().getDimension(R.dimen._1sdp), etQuantityValue.getResources().getDimension(R.dimen._40sdp), etQuantityValue.getResources().getDimension(R.dimen._40sdp));
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etQuantityValue, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etQuantityValueandroidTextAttrChanged);
            com.centerpoint.connect.base.ViewBindingsKt.bindCustomBackground(this.etSearchRepair, getColorFromResource(etSearchRepair, R.color.white), getColorFromResource(etSearchRepair, R.color.border_silver), etSearchRepair.getResources().getDimension(R.dimen._1sdp), etSearchRepair.getResources().getDimension(R.dimen._20sdp), etSearchRepair.getResources().getDimension(R.dimen._20sdp));
            this.ivCamera.setOnClickListener(mCallback20);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.mboundView12, (android.widget.CompoundButton.OnCheckedChangeListener)null, mboundView12androidCheckedAttrChanged);
            this.mboundView13.setOnClickListener(mCallback22);
            com.centerpoint.connect.base.ViewBindingsKt.bindCustomBackground(this.tvCorrectionValue, getColorFromResource(tvCorrectionValue, R.color.white), getColorFromResource(tvCorrectionValue, R.color.border_silver), tvCorrectionValue.getResources().getDimension(R.dimen._1sdp), tvCorrectionValue.getResources().getDimension(R.dimen.ticket_info_card_corners), tvCorrectionValue.getResources().getDimension(R.dimen.ticket_info_card_corners));
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvCorrectionValue, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvCorrectionValueandroidTextAttrChanged);
            com.centerpoint.connect.base.ViewBindingsKt.bindCustomBackground(this.tvDescriptionValue, getColorFromResource(tvDescriptionValue, R.color.white), getColorFromResource(tvDescriptionValue, R.color.border_silver), tvDescriptionValue.getResources().getDimension(R.dimen._1sdp), tvDescriptionValue.getResources().getDimension(R.dimen.ticket_info_card_corners), tvDescriptionValue.getResources().getDimension(R.dimen.ticket_info_card_corners));
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvDescriptionValue, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvDescriptionValueandroidTextAttrChanged);
            this.tvHeading.setOnClickListener(mCallback21);
        }
        if ((dirtyFlags & 0x304L) != 0) {
            // api target 1

            com.centerpoint.connect.base.ViewBindingsKt.bindVisibility(this.btnCancel, viewModelAddRepairRequestParamsRepairBitmapJavaLangObjectNull);
            com.centerpoint.connect.base.ViewBindingsKt.bindVisibility(this.btnNext, viewModelAddRepairRequestParamsRepairBitmapJavaLangObjectNull);
            com.centerpoint.connect.base.ViewBindingsKt.bindVisibility(this.ivCamera, ViewModelAddRepairRequestParamsRepairBitmapJavaLangObjectNull1);
            com.centerpoint.connect.base.ViewBindingsKt.bindImageWithBitmap(this.ivCapturedImage, viewModelAddRepairRequestParamsRepairBitmapGet);
            com.centerpoint.connect.base.ViewBindingsKt.bindVisibility(this.mboundView13, ViewModelAddRepairRequestParamsRepairBitmapJavaLangObjectNull1);
            com.centerpoint.connect.base.ViewBindingsKt.bindVisibility(this.mboundView4, viewModelAddRepairRequestParamsRepairBitmapJavaLangObjectNull);
            com.centerpoint.connect.base.ViewBindingsKt.bindVisibility(this.tvHeading, ViewModelAddRepairRequestParamsRepairBitmapJavaLangObjectNull1);
        }
        if ((dirtyFlags & 0x320L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etManagerName, viewModelAddRepairRequestParamsManagerNameGet);
        }
        if ((dirtyFlags & 0x340L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etQuantityUnit, viewModelAddRepairRequestParamsUnitGet);
        }
        if ((dirtyFlags & 0x308L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etQuantityValue, viewModelAddRepairRequestParamsQuantityGet);
        }
        if ((dirtyFlags & 0x301L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mboundView12, androidxDatabindingViewDataBindingSafeUnboxViewModelAddRepairRequestParamsRoofPenetrateGet);
        }
        if ((dirtyFlags & 0x310L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCorrectionValue, viewModelAddRepairRequestParamsCorrectionGet);
        }
        if ((dirtyFlags & 0x302L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDescriptionValue, viewModelAddRepairRequestParamsDescriptionGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // fragment
                com.centerpoint.connect.ui.global.service_info.add_repair.AddRepairFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.onBackPress();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // fragment.onNextClicked()
                com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailFragment fragmentOnNextClicked = null;
                // fragment
                com.centerpoint.connect.ui.global.service_info.add_repair.AddRepairFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragmentOnNextClicked = fragment.onNextClicked();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // fragment
                com.centerpoint.connect.ui.global.service_info.add_repair.AddRepairFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.onCameraClicked();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // fragment
                com.centerpoint.connect.ui.global.service_info.add_repair.AddRepairFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.onCameraClicked();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // fragment
                com.centerpoint.connect.ui.global.service_info.add_repair.AddRepairFragment fragment = mFragment;
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
        flag 0 (0x1L): viewModel.addRepairRequestParams.roofPenetrate
        flag 1 (0x2L): viewModel.addRepairRequestParams.description
        flag 2 (0x3L): viewModel.addRepairRequestParams.repairBitmap
        flag 3 (0x4L): viewModel.addRepairRequestParams.quantity
        flag 4 (0x5L): viewModel.addRepairRequestParams.correction
        flag 5 (0x6L): viewModel.addRepairRequestParams.managerName
        flag 6 (0x7L): viewModel.addRepairRequestParams.unit
        flag 7 (0x8L): fragment
        flag 8 (0x9L): viewModel
        flag 9 (0xaL): null
    flag mapping end*/
    //end
}