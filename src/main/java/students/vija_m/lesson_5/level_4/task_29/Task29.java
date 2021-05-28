package students.vija_m.lesson_5.level_4.task_29;

import java.util.Random;
import java.util.Arrays;

class Task29 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[7];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
        }
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));

        int even = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                even = numbers[i];
                System.out.println("even = " + even);
            }

        }

    }
}




