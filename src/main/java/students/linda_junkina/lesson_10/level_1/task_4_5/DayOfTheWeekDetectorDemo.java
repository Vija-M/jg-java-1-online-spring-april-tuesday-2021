package students.linda_junkina.lesson_10.level_1.task_4_5;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IfDayOfTheWeekDetector ifDayOfTheWeekDetector = new IfDayOfTheWeekDetector();

        System.out.println("Enter a number 1 - 7: ");
        int i = scanner.nextInt();

        System.out.print("ifDayOfTheWeekDetector = " + ifDayOfTheWeekDetector.detectDayName(i));
    }
}
