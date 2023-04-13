package com.centerpoint.connect

import android.app.Application
import com.centerpoint.connect.di.components
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

/**
@author Salman Aziz
created on 2/22/21
 **/

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(components)
        }

    }
}