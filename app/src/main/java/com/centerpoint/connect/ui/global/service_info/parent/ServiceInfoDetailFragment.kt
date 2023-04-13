package com.centerpoint.connect.ui.global.service_info.parent

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.lifecycleScope
import com.centerpoint.connect.R
import com.centerpoint.connect.base.BaseFragment
import com.centerpoint.connect.base.BaseViewModel
import com.centerpoint.connect.base.bindVisibility
import com.centerpoint.connect.base.listeners.BaseAdapterListener
import com.centerpoint.connect.constants.*
import com.centerpoint.connect.databinding.FragmentServiceInfoDetailBinding
import com.centerpoint.connect.models.helper.RepairTab
import com.centerpoint.connect.ui.global.service_info.add_repair.AddRepairFragment
import com.centerpoint.connect.ui.global.service_info.add_repair.DropLocationFragment
import com.centerpoint.connect.ui.global.service_info.add_repair.ReviewRepairFragment
import com.centerpoint.connect.ui.global.service_info.confirmation.ConfirmationFragment
import com.centerpoint.connect.ui.global.service_info.confirmation.SignatureFragment
import com.centerpoint.connect.ui.global.service_info.parent.adapter.RepairTabAdapter
import com.centerpoint.connect.ui.global.service_info.repairs.RepairsDetailFragment
import com.centerpoint.connect.ui.global.service_info.repairs.RepairsFragment
import com.centerpoint.connect.ui.global.service_info.review_work.ReviewWorkFragment
import com.centerpoint.connect.util.StopwatchUtils
import org.koin.androidx.viewmodel.ext.android.viewModel

class ServiceInfoDetailFragment : BaseFragment<FragmentServiceInfoDetailBinding>(),
    BaseAdapterListener {

    override fun getViewModel(): BaseViewModel = viewModel
    override fun getLayoutId(): Int = R.layout.fragment_service_info_detail
    override fun showBackButton(): Boolean = true

    val viewModel by viewModel<ServiceInfoDetailViewModel>()
    val adapter by lazy { RepairTabAdapter(this) }

    private var requestCode = REPAIRS_REQUEST_CODE

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() {
        playPauseStopwatch(if (firstTime) true else StopwatchUtils.isWatchRunning())
        replaceFragmentAccordingly(requestCode)
        firstTime = false
    }

    private fun playPauseStopwatch(start: Boolean) {
        if (start)
            StopwatchUtils.start(lifecycleScope.coroutineContext) { viewModel.clockTime.set(it) }
        else StopwatchUtils.stop(false)
        viewModel.isWatchRunning.set(StopwatchUtils.isWatchRunning())
    }

    private fun replaceFragment(
        fragment: Fragment,
        addToBackStack: Boolean = true,
        clearStack: Boolean = false,
        bundle: Bundle? = null
    ) {
        childFragmentManager.apply {
            val fragmentToAdd = fragments.firstOrNull {
                fragment.javaClass.simpleName == it.javaClass.simpleName
            }
            if (fragmentToAdd == null) beginTransaction().apply {
                if (clearStack) popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE)
                replace(R.id.fragmentContainer, fragment.apply { arguments = bundle })
                if (addToBackStack) addToBackStack(fragment.javaClass.simpleName)
                commitAllowingStateLoss()
            }
        }
    }

    fun replaceFragmentAccordingly(requestCode: Int, bundle: Bundle? = null) = when (requestCode) {
        ADD_REPAIR_REQUEST_CODE -> replaceFragment(AddRepairFragment(), bundle = bundle)
        ADD_SITE_BID_REQUEST_CODE -> replaceFragment(AddRepairFragment(), bundle = bundle)
        DROP_LOCATION_REQUEST_CODE -> replaceFragment(DropLocationFragment(), bundle = bundle)
        REVIEW_REPAIR_REQUEST_CODE -> replaceFragment(ReviewRepairFragment(), bundle = bundle)
        REPAIR_DETAIL_REQUEST_CODE -> replaceFragment(RepairsDetailFragment(), bundle = bundle)
        REVIEW_WORK_REQUEST_CODE -> replaceFragment(ReviewWorkFragment(), bundle = bundle)
        CONFIRMATION_REQUEST_CODE -> replaceFragment(ConfirmationFragment(), bundle = bundle)
        SIGNATURE_REQUEST_CODE -> replaceFragment(SignatureFragment(), bundle = bundle)
        REPAIRS_REQUEST_CODE -> replaceFragment(
            fragment = RepairsFragment(),
            addToBackStack = false,
            clearStack = true
        )
        else -> {}
    }.also { this@ServiceInfoDetailFragment.requestCode = requestCode }

    fun updateTabAccordingly(requestCode: Int, state: RepairTab.State) {
        val list = adapter.data()
        val indexOfSelected = list.indexOfFirst { (it as RepairTab).requestCode == requestCode }
        if (indexOfSelected != -1) {
            if (state == RepairTab.State.SELECTED) list.forEachIndexed { index, item ->
                (item as RepairTab).state = when {
                    item.state == RepairTab.State.SELECTED && index != indexOfSelected -> RepairTab.State.DISABLED
                    index == indexOfSelected -> RepairTab.State.SELECTED
                    else -> item.state
                }
            } else (list[indexOfSelected] as RepairTab).state = state
            adapter.updateDate(list)
        }
    }

    fun toggleStopwatch() {
        playPauseStopwatch(!StopwatchUtils.isWatchRunning())
    }

    fun toggleStopwatchView(visible: Boolean) = binding.includeHeader.root.bindVisibility(visible)

    fun toggleTabs(visible: Boolean) = binding.rvTabs.bindVisibility(visible)

    fun getSelectedTabId() =
        adapter.data().firstOrNull { (it as RepairTab).state == RepairTab.State.SELECTED } as RepairTab

    override fun onDestroy() {
        super.onDestroy()
        StopwatchUtils.stop(true)
    }

    /*
     * Tab Item Click Listeners
     */
    override fun onItemClick(position: Int, item: Any) {
        item as RepairTab
        if (item.requestCode == ADD_SITE_BID_REQUEST_CODE) {
            replaceFragmentAccordingly(
                item.requestCode,
                Bundle().apply { putBoolean("SITE_BID", true) })
            updateTabAccordingly(item.requestCode, RepairTab.State.SELECTED)
        }
    }
}