package com.centerpoint.connect;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.centerpoint.connect.databinding.ActivityGlobalNavigationBindingImpl;
import com.centerpoint.connect.databinding.ActivityLandingBindingImpl;
import com.centerpoint.connect.databinding.ActivitySplashBindingImpl;
import com.centerpoint.connect.databinding.DialogCallbackResponseBindingImpl;
import com.centerpoint.connect.databinding.FragmentAddRepairBindingImpl;
import com.centerpoint.connect.databinding.FragmentCheckInBindingImpl;
import com.centerpoint.connect.databinding.FragmentConfirmationBindingImpl;
import com.centerpoint.connect.databinding.FragmentDropLocationBindingImpl;
import com.centerpoint.connect.databinding.FragmentLocationDetailsBindingImpl;
import com.centerpoint.connect.databinding.FragmentLoginBindingImpl;
import com.centerpoint.connect.databinding.FragmentProjectsBindingImpl;
import com.centerpoint.connect.databinding.FragmentRepairDetailBindingImpl;
import com.centerpoint.connect.databinding.FragmentRepairsBindingImpl;
import com.centerpoint.connect.databinding.FragmentReviewRepairBindingImpl;
import com.centerpoint.connect.databinding.FragmentReviewWorkBindingImpl;
import com.centerpoint.connect.databinding.FragmentServiceInfoDetailBindingImpl;
import com.centerpoint.connect.databinding.FragmentServiceScheduleBindingImpl;
import com.centerpoint.connect.databinding.FragmentSignatureBindingImpl;
import com.centerpoint.connect.databinding.FragmentStartDayBindingImpl;
import com.centerpoint.connect.databinding.FragmentTicketInfoBindingImpl;
import com.centerpoint.connect.databinding.FragmentUpdateProfileBindingImpl;
import com.centerpoint.connect.databinding.IncludeBgLandingBindingImpl;
import com.centerpoint.connect.databinding.IncludeHeadingValueViewBindingImpl;
import com.centerpoint.connect.databinding.IncludeNumberTextBindingImpl;
import com.centerpoint.connect.databinding.IncludeRepairDetailContentBindingImpl;
import com.centerpoint.connect.databinding.IncludeSideDrawerBindingImpl;
import com.centerpoint.connect.databinding.IncludeTicketInfoContentBindingImpl;
import com.centerpoint.connect.databinding.IncludeTicketInfoHeaderBindingImpl;
import com.centerpoint.connect.databinding.IncludeTicketInfoHeaderTimerBindingImpl;
import com.centerpoint.connect.databinding.IncludeTicketInformatinoCardBindingImpl;
import com.centerpoint.connect.databinding.IncludeToolbarBindingImpl;
import com.centerpoint.connect.databinding.ItemDrawerBindingImpl;
import com.centerpoint.connect.databinding.ItemEstimateMaterialBindingImpl;
import com.centerpoint.connect.databinding.ItemPopupBindingImpl;
import com.centerpoint.connect.databinding.ItemRepairsBindingImpl;
import com.centerpoint.connect.databinding.ItemRepairsTabBindingImpl;
import com.centerpoint.connect.databinding.ItemServiceRepairsBindingImpl;
import com.centerpoint.connect.databinding.ItemServicesBindingImpl;
import com.centerpoint.connect.databinding.ItemTimeKeepingBindingImpl;
import com.centerpoint.connect.databinding.LayoutExpandableBindingImpl;
import com.centerpoint.connect.databinding.LayoutHeadingExpandableBindingImpl;
import com.centerpoint.connect.databinding.LayoutPopupViewBindingImpl;
import com.centerpoint.connect.databinding.LayoutSelectedViewBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYGLOBALNAVIGATION = 1;

  private static final int LAYOUT_ACTIVITYLANDING = 2;

  private static final int LAYOUT_ACTIVITYSPLASH = 3;

  private static final int LAYOUT_DIALOGCALLBACKRESPONSE = 4;

  private static final int LAYOUT_FRAGMENTADDREPAIR = 5;

  private static final int LAYOUT_FRAGMENTCHECKIN = 6;

  private static final int LAYOUT_FRAGMENTCONFIRMATION = 7;

  private static final int LAYOUT_FRAGMENTDROPLOCATION = 8;

  private static final int LAYOUT_FRAGMENTLOCATIONDETAILS = 9;

  private static final int LAYOUT_FRAGMENTLOGIN = 10;

  private static final int LAYOUT_FRAGMENTPROJECTS = 11;

  private static final int LAYOUT_FRAGMENTREPAIRDETAIL = 12;

  private static final int LAYOUT_FRAGMENTREPAIRS = 13;

  private static final int LAYOUT_FRAGMENTREVIEWREPAIR = 14;

  private static final int LAYOUT_FRAGMENTREVIEWWORK = 15;

  private static final int LAYOUT_FRAGMENTSERVICEINFODETAIL = 16;

  private static final int LAYOUT_FRAGMENTSERVICESCHEDULE = 17;

  private static final int LAYOUT_FRAGMENTSIGNATURE = 18;

  private static final int LAYOUT_FRAGMENTSTARTDAY = 19;

  private static final int LAYOUT_FRAGMENTTICKETINFO = 20;

  private static final int LAYOUT_FRAGMENTUPDATEPROFILE = 21;

  private static final int LAYOUT_INCLUDEBGLANDING = 22;

  private static final int LAYOUT_INCLUDEHEADINGVALUEVIEW = 23;

  private static final int LAYOUT_INCLUDENUMBERTEXT = 24;

  private static final int LAYOUT_INCLUDEREPAIRDETAILCONTENT = 25;

  private static final int LAYOUT_INCLUDESIDEDRAWER = 26;

  private static final int LAYOUT_INCLUDETICKETINFOCONTENT = 27;

  private static final int LAYOUT_INCLUDETICKETINFOHEADER = 28;

  private static final int LAYOUT_INCLUDETICKETINFOHEADERTIMER = 29;

  private static final int LAYOUT_INCLUDETICKETINFORMATINOCARD = 30;

  private static final int LAYOUT_INCLUDETOOLBAR = 31;

  private static final int LAYOUT_ITEMDRAWER = 32;

  private static final int LAYOUT_ITEMESTIMATEMATERIAL = 33;

  private static final int LAYOUT_ITEMPOPUP = 34;

  private static final int LAYOUT_ITEMREPAIRS = 35;

  private static final int LAYOUT_ITEMREPAIRSTAB = 36;

  private static final int LAYOUT_ITEMSERVICEREPAIRS = 37;

  private static final int LAYOUT_ITEMSERVICES = 38;

  private static final int LAYOUT_ITEMTIMEKEEPING = 39;

  private static final int LAYOUT_LAYOUTEXPANDABLE = 40;

  private static final int LAYOUT_LAYOUTHEADINGEXPANDABLE = 41;

  private static final int LAYOUT_LAYOUTPOPUPVIEW = 42;

  private static final int LAYOUT_LAYOUTSELECTEDVIEW = 43;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(43);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.centerpoint.connect.R.layout.activity_global_navigation, LAYOUT_ACTIVITYGLOBALNAVIGATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.centerpoint.connect.R.layout.activity_landing, LAYOUT_ACTIVITYLANDING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.centerpoint.connect.R.layout.activity_splash, LAYOUT_ACTIVITYSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.centerpoint.connect.R.layout.dialog_callback_response, LAYOUT_DIALOGCALLBACKRESPONSE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.centerpoint.connect.R.layout.fragment_add_repair, LAYOUT_FRAGMENTADDREPAIR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.centerpoint.connect.R.layout.fragment_check_in, LAYOUT_FRAGMENTCHECKIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.centerpoint.connect.R.layout.fragment_confirmation, LAYOUT_FRAGMENTCONFIRMATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.centerpoint.connect.R.layout.fragment_drop_location, LAYOUT_FRAGMENTDROPLOCATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.centerpoint.connect.R.layout.fragment_location_details, LAYOUT_FRAGMENTLOCATIONDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.centerpoint.connect.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.centerpoint.connect.R.layout.fragment_projects, LAYOUT_FRAGMENTPROJECTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.centerpoint.connect.R.layout.fragment_repair_detail, LAYOUT_FRAGMENTREPAIRDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.centerpoint.connect.R.layout.fragment_repairs, LAYOUT_FRAGMENTREPAIRS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.centerpoint.connect.R.layout.fragment_review_repair, LAYOUT_FRAGMENTREVIEWREPAIR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.centerpoint.connect.R.layout.fragment_review_work, LAYOUT_FRAGMENTREVIEWWORK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.centerpoint.connect.R.layout.fragment_service_info_detail, LAYOUT_FRAGMENTSERVICEINFODETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.centerpoint.connect.R.layout.fragment_service_schedule, LAYOUT_FRAGMENTSERVICESCHEDULE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.centerpoint.connect.R.layout.fragment_signature, LAYOUT_FRAGMENTSIGNATURE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.centerpoint.connect.R.layout.fragment_start_day, LAYOUT_FRAGMENTSTARTDAY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.centerpoint.connect.R.layout.fragment_ticket_info, LAYOUT_FRAGMENTTICKETINFO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.centerpoint.connect.R.layout.fragment_update_profile, LAYOUT_FRAGMENTUPDATEPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.centerpoint.connect.R.layout.include_bg_landing, LAYOUT_INCLUDEBGLANDING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.centerpoint.connect.R.layout.include_heading_value_view, LAYOUT_INCLUDEHEADINGVALUEVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.centerpoint.connect.R.layout.include_number_text, LAYOUT_INCLUDENUMBERTEXT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.centerpoint.connect.R.layout.include_repair_detail_content, LAYOUT_INCLUDEREPAIRDETAILCONTENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.centerpoint.connect.R.layout.include_side_drawer, LAYOUT_INCLUDESIDEDRAWER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.centerpoint.connect.R.layout.include_ticket_info_content, LAYOUT_INCLUDETICKETINFOCONTENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.centerpoint.connect.R.layout.include_ticket_info_header, LAYOUT_INCLUDETICKETINFOHEADER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.centerpoint.connect.R.layout.include_ticket_info_header_timer, LAYOUT_INCLUDETICKETINFOHEADERTIMER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.centerpoint.connect.R.layout.include_ticket_informatino_card, LAYOUT_INCLUDETICKETINFORMATINOCARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.centerpoint.connect.R.layout.include_toolbar, LAYOUT_INCLUDETOOLBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.centerpoint.connect.R.layout.item_drawer, LAYOUT_ITEMDRAWER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.centerpoint.connect.R.layout.item_estimate_material, LAYOUT_ITEMESTIMATEMATERIAL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.centerpoint.connect.R.layout.item_popup, LAYOUT_ITEMPOPUP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.centerpoint.connect.R.layout.item_repairs, LAYOUT_ITEMREPAIRS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.centerpoint.connect.R.layout.item_repairs_tab, LAYOUT_ITEMREPAIRSTAB);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.centerpoint.connect.R.layout.item_service_repairs, LAYOUT_ITEMSERVICEREPAIRS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.centerpoint.connect.R.layout.item_services, LAYOUT_ITEMSERVICES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.centerpoint.connect.R.layout.item_time_keeping, LAYOUT_ITEMTIMEKEEPING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.centerpoint.connect.R.layout.layout_expandable, LAYOUT_LAYOUTEXPANDABLE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.centerpoint.connect.R.layout.layout_heading_expandable, LAYOUT_LAYOUTHEADINGEXPANDABLE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.centerpoint.connect.R.layout.layout_popup_view, LAYOUT_LAYOUTPOPUPVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.centerpoint.connect.R.layout.layout_selected_view, LAYOUT_LAYOUTSELECTEDVIEW);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYGLOBALNAVIGATION: {
          if ("layout/activity_global_navigation_0".equals(tag)) {
            return new ActivityGlobalNavigationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_global_navigation is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLANDING: {
          if ("layout/activity_landing_0".equals(tag)) {
            return new ActivityLandingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_landing is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSPLASH: {
          if ("layout/activity_splash_0".equals(tag)) {
            return new ActivitySplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGCALLBACKRESPONSE: {
          if ("layout/dialog_callback_response_0".equals(tag)) {
            return new DialogCallbackResponseBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_callback_response is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTADDREPAIR: {
          if ("layout/fragment_add_repair_0".equals(tag)) {
            return new FragmentAddRepairBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_add_repair is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCHECKIN: {
          if ("layout/fragment_check_in_0".equals(tag)) {
            return new FragmentCheckInBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_check_in is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCONFIRMATION: {
          if ("layout/fragment_confirmation_0".equals(tag)) {
            return new FragmentConfirmationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_confirmation is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDROPLOCATION: {
          if ("layout/fragment_drop_location_0".equals(tag)) {
            return new FragmentDropLocationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_drop_location is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLOCATIONDETAILS: {
          if ("layout/fragment_location_details_0".equals(tag)) {
            return new FragmentLocationDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_location_details is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLOGIN: {
          if ("layout/fragment_login_0".equals(tag)) {
            return new FragmentLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_login is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPROJECTS: {
          if ("layout/fragment_projects_0".equals(tag)) {
            return new FragmentProjectsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_projects is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTREPAIRDETAIL: {
          if ("layout/fragment_repair_detail_0".equals(tag)) {
            return new FragmentRepairDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_repair_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTREPAIRS: {
          if ("layout/fragment_repairs_0".equals(tag)) {
            return new FragmentRepairsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_repairs is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTREVIEWREPAIR: {
          if ("layout/fragment_review_repair_0".equals(tag)) {
            return new FragmentReviewRepairBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_review_repair is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTREVIEWWORK: {
          if ("layout/fragment_review_work_0".equals(tag)) {
            return new FragmentReviewWorkBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_review_work is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSERVICEINFODETAIL: {
          if ("layout/fragment_service_info_detail_0".equals(tag)) {
            return new FragmentServiceInfoDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_service_info_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSERVICESCHEDULE: {
          if ("layout/fragment_service_schedule_0".equals(tag)) {
            return new FragmentServiceScheduleBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_service_schedule is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSIGNATURE: {
          if ("layout/fragment_signature_0".equals(tag)) {
            return new FragmentSignatureBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_signature is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSTARTDAY: {
          if ("layout/fragment_start_day_0".equals(tag)) {
            return new FragmentStartDayBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_start_day is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTICKETINFO: {
          if ("layout/fragment_ticket_info_0".equals(tag)) {
            return new FragmentTicketInfoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_ticket_info is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTUPDATEPROFILE: {
          if ("layout/fragment_update_profile_0".equals(tag)) {
            return new FragmentUpdateProfileBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_update_profile is invalid. Received: " + tag);
        }
        case  LAYOUT_INCLUDEBGLANDING: {
          if ("layout/include_bg_landing_0".equals(tag)) {
            return new IncludeBgLandingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for include_bg_landing is invalid. Received: " + tag);
        }
        case  LAYOUT_INCLUDEHEADINGVALUEVIEW: {
          if ("layout/include_heading_value_view_0".equals(tag)) {
            return new IncludeHeadingValueViewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for include_heading_value_view is invalid. Received: " + tag);
        }
        case  LAYOUT_INCLUDENUMBERTEXT: {
          if ("layout/include_number_text_0".equals(tag)) {
            return new IncludeNumberTextBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for include_number_text is invalid. Received: " + tag);
        }
        case  LAYOUT_INCLUDEREPAIRDETAILCONTENT: {
          if ("layout/include_repair_detail_content_0".equals(tag)) {
            return new IncludeRepairDetailContentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for include_repair_detail_content is invalid. Received: " + tag);
        }
        case  LAYOUT_INCLUDESIDEDRAWER: {
          if ("layout/include_side_drawer_0".equals(tag)) {
            return new IncludeSideDrawerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for include_side_drawer is invalid. Received: " + tag);
        }
        case  LAYOUT_INCLUDETICKETINFOCONTENT: {
          if ("layout/include_ticket_info_content_0".equals(tag)) {
            return new IncludeTicketInfoContentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for include_ticket_info_content is invalid. Received: " + tag);
        }
        case  LAYOUT_INCLUDETICKETINFOHEADER: {
          if ("layout/include_ticket_info_header_0".equals(tag)) {
            return new IncludeTicketInfoHeaderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for include_ticket_info_header is invalid. Received: " + tag);
        }
        case  LAYOUT_INCLUDETICKETINFOHEADERTIMER: {
          if ("layout/include_ticket_info_header_timer_0".equals(tag)) {
            return new IncludeTicketInfoHeaderTimerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for include_ticket_info_header_timer is invalid. Received: " + tag);
        }
        case  LAYOUT_INCLUDETICKETINFORMATINOCARD: {
          if ("layout/include_ticket_informatino_card_0".equals(tag)) {
            return new IncludeTicketInformatinoCardBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for include_ticket_informatino_card is invalid. Received: " + tag);
        }
        case  LAYOUT_INCLUDETOOLBAR: {
          if ("layout/include_toolbar_0".equals(tag)) {
            return new IncludeToolbarBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for include_toolbar is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMDRAWER: {
          if ("layout/item_drawer_0".equals(tag)) {
            return new ItemDrawerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_drawer is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMESTIMATEMATERIAL: {
          if ("layout/item_estimate_material_0".equals(tag)) {
            return new ItemEstimateMaterialBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_estimate_material is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMPOPUP: {
          if ("layout/item_popup_0".equals(tag)) {
            return new ItemPopupBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_popup is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMREPAIRS: {
          if ("layout/item_repairs_0".equals(tag)) {
            return new ItemRepairsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_repairs is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMREPAIRSTAB: {
          if ("layout/item_repairs_tab_0".equals(tag)) {
            return new ItemRepairsTabBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_repairs_tab is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSERVICEREPAIRS: {
          if ("layout/item_service_repairs_0".equals(tag)) {
            return new ItemServiceRepairsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_service_repairs is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSERVICES: {
          if ("layout/item_services_0".equals(tag)) {
            return new ItemServicesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_services is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMTIMEKEEPING: {
          if ("layout/item_time_keeping_0".equals(tag)) {
            return new ItemTimeKeepingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_time_keeping is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTEXPANDABLE: {
          if ("layout/layout_expandable_0".equals(tag)) {
            return new LayoutExpandableBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_expandable is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTHEADINGEXPANDABLE: {
          if ("layout/layout_heading_expandable_0".equals(tag)) {
            return new LayoutHeadingExpandableBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_heading_expandable is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTPOPUPVIEW: {
          if ("layout/layout_popup_view_0".equals(tag)) {
            return new LayoutPopupViewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_popup_view is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTSELECTEDVIEW: {
          if ("layout/layout_selected_view_0".equals(tag)) {
            return new LayoutSelectedViewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_selected_view is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(2);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new com.github.gcacace.signaturepad.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(19);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "activity");
      sKeys.put(2, "adapter");
      sKeys.put(3, "data");
      sKeys.put(4, "expanded");
      sKeys.put(5, "fragment");
      sKeys.put(6, "heading");
      sKeys.put(7, "hideLine");
      sKeys.put(8, "itemCount");
      sKeys.put(9, "listeners");
      sKeys.put(10, "orderId");
      sKeys.put(11, "position");
      sKeys.put(12, "showBack");
      sKeys.put(13, "stage");
      sKeys.put(14, "title");
      sKeys.put(15, "user");
      sKeys.put(16, "value");
      sKeys.put(17, "valueColor");
      sKeys.put(18, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(43);

    static {
      sKeys.put("layout/activity_global_navigation_0", com.centerpoint.connect.R.layout.activity_global_navigation);
      sKeys.put("layout/activity_landing_0", com.centerpoint.connect.R.layout.activity_landing);
      sKeys.put("layout/activity_splash_0", com.centerpoint.connect.R.layout.activity_splash);
      sKeys.put("layout/dialog_callback_response_0", com.centerpoint.connect.R.layout.dialog_callback_response);
      sKeys.put("layout/fragment_add_repair_0", com.centerpoint.connect.R.layout.fragment_add_repair);
      sKeys.put("layout/fragment_check_in_0", com.centerpoint.connect.R.layout.fragment_check_in);
      sKeys.put("layout/fragment_confirmation_0", com.centerpoint.connect.R.layout.fragment_confirmation);
      sKeys.put("layout/fragment_drop_location_0", com.centerpoint.connect.R.layout.fragment_drop_location);
      sKeys.put("layout/fragment_location_details_0", com.centerpoint.connect.R.layout.fragment_location_details);
      sKeys.put("layout/fragment_login_0", com.centerpoint.connect.R.layout.fragment_login);
      sKeys.put("layout/fragment_projects_0", com.centerpoint.connect.R.layout.fragment_projects);
      sKeys.put("layout/fragment_repair_detail_0", com.centerpoint.connect.R.layout.fragment_repair_detail);
      sKeys.put("layout/fragment_repairs_0", com.centerpoint.connect.R.layout.fragment_repairs);
      sKeys.put("layout/fragment_review_repair_0", com.centerpoint.connect.R.layout.fragment_review_repair);
      sKeys.put("layout/fragment_review_work_0", com.centerpoint.connect.R.layout.fragment_review_work);
      sKeys.put("layout/fragment_service_info_detail_0", com.centerpoint.connect.R.layout.fragment_service_info_detail);
      sKeys.put("layout/fragment_service_schedule_0", com.centerpoint.connect.R.layout.fragment_service_schedule);
      sKeys.put("layout/fragment_signature_0", com.centerpoint.connect.R.layout.fragment_signature);
      sKeys.put("layout/fragment_start_day_0", com.centerpoint.connect.R.layout.fragment_start_day);
      sKeys.put("layout/fragment_ticket_info_0", com.centerpoint.connect.R.layout.fragment_ticket_info);
      sKeys.put("layout/fragment_update_profile_0", com.centerpoint.connect.R.layout.fragment_update_profile);
      sKeys.put("layout/include_bg_landing_0", com.centerpoint.connect.R.layout.include_bg_landing);
      sKeys.put("layout/include_heading_value_view_0", com.centerpoint.connect.R.layout.include_heading_value_view);
      sKeys.put("layout/include_number_text_0", com.centerpoint.connect.R.layout.include_number_text);
      sKeys.put("layout/include_repair_detail_content_0", com.centerpoint.connect.R.layout.include_repair_detail_content);
      sKeys.put("layout/include_side_drawer_0", com.centerpoint.connect.R.layout.include_side_drawer);
      sKeys.put("layout/include_ticket_info_content_0", com.centerpoint.connect.R.layout.include_ticket_info_content);
      sKeys.put("layout/include_ticket_info_header_0", com.centerpoint.connect.R.layout.include_ticket_info_header);
      sKeys.put("layout/include_ticket_info_header_timer_0", com.centerpoint.connect.R.layout.include_ticket_info_header_timer);
      sKeys.put("layout/include_ticket_informatino_card_0", com.centerpoint.connect.R.layout.include_ticket_informatino_card);
      sKeys.put("layout/include_toolbar_0", com.centerpoint.connect.R.layout.include_toolbar);
      sKeys.put("layout/item_drawer_0", com.centerpoint.connect.R.layout.item_drawer);
      sKeys.put("layout/item_estimate_material_0", com.centerpoint.connect.R.layout.item_estimate_material);
      sKeys.put("layout/item_popup_0", com.centerpoint.connect.R.layout.item_popup);
      sKeys.put("layout/item_repairs_0", com.centerpoint.connect.R.layout.item_repairs);
      sKeys.put("layout/item_repairs_tab_0", com.centerpoint.connect.R.layout.item_repairs_tab);
      sKeys.put("layout/item_service_repairs_0", com.centerpoint.connect.R.layout.item_service_repairs);
      sKeys.put("layout/item_services_0", com.centerpoint.connect.R.layout.item_services);
      sKeys.put("layout/item_time_keeping_0", com.centerpoint.connect.R.layout.item_time_keeping);
      sKeys.put("layout/layout_expandable_0", com.centerpoint.connect.R.layout.layout_expandable);
      sKeys.put("layout/layout_heading_expandable_0", com.centerpoint.connect.R.layout.layout_heading_expandable);
      sKeys.put("layout/layout_popup_view_0", com.centerpoint.connect.R.layout.layout_popup_view);
      sKeys.put("layout/layout_selected_view_0", com.centerpoint.connect.R.layout.layout_selected_view);
    }
  }
}
