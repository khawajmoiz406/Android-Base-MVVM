package com.centerpoint.connect.databinding;
import com.centerpoint.connect.R;
import com.centerpoint.connect.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemServiceRepairsBindingImpl extends ItemServiceRepairsBinding  {

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
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemServiceRepairsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ItemServiceRepairsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) bindings[4]
            , (com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) bindings[3]
            , (com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) bindings[1]
            , (com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) bindings[5]
            , (com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) bindings[2]
            );
        setContainedBinding(this.includeProblem);
        setContainedBinding(this.includeQuantity);
        setContainedBinding(this.includeRepairs);
        setContainedBinding(this.includeResolution);
        setContainedBinding(this.includeSection);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100L;
        }
        includeRepairs.invalidateAll();
        includeSection.invalidateAll();
        includeQuantity.invalidateAll();
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
        if (includeRepairs.hasPendingBindings()) {
            return true;
        }
        if (includeSection.hasPendingBindings()) {
            return true;
        }
        if (includeQuantity.hasPendingBindings()) {
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
    }
    public void setItemCount(@Nullable java.lang.Integer ItemCount) {
        this.mItemCount = ItemCount;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.itemCount);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        includeRepairs.setLifecycleOwner(lifecycleOwner);
        includeSection.setLifecycleOwner(lifecycleOwner);
        includeQuantity.setLifecycleOwner(lifecycleOwner);
        includeProblem.setLifecycleOwner(lifecycleOwner);
        includeResolution.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeIncludeQuantity((com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) object, fieldId);
            case 1 :
                return onChangeIncludeResolution((com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) object, fieldId);
            case 2 :
                return onChangeIncludeSection((com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) object, fieldId);
            case 3 :
                return onChangeIncludeRepairs((com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) object, fieldId);
            case 4 :
                return onChangeIncludeProblem((com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeIncludeQuantity(com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding IncludeQuantity, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIncludeResolution(com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding IncludeResolution, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIncludeSection(com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding IncludeSection, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIncludeRepairs(com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding IncludeRepairs, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIncludeProblem(com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding IncludeProblem, int fieldId) {
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
        boolean positionInt2Int0 = false;
        boolean positionItemCountInt1 = false;
        float positionItemCountInt1MboundView0AndroidDimenTicketInfoCardCornersMboundView0AndroidDimenZeroDp = 0f;
        int itemCountInt1 = 0;
        int positionInt2Int0MboundView0AndroidColorWhiteMboundView0AndroidColorBorderSilverLight = 0;
        int positionInt2 = 0;
        java.lang.Integer itemCount = mItemCount;
        int androidxDatabindingViewDataBindingSafeUnboxPosition = 0;

        if ((dirtyFlags & 0x1a0L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(position)
                androidxDatabindingViewDataBindingSafeUnboxPosition = androidx.databinding.ViewDataBinding.safeUnbox(position);
                // read androidx.databinding.ViewDataBinding.safeUnbox(itemCount)
                androidxDatabindingViewDataBindingSafeUnboxItemCount = androidx.databinding.ViewDataBinding.safeUnbox(itemCount);


                // read (androidx.databinding.ViewDataBinding.safeUnbox(position)) % (2)
                positionInt2 = (androidxDatabindingViewDataBindingSafeUnboxPosition) % (2);
                // read (androidx.databinding.ViewDataBinding.safeUnbox(itemCount)) - (1)
                itemCountInt1 = (androidxDatabindingViewDataBindingSafeUnboxItemCount) - (1);


                // read (androidx.databinding.ViewDataBinding.safeUnbox(position)) % (2) == 0
                positionInt2Int0 = (positionInt2) == (0);
                // read androidx.databinding.ViewDataBinding.safeUnbox(position) == (androidx.databinding.ViewDataBinding.safeUnbox(itemCount)) - (1)
                positionItemCountInt1 = (androidxDatabindingViewDataBindingSafeUnboxPosition) == (itemCountInt1);
            if((dirtyFlags & 0x1a0L) != 0) {
                if(positionInt2Int0) {
                        dirtyFlags |= 0x1000L;
                }
                else {
                        dirtyFlags |= 0x800L;
                }
            }
            if((dirtyFlags & 0x1a0L) != 0) {
                if(positionItemCountInt1) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }


                // read (androidx.databinding.ViewDataBinding.safeUnbox(position)) % (2) == 0 ? @android:color/white : @android:color/border_silver_light
                positionInt2Int0MboundView0AndroidColorWhiteMboundView0AndroidColorBorderSilverLight = ((positionInt2Int0) ? (getColorFromResource(mboundView0, R.color.white)) : (getColorFromResource(mboundView0, R.color.border_silver_light)));
                // read androidx.databinding.ViewDataBinding.safeUnbox(position) == (androidx.databinding.ViewDataBinding.safeUnbox(itemCount)) - (1) ? @android:dimen/ticket_info_card_corners : @android:dimen/zero_dp
                positionItemCountInt1MboundView0AndroidDimenTicketInfoCardCornersMboundView0AndroidDimenZeroDp = ((positionItemCountInt1) ? (mboundView0.getResources().getDimension(R.dimen.ticket_info_card_corners)) : (mboundView0.getResources().getDimension(R.dimen.zero_dp)));
        }
        // batch finished
        if ((dirtyFlags & 0x100L) != 0) {
            // api target 1

            this.includeProblem.setHeading(getRoot().getResources().getString(R.string.problem));
            this.includeProblem.setValue("1 EA");
            this.includeQuantity.setHeading(getRoot().getResources().getString(R.string.quantity));
            this.includeQuantity.setValue("4 EA");
            this.includeRepairs.setHeading(getRoot().getResources().getString(R.string.repair));
            this.includeRepairs.setValue("Curb - Flashing Failure");
            this.includeRepairs.setValueColor(getColorFromResource(getRoot(), R.color.orange));
            this.includeResolution.setHeading(getRoot().getResources().getString(R.string.resolution));
            this.includeResolution.setHideLine(true);
            this.includeResolution.setValue("0 Photo");
            this.includeSection.setHeading(getRoot().getResources().getString(R.string.section));
            this.includeSection.setValue("A/C Duct Leak");
            this.includeSection.setValueColor(getColorFromResource(getRoot(), R.color.colorAccent));
        }
        if ((dirtyFlags & 0x1a0L) != 0) {
            // api target 1

            com.centerpoint.connect.base.ViewBindingsKt.bindCustomBackground(this.mboundView0, positionInt2Int0MboundView0AndroidColorWhiteMboundView0AndroidColorBorderSilverLight, (java.lang.Integer)null, (java.lang.Float)null, (java.lang.Float)null, positionItemCountInt1MboundView0AndroidDimenTicketInfoCardCornersMboundView0AndroidDimenZeroDp);
        }
        executeBindingsOn(includeRepairs);
        executeBindingsOn(includeSection);
        executeBindingsOn(includeQuantity);
        executeBindingsOn(includeProblem);
        executeBindingsOn(includeResolution);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): includeQuantity
        flag 1 (0x2L): includeResolution
        flag 2 (0x3L): includeSection
        flag 3 (0x4L): includeRepairs
        flag 4 (0x5L): includeProblem
        flag 5 (0x6L): position
        flag 6 (0x7L): listeners
        flag 7 (0x8L): itemCount
        flag 8 (0x9L): null
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(position) == (androidx.databinding.ViewDataBinding.safeUnbox(itemCount)) - (1) ? @android:dimen/ticket_info_card_corners : @android:dimen/zero_dp
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(position) == (androidx.databinding.ViewDataBinding.safeUnbox(itemCount)) - (1) ? @android:dimen/ticket_info_card_corners : @android:dimen/zero_dp
        flag 11 (0xcL): (androidx.databinding.ViewDataBinding.safeUnbox(position)) % (2) == 0 ? @android:color/white : @android:color/border_silver_light
        flag 12 (0xdL): (androidx.databinding.ViewDataBinding.safeUnbox(position)) % (2) == 0 ? @android:color/white : @android:color/border_silver_light
    flag mapping end*/
    //end
}