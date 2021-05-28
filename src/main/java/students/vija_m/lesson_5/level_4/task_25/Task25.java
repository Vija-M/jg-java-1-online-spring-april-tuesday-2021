package students.vija_m.lesson_5.level_4.task_25;

import java.util.Arrays;
import java.util.Scanner;

class Task25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int arrayLength = scanner.nextInt();
        int[] numbers = new int[arrayLength];

        System.out.println("Insert array elements:");
        for (int i = 0; i < arrayLength; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));
    }
}
