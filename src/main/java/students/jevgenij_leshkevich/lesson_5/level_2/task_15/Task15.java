package students.jevgenij_leshkevich.lesson_5.level_2.task_15;

import java.util.Random;

class Task15 {

    public static void main(String[] args) {
        int[] numbers = new int[3];
        Random random = new Random();
        System.out.println("Содержимое массива (значения от 0  до 100): ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(101);
            System.out.println(numbers[i]);
        }
        System.out.println();
        System.out.println("Увеличенное (+2) содержимое массива: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] + 2;
            System.out.println(numbers[i]);
        }

    }
}