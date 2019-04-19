package com.abagg.gospel.welcome

import com.abagg.gospel.shared.ReusableScope
import dagger.BindsInstance
import dagger.Subcomponent

@ReusableScope
@Subcomponent
interface WelcomeSubcomponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(@BindsInstance welcomeModule: WelcomeModule): WelcomeSubcomponent
    }

}