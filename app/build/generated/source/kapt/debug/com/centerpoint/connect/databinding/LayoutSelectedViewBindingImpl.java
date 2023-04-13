package com.centerpoint.connect.databinding;
import com.centerpoint.connect.R;
import com.centerpoint.connect.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutSelectedViewBindingImpl extends LayoutSelectedViewBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutSelectedViewBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 1, sIncludes, sViewsWithIds));
    }
    private LayoutSelectedViewBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatTextView) bindings[0]
            );
        this.textView.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.expanded == variableId) {
            setExpanded((java.lang.Boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setExpanded(@Nullable java.lang.Boolean Expanded) {
        this.mExpanded = Expanded;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.expanded);
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
        float expandedTextViewAndroidDimenZeroDpTextViewAndroidDimen20sdp = 0f;
        java.lang.Boolean expanded = mExpanded;
        boolean androidxDatabindingViewDataBindingSafeUnboxExpanded = false;
        android.graphics.drawable.Drawable expandedTextViewAndroidDrawableIcDropDownOpenTextViewAndroidDrawableIcDropDown = null;

        if ((dirtyFlags & 0x3L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(expanded)
                androidxDatabindingViewDataBindingSafeUnboxExpanded = androidx.databinding.ViewDataBinding.safeUnbox(expanded);
            if((dirtyFlags & 0x3L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxExpanded) {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x4L;
                        dirtyFlags |= 0x10L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(expanded) ? @android:dimen/zero_dp : @android:dimen/_20sdp
                expandedTextViewAndroidDimenZeroDpTextViewAndroidDimen20sdp = ((androidxDatabindingViewDataBindingSafeUnboxExpanded) ? (textView.getResources().getDimension(R.dimen.zero_dp)) : (textView.getResources().getDimension(R.dimen._20sdp)));
                // read androidx.databinding.ViewDataBinding.safeUnbox(expanded) ? @android:drawable/ic_drop_down_open : @android:drawable/ic_drop_down
                expandedTextViewAndroidDrawableIcDropDownOpenTextViewAndroidDrawableIcDropDown = ((androidxDatabindingViewDataBindingSafeUnboxExpanded) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(textView.getContext(), R.drawable.ic_drop_down_open)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(textView.getContext(), R.drawable.ic_drop_down)));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setDrawableEnd(this.textView, expandedTextViewAndroidDrawableIcDropDownOpenTextViewAndroidDrawableIcDropDown);
            com.centerpoint.connect.base.ViewBindingsKt.bindCustomBackground(this.textView, getColorFromResource(textView, R.color.white), getColorFromResource(textView, R.color.border_silver), textView.getResources().getDimension(R.dimen._1sdp), textView.getResources().getDimension(R.dimen._20sdp), expandedTextViewAndroidDimenZeroDpTextViewAndroidDimen20sdp);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): expanded
        flag 1 (0x2L): null
        flag 2 (0x3L): androidx.databinding.ViewDataBinding.safeUnbox(expanded) ? @android:dimen/zero_dp : @android:dimen/_20sdp
        flag 3 (0x4L): androidx.databinding.ViewDataBinding.safeUnbox(expanded) ? @android:dimen/zero_dp : @android:dimen/_20sdp
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(expanded) ? @android:drawable/ic_drop_down_open : @android:drawable/ic_drop_down
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(expanded) ? @android:drawable/ic_drop_down_open : @android:drawable/ic_drop_down
    flag mapping end*/
    //end
}