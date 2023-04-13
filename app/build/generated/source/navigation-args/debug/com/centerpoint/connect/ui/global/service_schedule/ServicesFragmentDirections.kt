package com.centerpoint.connect.ui.global.service_schedule

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.centerpoint.connect.R

public class ServicesFragmentDirections private constructor() {
  public companion object {
    public fun actionServicesFragmentToTicketInfoFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_servicesFragment_to_ticketInfoFragment)
  }
}
