package students.dmitrijs_matrenicevs.lesson_5.level_4.task_30;

import java.util.Random;

class Task30 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(50);
            System.out.println((i + 1) + " = " + numbers[i]);
        }

        System.out.println();

        System.out.print("Нечётные числа: ");
        for (int number : numbers) {
            if (number % 2 != 0) {

                System.out.print(number + " ");

            }

        }


        System.out.println();

    }

}
