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

    int changeAll(int[] arr, int changeNumber, int newNumber) {

        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == changeNumber) {
                arr[i] = newNumber;
                res++;
            }
        }
        return res;
    }

    void reverse(int[] arr) {
        int m = arr.length;
        int[] reverseService = new int[m];
        for (int k : arr) {
            reverseService[m - 1] = k;
            m--;
        }
        System.arraycopy(reverseService, 0, arr, 0, arr.length);
    }

    void sort(int[] arr) {

        int material;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int m = 1; m < arr.length - i; m++) {
                if (arr[m - 1] > arr[m]) {
                    material = arr[m - 1];
                    arr[m - 1] = arr[m];
                    arr[m] = material;
                }
            }
        }
    }

}
