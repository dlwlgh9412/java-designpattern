package com.jjangchen.creational.factory_method;

import com.jjangchen.creational.factory_method.scheduler.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ElevatorManger {
    private List<ElevatorController> elevatorControllers;
    // 문제점 1 해결방안
    //private ThroughputScheduler throughputScheduler;

    // 문제점2 해결방안의 과정1
    private SchedulingType schedulingType;


    public ElevatorManger(int elevatorCount, SchedulingType schedulingType) {
        this.elevatorControllers = new ArrayList<>(elevatorCount);

        for(int i = 0; i < elevatorCount; i++) {
            elevatorControllers.add(new ElevatorController(i + 1));
        }
        // 문제점 1 해결방안
        //throughputScheduler = new ThroughputScheduler();

        this.schedulingType = schedulingType;
    }

    public void requestElevator(int destination) {
        /*
        // 문제점1 해결방안 스트래티지 패턴 활용
        // ElevatorScheduler 클래스로 캡슐화하여 전략에 맞게 구현체클래스를 생성
        ElevatorScheduler scheduler;

        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        if (hour < 12)
            scheduler = new ResponseTimeScheduler();
        else
            scheduler = new ThroughputScheduler();
         */

        // 문제점2 해결방안의 과정 1
        ElevatorScheduler scheduler = SchedulerFactory.getScheduler(schedulingType);


        int selectedId = scheduler.selectElevator(this, destination);
        elevatorControllers.get(selectedId).gotoFloor(destination);
        System.out.println(scheduler.toString());

    }
}
