package com.centerpoint.connect.databinding;
import com.centerpoint.connect.R;
import com.centerpoint.connect.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentReviewWorkBindingImpl extends FragmentReviewWorkBinding implements com.centerpoint.connect.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.llButtons, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView5;
    @NonNull
    private final com.google.android.material.button.MaterialButton mboundView6;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentReviewWorkBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentReviewWorkBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.LinearLayout) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            );
        this.cvCard.setTag(null);
        this.ivProblem.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (androidx.appcompat.widget.AppCompatImageView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (com.google.android.material.button.MaterialButton) bindings[6];
        this.mboundView6.setTag(null);
        setRootTag(root);
        // listeners
        mCallback12 = new com.centerpoint.connect.generated.callback.OnClickListener(this, 1);
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
            setFragment((com.centerpoint.connect.ui.global.service_info.review_work.ReviewWorkFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFragment(@Nullable com.centerpoint.connect.ui.global.service_info.review_work.ReviewWorkFragment Fragment) {
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
                return onChangeViewModelUpdateRepairRequestParamsRepairBitmap((androidx.databinding.ObservableField<android.graphics.Bitmap>) object, fieldId);
            case 1 :
                return onChangeViewModelUpdateRepairRequestParamsResolutionBitmap((androidx.databinding.ObservableField<android.graphics.Bitmap>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelUpdateRepairRequestParamsRepairBitmap(androidx.databinding.ObservableField<android.graphics.Bitmap> ViewModelUpdateRepairRequestParamsRepairBitmap, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelUpdateRepairRequestParamsResolutionBitmap(androidx.databinding.ObservableField<android.graphics.Bitmap> ViewModelUpdateRepairRequestParamsResolutionBitmap, int fieldId) {
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
        android.graphics.Bitmap viewModelUpdateRepairRequestParamsResolutionBitmapGet = null;
        java.lang.String fragmentRepairRepairUrl = null;
        android.graphics.Bitmap viewModelUpdateRepairRequestParamsRepairBitmapGet = null;
        com.centerpoint.connect.ui.global.service_info.review_work.ReviewWorkFragment fragment = mFragment;
        com.centerpoint.connect.models.request.UpdateRepairRP viewModelUpdateRepairRequestParams = null;
        com.centerpoint.connect.models.response.repair.Repair fragmentRepair = null;
        androidx.databinding.ObservableField<android.graphics.Bitmap> viewModelUpdateRepairRequestParamsRepairBitmap = null;
        java.lang.String fragmentRepairManagerName = null;
        com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailViewModel viewModel = mViewModel;
        androidx.databinding.ObservableField<android.graphics.Bitmap> viewModelUpdateRepairRequestParamsResolutionBitmap = null;

        if ((dirtyFlags & 0x14L) != 0) {



                if (fragment != null) {
                    // read fragment.repair
                    fragmentRepair = fragment.getRepair();
                }


                if (fragmentRepair != null) {
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
                        // read viewModel.updateRepairRequestParams.repairBitmap
                        viewModelUpdateRepairRequestParamsRepairBitmap = viewModelUpdateRepairRequestParams.getRepairBitmap();
                    }
                    updateRegistration(0, viewModelUpdateRepairRequestParamsRepairBitmap);


                    if (viewModelUpdateRepairRequestParamsRepairBitmap != null) {
                        // read viewModel.updateRepairRequestParams.repairBitmap.get()
                        viewModelUpdateRepairRequestParamsRepairBitmapGet = viewModelUpdateRepairRequestParamsRepairBitmap.get();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModelUpdateRepairRequestParams != null) {
                        // read viewModel.updateRepairRequestParams.resolutionBitmap
                        viewModelUpdateRepairRequestParamsResolutionBitmap = viewModelUpdateRepairRequestParams.getResolutionBitmap();
                    }
                    updateRegistration(1, viewModelUpdateRepairRequestParamsResolutionBitmap);


                    if (viewModelUpdateRepairRequestParamsResolutionBitmap != null) {
                        // read viewModel.updateRepairRequestParams.resolutionBitmap.get()
                        viewModelUpdateRepairRequestParamsResolutionBitmapGet = viewModelUpdateRepairRequestParamsResolutionBitmap.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            com.centerpoint.connect.base.ViewBindingsKt.bindCustomBackground(this.cvCard, getColorFromResource(cvCard, R.color.white), (java.lang.Integer)null, (java.lang.Float)null, cvCard.getResources().getDimension(R.dimen.ticket_info_card_corners), cvCard.getResources().getDimension(R.dimen.ticket_info_card_corners));
            this.mboundView6.setOnClickListener(mCallback12);
        }
        if ((dirtyFlags & 0x14L) != 0) {
            // api target 1

            com.centerpoint.connect.base.ViewBindingsKt.loadImageWithGlide(this.ivProblem, fragmentRepairRepairUrl);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, fragmentRepairManagerName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, fragmentRepairManagerName);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            com.centerpoint.connect.base.ViewBindingsKt.bindImageWithBitmap(this.ivProblem, viewModelUpdateRepairRequestParamsRepairBitmapGet);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            com.centerpoint.connect.base.ViewBindingsKt.bindImageWithBitmap(this.mboundView5, viewModelUpdateRepairRequestParamsResolutionBitmapGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // fragment.onConfirmationClicked()
        com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailFragment fragmentOnConfirmationClicked = null;
        // fragment
        com.centerpoint.connect.ui.global.service_info.review_work.ReviewWorkFragment fragment = mFragment;
        // fragment != null
        boolean fragmentJavaLangObjectNull = false;



        fragmentJavaLangObjectNull = (fragment) != (null);
        if (fragmentJavaLangObjectNull) {


            fragmentOnConfirmationClicked = fragment.onConfirmationClicked();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.updateRepairRequestParams.repairBitmap
        flag 1 (0x2L): viewModel.updateRepairRequestParams.resolutionBitmap
        flag 2 (0x3L): fragment
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}