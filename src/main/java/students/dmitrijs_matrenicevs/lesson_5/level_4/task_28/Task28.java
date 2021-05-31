package students.dmitrijs_matrenicevs.lesson_5.level_4.task_28;

import java.util.Random;

class Task28 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(50);
            System.out.println((i + 1) + " = " + numbers[i]);
        }


        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }

        }
        System.out.println();
        System.out.println("Наименьшее число: " + min);


    }

}
