package students.arturs_arutjunovs.lesson_4.level_3.task_8;

import java.util.Scanner;

class Task_8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Please enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Please enter the third number: ");
        int num3 = scanner.nextInt();

        if (num1 < num2 && num2 < num3) {
            System.out.println("increasing");
        }
        else if (num1 > num2 && num2 > num3) {
            System.out.println("decreasing");
        } else
            System.out.println("neither");
    }
}
