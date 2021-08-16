package students.vija_m.lesson_10.level_2.task_5;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {
    DayOfTheWeekDetector detector;
    static int number;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector detector) {
        this.detector = detector;
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo detectorDemo = new DayOfTheWeekDetectorDemo(new IfDayOfTheWeekDetector());
        detectorDemo.getNumber();
        System.out.println("Day of the week detected using the if-else method:");
        detectorDemo.run();
        System.out.println("");

        detectorDemo = new DayOfTheWeekDetectorDemo(new SwitchDayOfTheWeekDetector());
        detectorDemo.getNumber();
        System.out.println("Day of the week detected using the switch method:");
        detectorDemo.run();
        System.out.println("");

        detectorDemo = new DayOfTheWeekDetectorDemo(new ArrayDayOfTheWeekDetector());
        detectorDemo.getNumber();
        System.out.println("Day of the week detected using the array method:");
        detectorDemo.run();
    }

    private void getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 7:");
        number = scanner.nextInt();
    }

    private void run() {
        System.out.println(detector.detectDayName(number));
    }
}

