package strategy.function.attack;

public class NoAttack implements Attackable {
    @Override
    public void attack() {
        System.out.println("어떠한 공격도 하지않습니다.");
    }
}
