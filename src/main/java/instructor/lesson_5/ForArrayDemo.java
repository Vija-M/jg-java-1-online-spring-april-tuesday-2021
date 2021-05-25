package instructor.lesson_5;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

class ForArrayDemo {

    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
//            sum += array[i];
        }

        double avg = (double) sum / array.length;

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println();
        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
        System.out.println("min = " + min);

//        System.out.println(Arrays.toString(array));
    }
}
