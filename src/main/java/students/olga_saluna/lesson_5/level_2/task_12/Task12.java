package students.olga_saluna.lesson_5.level_2.task_12;

import java.util.Random;

class Task12 {
    public static void main(String[] args) {


        Random random = new Random();

        int[] array = new int[3];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
    }
}