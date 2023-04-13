package com.centerpoint.connect.databinding;
import com.centerpoint.connect.R;
import com.centerpoint.connect.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemDrawerBindingImpl extends ItemDrawerBinding implements com.centerpoint.connect.generated.callback.OnClickListener.Listener {

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
    private final android.view.View.OnClickListener mCallback19;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemDrawerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemDrawerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.view.View) bindings[3]
            );
        this.ivDrawerItem.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvDrawerItem.setTag(null);
        this.viewLine.setTag(null);
        setRootTag(root);
        // listeners
        mCallback19 = new com.centerpoint.connect.generated.callback.OnClickListener(this, 1);
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
            setData((com.centerpoint.connect.models.helper.Drawer) variable);
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
    public void setData(@Nullable com.centerpoint.connect.models.helper.Drawer Data) {
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
        int dataTitle = 0;
        java.lang.Integer position = mPosition;
        boolean positionItemCountInt1 = false;
        int androidxDatabindingViewDataBindingSafeUnboxItemCount = 0;
        com.centerpoint.connect.base.listeners.BaseAdapterListener listeners = mListeners;
        java.lang.Integer itemCount = mItemCount;
        int androidxDatabindingViewDataBindingSafeUnboxPosition = 0;
        com.centerpoint.connect.models.helper.Drawer data = mData;
        int itemCountInt1 = 0;
        int dataIcon = 0;

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



                if (data != null) {
                    // read data.title
                    dataTitle = data.getTitle();
                    // read data.icon
                    dataIcon = data.getIcon();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            com.centerpoint.connect.base.ViewBindingsKt.bindImageWithResId(this.ivDrawerItem, dataIcon);
            this.tvDrawerItem.setText(dataTitle);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback19);
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
        com.centerpoint.connect.models.helper.Drawer data = mData;
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