package students.ernests_subhankulovs.lesson_10.level_2.task_5;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {

    DayOfTheWeekDetector detector;
    static int number;

    DayOfTheWeekDetectorDemo(DayOfTheWeekDetector detector) {
        this.detector = detector;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 7:");
        number = scanner.nextInt();
        System.out.println("Day of the week detected using the if-else method:");
        DayOfTheWeekDetectorDemo detectorDemo = new DayOfTheWeekDetectorDemo(new IfDayOfTheWeekDetector());
        detectorDemo.run();
        System.out.println("Day of the week detected using the switch method:");
        detectorDemo = new DayOfTheWeekDetectorDemo(new SwitchDayOfTheWeekDetector());
        detectorDemo.run();
        System.out.println("Day of the week detected using a string array of day names:");
        detectorDemo = new DayOfTheWeekDetectorDemo(new StringArrayDayOfTheWeekDetector());
        detectorDemo.run();
    }

    public void run() {
        System.out.println(detector.detectDayName(number));
    }
}
