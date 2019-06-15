package com.example.dagger2demo.di.compontentbuilder;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

abstract public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        setTitle(getTile());
    }

    protected abstract int getLayout();

    protected abstract String getTile();
}
