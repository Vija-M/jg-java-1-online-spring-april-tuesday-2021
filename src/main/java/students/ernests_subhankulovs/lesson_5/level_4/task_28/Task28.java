package students.ernests_subhankulovs.lesson_5.level_4.task_28;

import java.util.Random;

class Task28 {
    public static void main(String[] args) {
        Random random = new Random();
        int smallestElement;
        int arrayLength = random.nextInt(100);
        int[] array = new int[arrayLength];

        System.out.println();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.println("i = " + i + "; array[i] = " + array[i]);
        }

        smallestElement = array[0];

        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallestElement) {
                smallestElement = array[i];
            }
        }

        System.out.println();
        System.out.println("Tha smallest element of the array is " + smallestElement);
    }
}
