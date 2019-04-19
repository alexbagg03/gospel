package com.abagg.gospel.shared

import android.content.Context
import com.abagg.gospel.main.MainActivitySubcomponent
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface ApplicationComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance applicationContext: Context): ApplicationComponent
    }

    val mainActivitySubcomponentFactory: MainActivitySubcomponent.Factory

}