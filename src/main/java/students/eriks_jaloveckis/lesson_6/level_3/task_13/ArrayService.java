package students.eriks_jaloveckis.lesson_6.level_3.task_13;

class ArrayService {
    boolean contains(int[] arr, int numberToSearch) {
        for (int number : arr) {
            if (number == numberToSearch) {
                return true;
            }
        }
        return false;
    }

    int countOccurrences(int[] arr, int numberToSearch) {
        int count = 0;
        for (int number : arr) {
            if (number == numberToSearch) {
                count++;
            }
        }
        return count;
    }
}

