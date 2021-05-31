package students.arturs_arutjunovs.lesson_5.level_2.task_11;

import java.util.Scanner;

class Task_11 {
    public static void main(String[] args) {

        int[] number = new int[3];
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int userNum1 = scanner.nextInt();
        number[0] = userNum1;
        System.out.print("Enter second number: ");
        int userNum2 = scanner.nextInt();
        number[1] = userNum2;
        System.out.print("Enter third number: ");
        int userNum3 = scanner.nextInt();
        number[2] = userNum3;

        System.out.println("number[0] = " + userNum1);
        System.out.println("number[1] = " + userNum2);
        System.out.println("number[2] = " + userNum3);

    }
}
