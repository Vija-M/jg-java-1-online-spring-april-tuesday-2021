package students.dmitrijs_matrenicevs.lesson_5.level_2.task_14;

import java.util.Random;

class Task14 {

    public static void main(String[] args) {

        int[] numbers = new int[3];
        int sum = 0;

        Random random = new Random();

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(50);
            System.out.println(i + " = " + numbers[i]);
            sum += numbers[i];

        }

        double avg = (double) sum  / numbers.length;


        System.out.println();
        System.out.println("Общая сумма всех чисел = " + sum);
        System.out.println();
        System.out.println("Среднее арифметическое = " + sum / numbers.length);
        System.out.println();
        System.out.println("Double = " + avg);


    }




}
