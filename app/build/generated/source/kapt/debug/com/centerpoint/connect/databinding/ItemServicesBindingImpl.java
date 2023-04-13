package com.centerpoint.connect.databinding;
import com.centerpoint.connect.R;
import com.centerpoint.connect.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemServicesBindingImpl extends ItemServicesBinding implements com.centerpoint.connect.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tvEtaHeading, 2);
        sViewsWithIds.put(R.id.tvEtaTime, 3);
        sViewsWithIds.put(R.id.tvEtaDate, 4);
        sViewsWithIds.put(R.id.tvStageHeading, 5);
        sViewsWithIds.put(R.id.tvStage, 6);
        sViewsWithIds.put(R.id.viewLine, 7);
        sViewsWithIds.put(R.id.ivLocation, 8);
        sViewsWithIds.put(R.id.tvRegion, 9);
        sViewsWithIds.put(R.id.tvAddress, 10);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback30;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemServicesBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private ItemServicesBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatImageView) bindings[8]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[5]
            , (android.view.View) bindings[7]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        setRootTag(root);
        // listeners
        mCallback30 = new com.centerpoint.connect.generated.callback.OnClickListener(this, 1);
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
            setData((com.centerpoint.connect.models.response.services.Service) variable);
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
    }
    public void setData(@Nullable com.centerpoint.connect.models.response.services.Service Data) {
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
        com.centerpoint.connect.base.listeners.BaseAdapterListener listeners = mListeners;
        com.centerpoint.connect.models.response.services.Service data = mData;
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback30);
            com.centerpoint.connect.base.ViewBindingsKt.bindCustomBackground(this.mboundView0, getColorFromResource(mboundView0, R.color.white), (java.lang.Integer)null, (java.lang.Float)null, mboundView0.getResources().getDimension(R.dimen._18sdp), mboundView0.getResources().getDimension(R.dimen._18sdp));
            com.centerpoint.connect.base.ViewBindingsKt.bindCustomBackground(this.mboundView1, getColorFromResource(mboundView1, R.color.colorAccent), (java.lang.Integer)null, (java.lang.Float)null, mboundView1.getResources().getDimension(R.dimen._20sdp), mboundView1.getResources().getDimension(R.dimen._20sdp));
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
        com.centerpoint.connect.models.response.services.Service data = mData;
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