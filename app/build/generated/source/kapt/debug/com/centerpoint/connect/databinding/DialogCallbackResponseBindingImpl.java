package com.centerpoint.connect.databinding;
import com.centerpoint.connect.R;
import com.centerpoint.connect.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialogCallbackResponseBindingImpl extends DialogCallbackResponseBinding  {

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
    private final android.widget.TextView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DialogCallbackResponseBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private DialogCallbackResponseBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            );
        this.cvMain.setTag(null);
        this.ivLogo.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
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
        if (BR.data == variableId) {
            setData((com.centerpoint.connect.models.helper.ResponseCallback) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable com.centerpoint.connect.models.helper.ResponseCallback Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
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
        int dataTypeTypeSUCCESSCvMainAndroidColorGreenCvMainAndroidColorRed = 0;
        java.lang.String dataMessage = null;
        boolean dataTypeTypeSUCCESS = false;
        android.graphics.drawable.Drawable dataTypeTypeSUCCESSIvLogoAndroidDrawableIcCheckCircleIvLogoAndroidDrawableIcCancelCircle = null;
        com.centerpoint.connect.models.helper.ResponseCallback.Type dataType = null;
        com.centerpoint.connect.models.helper.ResponseCallback data = mData;

        if ((dirtyFlags & 0x3L) != 0) {



                if (data != null) {
                    // read data.message
                    dataMessage = data.getMessage();
                    // read data.type
                    dataType = data.getType();
                }


                // read data.type == Type.SUCCESS
                dataTypeTypeSUCCESS = (dataType) == (com.centerpoint.connect.models.helper.ResponseCallback.Type.SUCCESS);
            if((dirtyFlags & 0x3L) != 0) {
                if(dataTypeTypeSUCCESS) {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x4L;
                        dirtyFlags |= 0x10L;
                }
            }


                // read data.type == Type.SUCCESS ? @android:color/green : @android:color/red
                dataTypeTypeSUCCESSCvMainAndroidColorGreenCvMainAndroidColorRed = ((dataTypeTypeSUCCESS) ? (getColorFromResource(cvMain, R.color.green)) : (getColorFromResource(cvMain, R.color.red)));
                // read data.type == Type.SUCCESS ? @android:drawable/ic_check_circle : @android:drawable/ic_cancel_circle
                dataTypeTypeSUCCESSIvLogoAndroidDrawableIcCheckCircleIvLogoAndroidDrawableIcCancelCircle = ((dataTypeTypeSUCCESS) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(ivLogo.getContext(), R.drawable.ic_check_circle)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(ivLogo.getContext(), R.drawable.ic_cancel_circle)));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.centerpoint.connect.base.ViewBindingsKt.bindCustomBackground(this.cvMain, dataTypeTypeSUCCESSCvMainAndroidColorGreenCvMainAndroidColorRed, (java.lang.Integer)null, (java.lang.Float)null, (java.lang.Float)null, cvMain.getResources().getDimension(R.dimen._20sdp));
            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.ivLogo, dataTypeTypeSUCCESSIvLogoAndroidDrawableIcCheckCircleIvLogoAndroidDrawableIcCancelCircle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, dataMessage);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data
        flag 1 (0x2L): null
        flag 2 (0x3L): data.type == Type.SUCCESS ? @android:color/green : @android:color/red
        flag 3 (0x4L): data.type == Type.SUCCESS ? @android:color/green : @android:color/red
        flag 4 (0x5L): data.type == Type.SUCCESS ? @android:drawable/ic_check_circle : @android:drawable/ic_cancel_circle
        flag 5 (0x6L): data.type == Type.SUCCESS ? @android:drawable/ic_check_circle : @android:drawable/ic_cancel_circle
    flag mapping end*/
    //end
}