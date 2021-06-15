package students.dmitriy_shukailo.lesson_6.level_4.task_21;

import java.util.Arrays;
import java.util.Random;

class TwoDimensionalArray {

    void fillRandomly(int[][] numbers) {
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = random.nextInt(10);
            }
            System.out.println(Arrays.toString(numbers[i]));
        }
    }

    int sum(int[][] numbers) {
        int sumArrayElements = 0;
        for (int[] number : numbers) {
            for (int j = 0; j < numbers.length; j++) {
                sumArrayElements += number[j];
            }
        }
        return sumArrayElements;
    }

}