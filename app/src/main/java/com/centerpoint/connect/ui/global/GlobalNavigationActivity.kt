package com.centerpoint.connect.ui.global

import android.content.Intent
import android.os.Bundle
import androidx.core.view.GravityCompat
import com.centerpoint.connect.R
import com.centerpoint.connect.base.BaseActivity
import com.centerpoint.connect.base.BaseViewModel
import com.centerpoint.connect.base.bindVisibility
import com.centerpoint.connect.base.listeners.BaseAdapterListener
import com.centerpoint.connect.base.listeners.NavigationListeners
import com.centerpoint.connect.base.listeners.ToolbarListeners
import com.centerpoint.connect.constants.ITEM_LOGOUT
import com.centerpoint.connect.databinding.ActivityGlobalNavigationBinding
import com.centerpoint.connect.models.helper.Drawer
import com.centerpoint.connect.models.helper.User
import com.centerpoint.connect.ui.global.drawer.DrawerAdapter
import com.centerpoint.connect.ui.landing.LandingActivity

class GlobalNavigationActivity : BaseActivity<ActivityGlobalNavigationBinding>(),
    BaseAdapterListener, NavigationListeners, ToolbarListeners {
    override fun getViewModel(): BaseViewModel? = null
    override fun getLayoutId() = R.layout.activity_global_navigation
    override fun getNavHostId(): Int = R.id.nav_host_fragment
    override fun hasConnectivity(connectivity: Boolean) {
        if (!connectivity)
            noConnectivity()
    }

    val adapter: DrawerAdapter by lazy { DrawerAdapter(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initToolbar()
    }

    private fun initToolbar() = binding.apply {
        navController.addOnDestinationChangedListener { _, destination, _ ->
            changeTitle(destination.label?.toString() ?: "")
        }
    }

    fun toggleDrawer() = binding.apply {
        if (drawerLayout.isDrawerOpen(GravityCompat.START))
            drawerLayout.closeDrawer(GravityCompat.START)
        else drawerLayout.openDrawer(GravityCompat.START)
    }

    fun toggleToolbar(visible: Boolean, showBackButton: Boolean) = binding.apply {
        includeToolbar.apply {
            root.bindVisibility(visible)
            showBack = showBackButton
        }
    }

    fun logoutUser() {
        sharedPref.saveModel(null, User.TYPE)
        startActivity(Intent(this, LandingActivity::class.java))
        finish()
    }

    fun onUserDataUpdated(user: User?) {
        this.user = user
        binding.includeUser.user = user
        binding.includeToolbar.user = user
    }

    fun changeTitle(str: String) = binding.apply {
        includeToolbar.tvTitle.text = str
    }

    /*
     * Drawer Adapter Click Listeners
     */
    override fun onItemClick(position: Int, item: Any) {
        item as Drawer
        when (item.fragment) {
            R.id.projectsFragment -> navigateToDestination(item.fragment, true)
            ITEM_LOGOUT -> logoutUser()
            else -> navigateToDestination(item.fragment, Bundle())
        }
        toggleDrawer()
    }


    /*
     * Side Drawer Listener
     */
    override fun onBackClicked() {
        toggleDrawer()
    }

    override fun onProfileClicked() {
        navigateToDestination(R.id.updateProfileFragment, Bundle())
        toggleDrawer()
    }

    /*
     * Toolbar Listeners
     */
    override fun onStartIconClicked() {
        if(binding.includeToolbar.showBack == true)
            onBackPressed()
        else toggleDrawer()
    }

    override fun onEndIconClicked() {
        showToast(getString(R.string.under_development))
    }

    override fun onClockClicked() {
        navigateToDestination(R.id.startDayFragment, Bundle())
    }
}