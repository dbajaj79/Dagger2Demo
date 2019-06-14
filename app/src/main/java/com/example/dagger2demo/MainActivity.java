package com.example.dagger2demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.dagger2demo.databinding.ActivityMainBinding;
import com.example.dagger2demo.di.simple.SimpleDepency_Activity;
import com.example.dagger2demo.di.thirdparty.ThirdParty_Activity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        setListener();
    }
    private void setListener()
    {
        activityMainBinding.btnInterface.setOnClickListener(this);
        activityMainBinding.btnSimple.setOnClickListener(this);
        activityMainBinding.btnThirdparty.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId())
        {
            case R.id.btn_interface:

                break;
            case R.id.btn_thirdparty:
                intent = new Intent(this, ThirdParty_Activity.class);
                break;
            case R.id.btn_simple:
                intent = new Intent(this, SimpleDepency_Activity.class);
                break;
        }
        if(intent!=null)
        {
            startActivity(intent);
        }
    }
}
