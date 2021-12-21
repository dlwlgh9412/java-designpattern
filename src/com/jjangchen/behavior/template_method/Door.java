package com.jjangchen.behavior.template_method;

import com.jjangchen.behavior.template_method.status.DoorStatus;

public class Door {
    private DoorStatus doorStatus;

    public Door() {
        this.doorStatus = DoorStatus.CLOSED;
    }

    public DoorStatus getDoorStatus() {
        return doorStatus;
    }

    public void closeDoor() {
        this.doorStatus = DoorStatus.CLOSED;
    }

    public void openDoor() {
        this.doorStatus = DoorStatus.OPENED;
    }
}
