package com.jjangchen.behavior.strategy.robot.attack;

public class Punch implements Attack {
    @Override
    public void attack() {
        System.out.println("I have strong Punch");
    }
}
