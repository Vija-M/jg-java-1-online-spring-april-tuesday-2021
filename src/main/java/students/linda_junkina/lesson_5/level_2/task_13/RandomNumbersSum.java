package students.linda_junkina.lesson_5.level_2.task_13;

import java.util.Random;

class RandomNumbersSum {
    void showNumbers(int length) {

        Random random = new Random();

        int[] numbers = new int[length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (random.nextInt(10));
            System.out.println(numbers[i]);
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("sum = " + sum);
    }
}

