package students.linda_junkina.lesson_5.level_2.task_15;

import java.util.Random;

class RandomNumbers {
    void showNumbers(int length) {

        Random random = new Random();

        int[] numbers = new int[length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (random.nextInt(10));
            System.out.println(i + ") " + numbers[i]);

            numbers[i] += 2;
            System.out.println(numbers[i]);
        }

    }

}

