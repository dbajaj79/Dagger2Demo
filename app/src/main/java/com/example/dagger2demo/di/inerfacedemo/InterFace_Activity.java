package com.example.dagger2demo.di.inerfacedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dagger2demo.R;
import com.example.dagger2demo.di.compontents.BikeCompontent;
import com.example.dagger2demo.di.compontents.DaggerBikeCompontent;
import com.example.dagger2demo.di.inerfacedemo.bike.Bike;

public class InterFace_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inter_face);
        BikeCompontent bikeCompontent = DaggerBikeCompontent.create();
        Bike bike = bikeCompontent.getBike();
        bike.drive();


    }
}
