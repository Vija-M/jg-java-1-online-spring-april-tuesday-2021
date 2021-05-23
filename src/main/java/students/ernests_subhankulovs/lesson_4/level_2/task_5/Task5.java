package students.ernests_subhankulovs.lesson_4.level_2.task_5;

import java.util.Scanner;

class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer number A:");
        int a = scanner.nextInt();
        System.out.println("Enter integer number B:");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("The smallest of the numbers is B (B = " + b + ").");
        }
        else if (a < b) {
            System.out.println("The smallest of the numbers is A (A = " + a + ").");
        }
        else {
            System.out.println("Both numbers are equal.");
        }
    }
}
