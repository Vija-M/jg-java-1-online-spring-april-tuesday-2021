package students.eriks_jaloveckis.lesson_6.level_4.task_21;

import java.util.Arrays;
import java.util.Random;

class TwoDimensionalArray {
    Random random = new Random();

    public int[][] create(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(5);
                sum += array[i][j];
            }
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println();
        System.out.println("Sum of array is - " + sum);
        return array;
    }
}

