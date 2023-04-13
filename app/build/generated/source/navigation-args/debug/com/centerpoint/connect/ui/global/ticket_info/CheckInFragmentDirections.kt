package com.centerpoint.connect.ui.global.ticket_info

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.centerpoint.connect.R

public class CheckInFragmentDirections private constructor() {
  public companion object {
    public fun actionCheckInFragmentToServiceInfoDetailFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_checkInFragment_to_serviceInfoDetailFragment)
  }
}
