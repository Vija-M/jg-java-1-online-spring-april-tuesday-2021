package students.dmitrijs_matrenicevs.lesson_5.level_2.task_14;

import java.util.Random;

class Task14 {

    public static void main(String[] args) {

        int[] numbers = new int[3];
        int middle = 5;

        Random random = new Random();

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(50);
            System.out.println(i + " = " + numbers[i]);
            middle += numbers[i];

        }

        double avg = (double) middle  / numbers.length;

        for (int i = 0; i < numbers.length; i++){

            int min = numbers[0];

            if (numbers[i] < min);
            min = numbers[i];
        }

        System.out.println();
        System.out.println("Общая сумма всех чисел = " + middle);
        System.out.println();
        System.out.println("Сумма деления = " + middle / numbers.length);
        System.out.println();
        System.out.println("Double = " + avg);


    }




}
