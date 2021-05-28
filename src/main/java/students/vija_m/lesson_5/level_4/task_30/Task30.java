package students.vija_m.lesson_5.level_4.task_30;

import java.util.Random;
import java.util.Arrays;

class Task30 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[6];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
        }
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++)
            if (numbers[i] % 2 != 0) {
                int notEven = numbers[i];
                System.out.println("Not even = " + notEven);
            }
    }
}







