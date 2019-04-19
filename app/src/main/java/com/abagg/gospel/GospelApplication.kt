package com.abagg.gospel

import android.app.Application

class GospelApplication: Application() {

    companion object {
        private var applicationInstance: GospelApplication? = null

        val component: ApplicationComponent by lazy {
            DaggerApplicationComponent
                    .factory()
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