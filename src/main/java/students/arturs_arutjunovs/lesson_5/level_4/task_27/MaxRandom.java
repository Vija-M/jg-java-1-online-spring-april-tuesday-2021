package students.arturs_arutjunovs.lesson_5.level_4.task_27;

import java.util.Random;

class MaxRandom {
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
        int max = array[0];
        for (int j : array) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println();
        System.out.print("Maximal of array values is: " + max);
    }
}