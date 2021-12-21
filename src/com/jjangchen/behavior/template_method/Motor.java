package com.jjangchen.behavior.template_method;

import com.jjangchen.behavior.template_method.status.Direction;
import com.jjangchen.behavior.template_method.status.DoorStatus;
import com.jjangchen.behavior.template_method.status.MotorStatus;

// 중복코드에 대한 해결 방안 1
// 상속을 이용하여 해결
// 여기서는 HyundaiMotor와 LGMotor의 공통기능을 구현한다.
public abstract class Motor {
    // 2개의 필드는 공통부분이다.
    protected Door door;
    private MotorStatus motorStatus;

    public Motor(Door door) {
        this.door = door;
        motorStatus = MotorStatus.STOPPED;
    }

    public MotorStatus getMotorStatus() {
        return motorStatus;
    }

    protected void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }

    protected abstract void moveMotor(Direction direction);

    public void move(Direction direction) {
        MotorStatus motorStatus = getMotorStatus();
        if (motorStatus == MotorStatus.MOVING) return;

        DoorStatus doorStatus = door.getDoorStatus();
        if(doorStatus == DoorStatus.OPENED) door.closeDoor();

        moveMotor(direction);
        setMotorStatus(MotorStatus.MOVING);
    }
}
