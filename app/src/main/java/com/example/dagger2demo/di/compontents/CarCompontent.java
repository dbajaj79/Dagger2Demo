package com.example.dagger2demo.di.compontents;

import com.example.dagger2demo.di.simple.car.Car;

import dagger.Component;

@Component
public interface CarCompontent {
    Car getCar();
}
