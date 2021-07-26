package students.vija_m.lesson_5.level_6.task_37_38;

import java.util.Random;

class Arrays {
    public int[] create(int length) {
        return new int[length];
    }

    public void fillRandomly(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
    }

    public void print(int[] array) {
        for (int j : array) {
            System.out.println("array[i] = " + j);
        }
    }

    public int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

}