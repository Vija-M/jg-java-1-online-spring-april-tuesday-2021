package students.linda_junkina.lesson_5.level_5.task_31_32_33;

import java.util.Random;

class Arrays {

    public int[] create(int length) {

        return new int[length];
    }

    public void fillRandomly(int[] array) {

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(15);
        }
    }
}
