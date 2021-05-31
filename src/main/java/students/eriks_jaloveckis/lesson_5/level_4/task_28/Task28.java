package students.eriks_jaloveckis.lesson_5.level_4.task_28;

import java.util.Arrays;
import java.util.Random;

class Task28 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(200);
        }
        System.out.println(Arrays.toString(array));

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);

    }
}
