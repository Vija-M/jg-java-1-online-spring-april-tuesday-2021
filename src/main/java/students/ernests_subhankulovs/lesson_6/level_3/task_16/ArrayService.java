package students.ernests_subhankulovs.lesson_6.level_3.task_16;

import java.util.Arrays;

class ArrayService {

    boolean contains(int[] arr, int numberToSearch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToSearch) {
                return true;
            }
        }
        return false;
    }

    int countOccurrences(int[] arr, int numberToSearch) {
        int occurrences = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToSearch) {
                occurrences++;
            }
        }
        return occurrences;
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
        int replacementCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                replacementCounter++;
            }
        }
        return replacementCounter;
    }

    void reverse(int[] arr) {
        int j = arr.length;
        int[] reversedArray = new int[j];
        for (int i = 0; i < arr.length; i++) {
            reversedArray[j - 1] = arr[i];
            j--;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = reversedArray[i];
        }
    }

}
