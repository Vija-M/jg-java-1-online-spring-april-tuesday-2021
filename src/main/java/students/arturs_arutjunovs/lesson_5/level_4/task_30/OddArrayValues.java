package students.arturs_arutjunovs.lesson_5.level_4.task_30;

import java.util.Random;

class OddArrayValues {
    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.print("Array random values is: ");
        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.print("List of odd values: ");
        for (int i : array) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }
}
