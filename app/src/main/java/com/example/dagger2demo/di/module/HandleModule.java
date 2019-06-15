package com.example.dagger2demo.di.module;

import com.example.dagger2demo.di.compontentbuilder.cycle.Handle;

import dagger.Module;
import dagger.Provides;

@Module
public class HandleModule {
    private int no;

    public HandleModule(int no) {
        this.no = no;
    }



    @Provides
    Handle provideHandle() {
        return new Handle(no);
    }


}
