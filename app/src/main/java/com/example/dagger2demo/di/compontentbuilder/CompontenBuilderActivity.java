package com.example.dagger2demo.di.compontentbuilder;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

import com.example.dagger2demo.R;
import com.example.dagger2demo.di.compontentbuilder.cycle.Cycle;
import com.example.dagger2demo.di.compontents.CycleCompontent;
import com.example.dagger2demo.di.compontents.DaggerCycleCompontent;
import com.example.dagger2demo.di.module.HandleModule;

public class CompontenBuilderActivity extends BaseActivity {
    private static final String TAG = "CompontenBuilderActivit";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CycleCompontent cycleCompontent = DaggerCycleCompontent.builder().handleModule(new HandleModule(20)).build();
        Cycle cycle = cycleCompontent.getCycle();
        cycle.paddling();

    }

    @Override
    protected int getLayout() {
        return R.layout.activity_componten_builder;
    }

    @Override
    protected String getTile() {
        return "Compount Builder";
    }
}
