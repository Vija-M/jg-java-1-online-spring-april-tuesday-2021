package students.linda_junkina.lesson_6.level_4.task_21;

import java.util.Random;

class TwoDimensionalArray {

    void array(int length) {

        Random random = new Random();

        int[][] arrays = new int[length][length];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {

                arrays[i][j] = (random.nextInt(10));
                System.out.print(arrays[i][j]);
            }
            System.out.println();

        }
        int sum = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++)
                sum = sum + arrays[i][j];
        }
        System.out.println("sum = " + sum);
    }
}