package students.arturs_arutjunovs.lesson_5.level_2.task_12;

import java.util.Random;

class ArrayRand {
    public static void main(String[] args) {

        Random random = new Random();
        int[] number = new int[3];

        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt(20);
            System.out.print(number[i] + " ");

        }
    }
}
