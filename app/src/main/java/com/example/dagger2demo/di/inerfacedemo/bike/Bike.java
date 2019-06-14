package com.example.dagger2demo.di.inerfacedemo.bike;

import android.util.Log;

import com.example.dagger2demo.di.inerfacedemo.bike.engine.Engine;

import javax.inject.Inject;

public class Bike {

    private static final String TAG = "Bike";
    private Engine engine;


    @Inject
    public Bike(Engine engine, HeadLight headLight, Wheels wheels)
    {
        this.engine = engine;
    }

    public void drive()
    {
        engine.start();
        Log.d(TAG, "drive: Motor Cycle");
    }
}
