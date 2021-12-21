package com.jjangchen.behavior.strategy.robot;

import com.jjangchen.behavior.strategy.robot.attack.Missile;
import com.jjangchen.behavior.strategy.robot.attack.Punch;
import com.jjangchen.behavior.strategy.robot.move.Fly;
import com.jjangchen.behavior.strategy.robot.move.Walk;

public class Client {
    // 스트래티지 패턴, 행위(behavior)패턴 중 하나
    // 스트래티지 패턴의 행위를 클래스로 캡슐화하여 동적으로 행위를 바꾸는 패턴
    // 즉, 전략을 쉽게 수정할 수 있게 도와주는 패턴 --> 전략: 어떠한 목적을 달성하기 위해 짜여진 알고리즘, 규칙, 수행방식 등
    // 예를 들어, 도로상황이나 여러 요인에 따라 자동차가 취해야하는 주행보조 동작방식을 바꿀 때와 같은 여러 상황에 맞춰 전략을 수정할 때 유용하다.
    public static void main(String[] args) {
        Robot taekwonV = new TaekwonV("taekwonV");
        Robot atom = new Atom("atom");

        System.out.println("My name is " + taekwonV.getName());
        System.out.println("My name is " + atom.getName());
        /*
        taekwonV.attack();
        taekwonV.move();

        atom.attack();
        atom.move();
         */

        // 문제점 1. 만약 로봇들의 행위를 수정하고 싶다면?
        // 문제점 2. 또한 새로운 로봇을 만들어서 기존의 행위를 추가나 수정하는 경우?
        // 예를 들어, 새로운 로봇이 Atom이나 TaekwonV의 공격을 추가한다면?


        // setter메서드를 통해 공격방식, 이동방식을 주입
        taekwonV.setAttack(new Missile());
        taekwonV.setMove(new Fly());
        atom.setAttack(new Punch());
        atom.setMove(new Walk());

        taekwonV.attack();
        atom.attack();
        taekwonV.move();
        atom.move();
    }
}
