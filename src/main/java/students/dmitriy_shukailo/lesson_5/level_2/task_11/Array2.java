package students.dmitriy_shukailo.lesson_5.level_2.task_11;

import java.util.Scanner;

class Array2 {

    public static void main(String[] args) {

        System.out.println("Please, enter 3 numbers: ");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int[] numbers = {a, b, c};

        System.out.println("numbers [0] = " + numbers[0]);
        System.out.println("numbers [1] = " + numbers[1]);
        System.out.println("numbers [2] = " + numbers[2]);
    }

}