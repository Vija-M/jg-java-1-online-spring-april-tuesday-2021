package students.eriks_jaloveckis.lesson_5.level_5.task_32;

import java.util.Random;

public class Array {
    public int[] create(int length) {
        return new int[length];
    }

    public void fillRandomly(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(5);
        }
    }
}
