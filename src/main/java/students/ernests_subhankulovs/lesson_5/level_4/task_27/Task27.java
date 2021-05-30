package students.ernests_subhankulovs.lesson_5.level_4.task_27;

import java.util.Random;

class Task27 {
    public static void main(String[] args) {
        int arrayLength;
        int largestElement = 0;
        Random random = new Random();

        arrayLength = random.nextInt(100);
        int[] array = new int[arrayLength];

        System.out.println();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.println("i = " + i + "; array[i] = " + array[i]);
            if (array[i] > largestElement) {
                largestElement = array[i];
            }
        }

        System.out.println();
        System.out.println("Tha largest element of the array is " + largestElement);
    }
}
