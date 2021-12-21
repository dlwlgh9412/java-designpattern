package com.jjangchen.creational.factory_method.scheduler;

import java.util.Calendar;

public class SchedulerFactory {
    public static ElevatorScheduler getScheduler(SchedulingType type) {
        ElevatorScheduler elevatorScheduler = null;
        switch (type) {
            case RESPONSE_TYPE:
                elevatorScheduler = ResponseTimeScheduler.getInstance();
                break;
            case THOURGHPUT:
                elevatorScheduler = ThroughputScheduler.getInstance();
                break;
            case DYNAMIC: // 동적 스케쥴링 전략
                int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
                if (hour < 12)
                    elevatorScheduler = ResponseTimeScheduler.getInstance();
                else
                    elevatorScheduler = ThroughputScheduler.getInstance();
                break;
        }
        return elevatorScheduler;
    }
}
