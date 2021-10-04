package org.sussanacode.daggerapplication.di.module

import dagger.Module
import dagger.Provides
import org.sussanacode.daggerapplication.model.Color

//where we declare all dependencies
@Module
class AppModule {

    @Provides
    fun providesColor(): Color{
        return Color("Red", "Green", "Blue")
    }
}