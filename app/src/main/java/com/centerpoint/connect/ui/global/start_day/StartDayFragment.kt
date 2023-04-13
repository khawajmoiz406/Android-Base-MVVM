package com.centerpoint.connect.ui.global.start_day

import android.os.Bundle
import android.view.View
import com.centerpoint.connect.R
import com.centerpoint.connect.base.BaseFragment
import com.centerpoint.connect.base.BaseViewModel
import com.centerpoint.connect.constants.CHECK_IN
import com.centerpoint.connect.constants.CHECK_OUT
import com.centerpoint.connect.databinding.FragmentStartDayBinding
import com.centerpoint.connect.models.helper.ResponseCallback
import com.centerpoint.connect.models.response.attendance.AttendanceResponse
import org.koin.androidx.viewmodel.ext.android.viewModel

class StartDayFragment : BaseFragment<FragmentStartDayBinding>() {

    override fun getViewModel(): BaseViewModel = viewModel
    override fun getLayoutId(): Int = R.layout.fragment_start_day

    private val viewModel by viewModel<StartDayViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() {
        linkLiveData()
        viewModel.getCostCodeList()
    }

    private fun linkLiveData() = viewModel.apply {
        costCodesLiveData.observe(viewLifecycleOwner) {
            val strList = it.list?.map { item -> item.name.toString() }
            binding.dsvCostCode.mItemsList = strList ?: listOf()
        }
        attendanceLiveData.observe(viewLifecycleOwner) {
            onAttendanceResponse(it)
        }
    }

    private fun onAttendanceResponse(data: AttendanceResponse) {
        onUserUpdated(getUserData()?.apply { attendance = data.attendance })
        if (data.attendance == CHECK_OUT)
            onApiResponse(ResponseCallback.getErrorCallback(getString(R.string.check_out_successfully)))
        else
            onApiResponse(ResponseCallback.getSuccessCallback(getString(R.string.check_in_successfully)))
        onBackPress()
    }

    fun verifyFields() = viewModel.let {
        val indexOfSelected = it.costCodesLiveData.value
            ?.list
            ?.indexOfFirst { item -> item.name.equals(binding.dsvCostCode.mSelected) }

        indexOfSelected?.let { index ->
            if (index == -1) showToast(getString(R.string.select_cost_code))
            else {
//                val selectedCostCode = it.costCodesLiveData.value?.list?.get(index)
                val attendanceType =
                    if (getUserData()?.attendance == CHECK_OUT) CHECK_IN else CHECK_OUT
                it.markAttendance(attendanceType)
            }
        }
    }
}