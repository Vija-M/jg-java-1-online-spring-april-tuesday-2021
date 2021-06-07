package students.olga_saluna.lesson_5.level_2.task_15;
import java.util.Random;
class Task15 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[3];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");

            array[i] += 2;
            System.out.println("Array value +2 = " + array[i]);
        }
    }
}