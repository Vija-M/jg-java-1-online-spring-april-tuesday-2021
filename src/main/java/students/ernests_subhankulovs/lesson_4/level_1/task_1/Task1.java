package students.ernests_subhankulovs.lesson_4.level_1.task_1;

import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter an integer value:");
        Scanner scanner = new Scanner(System.in);
        int integerToBeChecked  = scanner.nextInt();

        if (integerToBeChecked > 0) {
            System.out.println("The value is positive.");
        }
        else if (integerToBeChecked < 0) {
            System.out.println("The value is negative.");
        }
        else {
            System.out.println("The value is equal to zero.");
        }
    }
}
