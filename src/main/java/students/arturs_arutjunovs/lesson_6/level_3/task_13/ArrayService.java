package students.arturs_arutjunovs.lesson_6.level_3.task_13;

class ArrayService {

    public boolean contains(int[] arr, int numberToSearch) {
        for (int number : arr) {
            if (number == numberToSearch) {
                return true;
            }
        }
        return false;
    }


    int countOccurrences(int[] arr, int numberToSearch) {
        int numOfOccur = 0;
        for (int number : arr) {
            if (number == numberToSearch) {
                numOfOccur++;
            }
        }
        return numOfOccur;
    }
}