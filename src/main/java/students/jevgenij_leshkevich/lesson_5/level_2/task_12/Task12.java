package students.jevgenij_leshkevich.lesson_5.level_2.task_12;

import java.util.Random;

class Task12 {

    public static void main(String[] args) {
        int[] numbers = new int[3];
        Random random = new Random();
        System.out.println("Содержимое массива (значения от -100  до 100): ");
        for (int number : numbers) {
            number = random.nextInt(201) - 100;
            System.out.println(number);
        }
    }
}