package com.jjangchen.creational.factory_method.scheduler;

import com.jjangchen.creational.factory_method.ElevatorManger;

public interface ElevatorScheduler {
    int selectElevator(ElevatorManger elevatorManger, int destination);
}
