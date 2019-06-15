package com.example.dagger2demo.di.compontents;

import com.example.dagger2demo.di.simple.SimpleDepency_Activity;
import com.example.dagger2demo.di.simple.car.Car;

import dagger.Component;

@Component
public interface CarCompontent {
    Car getCar();

    void inject(SimpleDepency_Activity simpleDepency_activity);
}
