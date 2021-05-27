package students.vija_m.lesson_5.level_2.task_15;

import java.util.Random;

class ArrayPlusTwo {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Random random = new Random();
        numbers[0] = random.nextInt();
        numbers[1] = random.nextInt();
        numbers[2] = random.nextInt();
        System.out.println("1st number = " + numbers[0]);
        System.out.println("2nd number = " + numbers[1]);
        System.out.println("3rd number = " + numbers[2]);
        System.out.println();

        int a = numbers[0] + 2;
        int b = numbers[1] + 2;
        int c = numbers[2] + 2;
        System.out.println(numbers[0] + " + 2 = " + a);
        System.out.println(numbers[1] + " + 2 = " + b);
        System.out.println(numbers[2] + " + 2 = " + c);
    }
}
