package com.abagg.gospel.main

import com.abagg.gospel.shared.ReusableScope
import dagger.BindsInstance
import dagger.Subcomponent

@ReusableScope
@Subcomponent
interface MainActivitySubcomponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(@BindsInstance mainActivityModule: MainActivityModule): MainActivitySubcomponent
    }

}