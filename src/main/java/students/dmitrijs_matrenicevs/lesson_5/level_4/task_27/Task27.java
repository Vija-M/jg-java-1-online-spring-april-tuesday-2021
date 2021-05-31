package students.dmitrijs_matrenicevs.lesson_5.level_4.task_27;

import java.util.Random;

class Task27 {

    public static void main(String[] args) {

        int[] numbers = new int[10];
        int mostNumber = 0;
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(50);

            if (numbers[i] > mostNumber) {
                mostNumber = numbers[i];
            }
            System.out.println((i + 1) + " = " + numbers[i]);
        }
        System.out.println();
        System.out.println("Наибольшее число: " + mostNumber);

    }


}



