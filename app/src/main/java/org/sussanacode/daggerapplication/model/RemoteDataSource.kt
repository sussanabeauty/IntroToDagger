package org.sussanacode.daggerapplication.model

import android.util.Log
import org.sussanacode.daggerapplication.di.component.AppComponent
import org.sussanacode.daggerapplication.di.component.DaggerAppComponent
import org.sussanacode.daggerapplication.di.module.AppModule
import javax.inject.Inject

//tell dagger to create a constructor of this class
class RemoteDataSource  @Inject constructor(){


    @Inject //declaring a field injection
    lateinit var car: Car


    init{
        val daggerAppComponent: AppComponent = DaggerAppComponent.builder().appModule(AppModule()).build()

        daggerAppComponent.inject(this)

        Log.d("Car Object From RemoteDataSource", car.toString())

    }

}