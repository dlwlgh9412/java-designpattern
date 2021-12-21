package com.jjangchen.creational.factory_method.scheduler;

import com.jjangchen.creational.factory_method.ElevatorManger;

// 문제점2에 대한 해결방안으로 싱글톤패턴으로 구현한다.
// 생성자를 private로 변경하고 getInstance()를 통해 객체를 반환
public class ResponseTimeScheduler implements ElevatorScheduler {
    private static ElevatorScheduler elevatorScheduler;

    private ResponseTimeScheduler() {}

    public static ElevatorScheduler getInstance() {
        if (elevatorScheduler == null)
            elevatorScheduler = new ResponseTimeScheduler();
        return elevatorScheduler;
    }

    public int selectElevator(ElevatorManger elevatorManger, int destination) {
        return 0;
    }
}
