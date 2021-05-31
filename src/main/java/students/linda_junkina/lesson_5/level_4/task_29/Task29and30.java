package students.linda_junkina.lesson_5.level_4.task_29;

import java.util.Random;
import java.util.Arrays;

class Task29and30 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }
        System.out.println("Array: " + Arrays.toString(array));

        int evenNumbers = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println("Even numbers are: " + (array[i]));
            }
        }

        int oddNumbers = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.println("Odd numbers are: " + (array[i]));
            }
        }

    }
}
