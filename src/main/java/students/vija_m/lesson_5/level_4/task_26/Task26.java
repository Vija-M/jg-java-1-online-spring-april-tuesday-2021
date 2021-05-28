package students.vija_m.lesson_5.level_4.task_26;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

class Task26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter array length: ");
        int arrayLength = scanner.nextInt();
        int[] numbers = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            numbers[i] = random.nextInt();
        }
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));
    }
}
