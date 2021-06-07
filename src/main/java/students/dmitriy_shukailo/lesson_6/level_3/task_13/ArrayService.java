package students.dmitriy_shukailo.lesson_6.level_3.task_13;

public class ArrayService {

    public int[] create(int length) {
        return new int[length];
    }

    boolean contains(int[] arr, int numberToSearch) {
        for (int j : arr) {
            if (j == numberToSearch) {
                return true;
            }
        }
        return false;
    }

    int countOccurrences(int[] arr, int numberToSearch) {
        int count = 0;
        for (int j : arr) {
            if (j == numberToSearch) {
                count++;
            }
        }
        return count;
    }

}