package com.jjangchen.creational.factory_method.scheduler;

import com.jjangchen.creational.factory_method.ElevatorManger;

// 문제점2에 대한 해결방안으로 싱글톤패턴으로 구현한다.
// 생성자를 private로 변경하고 getInstance()를 통해 객체를 반환
public class ThroughputScheduler implements ElevatorScheduler {
    private static ElevatorScheduler elevatorScheduler;

    private ThroughputScheduler() {}

    public static ElevatorScheduler getInstance() {
        if (elevatorScheduler == null)
            elevatorScheduler = new ThroughputScheduler();
        return elevatorScheduler;
    }
    @Override
    public int selectElevator(ElevatorManger elevatorManger, int destination) {
        return 0;
    }
}
