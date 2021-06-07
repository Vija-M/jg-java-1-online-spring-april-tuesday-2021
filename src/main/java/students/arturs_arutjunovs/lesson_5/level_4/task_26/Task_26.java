package students.arturs_arutjunovs.lesson_5.level_4.task_26;

import java.util.Random;
import java.util.Scanner;

class Task_26 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any array`s size: ");
        int sizeArrayInput = scanner.nextInt();
        int[] array = new int[sizeArrayInput];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);

        }
        System.out.print("Array random values is: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
