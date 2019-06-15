package com.example.dagger2demo.di.module;

import com.example.dagger2demo.di.compontentbuilder.cycle.Handle;
import com.example.dagger2demo.di.compontentbuilder.cycle.Straight_Handle;

import dagger.Module;
import dagger.Provides;

@Module
public class HandleModule {
    private int no;

    public HandleModule(int no) {
        this.no = no;
    }
//Dagger understand it will return int value no property name etc
    @Provides
    public int getNo() {
        return no;
    }
/*
* While I am trying following method with Concrete class it give me error
* But using interface it is working fine
*
* */
    @Provides
    Handle provideHandle(Straight_Handle straight_handle) {
        return straight_handle;
    }


}
