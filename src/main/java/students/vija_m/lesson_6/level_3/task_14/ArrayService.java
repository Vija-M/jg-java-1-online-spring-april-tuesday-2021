package students.vija_m.lesson_6.level_3.task_14;

class ArrayService {
    public boolean replaceFirst(int[] arr, int numberToReplace, int newNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                return true;
            }
        }
        return false;
    }


    public int countOccurrences(int[] arr, int numberToSearch) {
        int numberOfOccurrence = 0;
        for (int number : arr) {
            if (number == numberToSearch) {
                numberOfOccurrence++;
            }
        }
        return numberOfOccurrence;
    }


    public boolean contains(int[] arr, int numberToSearch) {
        for (int number : arr) {
            if (number == numberToSearch) {
                return true;
            }
        }
        return false;
    }
}