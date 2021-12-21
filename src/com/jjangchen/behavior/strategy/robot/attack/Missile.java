package com.jjangchen.behavior.strategy.robot.attack;

public class Missile implements Attack {
    @Override
    public void attack() {
        System.out.println("I have Missile");
    }
}
