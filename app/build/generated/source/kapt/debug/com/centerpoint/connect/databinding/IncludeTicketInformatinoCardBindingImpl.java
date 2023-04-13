package com.centerpoint.connect.databinding;
import com.centerpoint.connect.R;
import com.centerpoint.connect.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class IncludeTicketInformatinoCardBindingImpl extends IncludeTicketInformatinoCardBinding implements com.centerpoint.connect.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tvPropertyHeading, 2);
        sViewsWithIds.put(R.id.ivLocation, 3);
        sViewsWithIds.put(R.id.tvRegion, 4);
        sViewsWithIds.put(R.id.tvAddress, 5);
        sViewsWithIds.put(R.id.tvServiceTypeHeading, 6);
        sViewsWithIds.put(R.id.tvServiceTypeValue, 7);
        sViewsWithIds.put(R.id.tvExceedHeading, 8);
        sViewsWithIds.put(R.id.tvExceedValue, 9);
        sViewsWithIds.put(R.id.tvTechnicianHeading, 10);
        sViewsWithIds.put(R.id.tvTechnicianValue, 11);
        sViewsWithIds.put(R.id.tvTruckIdHeading, 12);
        sViewsWithIds.put(R.id.tvTruckIdValue, 13);
        sViewsWithIds.put(R.id.tvEtaHeading, 14);
        sViewsWithIds.put(R.id.tvEtaValue, 15);
        sViewsWithIds.put(R.id.tvCreatedBy, 16);
        sViewsWithIds.put(R.id.tvCreatedByValue, 17);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public IncludeTicketInformatinoCardBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private IncludeTicketInformatinoCardBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[13]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvMapAddress.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.centerpoint.connect.generated.callback.OnClickListener(this, 1);
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
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.fragment);
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
        com.centerpoint.connect.ui.global.ticket_info.TicketInfoFragment fragment = mFragment;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            com.centerpoint.connect.base.ViewBindingsKt.bindCustomBackground(this.mboundView0, getColorFromResource(mboundView0, R.color.white), (java.lang.Integer)null, (java.lang.Float)null, mboundView0.getResources().getDimension(R.dimen.ticket_info_card_corners), mboundView0.getResources().getDimension(R.dimen.ticket_info_card_corners));
            this.tvMapAddress.setOnClickListener(mCallback2);
            com.centerpoint.connect.base.ViewBindingsKt.bindCustomBackground(this.tvMapAddress, getColorFromResource(tvMapAddress, R.color.white), getColorFromResource(tvMapAddress, R.color.border_silver), tvMapAddress.getResources().getDimension(R.dimen._1sdp), tvMapAddress.getResources().getDimension(R.dimen._40sdp), tvMapAddress.getResources().getDimension(R.dimen._40sdp));
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // fragment
        com.centerpoint.connect.ui.global.ticket_info.TicketInfoFragment fragment = mFragment;
        // fragment != null
        boolean fragmentJavaLangObjectNull = false;



        fragmentJavaLangObjectNull = (fragment) != (null);
        if (fragmentJavaLangObjectNull) {


            fragment.gotoLocationDetailFragment();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): fragment
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}