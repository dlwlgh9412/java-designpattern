package com.jjangchen.behavior.strategy.robot;

import com.jjangchen.behavior.strategy.robot.attack.Attack;
import com.jjangchen.behavior.strategy.robot.move.Move;

public abstract class Robot {
    private String name;

    // 공격방식과 이동방식을 캡슐화할 인터페이스
    private Attack attack;
    private Move move;

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /*
    public abstract void attack();
    public abstract void move();
     */

    public void attack() {
        attack.attack();
    }

    public void move() {
        move.move();
    }

    public void setAttack(Attack attack) {
        this.attack = attack;
    }

    public void setMove(Move move) {
        this.move = move;
    }
}


