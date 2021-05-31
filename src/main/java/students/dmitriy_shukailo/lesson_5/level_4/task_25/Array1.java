package students.dmitriy_shukailo.lesson_5.level_4.task_25;

import java.util.Arrays;
import java.util.Scanner;

class Array1 {

    public static void main(String[] args) {

        System.out.println("Please, enter length of array: ");

        Scanner scanner = new Scanner(System.in);
        int lengthArray = scanner.nextInt();

        int[] numbers = new int[lengthArray];

        System.out.println("Please, enter elements of array: ");
        for (int i = 0; i < lengthArray; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Array [" + lengthArray + "]: " + Arrays.toString(numbers));
    }

}