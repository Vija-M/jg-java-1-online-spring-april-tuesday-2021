package students.dmitriy_shukailo.lesson_6.level_3.task_12;

import java.util.Random;

public class ArrayService {

    Random random = new Random();

    public int[] create(int length) {
        return new int[length];
    }

    public void fillRandomly(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
    }

    boolean contains(int[] arr, int numberToSearch) {
        for (int j : arr) {
            if (j == numberToSearch) {
                return true;
            }
        }
        return false;
    }

    public void print(int[] arr) {
        System.out.println("Array [" + arr.length + "]: " + java.util.Arrays.toString(arr));
    }

}