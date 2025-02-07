package students.eriks_jaloveckis.lesson_5.level_5.task_34;

import java.util.Random;
import java.util.Arrays;

class Array {
    public int[] create(int length) {
        return new int[length];
    }

    public void fillRandomly(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(5);
        }
    }

    public void print(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public int findMax (int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int findMin(int[] array) {
        int min = array[0]; // как то в голову пришло, надеюсь, что правильно
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}