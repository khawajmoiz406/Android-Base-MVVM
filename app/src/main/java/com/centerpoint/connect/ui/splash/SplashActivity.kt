package com.centerpoint.connect.ui.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.centerpoint.connect.R
import com.centerpoint.connect.base.BaseActivity
import com.centerpoint.connect.base.BaseViewModel
import com.centerpoint.connect.constants.SPLASH_DELAY
import com.centerpoint.connect.databinding.ActivitySplashBinding
import com.centerpoint.connect.ui.landing.LandingActivity

class SplashActivity : BaseActivity<ActivitySplashBinding>() {

    override fun getViewModel(): BaseViewModel? = null
    override fun getLayoutId() = R.layout.activity_splash
    override fun getNavHostId(): Int? = null

    private val handler: Handler by lazy {
        Handler(Looper.getMainLooper())
    }

    override fun hasConnectivity(connectivity: Boolean) {
        if (!connectivity)
            noConnectivity()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initSplash()
    }

    private fun initSplash() = handler.postDelayed({
        gotoNextActivity()
    }, SPLASH_DELAY)

    private fun gotoNextActivity() {
        startActivity(Intent(this, LandingActivity::class.java))
        finish()
    }
}