package students.vija_m.lesson_5.level_5.task_33;

import java.util.Random;

class Arrays {
    public int[] create(int length) {

        Random random = new Random();
        int[] numbers = new int[length];
        public void fillRandomly(int[] array) {
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt();

            }
        }
        return numbers;
    }
}