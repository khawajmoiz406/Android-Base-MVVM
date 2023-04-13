package com.centerpoint.connect.ui.global.ticket_info

import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import com.centerpoint.connect.api.Result
import com.centerpoint.connect.base.BaseRequestParams
import com.centerpoint.connect.base.BaseViewModel
import com.centerpoint.connect.models.request.CheckInRP
import com.centerpoint.connect.models.response.services.ServicesResponse
import com.centerpoint.connect.repository.ServicesRepository
import com.centerpoint.connect.repository.TicketInfoRepository
import com.centerpoint.connect.util.EncryptSharedPref

class TicketInfoViewModel(
    private val remoteRepo: TicketInfoRepository,
    private val sharedPreferences: EncryptSharedPref
) : BaseViewModel() {

    val checkInRequestParams = CheckInRP()
}