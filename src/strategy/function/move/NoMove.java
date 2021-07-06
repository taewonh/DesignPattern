package strategy.function.move;

public class NoMove implements Movable {
    @Override
    public void move() {
        System.out.println("움직일 수 없습니다.");
    }
}
