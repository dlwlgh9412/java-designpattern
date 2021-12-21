package com.jjangchen.behavior.strategy.robot;

public class Atom extends Robot {
    public Atom(String name) {
        super(name);
    }

    /*
    공격과 이동방식을 캡슐화하므로 각 클래스별 공격, 이동 메서드는 필요없어짐
    @Override
    public void attack() {
        System.out.println("I have strong punch");
    }

    @Override
    public void move() {
        System.out.println("I can fly");
    }
     */

}
