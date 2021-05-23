package students.linda_junkina.lesson_4.level_3.task_7;

import java.util.Scanner;
class Task7Demo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();


        if (firstNumber == secondNumber && firstNumber == thirdNumber) {
            System.out.println("All numbers are equal");
        } else if (firstNumber != secondNumber && firstNumber != thirdNumber) {
            System.out.println("All numbers are unequal");
        } else {
            System.out.println("Neither all are equal or unequal");
        }
    }
}
