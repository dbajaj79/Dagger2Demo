package com.example.dagger2demo.di.compontents;

import com.example.dagger2demo.di.module.ComputerModule;
import com.example.dagger2demo.di.thirdparty.computer.Computer;

import dagger.Component;

@Component(modules = ComputerModule.class)
public interface ComputerCompontent {

    Computer getComputer();

}
