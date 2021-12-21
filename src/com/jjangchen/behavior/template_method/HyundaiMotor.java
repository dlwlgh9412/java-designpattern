package com.jjangchen.behavior.template_method;

import com.jjangchen.behavior.template_method.status.Direction;
import com.jjangchen.behavior.template_method.status.DoorStatus;
import com.jjangchen.behavior.template_method.status.MotorStatus;

// 방법1. Motor클래스를 상속
public class HyundaiMotor extends Motor {
    //private Door door;
    //private MotorStatus motorStatus;

    public HyundaiMotor(Door door) {
        //this.door = door;
        //motorStatus = MotorStatus.STOPPED;
        super(door);
    }

    @Override
    protected void moveMotor(Direction direction) {

    }

    private void moveHyundaiMotor(Direction direction) {
        // 모터구동 로직
        System.out.println("moveHyundaiMotor() " + direction.name());
    }

    /* 방법1. 공통기능 부분
    public MotorStatus getMotorStatus() {
        return motorStatus;
    }

    private void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }

     */

    /* Motor클래스에서 구현하고 있으므로 삭제
    moveHyundaiMotor메서드는 상위클래스의 moveMotor클래스를 오버라이드 한다.
    public void move(Direction direction) {
        MotorStatus motorStatus = getMotorStatus();
        if (motorStatus == MotorStatus.MOVING) return;

        DoorStatus doorStatus = door.getDoorStatus();
        if(doorStatus == DoorStatus.OPENED) door.closeDoor();

        moveHyundaiMotor(direction);
        setMotorStatus(MotorStatus.MOVING);
    }
     */
}
