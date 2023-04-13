package com.centerpoint.connect.databinding;
import com.centerpoint.connect.R;
import com.centerpoint.connect.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemEstimateMaterialBindingImpl extends ItemEstimateMaterialBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(16);
        sIncludes.setIncludes(0, 
            new String[] {"include_heading_value_view", "include_heading_value_view", "include_heading_value_view", "include_heading_value_view", "include_heading_value_view", "include_heading_value_view"},
            new int[] {1, 2, 3, 4, 5, 6},
            new int[] {com.centerpoint.connect.R.layout.include_heading_value_view,
                com.centerpoint.connect.R.layout.include_heading_value_view,
                com.centerpoint.connect.R.layout.include_heading_value_view,
                com.centerpoint.connect.R.layout.include_heading_value_view,
                com.centerpoint.connect.R.layout.include_heading_value_view,
                com.centerpoint.connect.R.layout.include_heading_value_view});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tvMaterialHeading, 7);
        sViewsWithIds.put(R.id.tvMaterialValue, 8);
        sViewsWithIds.put(R.id.tvLabourHeading, 9);
        sViewsWithIds.put(R.id.tvLabourValue, 10);
        sViewsWithIds.put(R.id.tvOtherHeading, 11);
        sViewsWithIds.put(R.id.tvOtherValue, 12);
        sViewsWithIds.put(R.id.viewTotal, 13);
        sViewsWithIds.put(R.id.tvTotalHeading, 14);
        sViewsWithIds.put(R.id.tvTotalValue, 15);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemEstimateMaterialBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private ItemEstimateMaterialBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) bindings[4]
            , (com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) bindings[1]
            , (com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) bindings[2]
            , (com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) bindings[6]
            , (com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) bindings[5]
            , (com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) bindings[3]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[15]
            , (android.view.View) bindings[13]
            );
        setContainedBinding(this.includeCost);
        setContainedBinding(this.includeName);
        setContainedBinding(this.includeQuantity);
        setContainedBinding(this.includeTaxable);
        setContainedBinding(this.includeTotal);
        setContainedBinding(this.includeUnits);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x200L;
        }
        includeName.invalidateAll();
        includeQuantity.invalidateAll();
        includeUnits.invalidateAll();
        includeCost.invalidateAll();
        includeTotal.invalidateAll();
        includeTaxable.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (includeName.hasPendingBindings()) {
            return true;
        }
        if (includeQuantity.hasPendingBindings()) {
            return true;
        }
        if (includeUnits.hasPendingBindings()) {
            return true;
        }
        if (includeCost.hasPendingBindings()) {
            return true;
        }
        if (includeTotal.hasPendingBindings()) {
            return true;
        }
        if (includeTaxable.hasPendingBindings()) {
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
            mDirtyFlags |= 0x40L;
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
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.itemCount);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        includeName.setLifecycleOwner(lifecycleOwner);
        includeQuantity.setLifecycleOwner(lifecycleOwner);
        includeUnits.setLifecycleOwner(lifecycleOwner);
        includeCost.setLifecycleOwner(lifecycleOwner);
        includeTotal.setLifecycleOwner(lifecycleOwner);
        includeTaxable.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeIncludeName((com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) object, fieldId);
            case 1 :
                return onChangeIncludeTaxable((com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) object, fieldId);
            case 2 :
                return onChangeIncludeQuantity((com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) object, fieldId);
            case 3 :
                return onChangeIncludeTotal((com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) object, fieldId);
            case 4 :
                return onChangeIncludeCost((com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) object, fieldId);
            case 5 :
                return onChangeIncludeUnits((com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeIncludeName(com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding IncludeName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIncludeTaxable(com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding IncludeTaxable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIncludeQuantity(com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding IncludeQuantity, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIncludeTotal(com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding IncludeTotal, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIncludeCost(com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding IncludeCost, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIncludeUnits(com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding IncludeUnits, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
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
        boolean positionItemCountInt1 = false;
        float positionItemCountInt1MboundView0AndroidDimenTicketInfoCardCornersMboundView0AndroidDimenZeroDp = 0f;
        int itemCountInt1 = 0;
        int positionInt2 = 0;
        int androidxDatabindingViewDataBindingSafeUnboxPosition = 0;
        java.lang.Integer position = mPosition;
        int androidxDatabindingViewDataBindingSafeUnboxItemCount = 0;
        boolean positionInt2Int0 = false;
        int positionInt2Int0MboundView0AndroidColorWhiteMboundView0AndroidColorBorderSilverLight = 0;
        java.lang.Integer itemCount = mItemCount;

        if ((dirtyFlags & 0x340L) != 0) {



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
            if((dirtyFlags & 0x340L) != 0) {
                if(positionInt2Int0) {
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x1000L;
                }
            }
            if((dirtyFlags & 0x340L) != 0) {
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
        // batch finished
        if ((dirtyFlags & 0x200L) != 0) {
            // api target 1

            this.includeCost.setHeading(getRoot().getResources().getString(R.string.cost));
            this.includeCost.setValue("$ 20");
            this.includeName.setHeading(getRoot().getResources().getString(R.string.name));
            this.includeName.setValue("Exwayezee");
            this.includeName.setValueColor(getColorFromResource(getRoot(), R.color.orange));
            this.includeQuantity.setHeading(getRoot().getResources().getString(R.string.quantity));
            this.includeQuantity.setValue("1");
            this.includeQuantity.setValueColor(getColorFromResource(getRoot(), R.color.colorAccent));
            this.includeTaxable.setHeading(getRoot().getResources().getString(R.string.taxable));
            this.includeTaxable.setValue("Yes");
            this.includeTotal.setHeading(getRoot().getResources().getString(R.string.total));
            this.includeTotal.setValue("$ 20");
            this.includeUnits.setHeading(getRoot().getResources().getString(R.string.units));
            this.includeUnits.setValue("Gal");
        }
        if ((dirtyFlags & 0x340L) != 0) {
            // api target 1

            com.centerpoint.connect.base.ViewBindingsKt.bindCustomBackground(this.mboundView0, positionInt2Int0MboundView0AndroidColorWhiteMboundView0AndroidColorBorderSilverLight, (java.lang.Integer)null, (java.lang.Float)null, (java.lang.Float)null, positionItemCountInt1MboundView0AndroidDimenTicketInfoCardCornersMboundView0AndroidDimenZeroDp);
        }
        executeBindingsOn(includeName);
        executeBindingsOn(includeQuantity);
        executeBindingsOn(includeUnits);
        executeBindingsOn(includeCost);
        executeBindingsOn(includeTotal);
        executeBindingsOn(includeTaxable);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): includeName
        flag 1 (0x2L): includeTaxable
        flag 2 (0x3L): includeQuantity
        flag 3 (0x4L): includeTotal
        flag 4 (0x5L): includeCost
        flag 5 (0x6L): includeUnits
        flag 6 (0x7L): position
        flag 7 (0x8L): listeners
        flag 8 (0x9L): itemCount
        flag 9 (0xaL): null
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(position) == (androidx.databinding.ViewDataBinding.safeUnbox(itemCount)) - (1) ? @android:dimen/ticket_info_card_corners : @android:dimen/zero_dp
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(position) == (androidx.databinding.ViewDataBinding.safeUnbox(itemCount)) - (1) ? @android:dimen/ticket_info_card_corners : @android:dimen/zero_dp
        flag 12 (0xdL): (androidx.databinding.ViewDataBinding.safeUnbox(position)) % (2) == 0 ? @android:color/white : @android:color/border_silver_light
        flag 13 (0xeL): (androidx.databinding.ViewDataBinding.safeUnbox(position)) % (2) == 0 ? @android:color/white : @android:color/border_silver_light
    flag mapping end*/
    //end
}