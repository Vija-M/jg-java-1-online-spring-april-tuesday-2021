package students.vija_m.lesson_6.level_3.task_13;

class ArrayService {

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