package students.arturs_arutjunovs.lesson_4.level_2.task_4;

import java.util.Scanner;

class Task_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Please enter the second number: ");
        int secondNumber = scanner.nextInt();


        if (firstNumber > secondNumber) {
            System.out.println(firstNumber);
        } else {
            System.out.println(secondNumber);
        }
    }
}
