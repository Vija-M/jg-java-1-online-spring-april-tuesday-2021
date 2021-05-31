package students.arturs_arutjunovs.lesson_5.level_2.task_13;

import java.util.Random;

class ArraySum {
    public static void main(String[] args) {

        Random random = new Random();
        int[] number = new int[3];

        System.out.print("Random numbers: ");
        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt(10);
        }
        int sum = 0;
        for (int i : number) {
            sum += i;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Sum = " + sum);
    }
}
