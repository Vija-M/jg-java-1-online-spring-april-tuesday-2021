package students.eriks_jaloveckis.lesson_10.level_2;

import java.util.Scanner;

public class DayOfTheWeekDetectorDemo {

    static int number;
    DayOfTheWeekDetector detector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector detector) {
        this.detector = detector;
    }

    void run() {
        System.out.println(detector.detectDayName(number));
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1/7: ");
        number = scanner.nextInt();

        DayOfTheWeekDetectorDemo detectorDemoArray = new DayOfTheWeekDetectorDemo(new ArrayDayOfTheWeekDetector());
        detectorDemoArray.run();
        DayOfTheWeekDetectorDemo detectorDemoIf = new DayOfTheWeekDetectorDemo(new IfDayOfTheWeekDetector());
        detectorDemoIf.run();
        DayOfTheWeekDetectorDemo detectorDemoSwitch = new DayOfTheWeekDetectorDemo(new SwitchDayOfTheDetector());
        detectorDemoSwitch.run();

    }
}
