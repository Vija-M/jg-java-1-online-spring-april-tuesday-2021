package students.vija_m.lesson_5.level_6.task_36;

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
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[i] = " + array[i]);
        }
    }

    public int findMax(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) ;
            {
                max = array[i];
            }
        }
        return max;

    }
}
