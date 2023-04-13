package com.centerpoint.connect.databinding;
import com.centerpoint.connect.R;
import com.centerpoint.connect.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class IncludeSideDrawerBindingImpl extends IncludeSideDrawerBinding implements com.centerpoint.connect.generated.callback.OnClickListener.Listener {

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
    @Nullable
    private final android.view.View.OnClickListener mCallback34;
    @Nullable
    private final android.view.View.OnClickListener mCallback35;
    @Nullable
    private final android.view.View.OnClickListener mCallback32;
    @Nullable
    private final android.view.View.OnClickListener mCallback33;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public IncludeSideDrawerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private IncludeSideDrawerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (android.widget.RelativeLayout) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[5]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            );
        this.ivUser.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rlBack.setTag(null);
        this.rvItems.setTag(null);
        this.tvUserEmail.setTag(null);
        this.tvUserName.setTag(null);
        setRootTag(root);
        // listeners
        mCallback34 = new com.centerpoint.connect.generated.callback.OnClickListener(this, 3);
        mCallback35 = new com.centerpoint.connect.generated.callback.OnClickListener(this, 4);
        mCallback32 = new com.centerpoint.connect.generated.callback.OnClickListener(this, 1);
        mCallback33 = new com.centerpoint.connect.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.user == variableId) {
            setUser((com.centerpoint.connect.models.helper.User) variable);
        }
        else if (BR.listeners == variableId) {
            setListeners((com.centerpoint.connect.base.listeners.NavigationListeners) variable);
        }
        else if (BR.adapter == variableId) {
            setAdapter((com.centerpoint.connect.ui.global.drawer.DrawerAdapter) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setUser(@Nullable com.centerpoint.connect.models.helper.User User) {
        this.mUser = User;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.user);
        super.requestRebind();
    }
    public void setListeners(@Nullable com.centerpoint.connect.base.listeners.NavigationListeners Listeners) {
        this.mListeners = Listeners;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.listeners);
        super.requestRebind();
    }
    public void setAdapter(@Nullable com.centerpoint.connect.ui.global.drawer.DrawerAdapter Adapter) {
        this.mAdapter = Adapter;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.adapter);
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
        com.centerpoint.connect.models.helper.User user = mUser;
        com.centerpoint.connect.base.listeners.NavigationListeners listeners = mListeners;
        java.lang.String userName = null;
        java.lang.String userEmail = null;
        com.centerpoint.connect.ui.global.drawer.DrawerAdapter adapter = mAdapter;

        if ((dirtyFlags & 0x9L) != 0) {



                if (user != null) {
                    // read user.name
                    userName = user.getName();
                    // read user.email
                    userEmail = user.getEmail();
                }
        }
        if ((dirtyFlags & 0xcL) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.ivUser.setOnClickListener(mCallback33);
            com.centerpoint.connect.base.ViewBindingsKt.bindCustomBackground(this.ivUser, getColorFromResource(ivUser, R.color.white), (java.lang.Integer)null, (java.lang.Float)null, ivUser.getResources().getDimension(R.dimen._35sdp), ivUser.getResources().getDimension(R.dimen._35sdp));
            this.rlBack.setOnClickListener(mCallback32);
            this.tvUserEmail.setOnClickListener(mCallback35);
            this.tvUserName.setOnClickListener(mCallback34);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            com.centerpoint.connect.base.ViewBindingsKt.bindRecyclerViewAdapter(this.rvItems, adapter);
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvUserEmail, userEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvUserName, userName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // listeners != null
                boolean listenersJavaLangObjectNull = false;
                // listeners
                com.centerpoint.connect.base.listeners.NavigationListeners listeners = mListeners;



                listenersJavaLangObjectNull = (listeners) != (null);
                if (listenersJavaLangObjectNull) {


                    listeners.onProfileClicked();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // listeners != null
                boolean listenersJavaLangObjectNull = false;
                // listeners
                com.centerpoint.connect.base.listeners.NavigationListeners listeners = mListeners;



                listenersJavaLangObjectNull = (listeners) != (null);
                if (listenersJavaLangObjectNull) {


                    listeners.onProfileClicked();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // listeners != null
                boolean listenersJavaLangObjectNull = false;
                // listeners
                com.centerpoint.connect.base.listeners.NavigationListeners listeners = mListeners;



                listenersJavaLangObjectNull = (listeners) != (null);
                if (listenersJavaLangObjectNull) {


                    listeners.onBackClicked();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // listeners != null
                boolean listenersJavaLangObjectNull = false;
                // listeners
                com.centerpoint.connect.base.listeners.NavigationListeners listeners = mListeners;



                listenersJavaLangObjectNull = (listeners) != (null);
                if (listenersJavaLangObjectNull) {


                    listeners.onProfileClicked();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): user
        flag 1 (0x2L): listeners
        flag 2 (0x3L): adapter
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}