package students.ernests_subhankulovs.lesson_5.level_4.task_26;

import java.util.Random;
import java.util.Scanner;

class Task26 {
    public static void main(String[] args) {
        int arrayLength;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the array:");
        arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];

        System.out.println();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.println("i = " + i + "; array[i] = " + array[i]);
        }

    }
}
