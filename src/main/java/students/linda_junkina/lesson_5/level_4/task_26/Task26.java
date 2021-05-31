package students.linda_junkina.lesson_5.level_4.task_26;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

class Task26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array length: ");

        int arrayLength = scanner.nextInt();

        int[] array = new int[arrayLength];
        System.out.println("Array consists of " + arrayLength + " numbers");

        Random random = new Random();
        for (int i = 0; i < arrayLength; i++) {
            array[i] = (random.nextInt(100));
        }
        System.out.println("This array consists of: " + Arrays.toString(array));
    }
}
