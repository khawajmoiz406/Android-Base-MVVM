package com.centerpoint.connect.databinding;
import com.centerpoint.connect.R;
import com.centerpoint.connect.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityGlobalNavigationBindingImpl extends ActivityGlobalNavigationBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(6);
        sIncludes.setIncludes(1, 
            new String[] {"include_toolbar"},
            new int[] {3},
            new int[] {com.centerpoint.connect.R.layout.include_toolbar});
        sIncludes.setIncludes(2, 
            new String[] {"include_side_drawer"},
            new int[] {4},
            new int[] {com.centerpoint.connect.R.layout.include_side_drawer});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.nav_host_fragment, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    @NonNull
    private final com.google.android.material.navigation.NavigationView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityGlobalNavigationBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ActivityGlobalNavigationBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.drawerlayout.widget.DrawerLayout) bindings[0]
            , (com.centerpoint.connect.databinding.IncludeToolbarBinding) bindings[3]
            , (com.centerpoint.connect.databinding.IncludeSideDrawerBinding) bindings[4]
            , (androidx.fragment.app.FragmentContainerView) bindings[5]
            );
        this.drawerLayout.setTag(null);
        setContainedBinding(this.includeToolbar);
        setContainedBinding(this.includeUser);
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (com.google.android.material.navigation.NavigationView) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        includeToolbar.invalidateAll();
        includeUser.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (includeToolbar.hasPendingBindings()) {
            return true;
        }
        if (includeUser.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.activity == variableId) {
            setActivity((com.centerpoint.connect.ui.global.GlobalNavigationActivity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setActivity(@Nullable com.centerpoint.connect.ui.global.GlobalNavigationActivity Activity) {
        this.mActivity = Activity;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.activity);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        includeToolbar.setLifecycleOwner(lifecycleOwner);
        includeUser.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeIncludeToolbar((com.centerpoint.connect.databinding.IncludeToolbarBinding) object, fieldId);
            case 1 :
                return onChangeIncludeUser((com.centerpoint.connect.databinding.IncludeSideDrawerBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeIncludeToolbar(com.centerpoint.connect.databinding.IncludeToolbarBinding IncludeToolbar, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIncludeUser(com.centerpoint.connect.databinding.IncludeSideDrawerBinding IncludeUser, int fieldId) {
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
        com.centerpoint.connect.ui.global.drawer.DrawerAdapter activityAdapter = null;
        com.centerpoint.connect.ui.global.GlobalNavigationActivity activity = mActivity;
        com.centerpoint.connect.models.helper.User activityUser = null;

        if ((dirtyFlags & 0xcL) != 0) {



                if (activity != null) {
                    // read activity.adapter
                    activityAdapter = activity.getAdapter();
                    // read activity.user
                    activityUser = activity.getUser();
                }
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.includeToolbar.setListeners(activity);
            this.includeToolbar.setUser(activityUser);
            this.includeUser.setAdapter(activityAdapter);
            this.includeUser.setListeners(activity);
            this.includeUser.setUser(activityUser);
        }
        executeBindingsOn(includeToolbar);
        executeBindingsOn(includeUser);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): includeToolbar
        flag 1 (0x2L): includeUser
        flag 2 (0x3L): activity
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}