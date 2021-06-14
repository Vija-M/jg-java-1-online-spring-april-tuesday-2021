package students.linda_junkina.lesson_6.task_12_13_14_15_16_17;


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
        int counter = 0;
        for (int number : arr) {
            if (number == numberToSearch) {
                counter++;
            }
        }
        return counter;
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
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                counter++;
            }
        }
        return counter;
    }

    void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }
    }

    void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int cell = i;
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    cell = j;
                    min = arr[j];
                }
            }
            arr[cell] = arr[i];
            arr[i] = min;
        }
    }
}