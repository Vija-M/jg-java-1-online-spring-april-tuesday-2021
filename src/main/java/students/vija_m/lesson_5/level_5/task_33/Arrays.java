package students.vija_m.lesson_5.level_5.task_33;

import java.util.Random;

class Arrays {
    public int[] create(int length) {
        int[] numbers = new int[length];
        return numbers;
    }


    public void fillRandomly(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();

        }
    }

}
