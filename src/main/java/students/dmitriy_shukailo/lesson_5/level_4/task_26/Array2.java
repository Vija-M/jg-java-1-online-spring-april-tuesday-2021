package students.dmitriy_shukailo.lesson_5.level_4.task_26;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Array2 {

    public static void main(String[] args) {

        System.out.println("Please, enter length of array: ");

        Scanner scanner = new Scanner(System.in);
        int lengthArray = scanner.nextInt();

        int[] numbers = new int[lengthArray];

        Random random = new Random();
        for (int i = 0; i < lengthArray; i++) {
            numbers[i] = random.nextInt(100);
        }

        System.out.println("Array [" + lengthArray + "]: " + Arrays.toString(numbers));
    }

}