package com.example.dagger2demo.di.inerfacedemo.bike.engine;


import android.util.Log;

import javax.inject.Inject;

public class PetrolEngine implements Engine {
    private static final String TAG = "PetrolEngine";

    @Inject
    public PetrolEngine()
    {

    }

    @Override
    public void start() {
        Log.d(TAG, "Petrol Engine is started: ");
    }
}
