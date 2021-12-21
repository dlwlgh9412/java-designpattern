package com.jjangchen.behavior.template_method;

import com.jjangchen.behavior.template_method.status.Direction;
import com.jjangchen.behavior.template_method.status.DoorStatus;
import com.jjangchen.behavior.template_method.status.MotorStatus;

// 방법1. Motor클래스 상속
public class LGMotor extends Motor {
    //private Door door;
    //private MotorStatus motorStatus;

    public LGMotor(Door door) {
        //this.door = door;
        //motorStatus = MotorStatus.STOPPED;
        super(door);
    }

    @Override
    protected void moveMotor(Direction direction) {

    }

    private void moveLGMotor(Direction direction) {
        // 구동 로직
    }

    /* 방법1. 공통기능 부분
    public MotorStatus getMotorStatus() {
        return motorStatus;
    }

    private void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }
     */

    /*
    moveLGMotor메서드는 상위클래스의 moveMotor메서드를 오버라이드한다.
    public void move(Direction direction) {
        MotorStatus motorStatus = getMotorStatus();
        if (motorStatus == MotorStatus.MOVING) return;

        DoorStatus doorStatus = door.getDoorStatus();
        if (doorStatus == DoorStatus.OPENED) door.closeDoor();

        moveLGMotor(direction);
        setMotorStatus(MotorStatus.MOVING);
    }

     */
}
