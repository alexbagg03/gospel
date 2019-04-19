package com.abagg.gospel

import android.content.Context
import com.abagg.gospel.home.HomeSubcomponent
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

    val homeSubcomponentFactory: HomeSubcomponent.Factory

}