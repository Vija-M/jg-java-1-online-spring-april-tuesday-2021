package students.arturs_arutjunovs.lesson_4.level_2.task_6;

import java.util.Scanner;

class Task_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Please enter the second number: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber != secondNumber) {
            System.out.println("Numbers are different");
        } else {
            System.out.println("Numbers are equal");
        }
    }
}
