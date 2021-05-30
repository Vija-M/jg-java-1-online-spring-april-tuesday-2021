package students.ernests_subhankulovs.lesson_5.level_2.task_12;

import java.util.Random;

class Task12 {
    public static void main(String[] args) {
        int[] integerNumbers = new int[3];
        Random random = new Random();

        for (int i = 0; i < integerNumbers.length; i++) {
            integerNumbers[i] = random.nextInt(100);
            System.out.println("i = " + i + "; integerNumbers[i] = " + integerNumbers[i]);
        }
    }
}
