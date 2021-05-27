package students.dmitriy_shukailo.lesson_5.level_2.task_14;

import java.util.Random;

class Array5 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
            System.out.println("Numbers [" + i + "] : " + numbers[i]);
        }

        int sum = 0;
        for (int number : numbers) sum = sum + number;

        double avg = (double) sum / numbers.length;

        System.out.println("Sum         : " + sum);
        System.out.println("Avg         : " + avg);

    }

}