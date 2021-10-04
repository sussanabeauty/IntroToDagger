package org.sussanacode.daggerapplication.di.component

import dagger.Component
import org.sussanacode.daggerapplication.MainActivity
import org.sussanacode.daggerapplication.di.module.AppModule

//tell dagger to use dependency from respective module and inject to activity

@Component(modules = arrayOf(AppModule::class) ) //telling dagger to use the dependency from this module
interface AppComponent {

    fun inject(mainActivity: MainActivity){}

}