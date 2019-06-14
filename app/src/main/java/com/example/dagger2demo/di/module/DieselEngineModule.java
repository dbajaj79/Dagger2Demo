package com.example.dagger2demo.di.module;

import com.example.dagger2demo.di.inerfacedemo.bike.engine.DieselEngine;
import com.example.dagger2demo.di.inerfacedemo.bike.engine.Engine;

import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {

    @Provides
    Engine provideDesielEngine(DieselEngine dieselEngine)
    {
        return dieselEngine;
    }
}
