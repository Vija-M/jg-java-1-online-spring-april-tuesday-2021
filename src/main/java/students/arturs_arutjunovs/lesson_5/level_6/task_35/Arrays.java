package students.arturs_arutjunovs.lesson_5.level_6.task_35;

import java.util.Random;

class Arrays {

    public int[] create(int length) {
        return new int[length];
    }

    public void fillRandomly(int[] array) {
        Random random = new Random();
        array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }
    }

    public void print(int[] array) {
        for (int j : array) {
            System.out.println(j);
        }
    }

            public int findMax(int[] array) {
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }
}