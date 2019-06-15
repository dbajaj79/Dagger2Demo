package com.example.dagger2demo.di.module;
import com.example.dagger2demo.di.dyanmicvalue.mobile.Processor;

import dagger.Module;
import dagger.Provides;

@Module
public class ProcessModule {

    private int versioncode;

    public ProcessModule(int versioncode) {
        this.versioncode = versioncode;
    }

    @Provides
    Processor provideProcessor()
    {
        return  new Processor(versioncode);
    }
}
