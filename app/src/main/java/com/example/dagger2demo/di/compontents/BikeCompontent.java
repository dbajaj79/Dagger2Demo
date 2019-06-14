package com.example.dagger2demo.di.compontents;
import com.example.dagger2demo.di.inerfacedemo.bike.Bike;
import com.example.dagger2demo.di.module.DieselEngineModule;

import dagger.Component;

@Component(modules = DieselEngineModule.class)
public interface BikeCompontent {

    Bike getBike();
}
