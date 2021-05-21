package students.ernests_subhankulovs.lesson_4.level_3.task_9;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer number A:");
        int a = scanner.nextInt();
        System.out.println("Enter integer number B:");
        int b = scanner.nextInt();
        System.out.println("Enter integer number C:");
        int c = scanner.nextInt();

        if (a > b && a > c) {
            System.out.println("The largest number is A (A = " + a + ").");
        }
        else if (b > a && b > c) {
            System.out.println("The largest number is B (B = " + b + ").");
        }
        else if (c > a && c > b) {
            System.out.println("The largest number is C (C = " + b + ").");
        }
        else if (a == b && a > c) {
            System.out.println("The largest numbers are A and B (A = B = " + a + ").");
        }
        else if ((a == c && a > b)) {
            System.out.println("The largest numbers are A and C (A = C = " + a + ").");
        }
        else if ((b == c && b > a)) {
            System.out.println("The largest numbers are B and C (B = C = " + b + ").");
        }
        else {
            System.out.println("All 3 numbers are equal (A = B = C = " + a + ").");
        }
    }
}

