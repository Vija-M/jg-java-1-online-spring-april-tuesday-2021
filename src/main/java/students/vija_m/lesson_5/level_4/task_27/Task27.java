package students.vija_m.lesson_5.level_4.task_27;

import java.util.Arrays;
import java.util.Random;

class Task27 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
        }
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("max = " + max);
    }
}



