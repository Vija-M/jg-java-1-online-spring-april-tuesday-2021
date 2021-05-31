package students.dmitrijs_matrenicevs.lesson_5.level_2.task_13;

import java.util.Random;

class Task13 {

    public static void main(String[] args) {

        int[] numbers = new int[3];
        int summa = 0;

        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += random.nextInt(50);
            System.out.println(i + " = " + numbers[i]);
            summa += numbers[i];

        }

        System.out.println("Общаая сумма всех чисел равна = " + summa);

    }

}
