package students.linda_junkina.lesson_5.level_4.task_27;

import java.util.Random;
import java.util.Arrays;

class Task27 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }
        System.out.println("Array: " + Arrays.toString(array));

        int max = array[9];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.print("max number is " + max);
    }
}
