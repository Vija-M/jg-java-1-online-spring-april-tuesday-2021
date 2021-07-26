package students.arturs_arutjunovs.lesson_10.level_2.task_5;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {

    DayOfTheWeekDetector detector;
    static int number;

    DayOfTheWeekDetectorDemo(DayOfTheWeekDetector detector) {
        this.detector = detector;
    }

    public void run() {
        System.out.println(detector.detectDayName(number));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number between 1 and 7: ");
        number = scanner.nextInt();
        System.out.print("IF_ELSE detection method: ");
        DayOfTheWeekDetectorDemo detectorDemo = new DayOfTheWeekDetectorDemo(new IfDayOfTheWeekDetector());
        detectorDemo.run();
        System.out.print("SWITCH detection method: ");
        detectorDemo = new DayOfTheWeekDetectorDemo(new SwitchDayOfTheWeekDetector());
        detectorDemo.run();
        System.out.print("STRING_ARRAY detection method: ");
        detectorDemo = new DayOfTheWeekDetectorDemo(new StringArrayDayOfTheWeekDetector());
        detectorDemo.run();
    }
}
