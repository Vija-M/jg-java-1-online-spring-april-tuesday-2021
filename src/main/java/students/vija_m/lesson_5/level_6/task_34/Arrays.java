package students.vija_m.lesson_5.level_6.task_34;

import java.util.Random;

class Arrays {
    Random random = new Random();

    public int[] create(int length) {
        return new int[length];
    }


    public void fillRandomly(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();

        }
    }

    public void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[i] = " + array[i]);
        }


    }

}
