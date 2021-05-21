package students.arturs_arutjunovs.lesson_4.level_1.task_1;

import java.util.Scanner;

class Task_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.print("Your number is equal to 0");
        } else if (number > 0) {
            System.out.print("Your number is positive");
        } else {
            System.out.print("Your number is negative");
        }
    }
}
