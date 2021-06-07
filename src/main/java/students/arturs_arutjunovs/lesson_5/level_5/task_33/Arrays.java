package students.arturs_arutjunovs.lesson_5.level_5.task_33;

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
}
