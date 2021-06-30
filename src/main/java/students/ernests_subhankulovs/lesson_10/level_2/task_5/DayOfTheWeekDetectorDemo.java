package students.ernests_subhankulovs.lesson_10.level_2.task_5;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {

    Scanner scanner = new Scanner(System.in);
    DayOfTheWeekDetector detector;

    DayOfTheWeekDetectorDemo() {

    }

    DayOfTheWeekDetectorDemo(DayOfTheWeekDetector detector) {
        this.detector = detector;
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo detectorDemo = new DayOfTheWeekDetectorDemo();
        detectorDemo.run();
    }

    public void run() {
        System.out.println("Enter a number between 1 and 7:");
        int number = scanner.nextInt();
        System.out.println("Day of the week detected using the if-else method:");
        DayOfTheWeekDetectorDemo detectorDemo = new DayOfTheWeekDetectorDemo(new IfDayOfTheWeekDetector());
        System.out.println(detectorDemo.detector.detectDayName(number));
        System.out.println("Day of the week detected using the switch method:");
        detectorDemo = new DayOfTheWeekDetectorDemo(new SwitchDayOfTheWeekDetector());
        System.out.println(detectorDemo.detector.detectDayName(number));
        System.out.println("Day of the week detected using a string array of day names:");
        detectorDemo = new DayOfTheWeekDetectorDemo(new StringArrayDayOfTheWeekDetector());
        System.out.println(detectorDemo.detector.detectDayName(number));
    }
}
