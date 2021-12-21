package com.jjangchen.creational.factory_method;

import com.jjangchen.creational.factory_method.scheduler.SchedulingType;

public class Client {
    public static void main(String[] args) {
        ElevatorManger responseTimeScheduler = new ElevatorManger(10, SchedulingType.RESPONSE_TYPE);
        responseTimeScheduler.requestElevator(10);

        ElevatorManger throughtputScheduler = new ElevatorManger(10, SchedulingType.THOURGHPUT);
        throughtputScheduler.requestElevator(10);

        ElevatorManger dynamicScheduler = new ElevatorManger(10, SchedulingType.DYNAMIC);
        dynamicScheduler.requestElevator(10);
    }
}
