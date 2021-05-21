package students.arturs_arutjunovs.lesson_4.level_1.task_3;

import java.util.Scanner;

class Task_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
}
