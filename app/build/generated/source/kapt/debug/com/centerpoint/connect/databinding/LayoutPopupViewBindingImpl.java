package com.centerpoint.connect.databinding;
import com.centerpoint.connect.R;
import com.centerpoint.connect.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutPopupViewBindingImpl extends LayoutPopupViewBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.recyclerview.widget.RecyclerView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutPopupViewBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 1, sIncludes, sViewsWithIds));
    }
    private LayoutPopupViewBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            );
        this.mboundView0 = (androidx.recyclerview.widget.RecyclerView) bindings[0];
        this.mboundView0.setTag(null);
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
        if (BR.adapter == variableId) {
            setAdapter((com.centerpoint.connect.classes.drop_down_spinner.adapter.PopupAdapter) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAdapter(@Nullable com.centerpoint.connect.classes.drop_down_spinner.adapter.PopupAdapter Adapter) {
        this.mAdapter = Adapter;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.adapter);
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
        com.centerpoint.connect.classes.drop_down_spinner.adapter.PopupAdapter adapter = mAdapter;

        if ((dirtyFlags & 0x3L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.centerpoint.connect.base.ViewBindingsKt.bindRecyclerViewAdapter(this.mboundView0, adapter);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            com.centerpoint.connect.base.ViewBindingsKt.bindCustomBackground(this.mboundView0, getColorFromResource(mboundView0, R.color.white), getColorFromResource(mboundView0, R.color.border_silver), mboundView0.getResources().getDimension(R.dimen._1sdp), (java.lang.Float)null, mboundView0.getResources().getDimension(R.dimen._20sdp));
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): adapter
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}