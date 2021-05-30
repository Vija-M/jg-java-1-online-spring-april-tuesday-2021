package students.ernests_subhankulovs.lesson_5.level_4.task_29;

import java.util.Random;

class Task29 {
    public static void main(String[] args) {
        int arrayLength;
        Random random = new Random();

        arrayLength = random.nextInt(100);
        int[] array = new int[arrayLength];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.println("i = " + i + "; array[i] = " + array[i]);
        }

        System.out.println();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            //System.out.println("i = " + i + "; array[i] = " + array[i]);
            if (array[i] % 2 == 0) {
                System.out.println("i = " + i + "; array[i] = " + array[i] + " is an even number.");
            }
        }

        System.out.println();
    }
}
