package students.ernests_subhankulovs.lesson_4.level_2.task_4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer number A:");
        int a = scanner.nextInt();
        System.out.println("Enter integer number B:");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("The largest of the numbers is A (A = " + a + ").");
        }
        else if (a < b) {
            System.out.println("The largest of the numbers is B (B = " + b + ").");
        }
        else {
            System.out.println("Both numbers are equal.");
        }
    }
}
