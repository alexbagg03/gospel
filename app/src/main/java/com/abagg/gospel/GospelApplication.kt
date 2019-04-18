package com.abagg.gospel

import android.app.Application

class GospelApplication: Application() {

    val applicationComponent: ApplicationComponent by lazy {
        DaggerApplicationComponent.builder()
                .applicationContext(this)
                .build()
    }

}