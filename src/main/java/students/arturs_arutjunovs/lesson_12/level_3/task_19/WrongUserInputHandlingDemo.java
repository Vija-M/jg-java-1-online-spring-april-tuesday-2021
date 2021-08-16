package students.arturs_arutjunovs.lesson_12.level_3.task_19;

import java.util.Scanner;

class WrongUserInputHandlingDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = 0;
        boolean reenter;
        do {
            System.out.println("Please enter a number:");
            try {
                num = scanner.nextInt();
                reenter = false;
            } catch (Exception e) {
                System.out.println("Wrong input");
                System.out.println("The input must be a number! Try again: ");
                scanner.nextLine();
                reenter = true;
            }
        } while (reenter);
        System.out.println("Your enter is: " + num);
    }
}