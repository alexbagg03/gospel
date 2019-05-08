package com.abagg.gospel.core

import android.content.Context
import com.abagg.gospel.home.HomeSubcomponent
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface CoreComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance applicationContext: Context): CoreComponent
    }

    val homeSubcomponentFactory: HomeSubcomponent.Factory

}