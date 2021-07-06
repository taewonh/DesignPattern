package strategy;

import strategy.robot.MockRobot;
import strategy.robot.Robot;
import strategy.robot.TackwonVRobot;

public class Main {

    public static void main(String[] args) {
        Robot mockRobot = new MockRobot();
        mockRobot.run();

        Robot taekwonV = new TackwonVRobot();
        taekwonV.run();

        /*
        * 각 로봇의 기본 기능은 생성자에서 각 행위를 구현한 구현체를 바로 주입하여 초기화함
        * 만약 기능을 변경하고 싶은 경우 로봇 인스턴스 생성 시 생성자나 혹은 변경하고자 하는 기능만 주입할 수 있음
        *
        * 해당 패턴은 전략(Strategy) 패턴으로써
        * 각 행위(fly, attack, move)를 추상화하고, 실제 행위를 서술한 구현 클래스들을 별도로 생성하여
        * 로봇 생성 시 주입하여 각각 다른 로봇들을 만들어 낼 수 있음.
        *
        * 전략 패턴 사용 시 적용하고 싶은 알고리즘을
        * 손쉽게 선택하여 추가하거나 변경하는 것이 가능하며,
        * 각 행위들을 모두 분리하여 변화에 능동적임
        *
        * */
    }
}
