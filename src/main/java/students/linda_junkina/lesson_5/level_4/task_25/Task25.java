package students.linda_junkina.lesson_5.level_4.task_25;

import java.util.Arrays;
import java.util.Scanner;

class Task25 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array length: ");

        int arrayLength = scanner.nextInt();

        int[] array = new int[arrayLength];
        System.out.println("Ok, array consists of " + arrayLength + " numbers");

        System.out.print("Enter array numbers: ");

        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();

        }
        System.out.println("This is your array: " + Arrays.toString(array));
    }
}
