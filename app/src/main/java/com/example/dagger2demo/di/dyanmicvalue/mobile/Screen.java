package com.example.dagger2demo.di.dyanmicvalue.mobile;

import android.util.Log;

import javax.inject.Inject;

public class Screen {

    private static final String TAG = "Screen";
    @Inject
    public Screen() {
    }

    public void  display()
    {
        Log.d(TAG, "display:Screen is Display WallPapers");
    }
}
