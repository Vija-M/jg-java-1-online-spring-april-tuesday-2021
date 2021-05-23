package students.linda_junkina.lesson_4.level_2.task_5;

import java.util.Scanner;
class Task5Demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter two numbers: ");

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println(secondNumber);
        } else if (firstNumber < secondNumber) {
            System.out.println(firstNumber);

        }
    }
}
