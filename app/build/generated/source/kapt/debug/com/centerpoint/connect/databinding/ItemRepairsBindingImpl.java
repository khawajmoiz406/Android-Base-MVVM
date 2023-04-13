package com.centerpoint.connect.databinding;
import com.centerpoint.connect.R;
import com.centerpoint.connect.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemRepairsBindingImpl extends ItemRepairsBinding implements com.centerpoint.connect.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(6);
        sIncludes.setIncludes(0, 
            new String[] {"include_heading_value_view", "include_heading_value_view", "include_heading_value_view", "include_heading_value_view", "include_heading_value_view"},
            new int[] {1, 2, 3, 4, 5},
            new int[] {com.centerpoint.connect.R.layout.include_heading_value_view,
                com.centerpoint.connect.R.layout.include_heading_value_view,
                com.centerpoint.connect.R.layout.include_heading_value_view,
                com.centerpoint.connect.R.layout.include_heading_value_view,
                com.centerpoint.connect.R.layout.include_heading_value_view});
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback18;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemRepairsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ItemRepairsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) bindings[1]
            , (com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) bindings[4]
            , (com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) bindings[2]
            , (com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) bindings[5]
            , (com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) bindings[3]
            );
        setContainedBinding(this.includeNo);
        setContainedBinding(this.includeProblem);
        setContainedBinding(this.includeRepairs);
        setContainedBinding(this.includeResolution);
        setContainedBinding(this.includeSection);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback18 = new com.centerpoint.connect.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x200L;
        }
        includeNo.invalidateAll();
        includeRepairs.invalidateAll();
        includeSection.invalidateAll();
        includeProblem.invalidateAll();
        includeResolution.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (includeNo.hasPendingBindings()) {
            return true;
        }
        if (includeRepairs.hasPendingBindings()) {
            return true;
        }
        if (includeSection.hasPendingBindings()) {
            return true;
        }
        if (includeProblem.hasPendingBindings()) {
            return true;
        }
        if (includeResolution.hasPendingBindings()) {
            return true;
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
        else if (BR.data == variableId) {
            setData((com.centerpoint.connect.models.response.repair.Repair) variable);
        }
        else if (BR.itemCount == variableId) {
            setItemCount((java.lang.Integer) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPosition(@Nullable java.lang.Integer Position) {
        this.mPosition = Position;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.position);
        super.requestRebind();
    }
    public void setListeners(@Nullable com.centerpoint.connect.base.listeners.BaseAdapterListener Listeners) {
        this.mListeners = Listeners;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.listeners);
        super.requestRebind();
    }
    public void setData(@Nullable com.centerpoint.connect.models.response.repair.Repair Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.data);
        super.requestRebind();
    }
    public void setItemCount(@Nullable java.lang.Integer ItemCount) {
        this.mItemCount = ItemCount;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.itemCount);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        includeNo.setLifecycleOwner(lifecycleOwner);
        includeRepairs.setLifecycleOwner(lifecycleOwner);
        includeSection.setLifecycleOwner(lifecycleOwner);
        includeProblem.setLifecycleOwner(lifecycleOwner);
        includeResolution.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeIncludeResolution((com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) object, fieldId);
            case 1 :
                return onChangeIncludeSection((com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) object, fieldId);
            case 2 :
                return onChangeIncludeRepairs((com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) object, fieldId);
            case 3 :
                return onChangeIncludeProblem((com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) object, fieldId);
            case 4 :
                return onChangeIncludeNo((com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeIncludeResolution(com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding IncludeResolution, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIncludeSection(com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding IncludeSection, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIncludeRepairs(com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding IncludeRepairs, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIncludeProblem(com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding IncludeProblem, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIncludeNo(com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding IncludeNo, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
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
        java.lang.Integer position = mPosition;
        int androidxDatabindingViewDataBindingSafeUnboxItemCount = 0;
        com.centerpoint.connect.base.listeners.BaseAdapterListener listeners = mListeners;
        boolean positionInt2Int0 = false;
        java.lang.String dataQuantity = null;
        boolean positionItemCountInt1 = false;
        float positionItemCountInt1MboundView0AndroidDimenTicketInfoCardCornersMboundView0AndroidDimenZeroDp = 0f;
        com.centerpoint.connect.models.response.repair.Repair data = mData;
        int itemCountInt1 = 0;
        int positionInt2Int0MboundView0AndroidColorWhiteMboundView0AndroidColorBorderSilverLight = 0;
        int positionInt1 = 0;
        int positionInt2 = 0;
        java.lang.String stringValueOfPositionInt1 = null;
        java.lang.Integer itemCount = mItemCount;
        java.lang.String dataManagerName = null;
        int androidxDatabindingViewDataBindingSafeUnboxPosition = 0;

        if ((dirtyFlags & 0x320L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(position)
                androidxDatabindingViewDataBindingSafeUnboxPosition = androidx.databinding.ViewDataBinding.safeUnbox(position);
                // read androidx.databinding.ViewDataBinding.safeUnbox(itemCount)
                androidxDatabindingViewDataBindingSafeUnboxItemCount = androidx.databinding.ViewDataBinding.safeUnbox(itemCount);

            if ((dirtyFlags & 0x220L) != 0) {

                    // read (androidx.databinding.ViewDataBinding.safeUnbox(position)) + (1)
                    positionInt1 = (androidxDatabindingViewDataBindingSafeUnboxPosition) + (1);


                    // read String.valueOf((androidx.databinding.ViewDataBinding.safeUnbox(position)) + (1))
                    stringValueOfPositionInt1 = java.lang.String.valueOf(positionInt1);
            }

                // read (androidx.databinding.ViewDataBinding.safeUnbox(position)) % (2)
                positionInt2 = (androidxDatabindingViewDataBindingSafeUnboxPosition) % (2);
                // read (androidx.databinding.ViewDataBinding.safeUnbox(itemCount)) - (1)
                itemCountInt1 = (androidxDatabindingViewDataBindingSafeUnboxItemCount) - (1);


                // read (androidx.databinding.ViewDataBinding.safeUnbox(position)) % (2) == 0
                positionInt2Int0 = (positionInt2) == (0);
                // read androidx.databinding.ViewDataBinding.safeUnbox(position) == (androidx.databinding.ViewDataBinding.safeUnbox(itemCount)) - (1)
                positionItemCountInt1 = (androidxDatabindingViewDataBindingSafeUnboxPosition) == (itemCountInt1);
            if((dirtyFlags & 0x320L) != 0) {
                if(positionInt2Int0) {
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x1000L;
                }
            }
            if((dirtyFlags & 0x320L) != 0) {
                if(positionItemCountInt1) {
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x400L;
                }
            }


                // read (androidx.databinding.ViewDataBinding.safeUnbox(position)) % (2) == 0 ? @android:color/white : @android:color/border_silver_light
                positionInt2Int0MboundView0AndroidColorWhiteMboundView0AndroidColorBorderSilverLight = ((positionInt2Int0) ? (getColorFromResource(mboundView0, R.color.white)) : (getColorFromResource(mboundView0, R.color.border_silver_light)));
                // read androidx.databinding.ViewDataBinding.safeUnbox(position) == (androidx.databinding.ViewDataBinding.safeUnbox(itemCount)) - (1) ? @android:dimen/ticket_info_card_corners : @android:dimen/zero_dp
                positionItemCountInt1MboundView0AndroidDimenTicketInfoCardCornersMboundView0AndroidDimenZeroDp = ((positionItemCountInt1) ? (mboundView0.getResources().getDimension(R.dimen.ticket_info_card_corners)) : (mboundView0.getResources().getDimension(R.dimen.zero_dp)));
        }
        if ((dirtyFlags & 0x280L) != 0) {



                if (data != null) {
                    // read data.quantity
                    dataQuantity = data.getQuantity();
                    // read data.managerName
                    dataManagerName = data.getManagerName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x200L) != 0) {
            // api target 1

            this.includeNo.setHeading("#");
            this.includeProblem.setHeading(getRoot().getResources().getString(R.string.problem));
            this.includeProblem.setValue("Photos (1)");
            this.includeRepairs.setHeading(getRoot().getResources().getString(R.string.repair));
            this.includeRepairs.setValueColor(getColorFromResource(getRoot(), R.color.orange));
            this.includeResolution.setHeading(getRoot().getResources().getString(R.string.resolution));
            this.includeResolution.setHideLine(true);
            this.includeResolution.setValue("Photos (0)");
            this.includeSection.setHeading(getRoot().getResources().getString(R.string.section));
            this.includeSection.setValueColor(getColorFromResource(getRoot(), R.color.colorAccent));
            this.mboundView0.setOnClickListener(mCallback18);
        }
        if ((dirtyFlags & 0x220L) != 0) {
            // api target 1

            this.includeNo.setValue(stringValueOfPositionInt1);
        }
        if ((dirtyFlags & 0x280L) != 0) {
            // api target 1

            this.includeRepairs.setValue(dataManagerName);
            this.includeSection.setValue(dataQuantity);
        }
        if ((dirtyFlags & 0x320L) != 0) {
            // api target 1

            com.centerpoint.connect.base.ViewBindingsKt.bindCustomBackground(this.mboundView0, positionInt2Int0MboundView0AndroidColorWhiteMboundView0AndroidColorBorderSilverLight, (java.lang.Integer)null, (java.lang.Float)null, (java.lang.Float)null, positionItemCountInt1MboundView0AndroidDimenTicketInfoCardCornersMboundView0AndroidDimenZeroDp);
        }
        executeBindingsOn(includeNo);
        executeBindingsOn(includeRepairs);
        executeBindingsOn(includeSection);
        executeBindingsOn(includeProblem);
        executeBindingsOn(includeResolution);
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
        com.centerpoint.connect.models.response.repair.Repair data = mData;
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
        flag 0 (0x1L): includeResolution
        flag 1 (0x2L): includeSection
        flag 2 (0x3L): includeRepairs
        flag 3 (0x4L): includeProblem
        flag 4 (0x5L): includeNo
        flag 5 (0x6L): position
        flag 6 (0x7L): listeners
        flag 7 (0x8L): data
        flag 8 (0x9L): itemCount
        flag 9 (0xaL): null
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(position) == (androidx.databinding.ViewDataBinding.safeUnbox(itemCount)) - (1) ? @android:dimen/ticket_info_card_corners : @android:dimen/zero_dp
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(position) == (androidx.databinding.ViewDataBinding.safeUnbox(itemCount)) - (1) ? @android:dimen/ticket_info_card_corners : @android:dimen/zero_dp
        flag 12 (0xdL): (androidx.databinding.ViewDataBinding.safeUnbox(position)) % (2) == 0 ? @android:color/white : @android:color/border_silver_light
        flag 13 (0xeL): (androidx.databinding.ViewDataBinding.safeUnbox(position)) % (2) == 0 ? @android:color/white : @android:color/border_silver_light
    flag mapping end*/
    //end
}