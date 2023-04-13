package com.centerpoint.connect.databinding;
import com.centerpoint.connect.R;
import com.centerpoint.connect.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemRepairsTabBindingImpl extends ItemRepairsTabBinding implements com.centerpoint.connect.generated.callback.OnClickListener.Listener {

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
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView1;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemRepairsTabBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ItemRepairsTabBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.appcompat.widget.AppCompatImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (androidx.appcompat.widget.AppCompatImageView) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
        mCallback11 = new com.centerpoint.connect.generated.callback.OnClickListener(this, 1);
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
        if (BR.position == variableId) {
            setPosition((java.lang.Integer) variable);
        }
        else if (BR.listeners == variableId) {
            setListeners((com.centerpoint.connect.base.listeners.BaseAdapterListener) variable);
        }
        else if (BR.data == variableId) {
            setData((com.centerpoint.connect.models.helper.RepairTab) variable);
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
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.position);
        super.requestRebind();
    }
    public void setListeners(@Nullable com.centerpoint.connect.base.listeners.BaseAdapterListener Listeners) {
        this.mListeners = Listeners;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.listeners);
        super.requestRebind();
    }
    public void setData(@Nullable com.centerpoint.connect.models.helper.RepairTab Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.data);
        super.requestRebind();
    }
    public void setItemCount(@Nullable java.lang.Integer ItemCount) {
        this.mItemCount = ItemCount;
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
        java.lang.Integer position = mPosition;
        boolean dataStateStateCOMPLETED = false;
        boolean DataStateStateCOMPLETED1 = false;
        int dataStateStateDISABLEDMboundView1AndroidColorTextDisableMboundView1AndroidColorWhite = 0;
        int dataStateStateSELECTEDMboundView1AndroidColorColorAccentMboundView1AndroidColorColorDisableBg = 0;
        com.centerpoint.connect.base.listeners.BaseAdapterListener listeners = mListeners;
        boolean dataStateStateDISABLED = false;
        com.centerpoint.connect.models.helper.RepairTab data = mData;
        int dataStateStateCOMPLETEDMboundView1AndroidColorOrangeDataStateStateSELECTEDMboundView1AndroidColorColorAccentMboundView1AndroidColorColorDisableBg = 0;
        com.centerpoint.connect.models.helper.RepairTab.State dataState = null;
        int dataImageRes = 0;
        boolean dataStateStateSELECTED = false;

        if ((dirtyFlags & 0x14L) != 0) {



                if (data != null) {
                    // read data.state
                    dataState = data.getState();
                    // read data.imageRes
                    dataImageRes = data.getImageRes();
                }


                // read data.state == State.COMPLETED
                dataStateStateCOMPLETED = (dataState) == (com.centerpoint.connect.models.helper.RepairTab.State.COMPLETED);
                // read data.state != State.COMPLETED
                DataStateStateCOMPLETED1 = (dataState) != (com.centerpoint.connect.models.helper.RepairTab.State.COMPLETED);
                // read data.state == State.DISABLED
                dataStateStateDISABLED = (dataState) == (com.centerpoint.connect.models.helper.RepairTab.State.DISABLED);
            if((dirtyFlags & 0x14L) != 0) {
                if(dataStateStateCOMPLETED) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }
            if((dirtyFlags & 0x14L) != 0) {
                if(dataStateStateDISABLED) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }


                // read data.state == State.DISABLED ? @android:color/text_disable : @android:color/white
                dataStateStateDISABLEDMboundView1AndroidColorTextDisableMboundView1AndroidColorWhite = ((dataStateStateDISABLED) ? (getColorFromResource(mboundView1, R.color.text_disable)) : (getColorFromResource(mboundView1, R.color.white)));
        }
        // batch finished

        if ((dirtyFlags & 0x200L) != 0) {

                // read data.state == State.SELECTED
                dataStateStateSELECTED = (dataState) == (com.centerpoint.connect.models.helper.RepairTab.State.SELECTED);
            if((dirtyFlags & 0x200L) != 0) {
                if(dataStateStateSELECTED) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }


                // read data.state == State.SELECTED ? @android:color/colorAccent : @android:color/color_disable_bg
                dataStateStateSELECTEDMboundView1AndroidColorColorAccentMboundView1AndroidColorColorDisableBg = ((dataStateStateSELECTED) ? (getColorFromResource(mboundView1, R.color.colorAccent)) : (getColorFromResource(mboundView1, R.color.color_disable_bg)));
        }

        if ((dirtyFlags & 0x14L) != 0) {

                // read data.state == State.COMPLETED ? @android:color/orange : data.state == State.SELECTED ? @android:color/colorAccent : @android:color/color_disable_bg
                dataStateStateCOMPLETEDMboundView1AndroidColorOrangeDataStateStateSELECTEDMboundView1AndroidColorColorAccentMboundView1AndroidColorColorDisableBg = ((dataStateStateCOMPLETED) ? (getColorFromResource(mboundView1, R.color.orange)) : (dataStateStateSELECTEDMboundView1AndroidColorColorAccentMboundView1AndroidColorColorDisableBg));
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback11);
            com.centerpoint.connect.base.ViewBindingsKt.bindCustomBackground(this.mboundView2, getColorFromResource(mboundView2, R.color.colorPrimary), getColorFromResource(mboundView2, R.color.colorPrimary), mboundView2.getResources().getDimension(R.dimen._2sdp), mboundView2.getResources().getDimension(R.dimen._8sdp), mboundView2.getResources().getDimension(R.dimen._8sdp));
        }
        if ((dirtyFlags & 0x14L) != 0) {
            // api target 21
            if(getBuildSdkInt() >= 21) {

                this.mboundView1.setImageTintList(androidx.databinding.adapters.Converters.convertColorToColorStateList(dataStateStateDISABLEDMboundView1AndroidColorTextDisableMboundView1AndroidColorWhite));
            }
            // api target 1

            com.centerpoint.connect.base.ViewBindingsKt.bindImageWithResId(this.mboundView1, dataImageRes);
            com.centerpoint.connect.base.ViewBindingsKt.bindCustomBackground(this.mboundView1, dataStateStateCOMPLETEDMboundView1AndroidColorOrangeDataStateStateSELECTEDMboundView1AndroidColorColorAccentMboundView1AndroidColorColorDisableBg, (java.lang.Integer)null, (java.lang.Float)null, mboundView1.getResources().getDimension(R.dimen._16sdp), mboundView1.getResources().getDimension(R.dimen._16sdp));
            com.centerpoint.connect.base.ViewBindingsKt.bindInVisibility(this.mboundView2, DataStateStateCOMPLETED1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // listeners != null
        boolean listenersJavaLangObjectNull = false;
        // position
        java.lang.Integer position = mPosition;
        // data != null
        boolean dataJavaLangObjectNull = false;
        // data.selectable
        boolean dataSelectable = false;
        // data
        com.centerpoint.connect.models.helper.RepairTab data = mData;
        // listeners
        com.centerpoint.connect.base.listeners.BaseAdapterListener listeners = mListeners;



        dataJavaLangObjectNull = (data) != (null);
        if (dataJavaLangObjectNull) {


            dataSelectable = data.getSelectable();
            if (dataSelectable) {



                listenersJavaLangObjectNull = (listeners) != (null);
                if (listenersJavaLangObjectNull) {




                    listeners.onItemClick(position, data);
                }
            }
            else {
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): position
        flag 1 (0x2L): listeners
        flag 2 (0x3L): data
        flag 3 (0x4L): itemCount
        flag 4 (0x5L): null
        flag 5 (0x6L): data.state == State.DISABLED ? @android:color/text_disable : @android:color/white
        flag 6 (0x7L): data.state == State.DISABLED ? @android:color/text_disable : @android:color/white
        flag 7 (0x8L): data.state == State.SELECTED ? @android:color/colorAccent : @android:color/color_disable_bg
        flag 8 (0x9L): data.state == State.SELECTED ? @android:color/colorAccent : @android:color/color_disable_bg
        flag 9 (0xaL): data.state == State.COMPLETED ? @android:color/orange : data.state == State.SELECTED ? @android:color/colorAccent : @android:color/color_disable_bg
        flag 10 (0xbL): data.state == State.COMPLETED ? @android:color/orange : data.state == State.SELECTED ? @android:color/colorAccent : @android:color/color_disable_bg
    flag mapping end*/
    //end
}