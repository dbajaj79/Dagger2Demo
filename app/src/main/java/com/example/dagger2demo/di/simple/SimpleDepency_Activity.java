package com.example.dagger2demo.di.simple;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dagger2demo.R;
import com.example.dagger2demo.di.compontents.CarCompontent;
import com.example.dagger2demo.di.compontents.DaggerCarCompontent;
import com.example.dagger2demo.di.simple.car.Car;

import javax.inject.Inject;

public class SimpleDepency_Activity extends AppCompatActivity {

    @Inject
    public Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_depency_);
        CarCompontent carCompontent = DaggerCarCompontent.create();
        carCompontent.inject(this);
        car.drive();
    }
}
