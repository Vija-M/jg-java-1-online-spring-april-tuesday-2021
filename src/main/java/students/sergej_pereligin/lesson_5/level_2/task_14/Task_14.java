package students.sergej_pereligin.lesson_5.level_2.task_14;




import java.util.Random;
import java.util.Arrays;

/*Напишите программу, в которой:
 - создайте массив целых чисел длиной 3,
 - заполните каждую ячейку массива случайным числом,
 - посчитайте среднее значение и выведите его на консоль.*/

public class Task_14 {
    public static void main(String[] args) {
        int[] rec = new int[3];
        int sum = 0;
        Random random = new Random();
        for (int i = 0; i < rec.length; i++) {
            rec[i] = random.nextInt(100);
            sum = sum + rec[i];
        }
        System.out.println("Arrays:" + Arrays.toString(rec));
        System.out.println("Sum of arrays " + sum+ " Avarage: " + sum / rec.length);

    }
}
