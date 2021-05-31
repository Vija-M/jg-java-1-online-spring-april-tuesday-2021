package students.dmitriy_shukailo.lesson_5.level_6.task_36;

import java.util.Random;

class Arrays {

    Random random = new Random();

    public int[] create(int length) {
        return new int[length];
    }

    public void fillRandomly(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    public void print(int[] array) {
        System.out.println("Array [" + array.length + "]: " + java.util.Arrays.toString(array));
    }

    public int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

}