package com.example.dagger2demo.di.dyanmicvalue.mobile;

import android.util.Log;

import javax.inject.Inject;

public class Mobile {

    private static final String TAG = "Mobile";
    private Processor processor;
    private Screen screen;

    @Inject
    public Mobile(Processor processor, Screen screen) {
        this.processor = processor;
        this.screen = screen;
    }

    public void playingMovie()
    {
        processor.displayProcess();
        Log.d(TAG, "playingMovie: On Movie");
    }
}
