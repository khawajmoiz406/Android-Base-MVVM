package com.centerpoint.connect.databinding;
import com.centerpoint.connect.R;
import com.centerpoint.connect.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemTimeKeepingBindingImpl extends ItemTimeKeepingBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(7);
        sIncludes.setIncludes(0, 
            new String[] {"include_heading_value_view", "include_heading_value_view", "include_heading_value_view", "include_heading_value_view", "include_heading_value_view", "include_heading_value_view"},
            new int[] {1, 2, 3, 4, 5, 6},
            new int[] {com.centerpoint.connect.R.layout.include_heading_value_view,
                com.centerpoint.connect.R.layout.include_heading_value_view,
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

    public ItemTimeKeepingBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ItemTimeKeepingBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) bindings[1]
            , (com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) bindings[2]
            , (com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) bindings[6]
            , (com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) bindings[3]
            , (com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) bindings[4]
            , (com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) bindings[5]
            );
        setContainedBinding(this.includeDate);
        setContainedBinding(this.includeEmployee);
        setContainedBinding(this.includeHours);
        setContainedBinding(this.includeTask);
        setContainedBinding(this.includeTimeIn);
        setContainedBinding(this.includeTimeOut);
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
        includeDate.invalidateAll();
        includeEmployee.invalidateAll();
        includeTask.invalidateAll();
        includeTimeIn.invalidateAll();
        includeTimeOut.invalidateAll();
        includeHours.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (includeDate.hasPendingBindings()) {
            return true;
        }
        if (includeEmployee.hasPendingBindings()) {
            return true;
        }
        if (includeTask.hasPendingBindings()) {
            return true;
        }
        if (includeTimeIn.hasPendingBindings()) {
            return true;
        }
        if (includeTimeOut.hasPendingBindings()) {
            return true;
        }
        if (includeHours.hasPendingBindings()) {
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
        includeDate.setLifecycleOwner(lifecycleOwner);
        includeEmployee.setLifecycleOwner(lifecycleOwner);
        includeTask.setLifecycleOwner(lifecycleOwner);
        includeTimeIn.setLifecycleOwner(lifecycleOwner);
        includeTimeOut.setLifecycleOwner(lifecycleOwner);
        includeHours.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeIncludeHours((com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) object, fieldId);
            case 1 :
                return onChangeIncludeTimeOut((com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) object, fieldId);
            case 2 :
                return onChangeIncludeTask((com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) object, fieldId);
            case 3 :
                return onChangeIncludeTimeIn((com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) object, fieldId);
            case 4 :
                return onChangeIncludeEmployee((com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) object, fieldId);
            case 5 :
                return onChangeIncludeDate((com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeIncludeHours(com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding IncludeHours, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIncludeTimeOut(com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding IncludeTimeOut, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIncludeTask(com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding IncludeTask, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIncludeTimeIn(com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding IncludeTimeIn, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIncludeEmployee(com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding IncludeEmployee, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIncludeDate(com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding IncludeDate, int fieldId) {
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

            this.includeDate.setHeading(getRoot().getResources().getString(R.string.date));
            this.includeDate.setValue("10/11/22");
            this.includeDate.setValueColor(getColorFromResource(getRoot(), R.color.orange));
            this.includeEmployee.setHeading(getRoot().getResources().getString(R.string.employee));
            this.includeEmployee.setValue("Service Technician");
            this.includeEmployee.setValueColor(getColorFromResource(getRoot(), R.color.colorAccent));
            this.includeHours.setHeading(getRoot().getResources().getString(R.string.hours));
            this.includeHours.setHideLine(true);
            this.includeHours.setValue("9");
            this.includeTask.setHeading(getRoot().getResources().getString(R.string.task));
            this.includeTask.setValue("Travel");
            this.includeTimeIn.setHeading(getRoot().getResources().getString(R.string.time_in));
            this.includeTimeIn.setValue("11:59am");
            this.includeTimeOut.setHeading(getRoot().getResources().getString(R.string.time_out));
            this.includeTimeOut.setValue("08:59pm");
        }
        if ((dirtyFlags & 0x340L) != 0) {
            // api target 1

            com.centerpoint.connect.base.ViewBindingsKt.bindCustomBackground(this.mboundView0, positionInt2Int0MboundView0AndroidColorWhiteMboundView0AndroidColorBorderSilverLight, (java.lang.Integer)null, (java.lang.Float)null, (java.lang.Float)null, positionItemCountInt1MboundView0AndroidDimenTicketInfoCardCornersMboundView0AndroidDimenZeroDp);
        }
        executeBindingsOn(includeDate);
        executeBindingsOn(includeEmployee);
        executeBindingsOn(includeTask);
        executeBindingsOn(includeTimeIn);
        executeBindingsOn(includeTimeOut);
        executeBindingsOn(includeHours);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): includeHours
        flag 1 (0x2L): includeTimeOut
        flag 2 (0x3L): includeTask
        flag 3 (0x4L): includeTimeIn
        flag 4 (0x5L): includeEmployee
        flag 5 (0x6L): includeDate
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