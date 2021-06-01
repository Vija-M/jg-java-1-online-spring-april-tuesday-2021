package students.dmitrijs_matrenicevs.lesson_5.level_6.task_34_38;

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


    public void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " = " + array[i]);
        }
    }

    public int findMax(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) ;
            max = array[i];

        }
        return max;
    }




}
