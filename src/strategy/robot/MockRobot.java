package strategy.robot;

import strategy.function.attack.Attackable;
import strategy.function.attack.NoAttack;
import strategy.function.fly.Flyable;
import strategy.function.fly.NoFly;
import strategy.function.move.Movable;
import strategy.function.move.NoMove;

public class MockRobot extends Robot {

    public MockRobot(String name, Attackable attackable, Flyable flyable, Movable movable) {
        super(name, attackable, flyable, movable);
    }

    public MockRobot() {
        super("가짜 로봇", new NoAttack(), new NoFly(), new NoMove());
    }
}
