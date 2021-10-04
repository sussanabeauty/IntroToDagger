package org.sussanacode.daggerapplication.di.module

import dagger.Module
import dagger.Provides
import org.sussanacode.daggerapplication.model.Car
import org.sussanacode.daggerapplication.model.Color
import org.sussanacode.daggerapplication.model.Engine
import javax.inject.Named

//where we declare all dependencies
@Module
class AppModule {

    @Provides
    fun providesColor(): Color{
        return Color("Red", "Green", "Blue")
    }


    @Provides
    fun providesEngine(color: Color): Engine{
        return Engine("Electric", "Ford", color)
    }


    @Provides
    fun providesCar(@Named("Maker") maker: String,  @Named("Price") carPrice: Double, color: Color, engine: Engine): Car{
        return Car(maker, carPrice , engine, color)
    }

    @Named("Maker")
    @Provides
    fun provideStringMaker():String{ return "Ford" }

    @Named("Price")
    @Provides
    fun provideDouble():Double{ return 5400.00 }
}