package students.linda_junkina.lesson_4.level_2.task_6;

import java.util.Scanner;
class Task6Demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        if (firstNumber == secondNumber) {
            System.out.println("Numbers are equal");
        } else if (firstNumber != secondNumber) {
            System.out.println("Numbers are unequal");
        }
    }
}
