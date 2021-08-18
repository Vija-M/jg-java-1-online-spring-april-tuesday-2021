package students.linda_junkina.lesson_10.level_2.task_4_5;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {

    private final DayOfTheWeekDetector detector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector detector) {
        this.detector = detector;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number 1 - 7: ");
        int number = scanner.nextInt();
        System.out.println(detector.detectDayName(number));
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo ifDemo = new DayOfTheWeekDetectorDemo(new IfDayOfTheWeekDetector());
        ifDemo.run();
        DayOfTheWeekDetectorDemo switchDemo = new DayOfTheWeekDetectorDemo(new SwitchDayOfTheWeekDetector());
        switchDemo.run();
        DayOfTheWeekDetectorDemo arrayDemo = new DayOfTheWeekDetectorDemo(new ArrayDayOfTheWeekDetector());
        arrayDemo.run();
    }
}
