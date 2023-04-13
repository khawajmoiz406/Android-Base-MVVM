package com.centerpoint.connect.databinding;
import com.centerpoint.connect.R;
import com.centerpoint.connect.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentRepairDetailBindingImpl extends FragmentRepairDetailBinding implements com.centerpoint.connect.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(4);
        sIncludes.setIncludes(0, 
            new String[] {"include_repair_detail_content"},
            new int[] {3},
            new int[] {com.centerpoint.connect.R.layout.include_repair_detail_content});
        sViewsWithIds = null;
    }
    // views
    @Nullable
    private final com.centerpoint.connect.databinding.IncludeRepairDetailContentBinding mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView01;
    @NonNull
    private final com.google.android.material.button.MaterialButton mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback27;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentRepairDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentRepairDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            );
        this.llButtons.setTag(null);
        this.mboundView0 = (com.centerpoint.connect.databinding.IncludeRepairDetailContentBinding) bindings[3];
        setContainedBinding(this.mboundView0);
        this.mboundView01 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView01.setTag(null);
        this.mboundView2 = (com.google.android.material.button.MaterialButton) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
        mCallback27 = new com.centerpoint.connect.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        mboundView0.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView0.hasPendingBindings()) {
            return true;
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
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.fragment);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView0.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelUpdateRepairRequestParamsResolutionBitmap((androidx.databinding.ObservableField<android.graphics.Bitmap>) object, fieldId);
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

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        android.graphics.Bitmap viewModelUpdateRepairRequestParamsResolutionBitmapGet = null;
        boolean viewModelUpdateRepairRequestParamsResolutionBitmapJavaLangObjectNull = false;
        com.centerpoint.connect.ui.global.service_info.repairs.RepairsDetailFragment fragment = mFragment;
        com.centerpoint.connect.models.request.UpdateRepairRP viewModelUpdateRepairRequestParams = null;
        com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailViewModel viewModel = mViewModel;
        androidx.databinding.ObservableField<android.graphics.Bitmap> viewModelUpdateRepairRequestParamsResolutionBitmap = null;

        if ((dirtyFlags & 0xaL) != 0) {
        }
        if ((dirtyFlags & 0xdL) != 0) {



                if (viewModel != null) {
                    // read viewModel.updateRepairRequestParams
                    viewModelUpdateRepairRequestParams = viewModel.getUpdateRepairRequestParams();
                }


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
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.centerpoint.connect.base.ViewBindingsKt.bindVisibility(this.llButtons, viewModelUpdateRepairRequestParamsResolutionBitmapJavaLangObjectNull);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            this.mboundView0.setFragment(fragment);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.mboundView0.setViewModel(viewModel);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.mboundView2.setOnClickListener(mCallback27);
        }
        executeBindingsOn(mboundView0);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // fragment
        com.centerpoint.connect.ui.global.service_info.repairs.RepairsDetailFragment fragment = mFragment;
        // fragment != null
        boolean fragmentJavaLangObjectNull = false;
        // fragment.onReviewWorkClicked()
        com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailFragment fragmentOnReviewWorkClicked = null;



        fragmentJavaLangObjectNull = (fragment) != (null);
        if (fragmentJavaLangObjectNull) {


            fragmentOnReviewWorkClicked = fragment.onReviewWorkClicked();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.updateRepairRequestParams.resolutionBitmap
        flag 1 (0x2L): fragment
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}