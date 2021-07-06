package strategy.robot;

import strategy.function.attack.Attackable;
import strategy.function.attack.KoreaAttack;
import strategy.function.attack.NoAttack;
import strategy.function.fly.Flyable;
import strategy.function.fly.KoreaFly;
import strategy.function.fly.NoFly;
import strategy.function.move.KoreaMove;
import strategy.function.move.Movable;
import strategy.function.move.NoMove;

public class TackwonVRobot extends Robot {

    public TackwonVRobot(String name, Attackable attackable, Flyable flyable, Movable movable) {
        super(name, attackable, flyable, movable);
    }

    public TackwonVRobot() {
        super("태권V", new KoreaAttack(), new KoreaFly(), new KoreaMove());
    }
}
