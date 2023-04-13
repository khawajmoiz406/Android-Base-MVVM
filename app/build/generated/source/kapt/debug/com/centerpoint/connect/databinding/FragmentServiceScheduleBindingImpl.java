package com.centerpoint.connect.databinding;
import com.centerpoint.connect.R;
import com.centerpoint.connect.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentServiceScheduleBindingImpl extends FragmentServiceScheduleBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rlFilter, 3);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.appcompat.widget.AppCompatEditText mboundView1;
    @NonNull
    private final androidx.recyclerview.widget.RecyclerView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentServiceScheduleBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentServiceScheduleBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.RelativeLayout) bindings[3]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(this.mboundView0.getResources().getString(com.centerpoint.connect.R.string.service_schedule));
        this.mboundView1 = (androidx.appcompat.widget.AppCompatEditText) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (androidx.recyclerview.widget.RecyclerView) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
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
            setFragment((com.centerpoint.connect.ui.global.service_schedule.ServicesFragment) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFragment(@Nullable com.centerpoint.connect.ui.global.service_schedule.ServicesFragment Fragment) {
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
        com.centerpoint.connect.ui.global.service_schedule.adapter.ServicesAdapter fragmentAdapter = null;
        com.centerpoint.connect.ui.global.service_schedule.ServicesFragment fragment = mFragment;

        if ((dirtyFlags & 0x3L) != 0) {



                if (fragment != null) {
                    // read fragment.adapter
                    fragmentAdapter = fragment.getAdapter();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            com.centerpoint.connect.base.ViewBindingsKt.bindCustomBackground(this.mboundView1, getColorFromResource(mboundView1, R.color.colorPrimaryDark), getColorFromResource(mboundView1, R.color.card_grey), mboundView1.getResources().getDimension(R.dimen._1sdp), mboundView1.getResources().getDimension(R.dimen._20sdp), mboundView1.getResources().getDimension(R.dimen._20sdp));
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.centerpoint.connect.base.ViewBindingsKt.bindRecyclerViewAdapter(this.mboundView2, fragmentAdapter);
            com.centerpoint.connect.base.ViewBindingsKt.bindPagination(this.mboundView2, fragment);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): fragment
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}