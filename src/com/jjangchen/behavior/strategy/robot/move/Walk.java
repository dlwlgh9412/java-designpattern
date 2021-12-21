package com.jjangchen.behavior.strategy.robot.move;

public class Walk implements Move {
    @Override
    public void move() {
        System.out.println("I can only walk");
    }
}
