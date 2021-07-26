package students.ernests_subhankulovs.lesson_12.level_3.task_19;

import java.util.Scanner;

class WrongUserInputHandlingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean retry;
        int number = 0;
        do {
            System.out.println("Enter an integer number:");
            try {
                number = scanner.nextInt();
                retry = false;
            } catch (Exception e) {
                System.out.println("The input must be a number!");
                System.out.println("Try again!");
                scanner.nextLine();
                retry = true;
            }
        } while (retry);
        System.out.println("Your entered number is: " + number);
    }
}
