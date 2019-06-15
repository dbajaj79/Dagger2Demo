package com.example.dagger2demo.di.thirdparty;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.KeyEventDispatcher;

import android.os.Bundle;

import com.example.dagger2demo.R;
import com.example.dagger2demo.di.compontents.ComputerCompontent;
import com.example.dagger2demo.di.compontents.DaggerComputerCompontent;
import com.example.dagger2demo.di.thirdparty.computer.Computer;

import javax.inject.Inject;

public class ThirdParty_Activity extends AppCompatActivity {

    @Inject
    public Computer computer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_party_);
        ComputerCompontent computerCompontent = DaggerComputerCompontent.create();
        Computer computer = computerCompontent.getComputer();
        computer.displayPrint();

    }
}
