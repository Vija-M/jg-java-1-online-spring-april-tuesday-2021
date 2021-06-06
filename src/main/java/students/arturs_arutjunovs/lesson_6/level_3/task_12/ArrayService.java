package students.arturs_arutjunovs.lesson_6.level_3.task_12;

class ArrayService {

    public boolean contains(int[] arr, int numberToSearch) {
        for (int i : arr) {
            if (i == numberToSearch) {
                return true;
            }
        }
        return false;
    }
}
