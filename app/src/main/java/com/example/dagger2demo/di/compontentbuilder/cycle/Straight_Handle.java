package com.example.dagger2demo.di.compontentbuilder.cycle;

import android.util.Log;

import javax.inject.Inject;

public class Straight_Handle implements Handle {

    private static final String TAG = "Handle";
    private int no;


    @Inject
    public Straight_Handle(int no) {
        this.no = no;
    }

    @Override
    public void move() {
        Log.d(TAG, "move:No:" + no);

    }

}
