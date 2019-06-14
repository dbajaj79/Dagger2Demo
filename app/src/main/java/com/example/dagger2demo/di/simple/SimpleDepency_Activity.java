package com.example.dagger2demo.di.simple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dagger2demo.R;
import com.example.dagger2demo.di.compontents.CarCompontent;
import com.example.dagger2demo.di.compontents.DaggerCarCompontent;
import com.example.dagger2demo.di.simple.car.Car;

import dagger.internal.DaggerCollections;

public class SimpleDepency_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_depency_);
        CarCompontent carCompontent = DaggerCarCompontent.create();
        Car car  = carCompontent.getCar();
        car.drive();
    }
}
