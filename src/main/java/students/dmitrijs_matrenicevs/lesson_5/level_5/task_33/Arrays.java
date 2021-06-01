package students.dmitrijs_matrenicevs.lesson_5.level_5.task_33;

import java.util.Random;

class Arrays {

    Random random = new Random();

    public int[] create(int length) {
        return new int[length];

    }

    public void fillRandomly(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }
    }

}
