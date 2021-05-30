package students.ernests_subhankulovs.lesson_5.level_5.task_33;

import java.util.Random;

class Arrays {

    Random random = new Random();

    public int[] create(int length) {
        int[] array = new int[length];
        return array;
    }

    public void fillRandomly(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

}
