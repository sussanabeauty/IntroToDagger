package org.sussanacode.daggerapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import org.sussanacode.daggerapplication.databinding.ActivityMainBinding
import org.sussanacode.daggerapplication.di.component.AppComponent
import org.sussanacode.daggerapplication.di.component.DaggerAppComponent
import org.sussanacode.daggerapplication.di.module.AppModule
import org.sussanacode.daggerapplication.model.Color

import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding


    @Inject
    lateinit var color: Color

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val daggerAppComponent:AppComponent = DaggerAppComponent.builder().appModule(AppModule()).build()

        daggerAppComponent.inject(this)

        Log.d("Color Object", color.toString())
    }
}