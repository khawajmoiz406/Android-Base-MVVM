package com.centerpoint.connect.databinding;
import com.centerpoint.connect.R;
import com.centerpoint.connect.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentRepairsBindingImpl extends FragmentRepairsBinding implements com.centerpoint.connect.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tvHeading, 4);
        sViewsWithIds.put(R.id.btnSiteBid, 5);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final androidx.recyclerview.widget.RecyclerView mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback31;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentRepairsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentRepairsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.button.MaterialButton) bindings[3]
            , (com.google.android.material.button.MaterialButton) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (android.widget.TextView) bindings[4]
            );
        this.btnAddRepair.setTag(null);
        this.cvCard.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (androidx.recyclerview.widget.RecyclerView) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
        mCallback31 = new com.centerpoint.connect.generated.callback.OnClickListener(this, 1);
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
            setFragment((com.centerpoint.connect.ui.global.service_info.repairs.RepairsFragment) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFragment(@Nullable com.centerpoint.connect.ui.global.service_info.repairs.RepairsFragment Fragment) {
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
        com.centerpoint.connect.ui.global.service_info.repairs.adapter.RepairsAdapter fragmentAdapter = null;
        com.centerpoint.connect.ui.global.service_info.repairs.RepairsFragment fragment = mFragment;

        if ((dirtyFlags & 0x3L) != 0) {



                if (fragment != null) {
                    // read fragment.adapter
                    fragmentAdapter = fragment.getAdapter();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.btnAddRepair.setOnClickListener(mCallback31);
            com.centerpoint.connect.base.ViewBindingsKt.bindCustomBackground(this.cvCard, getColorFromResource(cvCard, R.color.white), (java.lang.Integer)null, (java.lang.Float)null, cvCard.getResources().getDimension(R.dimen.ticket_info_card_corners), cvCard.getResources().getDimension(R.dimen.ticket_info_card_corners));
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.centerpoint.connect.base.ViewBindingsKt.bindRecyclerViewAdapter(this.mboundView2, fragmentAdapter);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // fragment
        com.centerpoint.connect.ui.global.service_info.repairs.RepairsFragment fragment = mFragment;
        // fragment.onAddRepairClicked()
        com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailFragment fragmentOnAddRepairClicked = null;
        // fragment != null
        boolean fragmentJavaLangObjectNull = false;



        fragmentJavaLangObjectNull = (fragment) != (null);
        if (fragmentJavaLangObjectNull) {


            fragmentOnAddRepairClicked = fragment.onAddRepairClicked();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): fragment
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}