package com.abagg.gospel.home

import com.abagg.gospel.shared.ReusableScope
import dagger.BindsInstance
import dagger.Subcomponent

@ReusableScope
@Subcomponent
interface HomeSubcomponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(@BindsInstance homeModule: HomeModule): HomeSubcomponent
    }

}