package students.ernests_subhankulovs.lesson_5.level_6.task_34;

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

    public void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("i = " + i + "; array[i] = " + array[i]);
        }
    }

}