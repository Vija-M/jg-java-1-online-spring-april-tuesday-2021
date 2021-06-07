package students.arturs_arutjunovs.lesson_5.level_4.task_28;

import java.util.Random;

class MinRandom {
    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }
        System.out.print("Array random values is: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        int min = array[0];
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println();
        System.out.print("Minimal of array values is: " + min);
    }
}
