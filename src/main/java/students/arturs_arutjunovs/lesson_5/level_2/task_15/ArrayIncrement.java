package students.arturs_arutjunovs.lesson_5.level_2.task_15;

import java.util.Random;

class ArrayIncrement {
    public static void main(String[] args) {

        Random random = new Random();
        int[] number = new int[3];

        System.out.print("Random numbers: ");
        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt(20);
            System.out.print(number[i] + " ");
        }
        System.out.println("");

        System.out.print("Incremented numbers: ");
        for (int i = 0; i < number.length; i++) {
            number[i] += +2;
            System.out.print(number[i] + " ");

        }
    }
}
