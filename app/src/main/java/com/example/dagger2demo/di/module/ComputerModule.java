package com.example.dagger2demo.di.module;

import com.example.dagger2demo.di.thirdparty.computer.Computer;
import com.example.dagger2demo.di.thirdparty.computer.HardDrive;
import com.example.dagger2demo.di.thirdparty.computer.Monitor;
import com.example.dagger2demo.di.thirdparty.computer.Ram;

import dagger.Module;
import dagger.Provides;

@Module
public class ComputerModule {

    @Provides
    Ram prvoideRam() {
        return new Ram();
    }

    @Provides
    HardDrive provideHardDrive() {
        return new HardDrive();
    }

    @Provides
    Monitor provideMonitor() {
        return new Monitor();
    }

    @Provides
    Computer provideComputer(Monitor monitor, Ram ram, HardDrive hardDrive) {
        return new Computer(hardDrive, monitor, ram);
    }
}
