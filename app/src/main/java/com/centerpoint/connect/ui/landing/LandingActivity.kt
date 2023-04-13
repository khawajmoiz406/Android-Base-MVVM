package com.centerpoint.connect.ui.landing

import android.content.Intent
import com.centerpoint.connect.R
import com.centerpoint.connect.base.BaseActivity
import com.centerpoint.connect.base.BaseViewModel
import com.centerpoint.connect.databinding.ActivityLandingBinding
import com.centerpoint.connect.ui.global.GlobalNavigationActivity

class LandingActivity : BaseActivity<ActivityLandingBinding>() {

    override fun getViewModel(): BaseViewModel? = null
    override fun getLayoutId() = R.layout.activity_landing
    override fun getNavHostId(): Int = R.id.nav_host_fragment
    override fun hasConnectivity(connectivity: Boolean) {
        if (!connectivity)
            noConnectivity()
    }

    fun gotoGlobalActivity() {
        startActivity(Intent(this, GlobalNavigationActivity::class.java))
        finish()
    }
}