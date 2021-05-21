package students.arturs_arutjunovs.lesson_4.level_3.task_9;

import java.util.Scanner;

class Task_9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Please enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Please enter the third number: ");
        int num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }
    }
}