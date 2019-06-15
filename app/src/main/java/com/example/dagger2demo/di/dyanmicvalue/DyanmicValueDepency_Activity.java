package com.example.dagger2demo.di.dyanmicvalue;

import android.os.Bundle;
import android.os.PersistableBundle;

import com.example.dagger2demo.R;
import com.example.dagger2demo.di.compontentbuilder.BaseActivity;
import com.example.dagger2demo.di.compontents.DaggerMobileCompontent;
import com.example.dagger2demo.di.compontents.MobileCompontent;
import com.example.dagger2demo.di.dyanmicvalue.mobile.Mobile;
import com.example.dagger2demo.di.module.ProcessModule;

public class DyanmicValueDepency_Activity extends BaseActivity {


    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        MobileCompontent mobileCompontent = DaggerMobileCompontent.builder().processModule(new ProcessModule(8)).build();
        Mobile mobile = mobileCompontent.getMobile();
        mobile.playingMovie();
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_dyanmic_value_depency;
    }

    @Override
    protected String getTile() {
        return "DyanmicValue Depency";
    }
}
