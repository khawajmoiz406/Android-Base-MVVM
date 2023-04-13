package com.centerpoint.connect.databinding;
import com.centerpoint.connect.R;
import com.centerpoint.connect.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class IncludeRepairDetailContentBindingImpl extends IncludeRepairDetailContentBinding implements com.centerpoint.connect.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tvManagerNameHeading, 14);
        sViewsWithIds.put(R.id.tvQuantityHeading, 15);
        sViewsWithIds.put(R.id.tvDescriptionHeading, 16);
        sViewsWithIds.put(R.id.tvCorrectionHeading, 17);
        sViewsWithIds.put(R.id.tvWaterProofHeading, 18);
        sViewsWithIds.put(R.id.ivMap, 19);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final com.centerpoint.connect.classes.expandable_view.ExpandableView mboundView10;
    @NonNull
    private final android.widget.TextView mboundView13;
    @NonNull
    private final androidx.appcompat.widget.SwitchCompat mboundView6;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public IncludeRepairDetailContentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds));
    }
    private IncludeRepairDetailContentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[8]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[12]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[19]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[7]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[11]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[18]
            );
        this.etManagerName.setTag(null);
        this.etQuantityUnit.setTag(null);
        this.etQuantityValue.setTag(null);
        this.ivCamera.setTag(null);
        this.ivCameraResolution.setTag(null);
        this.ivProblem.setTag(null);
        this.ivResolution.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView10 = (com.centerpoint.connect.classes.expandable_view.ExpandableView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView13 = (android.widget.TextView) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView6 = (androidx.appcompat.widget.SwitchCompat) bindings[6];
        this.mboundView6.setTag(null);
        this.tvCorrectionValue.setTag(null);
        this.tvDescriptionValue.setTag(null);
        this.tvHeading.setTag(null);
        setRootTag(root);
        // listeners
        mCallback6 = new com.centerpoint.connect.generated.callback.OnClickListener(this, 4);
        mCallback5 = new com.centerpoint.connect.generated.callback.OnClickListener(this, 3);
        mCallback4 = new com.centerpoint.connect.generated.callback.OnClickListener(this, 2);
        mCallback3 = new com.centerpoint.connect.generated.callback.OnClickListener(this, 1);
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
            setFragment((com.centerpoint.connect.ui.global.service_info.repairs.RepairsDetailFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFragment(@Nullable com.centerpoint.connect.ui.global.service_info.repairs.RepairsDetailFragment Fragment) {
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
                return onChangeViewModelUpdateRepairRequestParamsResolutionBitmap((androidx.databinding.ObservableField<android.graphics.Bitmap>) object, fieldId);
            case 1 :
                return onChangeViewModelUpdateRepairRequestParamsRepairBitmap((androidx.databinding.ObservableField<android.graphics.Bitmap>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelUpdateRepairRequestParamsResolutionBitmap(androidx.databinding.ObservableField<android.graphics.Bitmap> ViewModelUpdateRepairRequestParamsResolutionBitmap, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelUpdateRepairRequestParamsRepairBitmap(androidx.databinding.ObservableField<android.graphics.Bitmap> ViewModelUpdateRepairRequestParamsRepairBitmap, int fieldId) {
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
        android.graphics.Bitmap viewModelUpdateRepairRequestParamsRepairBitmapGet = null;
        com.centerpoint.connect.ui.global.service_info.repairs.RepairsDetailFragment fragment = mFragment;
        java.lang.String viewModelUpdateRepairRequestParamsResolutionBitmapJavaLangObjectNullMboundView10AndroidStringRequiredPhotosMboundView10AndroidStringCompleted = null;
        java.lang.String fragmentRepairCorrection = null;
        java.lang.String viewModelUpdateRepairRequestParamsResolutionBitmapJavaLangObjectNullJavaLangString04PhotosJavaLangString14Photos = null;
        boolean fragmentRepairRoofPenetrate = false;
        java.lang.String fragmentRepairDescription = null;
        boolean viewModelUpdateRepairRequestParamsResolutionBitmapJavaLangObjectNull = false;
        java.lang.String fragmentRepairQuantity = null;
        androidx.databinding.ObservableField<android.graphics.Bitmap> viewModelUpdateRepairRequestParamsResolutionBitmap = null;
        java.lang.String fragmentRepairUnit = null;
        com.centerpoint.connect.models.response.repair.Repair fragmentRepair = null;
        android.graphics.Bitmap viewModelUpdateRepairRequestParamsResolutionBitmapGet = null;
        int viewModelUpdateRepairRequestParamsResolutionBitmapJavaLangObjectNullMboundView10AndroidColorColorAccentMboundView10AndroidColorTextColorGrey = 0;
        java.lang.String fragmentRepairRepairUrl = null;
        com.centerpoint.connect.models.request.UpdateRepairRP viewModelUpdateRepairRequestParams = null;
        androidx.databinding.ObservableField<android.graphics.Bitmap> viewModelUpdateRepairRequestParamsRepairBitmap = null;
        java.lang.String fragmentRepairManagerName = null;
        boolean ViewModelUpdateRepairRequestParamsResolutionBitmapJavaLangObjectNull1 = false;
        com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x14L) != 0) {



                if (fragment != null) {
                    // read fragment.repair
                    fragmentRepair = fragment.getRepair();
                }


                if (fragmentRepair != null) {
                    // read fragment.repair.correction
                    fragmentRepairCorrection = fragmentRepair.getCorrection();
                    // read fragment.repair.roofPenetrate
                    fragmentRepairRoofPenetrate = fragmentRepair.getRoofPenetrate();
                    // read fragment.repair.description
                    fragmentRepairDescription = fragmentRepair.getDescription();
                    // read fragment.repair.quantity
                    fragmentRepairQuantity = fragmentRepair.getQuantity();
                    // read fragment.repair.unit
                    fragmentRepairUnit = fragmentRepair.getUnit();
                    // read fragment.repair.repairUrl
                    fragmentRepairRepairUrl = fragmentRepair.getRepairUrl();
                    // read fragment.repair.managerName
                    fragmentRepairManagerName = fragmentRepair.getManagerName();
                }
        }
        if ((dirtyFlags & 0x1bL) != 0) {



                if (viewModel != null) {
                    // read viewModel.updateRepairRequestParams
                    viewModelUpdateRepairRequestParams = viewModel.getUpdateRepairRequestParams();
                }

            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModelUpdateRepairRequestParams != null) {
                        // read viewModel.updateRepairRequestParams.resolutionBitmap
                        viewModelUpdateRepairRequestParamsResolutionBitmap = viewModelUpdateRepairRequestParams.getResolutionBitmap();
                    }
                    updateRegistration(0, viewModelUpdateRepairRequestParamsResolutionBitmap);


                    if (viewModelUpdateRepairRequestParamsResolutionBitmap != null) {
                        // read viewModel.updateRepairRequestParams.resolutionBitmap.get()
                        viewModelUpdateRepairRequestParamsResolutionBitmapGet = viewModelUpdateRepairRequestParamsResolutionBitmap.get();
                    }


                    // read viewModel.updateRepairRequestParams.resolutionBitmap.get() != null
                    viewModelUpdateRepairRequestParamsResolutionBitmapJavaLangObjectNull = (viewModelUpdateRepairRequestParamsResolutionBitmapGet) != (null);
                    // read viewModel.updateRepairRequestParams.resolutionBitmap.get() == null
                    ViewModelUpdateRepairRequestParamsResolutionBitmapJavaLangObjectNull1 = (viewModelUpdateRepairRequestParamsResolutionBitmapGet) == (null);
                if((dirtyFlags & 0x19L) != 0) {
                    if(ViewModelUpdateRepairRequestParamsResolutionBitmapJavaLangObjectNull1) {
                            dirtyFlags |= 0x40L;
                            dirtyFlags |= 0x100L;
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                            dirtyFlags |= 0x80L;
                            dirtyFlags |= 0x200L;
                    }
                }


                    // read viewModel.updateRepairRequestParams.resolutionBitmap.get() == null ? @android:string/required_photos : @android:string/completed
                    viewModelUpdateRepairRequestParamsResolutionBitmapJavaLangObjectNullMboundView10AndroidStringRequiredPhotosMboundView10AndroidStringCompleted = ((ViewModelUpdateRepairRequestParamsResolutionBitmapJavaLangObjectNull1) ? (mboundView10.getResources().getString(R.string.required_photos)) : (mboundView10.getResources().getString(R.string.completed)));
                    // read viewModel.updateRepairRequestParams.resolutionBitmap.get() == null ? "0 / 4 Photos" : "1 / 4 Photos"
                    viewModelUpdateRepairRequestParamsResolutionBitmapJavaLangObjectNullJavaLangString04PhotosJavaLangString14Photos = ((ViewModelUpdateRepairRequestParamsResolutionBitmapJavaLangObjectNull1) ? ("0 / 4 Photos") : ("1 / 4 Photos"));
                    // read viewModel.updateRepairRequestParams.resolutionBitmap.get() == null ? @android:color/colorAccent : @android:color/text_color_grey
                    viewModelUpdateRepairRequestParamsResolutionBitmapJavaLangObjectNullMboundView10AndroidColorColorAccentMboundView10AndroidColorTextColorGrey = ((ViewModelUpdateRepairRequestParamsResolutionBitmapJavaLangObjectNull1) ? (getColorFromResource(mboundView10, R.color.colorAccent)) : (getColorFromResource(mboundView10, R.color.text_color_grey)));
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModelUpdateRepairRequestParams != null) {
                        // read viewModel.updateRepairRequestParams.repairBitmap
                        viewModelUpdateRepairRequestParamsRepairBitmap = viewModelUpdateRepairRequestParams.getRepairBitmap();
                    }
                    updateRegistration(1, viewModelUpdateRepairRequestParamsRepairBitmap);


                    if (viewModelUpdateRepairRequestParamsRepairBitmap != null) {
                        // read viewModel.updateRepairRequestParams.repairBitmap.get()
                        viewModelUpdateRepairRequestParamsRepairBitmapGet = viewModelUpdateRepairRequestParamsRepairBitmap.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x14L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etManagerName, fragmentRepairManagerName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etQuantityUnit, fragmentRepairUnit);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etQuantityValue, fragmentRepairQuantity);
            com.centerpoint.connect.base.ViewBindingsKt.loadImageWithGlide(this.ivProblem, fragmentRepairRepairUrl);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mboundView6, fragmentRepairRoofPenetrate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCorrectionValue, fragmentRepairCorrection);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDescriptionValue, fragmentRepairDescription);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            com.centerpoint.connect.base.ViewBindingsKt.bindCustomBackground(this.etManagerName, getColorFromResource(etManagerName, R.color.white), getColorFromResource(etManagerName, R.color.border_silver), etManagerName.getResources().getDimension(R.dimen._1sdp), etManagerName.getResources().getDimension(R.dimen._40sdp), etManagerName.getResources().getDimension(R.dimen._40sdp));
            com.centerpoint.connect.base.ViewBindingsKt.bindCustomBackground(this.etQuantityUnit, getColorFromResource(etQuantityUnit, R.color.white), getColorFromResource(etQuantityUnit, R.color.border_silver), etQuantityUnit.getResources().getDimension(R.dimen._1sdp), etQuantityUnit.getResources().getDimension(R.dimen._40sdp), etQuantityUnit.getResources().getDimension(R.dimen._40sdp));
            com.centerpoint.connect.base.ViewBindingsKt.bindCustomBackground(this.etQuantityValue, getColorFromResource(etQuantityValue, R.color.white), getColorFromResource(etQuantityValue, R.color.border_silver), etQuantityValue.getResources().getDimension(R.dimen._1sdp), etQuantityValue.getResources().getDimension(R.dimen._40sdp), etQuantityValue.getResources().getDimension(R.dimen._40sdp));
            this.ivCamera.setOnClickListener(mCallback3);
            this.ivCameraResolution.setOnClickListener(mCallback5);
            this.mboundView13.setOnClickListener(mCallback6);
            com.centerpoint.connect.base.ViewBindingsKt.bindCustomBackground(this.tvCorrectionValue, getColorFromResource(tvCorrectionValue, R.color.white), getColorFromResource(tvCorrectionValue, R.color.border_silver), tvCorrectionValue.getResources().getDimension(R.dimen._1sdp), tvCorrectionValue.getResources().getDimension(R.dimen.ticket_info_card_corners), tvCorrectionValue.getResources().getDimension(R.dimen.ticket_info_card_corners));
            com.centerpoint.connect.base.ViewBindingsKt.bindCustomBackground(this.tvDescriptionValue, getColorFromResource(tvDescriptionValue, R.color.white), getColorFromResource(tvDescriptionValue, R.color.border_silver), tvDescriptionValue.getResources().getDimension(R.dimen._1sdp), tvDescriptionValue.getResources().getDimension(R.dimen.ticket_info_card_corners), tvDescriptionValue.getResources().getDimension(R.dimen.ticket_info_card_corners));
            this.tvHeading.setOnClickListener(mCallback4);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            com.centerpoint.connect.base.ViewBindingsKt.bindImageWithBitmap(this.ivProblem, viewModelUpdateRepairRequestParamsRepairBitmapGet);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            com.centerpoint.connect.base.ViewBindingsKt.bindImageWithBitmap(this.ivResolution, viewModelUpdateRepairRequestParamsResolutionBitmapGet);
            com.centerpoint.connect.base.ViewBindingsKt.bindVisibility(this.ivResolution, viewModelUpdateRepairRequestParamsResolutionBitmapJavaLangObjectNull);
            com.centerpoint.connect.base.ViewBindingsKt.bindValues(this.mboundView10, viewModelUpdateRepairRequestParamsResolutionBitmapJavaLangObjectNullMboundView10AndroidStringRequiredPhotosMboundView10AndroidStringCompleted, viewModelUpdateRepairRequestParamsResolutionBitmapJavaLangObjectNullMboundView10AndroidColorColorAccentMboundView10AndroidColorTextColorGrey, viewModelUpdateRepairRequestParamsResolutionBitmapJavaLangObjectNullJavaLangString04PhotosJavaLangString14Photos);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // fragment
                com.centerpoint.connect.ui.global.service_info.repairs.RepairsDetailFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {




                    fragment.onCameraClicked(com.centerpoint.connect.constants.ConstantsKt.RESOLUTION_PICTURE);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // fragment
                com.centerpoint.connect.ui.global.service_info.repairs.RepairsDetailFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {




                    fragment.onCameraClicked(com.centerpoint.connect.constants.ConstantsKt.RESOLUTION_PICTURE);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // fragment
                com.centerpoint.connect.ui.global.service_info.repairs.RepairsDetailFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {




                    fragment.onCameraClicked(com.centerpoint.connect.constants.ConstantsKt.PROBLEM_PICTURE);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // fragment
                com.centerpoint.connect.ui.global.service_info.repairs.RepairsDetailFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {




                    fragment.onCameraClicked(com.centerpoint.connect.constants.ConstantsKt.PROBLEM_PICTURE);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.updateRepairRequestParams.resolutionBitmap
        flag 1 (0x2L): viewModel.updateRepairRequestParams.repairBitmap
        flag 2 (0x3L): fragment
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
        flag 5 (0x6L): viewModel.updateRepairRequestParams.resolutionBitmap.get() == null ? @android:string/required_photos : @android:string/completed
        flag 6 (0x7L): viewModel.updateRepairRequestParams.resolutionBitmap.get() == null ? @android:string/required_photos : @android:string/completed
        flag 7 (0x8L): viewModel.updateRepairRequestParams.resolutionBitmap.get() == null ? "0 / 4 Photos" : "1 / 4 Photos"
        flag 8 (0x9L): viewModel.updateRepairRequestParams.resolutionBitmap.get() == null ? "0 / 4 Photos" : "1 / 4 Photos"
        flag 9 (0xaL): viewModel.updateRepairRequestParams.resolutionBitmap.get() == null ? @android:color/colorAccent : @android:color/text_color_grey
        flag 10 (0xbL): viewModel.updateRepairRequestParams.resolutionBitmap.get() == null ? @android:color/colorAccent : @android:color/text_color_grey
    flag mapping end*/
    //end
}