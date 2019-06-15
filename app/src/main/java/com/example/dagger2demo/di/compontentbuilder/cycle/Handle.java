package com.example.dagger2demo.di.compontentbuilder.cycle;

import android.util.Log;

public class Handle {
    private static final String TAG = "Handle";
    private int no;

    public Handle(int no) {
        this.no = no;
    }

    public void move() {
        Log.d(TAG, "move:No:" + no);

    }
}
