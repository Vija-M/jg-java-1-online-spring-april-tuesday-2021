package students.ernests_subhankulovs.lesson_4.level_2.task_6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer number A:");
        int a = scanner.nextInt();
        System.out.println("Enter integer number B:");
        int b = scanner.nextInt();

        if (a == b) {
            System.out.println("Numbers are equals");
        }
        else {
            System.out.println("Numbers are different");
        }
    }
}
