package students.antons_korenevskis.lesson_5.level_2;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {

        int[] numbers = new int[3];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        numbers[0] = input.nextInt();
        System.out.println("Enter second number");
        numbers[1] = input.nextInt();
        System.out.println("Enter third number");
        numbers[2] = input.nextInt();



        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
    }
}
