package com.centerpoint.connect.databinding;
import com.centerpoint.connect.R;
import com.centerpoint.connect.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCheckInBindingImpl extends FragmentCheckInBinding implements com.centerpoint.connect.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(11);
        sIncludes.setIncludes(0, 
            new String[] {"include_ticket_info_header"},
            new int[] {5},
            new int[] {com.centerpoint.connect.R.layout.include_ticket_info_header});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.scrollView, 6);
        sViewsWithIds.put(R.id.tvInfo, 7);
        sViewsWithIds.put(R.id.tvManagerNameHeading, 8);
        sViewsWithIds.put(R.id.tvNotes, 9);
        sViewsWithIds.put(R.id.llButtons, 10);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final com.google.android.material.button.MaterialButton mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback40;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etManagerNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.checkInRequestParams.managerName.get()
            //         is viewModel.checkInRequestParams.managerName.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etManagerName);
            // localize variables for thread safety
            // viewModel.checkInRequestParams.managerName
            androidx.databinding.ObservableField<java.lang.String> viewModelCheckInRequestParamsManagerName = null;
            // viewModel.checkInRequestParams
            com.centerpoint.connect.models.request.CheckInRP viewModelCheckInRequestParams = null;
            // viewModel
            com.centerpoint.connect.ui.global.ticket_info.TicketInfoViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.checkInRequestParams != null
            boolean viewModelCheckInRequestParamsJavaLangObjectNull = false;
            // viewModel.checkInRequestParams.managerName.get()
            java.lang.String viewModelCheckInRequestParamsManagerNameGet = null;
            // viewModel.checkInRequestParams.managerName != null
            boolean viewModelCheckInRequestParamsManagerNameJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelCheckInRequestParams = viewModel.getCheckInRequestParams();

                viewModelCheckInRequestParamsJavaLangObjectNull = (viewModelCheckInRequestParams) != (null);
                if (viewModelCheckInRequestParamsJavaLangObjectNull) {


                    viewModelCheckInRequestParamsManagerName = viewModelCheckInRequestParams.getManagerName();

                    viewModelCheckInRequestParamsManagerNameJavaLangObjectNull = (viewModelCheckInRequestParamsManagerName) != (null);
                    if (viewModelCheckInRequestParamsManagerNameJavaLangObjectNull) {




                        viewModelCheckInRequestParamsManagerName.set(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etNotesandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.checkInRequestParams.notes.get()
            //         is viewModel.checkInRequestParams.notes.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etNotes);
            // localize variables for thread safety
            // viewModel.checkInRequestParams
            com.centerpoint.connect.models.request.CheckInRP viewModelCheckInRequestParams = null;
            // viewModel.checkInRequestParams.notes.get()
            java.lang.String viewModelCheckInRequestParamsNotesGet = null;
            // viewModel
            com.centerpoint.connect.ui.global.ticket_info.TicketInfoViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.checkInRequestParams != null
            boolean viewModelCheckInRequestParamsJavaLangObjectNull = false;
            // viewModel.checkInRequestParams.notes != null
            boolean viewModelCheckInRequestParamsNotesJavaLangObjectNull = false;
            // viewModel.checkInRequestParams.notes
            androidx.databinding.ObservableField<java.lang.String> viewModelCheckInRequestParamsNotes = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelCheckInRequestParams = viewModel.getCheckInRequestParams();

                viewModelCheckInRequestParamsJavaLangObjectNull = (viewModelCheckInRequestParams) != (null);
                if (viewModelCheckInRequestParamsJavaLangObjectNull) {


                    viewModelCheckInRequestParamsNotes = viewModelCheckInRequestParams.getNotes();

                    viewModelCheckInRequestParamsNotesJavaLangObjectNull = (viewModelCheckInRequestParamsNotes) != (null);
                    if (viewModelCheckInRequestParamsNotesJavaLangObjectNull) {




                        viewModelCheckInRequestParamsNotes.set(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };

    public FragmentCheckInBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private FragmentCheckInBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[2]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[3]
            , (com.centerpoint.connect.databinding.IncludeTicketInfoHeaderBinding) bindings[5]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.ScrollView) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            );
        this.cvCard.setTag(null);
        this.etManagerName.setTag(null);
        this.etNotes.setTag(null);
        setContainedBinding(this.includeTicketHeader);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView4 = (com.google.android.material.button.MaterialButton) bindings[4];
        this.mboundView4.setTag(null);
        setRootTag(root);
        // listeners
        mCallback40 = new com.centerpoint.connect.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
        }
        includeTicketHeader.invalidateAll();
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
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.fragment == variableId) {
            setFragment((com.centerpoint.connect.ui.global.ticket_info.CheckInFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.centerpoint.connect.ui.global.ticket_info.TicketInfoViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFragment(@Nullable com.centerpoint.connect.ui.global.ticket_info.CheckInFragment Fragment) {
        this.mFragment = Fragment;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.fragment);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.centerpoint.connect.ui.global.ticket_info.TicketInfoViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        includeTicketHeader.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelCheckInRequestParamsManagerName((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeIncludeTicketHeader((com.centerpoint.connect.databinding.IncludeTicketInfoHeaderBinding) object, fieldId);
            case 2 :
                return onChangeViewModelCheckInRequestParamsNotes((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelCheckInRequestParamsManagerName(androidx.databinding.ObservableField<java.lang.String> ViewModelCheckInRequestParamsManagerName, int fieldId) {
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
    private boolean onChangeViewModelCheckInRequestParamsNotes(androidx.databinding.ObservableField<java.lang.String> ViewModelCheckInRequestParamsNotes, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        androidx.databinding.ObservableField<java.lang.String> viewModelCheckInRequestParamsManagerName = null;
        com.centerpoint.connect.ui.global.ticket_info.CheckInFragment fragment = mFragment;
        com.centerpoint.connect.models.request.CheckInRP viewModelCheckInRequestParams = null;
        java.lang.String viewModelCheckInRequestParamsManagerNameGet = null;
        java.lang.String viewModelCheckInRequestParamsNotesGet = null;
        com.centerpoint.connect.ui.global.ticket_info.TicketInfoViewModel viewModel = mViewModel;
        androidx.databinding.ObservableField<java.lang.String> viewModelCheckInRequestParamsNotes = null;

        if ((dirtyFlags & 0x35L) != 0) {



                if (viewModel != null) {
                    // read viewModel.checkInRequestParams
                    viewModelCheckInRequestParams = viewModel.getCheckInRequestParams();
                }

            if ((dirtyFlags & 0x31L) != 0) {

                    if (viewModelCheckInRequestParams != null) {
                        // read viewModel.checkInRequestParams.managerName
                        viewModelCheckInRequestParamsManagerName = viewModelCheckInRequestParams.getManagerName();
                    }
                    updateRegistration(0, viewModelCheckInRequestParamsManagerName);


                    if (viewModelCheckInRequestParamsManagerName != null) {
                        // read viewModel.checkInRequestParams.managerName.get()
                        viewModelCheckInRequestParamsManagerNameGet = viewModelCheckInRequestParamsManagerName.get();
                    }
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (viewModelCheckInRequestParams != null) {
                        // read viewModel.checkInRequestParams.notes
                        viewModelCheckInRequestParamsNotes = viewModelCheckInRequestParams.getNotes();
                    }
                    updateRegistration(2, viewModelCheckInRequestParamsNotes);


                    if (viewModelCheckInRequestParamsNotes != null) {
                        // read viewModel.checkInRequestParams.notes.get()
                        viewModelCheckInRequestParamsNotesGet = viewModelCheckInRequestParamsNotes.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            com.centerpoint.connect.base.ViewBindingsKt.bindCustomBackground(this.cvCard, getColorFromResource(cvCard, R.color.white), (java.lang.Integer)null, (java.lang.Float)null, cvCard.getResources().getDimension(R.dimen.ticket_info_card_corners), cvCard.getResources().getDimension(R.dimen.ticket_info_card_corners));
            com.centerpoint.connect.base.ViewBindingsKt.bindCustomBackground(this.etManagerName, getColorFromResource(etManagerName, R.color.white), getColorFromResource(etManagerName, R.color.border_silver), etManagerName.getResources().getDimension(R.dimen._1sdp), etManagerName.getResources().getDimension(R.dimen._40sdp), etManagerName.getResources().getDimension(R.dimen._40sdp));
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etManagerName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etManagerNameandroidTextAttrChanged);
            com.centerpoint.connect.base.ViewBindingsKt.bindCustomBackground(this.etNotes, getColorFromResource(etNotes, R.color.white), getColorFromResource(etNotes, R.color.border_silver), etNotes.getResources().getDimension(R.dimen._1sdp), etNotes.getResources().getDimension(R.dimen.long_height_corners), etNotes.getResources().getDimension(R.dimen.long_height_corners));
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etNotes, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etNotesandroidTextAttrChanged);
            this.includeTicketHeader.setOrderId("123454");
            this.includeTicketHeader.setStage("New Service");
            this.mboundView4.setOnClickListener(mCallback40);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etManagerName, viewModelCheckInRequestParamsManagerNameGet);
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etNotes, viewModelCheckInRequestParamsNotesGet);
        }
        executeBindingsOn(includeTicketHeader);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // fragment
        com.centerpoint.connect.ui.global.ticket_info.CheckInFragment fragment = mFragment;
        // fragment != null
        boolean fragmentJavaLangObjectNull = false;



        fragmentJavaLangObjectNull = (fragment) != (null);
        if (fragmentJavaLangObjectNull) {


            fragment.onCheckInClicked();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.checkInRequestParams.managerName
        flag 1 (0x2L): includeTicketHeader
        flag 2 (0x3L): viewModel.checkInRequestParams.notes
        flag 3 (0x4L): fragment
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}