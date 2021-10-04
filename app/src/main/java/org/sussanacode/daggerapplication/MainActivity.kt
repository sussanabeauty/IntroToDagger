package org.sussanacode.daggerapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import org.sussanacode.daggerapplication.databinding.ActivityMainBinding
import org.sussanacode.daggerapplication.di.component.AppComponent
import org.sussanacode.daggerapplication.di.component.DaggerAppComponent
import org.sussanacode.daggerapplication.di.module.AppModule
import org.sussanacode.daggerapplication.model.Car
import org.sussanacode.daggerapplication.model.Color
import org.sussanacode.daggerapplication.model.DataRepository
import org.sussanacode.daggerapplication.model.Engine

import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    @Inject //declaring a field injection
    lateinit var car: Car

    @Inject
    lateinit var engine: Engine

    @Inject
    lateinit var color: Color

    @Inject
    lateinit var dataRepository: DataRepository


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val daggerAppComponent:AppComponent = DaggerAppComponent.builder().appModule(AppModule()).build()

        daggerAppComponent.inject(this)

//        Log.d("Car Object", car.toString())
        Log.d("Engine Object", engine.toString())
        Log.d("Color Object", color.toString())

        //Log.d("Data Repo Object", dataRepository.toString())
    }
}