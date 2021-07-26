package students.dmitrijs_matrenicevs.lesson_10.level_2.task_4_5;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {

    private static int number;
    DayOfTheWeekDetector detector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector detector) {
        this.detector = detector;
    }

    void run() {
        System.out.println(detector.detectDayName(number));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a valid number between 1 and 7: ");
        number = scanner.nextInt();
        System.out.print("If: ");
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemo = new DayOfTheWeekDetectorDemo(new IfDayOfTheWeekDetector());
        dayOfTheWeekDetectorDemo.run();
        System.out.print("Switch: ");
        dayOfTheWeekDetectorDemo = new DayOfTheWeekDetectorDemo(new SwitchDayOfTheWeekDetector());
        dayOfTheWeekDetectorDemo.run();
        System.out.print("String: ");
        dayOfTheWeekDetectorDemo = new DayOfTheWeekDetectorDemo(new StringDayOfTheWeekDetector());
        dayOfTheWeekDetectorDemo.run();
    }
}
