package students.vladimir_aboltins.lesson_3.level_3.task_10;

import java.util.Scanner;

class RobotDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Robot robot1 = new Robot();
        Robot.printAskName(1);
        robot1.robotName = scanner.nextLine();
        robot1.sayYourName();

        Robot robot2 = new Robot();
        Robot.printAskName(2);
        robot2.robotName = scanner.nextLine();
        robot2.sayYourName();
    }
}

