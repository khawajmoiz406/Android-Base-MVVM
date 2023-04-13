package com.centerpoint.connect.databinding;
import com.centerpoint.connect.R;
import com.centerpoint.connect.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class IncludeTicketInfoContentBindingImpl extends IncludeTicketInfoContentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(40);
        sIncludes.setIncludes(1, 
            new String[] {"include_ticket_informatino_card", "include_number_text", "include_number_text", "include_number_text", "include_number_text", "include_number_text", "include_number_text"},
            new int[] {7, 8, 9, 10, 11, 12, 22},
            new int[] {com.centerpoint.connect.R.layout.include_ticket_informatino_card,
                com.centerpoint.connect.R.layout.include_number_text,
                com.centerpoint.connect.R.layout.include_number_text,
                com.centerpoint.connect.R.layout.include_number_text,
                com.centerpoint.connect.R.layout.include_number_text,
                com.centerpoint.connect.R.layout.include_number_text,
                com.centerpoint.connect.R.layout.include_number_text});
        sIncludes.setIncludes(5, 
            new String[] {"include_heading_value_view", "include_heading_value_view", "include_heading_value_view", "include_heading_value_view", "include_heading_value_view", "include_heading_value_view", "include_heading_value_view", "include_heading_value_view", "include_heading_value_view"},
            new int[] {13, 14, 15, 16, 17, 18, 19, 20, 21},
            new int[] {com.centerpoint.connect.R.layout.include_heading_value_view,
                com.centerpoint.connect.R.layout.include_heading_value_view,
                com.centerpoint.connect.R.layout.include_heading_value_view,
                com.centerpoint.connect.R.layout.include_heading_value_view,
                com.centerpoint.connect.R.layout.include_heading_value_view,
                com.centerpoint.connect.R.layout.include_heading_value_view,
                com.centerpoint.connect.R.layout.include_heading_value_view,
                com.centerpoint.connect.R.layout.include_heading_value_view,
                com.centerpoint.connect.R.layout.include_heading_value_view});
        sIncludes.setIncludes(6, 
            new String[] {"include_heading_value_view", "include_heading_value_view", "include_heading_value_view", "include_heading_value_view", "include_heading_value_view", "include_heading_value_view"},
            new int[] {23, 24, 25, 26, 27, 28},
            new int[] {com.centerpoint.connect.R.layout.include_heading_value_view,
                com.centerpoint.connect.R.layout.include_heading_value_view,
                com.centerpoint.connect.R.layout.include_heading_value_view,
                com.centerpoint.connect.R.layout.include_heading_value_view,
                com.centerpoint.connect.R.layout.include_heading_value_view,
                com.centerpoint.connect.R.layout.include_heading_value_view});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.viewBottomOne, 29);
        sViewsWithIds.put(R.id.elTechnicianInstruction, 30);
        sViewsWithIds.put(R.id.viewBottomTwo, 31);
        sViewsWithIds.put(R.id.elTKEntries, 32);
        sViewsWithIds.put(R.id.viewBottomThree, 33);
        sViewsWithIds.put(R.id.elServiceRepairs, 34);
        sViewsWithIds.put(R.id.viewBottomFour, 35);
        sViewsWithIds.put(R.id.elEstimateMaterial, 36);
        sViewsWithIds.put(R.id.viewBottomFive, 37);
        sViewsWithIds.put(R.id.elTasksAndMeetings, 38);
        sViewsWithIds.put(R.id.elHistoryAndNotes, 39);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView5;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView6;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public IncludeTicketInfoContentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 40, sIncludes, sViewsWithIds));
    }
    private IncludeTicketInfoContentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 22
            , (com.centerpoint.connect.databinding.IncludeTicketInformatinoCardBinding) bindings[7]
            , (com.centerpoint.connect.classes.expandable_view.ExpandableView) bindings[36]
            , (com.centerpoint.connect.classes.expandable_view.ExpandableView) bindings[39]
            , (com.centerpoint.connect.classes.expandable_view.ExpandableView) bindings[34]
            , (com.centerpoint.connect.classes.expandable_view.ExpandableView) bindings[32]
            , (com.centerpoint.connect.classes.expandable_view.ExpandableView) bindings[38]
            , (com.centerpoint.connect.classes.expandable_view.ExpandableView) bindings[30]
            , (com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) bindings[19]
            , (com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) bindings[16]
            , (com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) bindings[27]
            , (com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) bindings[28]
            , (com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) bindings[14]
            , (com.centerpoint.connect.databinding.IncludeNumberTextBinding) bindings[12]
            , (com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) bindings[17]
            , (com.centerpoint.connect.databinding.IncludeNumberTextBinding) bindings[11]
            , (com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) bindings[25]
            , (com.centerpoint.connect.databinding.IncludeNumberTextBinding) bindings[8]
            , (com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) bindings[21]
            , (com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) bindings[24]
            , (com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) bindings[20]
            , (com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) bindings[26]
            , (com.centerpoint.connect.databinding.IncludeNumberTextBinding) bindings[22]
            , (com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) bindings[13]
            , (com.centerpoint.connect.databinding.IncludeNumberTextBinding) bindings[10]
            , (com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) bindings[15]
            , (com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) bindings[23]
            , (com.centerpoint.connect.databinding.IncludeNumberTextBinding) bindings[9]
            , (com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) bindings[18]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (android.view.View) bindings[37]
            , (android.view.View) bindings[35]
            , (android.view.View) bindings[29]
            , (android.view.View) bindings[33]
            , (android.view.View) bindings[31]
            );
        setContainedBinding(this.cvInfo);
        setContainedBinding(this.includeCompany);
        setContainedBinding(this.includeCompleted);
        setContainedBinding(this.includeCreatedBy);
        setContainedBinding(this.includeDate);
        setContainedBinding(this.includeDue);
        setContainedBinding(this.includeFive);
        setContainedBinding(this.includeFor);
        setContainedBinding(this.includeFour);
        setContainedBinding(this.includeNote);
        setContainedBinding(this.includeOne);
        setContainedBinding(this.includeOpportunity);
        setContainedBinding(this.includePreview);
        setContainedBinding(this.includeProperty);
        setContainedBinding(this.includeResource);
        setContainedBinding(this.includeSix);
        setContainedBinding(this.includeTask);
        setContainedBinding(this.includeThree);
        setContainedBinding(this.includeTime);
        setContainedBinding(this.includeTitle);
        setContainedBinding(this.includeTwo);
        setContainedBinding(this.includeWith);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView5 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[6];
        this.mboundView6.setTag(null);
        this.rvEstimateMaterial.setTag(null);
        this.rvServiceRepairs.setTag(null);
        this.rvTKEntries.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x800000L;
        }
        cvInfo.invalidateAll();
        includeOne.invalidateAll();
        includeTwo.invalidateAll();
        includeThree.invalidateAll();
        includeFour.invalidateAll();
        includeFive.invalidateAll();
        includeTask.invalidateAll();
        includeDue.invalidateAll();
        includeTime.invalidateAll();
        includeCompleted.invalidateAll();
        includeFor.invalidateAll();
        includeWith.invalidateAll();
        includeCompany.invalidateAll();
        includeProperty.invalidateAll();
        includeOpportunity.invalidateAll();
        includeSix.invalidateAll();
        includeTitle.invalidateAll();
        includePreview.invalidateAll();
        includeNote.invalidateAll();
        includeResource.invalidateAll();
        includeCreatedBy.invalidateAll();
        includeDate.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (cvInfo.hasPendingBindings()) {
            return true;
        }
        if (includeOne.hasPendingBindings()) {
            return true;
        }
        if (includeTwo.hasPendingBindings()) {
            return true;
        }
        if (includeThree.hasPendingBindings()) {
            return true;
        }
        if (includeFour.hasPendingBindings()) {
            return true;
        }
        if (includeFive.hasPendingBindings()) {
            return true;
        }
        if (includeTask.hasPendingBindings()) {
            return true;
        }
        if (includeDue.hasPendingBindings()) {
            return true;
        }
        if (includeTime.hasPendingBindings()) {
            return true;
        }
        if (includeCompleted.hasPendingBindings()) {
            return true;
        }
        if (includeFor.hasPendingBindings()) {
            return true;
        }
        if (includeWith.hasPendingBindings()) {
            return true;
        }
        if (includeCompany.hasPendingBindings()) {
            return true;
        }
        if (includeProperty.hasPendingBindings()) {
            return true;
        }
        if (includeOpportunity.hasPendingBindings()) {
            return true;
        }
        if (includeSix.hasPendingBindings()) {
            return true;
        }
        if (includeTitle.hasPendingBindings()) {
            return true;
        }
        if (includePreview.hasPendingBindings()) {
            return true;
        }
        if (includeNote.hasPendingBindings()) {
            return true;
        }
        if (includeResource.hasPendingBindings()) {
            return true;
        }
        if (includeCreatedBy.hasPendingBindings()) {
            return true;
        }
        if (includeDate.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.fragment == variableId) {
            setFragment((com.centerpoint.connect.ui.global.ticket_info.TicketInfoFragment) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFragment(@Nullable com.centerpoint.connect.ui.global.ticket_info.TicketInfoFragment Fragment) {
        this.mFragment = Fragment;
        synchronized(this) {
            mDirtyFlags |= 0x400000L;
        }
        notifyPropertyChanged(BR.fragment);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        cvInfo.setLifecycleOwner(lifecycleOwner);
        includeOne.setLifecycleOwner(lifecycleOwner);
        includeTwo.setLifecycleOwner(lifecycleOwner);
        includeThree.setLifecycleOwner(lifecycleOwner);
        includeFour.setLifecycleOwner(lifecycleOwner);
        includeFive.setLifecycleOwner(lifecycleOwner);
        includeTask.setLifecycleOwner(lifecycleOwner);
        includeDue.setLifecycleOwner(lifecycleOwner);
        includeTime.setLifecycleOwner(lifecycleOwner);
        includeCompleted.setLifecycleOwner(lifecycleOwner);
        includeFor.setLifecycleOwner(lifecycleOwner);
        includeWith.setLifecycleOwner(lifecycleOwner);
        includeCompany.setLifecycleOwner(lifecycleOwner);
        includeProperty.setLifecycleOwner(lifecycleOwner);
        includeOpportunity.setLifecycleOwner(lifecycleOwner);
        includeSix.setLifecycleOwner(lifecycleOwner);
        includeTitle.setLifecycleOwner(lifecycleOwner);
        includePreview.setLifecycleOwner(lifecycleOwner);
        includeNote.setLifecycleOwner(lifecycleOwner);
        includeResource.setLifecycleOwner(lifecycleOwner);
        includeCreatedBy.setLifecycleOwner(lifecycleOwner);
        includeDate.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeIncludeThree((com.centerpoint.connect.databinding.IncludeNumberTextBinding) object, fieldId);
            case 1 :
                return onChangeIncludeTitle((com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) object, fieldId);
            case 2 :
                return onChangeIncludeCompleted((com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) object, fieldId);
            case 3 :
                return onChangeIncludeTwo((com.centerpoint.connect.databinding.IncludeNumberTextBinding) object, fieldId);
            case 4 :
                return onChangeIncludeResource((com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) object, fieldId);
            case 5 :
                return onChangeIncludeProperty((com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) object, fieldId);
            case 6 :
                return onChangeIncludeTask((com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) object, fieldId);
            case 7 :
                return onChangeIncludeCreatedBy((com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) object, fieldId);
            case 8 :
                return onChangeCvInfo((com.centerpoint.connect.databinding.IncludeTicketInformatinoCardBinding) object, fieldId);
            case 9 :
                return onChangeIncludeOpportunity((com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) object, fieldId);
            case 10 :
                return onChangeIncludeNote((com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) object, fieldId);
            case 11 :
                return onChangeIncludeTime((com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) object, fieldId);
            case 12 :
                return onChangeIncludeWith((com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) object, fieldId);
            case 13 :
                return onChangeIncludeSix((com.centerpoint.connect.databinding.IncludeNumberTextBinding) object, fieldId);
            case 14 :
                return onChangeIncludeOne((com.centerpoint.connect.databinding.IncludeNumberTextBinding) object, fieldId);
            case 15 :
                return onChangeIncludeFor((com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) object, fieldId);
            case 16 :
                return onChangeIncludeFive((com.centerpoint.connect.databinding.IncludeNumberTextBinding) object, fieldId);
            case 17 :
                return onChangeIncludeFour((com.centerpoint.connect.databinding.IncludeNumberTextBinding) object, fieldId);
            case 18 :
                return onChangeIncludePreview((com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) object, fieldId);
            case 19 :
                return onChangeIncludeDate((com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) object, fieldId);
            case 20 :
                return onChangeIncludeCompany((com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) object, fieldId);
            case 21 :
                return onChangeIncludeDue((com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeIncludeThree(com.centerpoint.connect.databinding.IncludeNumberTextBinding IncludeThree, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIncludeTitle(com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding IncludeTitle, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIncludeCompleted(com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding IncludeCompleted, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIncludeTwo(com.centerpoint.connect.databinding.IncludeNumberTextBinding IncludeTwo, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIncludeResource(com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding IncludeResource, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIncludeProperty(com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding IncludeProperty, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIncludeTask(com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding IncludeTask, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIncludeCreatedBy(com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding IncludeCreatedBy, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCvInfo(com.centerpoint.connect.databinding.IncludeTicketInformatinoCardBinding CvInfo, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIncludeOpportunity(com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding IncludeOpportunity, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIncludeNote(com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding IncludeNote, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIncludeTime(com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding IncludeTime, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIncludeWith(com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding IncludeWith, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIncludeSix(com.centerpoint.connect.databinding.IncludeNumberTextBinding IncludeSix, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIncludeOne(com.centerpoint.connect.databinding.IncludeNumberTextBinding IncludeOne, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIncludeFor(com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding IncludeFor, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIncludeFive(com.centerpoint.connect.databinding.IncludeNumberTextBinding IncludeFive, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIncludeFour(com.centerpoint.connect.databinding.IncludeNumberTextBinding IncludeFour, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIncludePreview(com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding IncludePreview, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIncludeDate(com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding IncludeDate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIncludeCompany(com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding IncludeCompany, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIncludeDue(com.centerpoint.connect.databinding.IncludeHeadingValueViewBinding IncludeDue, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200000L;
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
        com.centerpoint.connect.ui.global.ticket_info.TicketInfoFragment fragment = mFragment;
        com.centerpoint.connect.ui.global.ticket_info.adapter.TimeKeepingAdapter fragmentTkAdapter = null;
        com.centerpoint.connect.ui.global.ticket_info.adapter.ServiceRepairAdapter fragmentSrAdapter = null;
        com.centerpoint.connect.ui.global.ticket_info.adapter.EstimateMaterialAdapter fragmentEmAdapter = null;

        if ((dirtyFlags & 0xc00000L) != 0) {



                if (fragment != null) {
                    // read fragment.tkAdapter
                    fragmentTkAdapter = fragment.getTkAdapter();
                    // read fragment.srAdapter
                    fragmentSrAdapter = fragment.getSrAdapter();
                    // read fragment.emAdapter
                    fragmentEmAdapter = fragment.getEmAdapter();
                }
        }
        // batch finished
        if ((dirtyFlags & 0xc00000L) != 0) {
            // api target 1

            this.cvInfo.setFragment(fragment);
            com.centerpoint.connect.base.ViewBindingsKt.bindRecyclerViewAdapter(this.rvEstimateMaterial, fragmentEmAdapter);
            com.centerpoint.connect.base.ViewBindingsKt.bindRecyclerViewAdapter(this.rvServiceRepairs, fragmentSrAdapter);
            com.centerpoint.connect.base.ViewBindingsKt.bindRecyclerViewAdapter(this.rvTKEntries, fragmentTkAdapter);
        }
        if ((dirtyFlags & 0x800000L) != 0) {
            // api target 1

            this.includeCompany.setHeading(getRoot().getResources().getString(R.string.company));
            this.includeCompany.setValue("Tandy Magnetics");
            this.includeCompleted.setHeading(getRoot().getResources().getString(R.string.completed));
            this.includeCompleted.setValue("11/10/22");
            this.includeCreatedBy.setHeading(getRoot().getResources().getString(R.string.created_by));
            this.includeCreatedBy.setValue("UiUx");
            this.includeDate.setHeading(getRoot().getResources().getString(R.string.date));
            this.includeDate.setHideLine(true);
            this.includeDate.setValue("11/10/22");
            this.includeDue.setHeading(getRoot().getResources().getString(R.string.due));
            this.includeDue.setValue("10/11/22");
            this.includeDue.setValueColor(getColorFromResource(getRoot(), R.color.colorAccent));
            this.includeFive.setTitle("5");
            this.includeFor.setHeading(getRoot().getResources().getString(R.string.for_));
            this.includeFor.setValue("Usman");
            this.includeFour.setTitle("4");
            this.includeNote.setHeading(getRoot().getResources().getString(R.string.note));
            this.includeNote.setValue("Sed quis neque in dolor dapibus gravida mollis quis erat in euismod");
            this.includeOne.setTitle("1");
            this.includeOpportunity.setHeading(getRoot().getResources().getString(R.string.opportunity));
            this.includeOpportunity.setHideLine(true);
            this.includeOpportunity.setValue("2094685");
            this.includePreview.setHeading(getRoot().getResources().getString(R.string.file));
            this.includePreview.setValue("Preview");
            this.includePreview.setValueColor(getColorFromResource(getRoot(), R.color.colorAccent));
            this.includeProperty.setHeading(getRoot().getResources().getString(R.string.property));
            this.includeProperty.setValue("4470 Hulen Park");
            this.includeResource.setHeading(getRoot().getResources().getString(R.string.resource));
            this.includeResource.setValue("2094685");
            this.includeSix.setTitle("6");
            this.includeTask.setHeading(getRoot().getResources().getString(R.string.task));
            this.includeTask.setValue("Call");
            this.includeTask.setValueColor(getColorFromResource(getRoot(), R.color.orange));
            this.includeThree.setTitle("3");
            this.includeTime.setHeading(getRoot().getResources().getString(R.string.time));
            this.includeTime.setValue("8:30am EST");
            this.includeTitle.setHeading(getRoot().getResources().getString(R.string.title));
            this.includeTitle.setValue("Need helper for this");
            this.includeTitle.setValueColor(getColorFromResource(getRoot(), R.color.orange));
            this.includeTwo.setTitle("2");
            this.includeWith.setHeading(getRoot().getResources().getString(R.string.with));
            this.includeWith.setValue("Rizwan");
        }
        executeBindingsOn(cvInfo);
        executeBindingsOn(includeOne);
        executeBindingsOn(includeTwo);
        executeBindingsOn(includeThree);
        executeBindingsOn(includeFour);
        executeBindingsOn(includeFive);
        executeBindingsOn(includeTask);
        executeBindingsOn(includeDue);
        executeBindingsOn(includeTime);
        executeBindingsOn(includeCompleted);
        executeBindingsOn(includeFor);
        executeBindingsOn(includeWith);
        executeBindingsOn(includeCompany);
        executeBindingsOn(includeProperty);
        executeBindingsOn(includeOpportunity);
        executeBindingsOn(includeSix);
        executeBindingsOn(includeTitle);
        executeBindingsOn(includePreview);
        executeBindingsOn(includeNote);
        executeBindingsOn(includeResource);
        executeBindingsOn(includeCreatedBy);
        executeBindingsOn(includeDate);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): includeThree
        flag 1 (0x2L): includeTitle
        flag 2 (0x3L): includeCompleted
        flag 3 (0x4L): includeTwo
        flag 4 (0x5L): includeResource
        flag 5 (0x6L): includeProperty
        flag 6 (0x7L): includeTask
        flag 7 (0x8L): includeCreatedBy
        flag 8 (0x9L): cvInfo
        flag 9 (0xaL): includeOpportunity
        flag 10 (0xbL): includeNote
        flag 11 (0xcL): includeTime
        flag 12 (0xdL): includeWith
        flag 13 (0xeL): includeSix
        flag 14 (0xfL): includeOne
        flag 15 (0x10L): includeFor
        flag 16 (0x11L): includeFive
        flag 17 (0x12L): includeFour
        flag 18 (0x13L): includePreview
        flag 19 (0x14L): includeDate
        flag 20 (0x15L): includeCompany
        flag 21 (0x16L): includeDue
        flag 22 (0x17L): fragment
        flag 23 (0x18L): null
    flag mapping end*/
    //end
}