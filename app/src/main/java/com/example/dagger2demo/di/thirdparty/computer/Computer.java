package com.example.dagger2demo.di.thirdparty.computer;

import android.util.Log;

public class Computer {

    private static final String TAG = "Computer";
    public Computer(HardDrive hardDrive, Monitor monitor, Ram ram) {

    }

    public void displayPrint()
    {
        Log.d(TAG, "Computer is printing displayPrint: ");
    }
}
