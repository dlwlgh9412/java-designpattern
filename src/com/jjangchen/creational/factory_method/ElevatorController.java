package com.jjangchen.creational.factory_method;

public class ElevatorController {
    private int id;
    private int curFloor;

    public ElevatorController(int id) {
        this.id = id;
        this.curFloor = 1;
    }

    public int getId() {
        return id;
    }
    public int getCurFloor() {
        return curFloor;
    }

    public void gotoFloor(int destination) {
        System.out.print("Elevator [ " + id + " ]: " + curFloor);
        curFloor = destination;
        System.out.println(" ===> " + curFloor);
    }
}
