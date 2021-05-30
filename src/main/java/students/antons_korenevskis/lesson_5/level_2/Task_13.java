package students.antons_korenevskis.lesson_5.level_2;

import java.util.Random;

public class Task_13 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(101);
        }

        int sum = numbers[0] + numbers[1] + numbers[2];

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        System.out.println("sum = " + sum);

    }


}
