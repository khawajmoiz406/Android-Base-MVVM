package com.centerpoint.connect.databinding;
import com.centerpoint.connect.R;
import com.centerpoint.connect.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentTicketInfoBindingImpl extends FragmentTicketInfoBinding implements com.centerpoint.connect.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(6);
        sIncludes.setIncludes(0, 
            new String[] {"include_ticket_info_header", "include_ticket_info_content"},
            new int[] {3, 4},
            new int[] {com.centerpoint.connect.R.layout.include_ticket_info_header,
                com.centerpoint.connect.R.layout.include_ticket_info_content});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.llButtons, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final com.google.android.material.button.MaterialButton mboundView1;
    @NonNull
    private final com.google.android.material.button.MaterialButton mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback38;
    @Nullable
    private final android.view.View.OnClickListener mCallback39;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentTicketInfoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentTicketInfoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.centerpoint.connect.databinding.IncludeTicketInfoHeaderBinding) bindings[3]
            , (com.centerpoint.connect.databinding.IncludeTicketInfoContentBinding) bindings[4]
            , (android.widget.LinearLayout) bindings[5]
            );
        setContainedBinding(this.includeTicketHeader);
        setContainedBinding(this.includeTicketInfoContent);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (com.google.android.material.button.MaterialButton) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (com.google.android.material.button.MaterialButton) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
        mCallback38 = new com.centerpoint.connect.generated.callback.OnClickListener(this, 1);
        mCallback39 = new com.centerpoint.connect.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        includeTicketHeader.invalidateAll();
        includeTicketInfoContent.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (includeTicketHeader.hasPendingBindings()) {
            return true;
        }
        if (includeTicketInfoContent.hasPendingBindings()) {
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
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.fragment);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        includeTicketHeader.setLifecycleOwner(lifecycleOwner);
        includeTicketInfoContent.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeIncludeTicketInfoContent((com.centerpoint.connect.databinding.IncludeTicketInfoContentBinding) object, fieldId);
            case 1 :
                return onChangeIncludeTicketHeader((com.centerpoint.connect.databinding.IncludeTicketInfoHeaderBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeIncludeTicketInfoContent(com.centerpoint.connect.databinding.IncludeTicketInfoContentBinding IncludeTicketInfoContent, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIncludeTicketHeader(com.centerpoint.connect.databinding.IncludeTicketInfoHeaderBinding IncludeTicketHeader, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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

        if ((dirtyFlags & 0xcL) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.includeTicketHeader.setOrderId("123454");
            this.includeTicketHeader.setStage("New Service");
            this.mboundView1.setOnClickListener(mCallback38);
            this.mboundView2.setOnClickListener(mCallback39);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.includeTicketInfoContent.setFragment(fragment);
        }
        executeBindingsOn(includeTicketHeader);
        executeBindingsOn(includeTicketInfoContent);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // fragment
                com.centerpoint.connect.ui.global.ticket_info.TicketInfoFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.gotoLocationDetailFragment();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // fragment
                com.centerpoint.connect.ui.global.ticket_info.TicketInfoFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.gotoCheckInFragment();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): includeTicketInfoContent
        flag 1 (0x2L): includeTicketHeader
        flag 2 (0x3L): fragment
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}