package com.abagg.gospel

import android.app.Application
import com.abagg.gospel.shared.ApplicationComponent
import com.abagg.gospel.shared.DaggerApplicationComponent

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