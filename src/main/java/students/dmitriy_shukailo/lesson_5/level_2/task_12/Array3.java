package students.dmitriy_shukailo.lesson_5.level_2.task_12;

import java.util.Random;

class Array3 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
            System.out.println("Numbers [" + i + "] : " + numbers[i]);
        }

    }

}