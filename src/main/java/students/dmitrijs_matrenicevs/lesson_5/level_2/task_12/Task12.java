package students.dmitrijs_matrenicevs.lesson_5.level_2.task_12;

import java.util.Random;

class Task12 {


    public static void main(String[] args) {

        Random random = new Random();

        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(40);

            System.out.println(i + " = " + numbers[i]);

        }



    }

}
