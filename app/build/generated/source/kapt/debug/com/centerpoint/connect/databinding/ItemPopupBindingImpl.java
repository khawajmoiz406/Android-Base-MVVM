package com.centerpoint.connect.databinding;
import com.centerpoint.connect.R;
import com.centerpoint.connect.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemPopupBindingImpl extends ItemPopupBinding implements com.centerpoint.connect.generated.callback.OnClickListener.Listener {

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
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemPopupBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ItemPopupBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[1]
            , (android.view.View) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvDrawerItem.setTag(null);
        this.viewLine.setTag(null);
        setRootTag(root);
        // listeners
        mCallback7 = new com.centerpoint.connect.generated.callback.OnClickListener(this, 1);
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
        if (BR.position == variableId) {
            setPosition((java.lang.Integer) variable);
        }
        else if (BR.listeners == variableId) {
            setListeners((com.centerpoint.connect.base.listeners.BaseAdapterListener) variable);
        }
        else if (BR.itemCount == variableId) {
            setItemCount((java.lang.Integer) variable);
        }
        else if (BR.data == variableId) {
            setData((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPosition(@Nullable java.lang.Integer Position) {
        this.mPosition = Position;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.position);
        super.requestRebind();
    }
    public void setListeners(@Nullable com.centerpoint.connect.base.listeners.BaseAdapterListener Listeners) {
        this.mListeners = Listeners;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.listeners);
        super.requestRebind();
    }
    public void setItemCount(@Nullable java.lang.Integer ItemCount) {
        this.mItemCount = ItemCount;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.itemCount);
        super.requestRebind();
    }
    public void setData(@Nullable java.lang.String Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.data);
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
        java.lang.Integer position = mPosition;
        boolean positionItemCountInt1 = false;
        int androidxDatabindingViewDataBindingSafeUnboxItemCount = 0;
        com.centerpoint.connect.base.listeners.BaseAdapterListener listeners = mListeners;
        java.lang.Integer itemCount = mItemCount;
        int androidxDatabindingViewDataBindingSafeUnboxPosition = 0;
        java.lang.String data = mData;
        int itemCountInt1 = 0;

        if ((dirtyFlags & 0x15L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(position)
                androidxDatabindingViewDataBindingSafeUnboxPosition = androidx.databinding.ViewDataBinding.safeUnbox(position);
                // read androidx.databinding.ViewDataBinding.safeUnbox(itemCount)
                androidxDatabindingViewDataBindingSafeUnboxItemCount = androidx.databinding.ViewDataBinding.safeUnbox(itemCount);


                // read (androidx.databinding.ViewDataBinding.safeUnbox(itemCount)) - (1)
                itemCountInt1 = (androidxDatabindingViewDataBindingSafeUnboxItemCount) - (1);


                // read androidx.databinding.ViewDataBinding.safeUnbox(position) != (androidx.databinding.ViewDataBinding.safeUnbox(itemCount)) - (1)
                positionItemCountInt1 = (androidxDatabindingViewDataBindingSafeUnboxPosition) != (itemCountInt1);
        }
        if ((dirtyFlags & 0x18L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback7);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDrawerItem, data);
        }
        if ((dirtyFlags & 0x15L) != 0) {
            // api target 1

            com.centerpoint.connect.base.ViewBindingsKt.bindVisibility(this.viewLine, positionItemCountInt1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // listeners != null
        boolean listenersJavaLangObjectNull = false;
        // position
        java.lang.Integer position = mPosition;
        // data
        java.lang.String data = mData;
        // listeners
        com.centerpoint.connect.base.listeners.BaseAdapterListener listeners = mListeners;



        listenersJavaLangObjectNull = (listeners) != (null);
        if (listenersJavaLangObjectNull) {




            listeners.onItemClick(position, data);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): position
        flag 1 (0x2L): listeners
        flag 2 (0x3L): itemCount
        flag 3 (0x4L): data
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}