package students.sergej_pereligin.lesson_6.level_2.task_7;

import java.util.Scanner;

public class DayOfTheWeekDetector {
    public int getNumberFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number between 1 and 7:");
        return scanner.nextInt();

    }
}
