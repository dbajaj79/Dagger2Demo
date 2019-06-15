package com.example.dagger2demo.di.compontents;

import com.example.dagger2demo.di.dyanmicvalue.mobile.Mobile;
import com.example.dagger2demo.di.module.ProcessModule;

import dagger.Component;

@Component(modules = ProcessModule.class)
public interface MobileCompontent {

    Mobile getMobile();
}
