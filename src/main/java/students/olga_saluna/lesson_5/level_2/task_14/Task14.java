package students.olga_saluna.lesson_5.level_2.task_14;

import java.util.Random;

class Task14 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[3];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];

        }
        double avg = (double) sum / array.length;

        System.out.println();
        System.out.println("avg = " + avg);
    }
}
