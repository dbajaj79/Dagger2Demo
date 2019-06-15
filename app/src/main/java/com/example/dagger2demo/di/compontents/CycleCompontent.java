package com.example.dagger2demo.di.compontents;

import com.example.dagger2demo.di.compontentbuilder.cycle.Cycle;
import com.example.dagger2demo.di.module.HandleModule;

import dagger.Component;

@Component (modules = HandleModule.class)
public interface CycleCompontent {

    Cycle getCycle();
}
