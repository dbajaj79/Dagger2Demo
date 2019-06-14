package com.example.dagger2demo.di.simple.car;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";

    @Inject
    public Car(Wheels wheels,Engine engine)
    {

    }

    public void drive()
    {
        Log.d(TAG, "I am Driving a Car drive:");
    }
}
