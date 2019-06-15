package com.example.dagger2demo.di.dyanmicvalue.mobile;

import android.util.Log;

import javax.inject.Inject;

public class Processor {

    private static final String TAG = "Processor";
    private int version;

    @Inject
    public Processor(int version) {
        this.version = version;
    }

    public void displayProcess()
    {
        Log.d(TAG, "displayProcess: Processor Version"+version);
    }
}
