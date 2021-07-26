package students.dmitriy_shukailo.lesson_10.level_2.task_5;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {

    static int number;
    DayOfTheWeekDetector detector;

    DayOfTheWeekDetectorDemo(DayOfTheWeekDetector detector) {
        this.detector = detector;
    }

    public static void main(String[] args) {

        DayOfTheWeekDetectorDemo detectorDemo;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number between 1 and 7");
        number = scanner.nextInt();

        System.out.print("Day of the week    (if-else method): ");
        detectorDemo = new DayOfTheWeekDetectorDemo(new IfDayOfTheWeekDetector());
        detectorDemo.run();

        System.out.print("Day of the week     (switch method): ");
        detectorDemo = new DayOfTheWeekDetectorDemo(new SwitchDayOfTheWeekDetector());
        detectorDemo.run();

        System.out.print("Day of the week      (array method): ");
        detectorDemo = new DayOfTheWeekDetectorDemo(new ArrayDayOfTheWeekDetector());
        detectorDemo.run();
    }

    void run() {
        System.out.println(detector.detectDayName(number));
    }

}