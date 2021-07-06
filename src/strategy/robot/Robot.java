package strategy.robot;

import strategy.function.attack.Attackable;
import strategy.function.fly.Flyable;
import strategy.function.move.Movable;

public abstract class Robot {

    protected String name;
    protected Attackable attackable;
    protected Flyable flyable;
    protected Movable movable;

    protected Robot(String name, Attackable attackable, Flyable flyable, Movable movable) {
        this.name = name;
        this.attackable = attackable;
        this.flyable = flyable;
        this.movable = movable;
    }

    private void attack() {
        attackable.attack();
    }

    private void fly() {
        flyable.fly();
    }

    private void move() {
        movable.move();
    }

    public void run() {
        System.out.println(name + " 로봇을 기동합니다.");
        attack();
        fly();
        move();
        System.out.println("==============================");
    }
}
