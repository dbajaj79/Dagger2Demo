package com.example.dagger2demo.di.module;

import com.example.dagger2demo.di.inerfacedemo.bike.engine.Engine;
import com.example.dagger2demo.di.inerfacedemo.bike.engine.PetrolEngine;

import dagger.Module;
import dagger.Provides;

@Module
public class BikeModule {

    @Provides
    Engine provideEngine(PetrolEngine engine)
    {
        return engine;
    }

}
