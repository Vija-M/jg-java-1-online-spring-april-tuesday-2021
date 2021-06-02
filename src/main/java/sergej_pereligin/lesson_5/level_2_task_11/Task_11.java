package sergej_pereligin.lesson_5.level_2_task_11;

import java.util.Arrays;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        int[] ara= new int[3];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number");
        int in1= scanner.nextInt();
        ara[0] = in1;
        System.out.println("Input first number");
        int in2 = scanner.nextInt();
        ara[1] = in2;
        System.out.println("Input first number");
        int in3 = scanner.nextInt();
        ara[2] = in3;
        System.out.println(Arrays.toString(ara));
    }
}
