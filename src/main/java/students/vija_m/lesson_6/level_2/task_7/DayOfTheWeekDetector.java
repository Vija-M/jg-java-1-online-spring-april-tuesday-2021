package students.vija_m.lesson_6.level_2.task_7;

import java.util.Scanner;

class DayOfTheWeekDetector {
    public int getDayNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input day number between 1 and 7 : ");
        return scanner.nextInt();
    }
}


