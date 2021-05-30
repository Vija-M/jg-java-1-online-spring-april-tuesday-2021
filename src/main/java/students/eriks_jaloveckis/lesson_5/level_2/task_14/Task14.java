package students.eriks_jaloveckis.lesson_5.level_2.task_14;

import java.util.Random;

class Task14 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[3];
        numbers[0] = random.nextInt(8);
        numbers[1] = random.nextInt(7);
        numbers[2] = random.nextInt(9);
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        int sum = numbers[0] + numbers[1] + numbers[2];
        double avg = (double) sum / numbers.length;
        System.out.println(avg);


    }
}
