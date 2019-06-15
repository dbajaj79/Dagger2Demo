package com.example.dagger2demo.di.compontentbuilder.cycle;

import android.util.Log;

import javax.inject.Inject;

public class Cycle {

    private static final String TAG = "Cycle";
    private Seat seat;
    private Handle handle;
    private Tyres tyres;

    @Inject
    public Cycle(Seat seat, Handle handle, Tyres tyres) {
        this.seat = seat;
        this.handle = handle;
        this.tyres = tyres;
    }

    public void paddling()
    {
        handle.move();
        Log.d(TAG, "paddling: Cycle is Paddling");
    }
}
