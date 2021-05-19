package students.ernests_subhankulovs.lesson_3.level_3;

import students.ernests_subhankulovs.lesson_3.level_3.Robot;

public class RobotDemo {
    public static void main(String[] args) {
        Robot robot = new Robot("ROBO");
        robot.sayHello();
        robot.sayYourName();

        Robot robot1 = new Robot("Rider");
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2 = new Robot("John");
        robot2.sayHello();
        robot2.sayYourName();
    }
}
