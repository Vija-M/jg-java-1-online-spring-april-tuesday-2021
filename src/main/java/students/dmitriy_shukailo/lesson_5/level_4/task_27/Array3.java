package students.dmitriy_shukailo.lesson_5.level_4.task_27;

import java.util.Arrays;
import java.util.Random;

class Array3 {

    public static void main(String[] args) {

        Random random = new Random();
        int lengthArray = random.nextInt(10);

        int[] numbers = new int[lengthArray];
        for (int i = 0; i < lengthArray; i++) {
            numbers[i] = random.nextInt(100);
        }

        System.out.println("Array [" + lengthArray + "]: " + Arrays.toString(numbers));

        int max = numbers[0];
        for (int i = 1; i < lengthArray; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Max elements from Array [" + lengthArray + "]: " + max);
    }

}