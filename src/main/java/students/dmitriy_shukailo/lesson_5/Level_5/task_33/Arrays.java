package students.dmitriy_shukailo.lesson_5.Level_5.task_33;

import java.util.Random;

class Arrays {

    public int[] create(int length) {

        int[] array = new int[length];
        return array;
    }

    public void fillRandomly(int[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

}