package students.vija_m.lesson_6.level_3.task_12;

class ArrayService {

    public boolean contains(int[] arr, int numberToSearch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToSearch) {
                return true;
            }
        }
        return false;
    }
}