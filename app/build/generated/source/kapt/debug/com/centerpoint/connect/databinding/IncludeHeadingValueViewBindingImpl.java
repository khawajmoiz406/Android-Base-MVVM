package com.centerpoint.connect.databinding;
import com.centerpoint.connect.R;
import com.centerpoint.connect.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class IncludeHeadingValueViewBindingImpl extends IncludeHeadingValueViewBinding  {

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
    // values
    // listeners
    // Inverse Binding Event Handlers

    public IncludeHeadingValueViewBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private IncludeHeadingValueViewBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.view.View) bindings[3]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvDateHeading.setTag(null);
        this.tvDateValue.setTag(null);
        this.viewDate.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.hideLine == variableId) {
            setHideLine((java.lang.Boolean) variable);
        }
        else if (BR.heading == variableId) {
            setHeading((java.lang.String) variable);
        }
        else if (BR.value == variableId) {
            setValue((java.lang.String) variable);
        }
        else if (BR.valueColor == variableId) {
            setValueColor((java.lang.Integer) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHideLine(@Nullable java.lang.Boolean HideLine) {
        this.mHideLine = HideLine;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.hideLine);
        super.requestRebind();
    }
    public void setHeading(@Nullable java.lang.String Heading) {
        this.mHeading = Heading;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.heading);
        super.requestRebind();
    }
    public void setValue(@Nullable java.lang.String Value) {
        this.mValue = Value;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.value);
        super.requestRebind();
    }
    public void setValueColor(@Nullable java.lang.Integer ValueColor) {
        this.mValueColor = ValueColor;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.valueColor);
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
        java.lang.Boolean hideLine = mHideLine;
        int valueColorJavaLangObjectNullTvDateValueAndroidColorTextColorGreyValueColor = 0;
        java.lang.String heading = mHeading;
        java.lang.String value = mValue;
        boolean valueColorJavaLangObjectNull = false;
        boolean HideLine1 = false;
        boolean hideLineJavaLangObjectNullBooleanTrueHideLine = false;
        java.lang.Integer valueColor = mValueColor;
        boolean hideLineJavaLangObjectNull = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxHideLine = false;

        if ((dirtyFlags & 0x11L) != 0) {



                // read hideLine == null
                hideLineJavaLangObjectNull = (hideLine) == (null);
            if((dirtyFlags & 0x11L) != 0) {
                if(hideLineJavaLangObjectNull) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }
        }
        if ((dirtyFlags & 0x12L) != 0) {
        }
        if ((dirtyFlags & 0x14L) != 0) {
        }
        if ((dirtyFlags & 0x18L) != 0) {



                // read valueColor == null
                valueColorJavaLangObjectNull = (valueColor) == (null);
            if((dirtyFlags & 0x18L) != 0) {
                if(valueColorJavaLangObjectNull) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x18L) != 0) {

                // read valueColor == null ? @android:color/text_color_grey : valueColor
                valueColorJavaLangObjectNullTvDateValueAndroidColorTextColorGreyValueColor = ((valueColorJavaLangObjectNull) ? (getColorFromResource(tvDateValue, R.color.text_color_grey)) : (valueColor));
        }
        if ((dirtyFlags & 0x80L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(hideLine)
                androidxDatabindingViewDataBindingSafeUnboxHideLine = androidx.databinding.ViewDataBinding.safeUnbox(hideLine);


                // read !androidx.databinding.ViewDataBinding.safeUnbox(hideLine)
                HideLine1 = !androidxDatabindingViewDataBindingSafeUnboxHideLine;
        }

        if ((dirtyFlags & 0x11L) != 0) {

                // read hideLine == null ? true : !androidx.databinding.ViewDataBinding.safeUnbox(hideLine)
                hideLineJavaLangObjectNullBooleanTrueHideLine = ((hideLineJavaLangObjectNull) ? (true) : (HideLine1));
        }
        // batch finished
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDateHeading, heading);
        }
        if ((dirtyFlags & 0x14L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDateValue, value);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            this.tvDateValue.setTextColor(valueColorJavaLangObjectNullTvDateValueAndroidColorTextColorGreyValueColor);
        }
        if ((dirtyFlags & 0x11L) != 0) {
            // api target 1

            com.centerpoint.connect.base.ViewBindingsKt.bindVisibility(this.viewDate, hideLineJavaLangObjectNullBooleanTrueHideLine);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): hideLine
        flag 1 (0x2L): heading
        flag 2 (0x3L): value
        flag 3 (0x4L): valueColor
        flag 4 (0x5L): null
        flag 5 (0x6L): valueColor == null ? @android:color/text_color_grey : valueColor
        flag 6 (0x7L): valueColor == null ? @android:color/text_color_grey : valueColor
        flag 7 (0x8L): hideLine == null ? true : !androidx.databinding.ViewDataBinding.safeUnbox(hideLine)
        flag 8 (0x9L): hideLine == null ? true : !androidx.databinding.ViewDataBinding.safeUnbox(hideLine)
    flag mapping end*/
    //end
}