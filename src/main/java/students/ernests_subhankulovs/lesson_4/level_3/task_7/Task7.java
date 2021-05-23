package students.ernests_subhankulovs.lesson_4.level_3.task_7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer number A:");
        int a = scanner.nextInt();
        System.out.println("Enter integer number B:");
        int b = scanner.nextInt();
        System.out.println("Enter integer number C:");
        int c = scanner.nextInt();

        if (a == b && b == c) {
            System.out.println("All numbers are equal");
        }
        else if (a != b && b != c && c != a) {
            System.out.println("All numbers are different");
        }
        else {
            System.out.println("Neither all are equal or different");
        }
    }
}
