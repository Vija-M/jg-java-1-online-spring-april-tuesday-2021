package students.dmitrijs_matrenicevs.lesson_5.level_2.task_15;

import java.util.Random;

class Task15 {

    public static void main(String[] args) {

        int[] numbers = new int[3];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(50);
            System.out.println(i + " = " + numbers[i]);
            System.out.println(i + " = " + (numbers[i] / 2));
        }

    }


}
