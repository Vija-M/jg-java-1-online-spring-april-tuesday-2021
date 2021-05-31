package students.eriks_jaloveckis.lesson_5.level_4.task_29;

import java.util.Arrays;
import java.util.Random;

class Task29 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[6];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(200);
        }

        System.out.println(Arrays.toString(array));

        int equal = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);

            }
        }
    }
}
