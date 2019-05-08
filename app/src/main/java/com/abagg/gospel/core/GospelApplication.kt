package com.abagg.gospel.core

import android.app.Application

class GospelApplication: Application() {

    companion object {
        private var applicationInstance: GospelApplication? = null

        val component: CoreComponent by lazy {
            DaggerCoreComponent.factory()
                    .create(getApplicationInstance())
        }

        private fun getApplicationInstance(): GospelApplication {
            if (applicationInstance == null) {
                applicationInstance = GospelApplication()
            }
            return applicationInstance!!
        }
    }

}