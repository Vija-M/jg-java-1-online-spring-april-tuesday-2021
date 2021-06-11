package students.olga_saluna.lesson_6.level_3.task_12;

class ArrayService {
    boolean contains(int[] arr, int numberToSearch) {
        for (final int i : arr) {
            if (i == numberToSearch) {
                return true;
            }
        }
        return false;
    }
}
