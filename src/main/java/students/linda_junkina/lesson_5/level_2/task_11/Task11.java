package students.linda_junkina.lesson_5.level_2.task_11;

import java.util.Scanner;

class Task11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:  ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number:  ");
        int secondNumber = scanner.nextInt();
        System.out.print("Enter second number:  ");
        int thirdNumber = scanner.nextInt();

        int[] numbers = new int[3];
        numbers[0] = firstNumber;
        numbers[1] = secondNumber;
        numbers[2] = thirdNumber;

        System.out.println("Number[0]: " + numbers[0]);
        System.out.println("Number[1]: " + numbers[1]);
        System.out.println("Number[2]: " + numbers[2]);

    }
}
