package students.eriks_jaloveckis.lesson_5.level_2.task_12;

import java.util.Random;

class Task12 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[3];
        numbers[0] = random.nextInt(6);
        numbers[1] = random.nextInt(3);
        numbers[2] = random.nextInt(4);
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

    }
}
