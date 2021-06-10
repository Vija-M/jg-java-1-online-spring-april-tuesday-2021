package students.dmitriy_shukailo.lesson_6.level_3.task_15;

class ArrayService {

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
        int countReplace = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                countReplace++;
            }
        }
        return countReplace;
    }

}