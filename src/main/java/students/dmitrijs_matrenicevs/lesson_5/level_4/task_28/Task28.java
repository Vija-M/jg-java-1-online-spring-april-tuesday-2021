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


        int numberSmall = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(50);
            if (numbers[i] < numberSmall) {
                numberSmall = numbers[i];
            }

        }
        System.out.println();
        System.out.println("Наименьшее число: " + numberSmall);


    }

}
