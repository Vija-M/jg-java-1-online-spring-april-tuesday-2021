package students.dmitrijs_matrenicevs.lesson_6.level_3.task_12_17;

class ArrayService {

    boolean contains(int[] arr, int numberToSearch) {
        for (final int i : arr) {
            if (i == numberToSearch) {
                return true;
            }
        }
        return false;
    }

    int countOccurrences(int[] arr, int numberToSearch) {

        int res = 0;
        for (int j : arr) {
            if (j == numberToSearch) {
                res++;
            }
        }
        return res;
    }

    boolean replaceFirst(int[] arr, int numberToReplace, int newNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                return true;
            }
        }
        return false;
    }

    int replaceAll(int[] arr, int numberToReplace, int newNumber) {

        int res = 0;
        for (int j : arr) {
            if (j == numberToReplace) {
                arr[j] = newNumber;
                res++;
            }
        }
        return res;
    }


    void reverse(int[] arr) {


    }

    void sort(int[] arr) {

    }

}
