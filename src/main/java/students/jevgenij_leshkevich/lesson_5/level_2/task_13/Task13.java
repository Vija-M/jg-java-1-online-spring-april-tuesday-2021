package students.jevgenij_leshkevich.lesson_5.level_2.task_13;

import java.util.Random;

class Task13 {

    public static void main(String[] args) {
        int[] numbers = new int[3];
        Random random = new Random();
        int sum = 0;
        System.out.println("Содержимое массива (значения от 0  до 100): ");
        for (int number : numbers) {
            number = random.nextInt(101);
            System.out.println(number);
            sum = sum + number;
        }
        System.out.print("Сумма всех ячеек массива: " + sum);
    }

}
