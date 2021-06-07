package students.vija_m.lesson_6.level_3.task_17;

class ArrayService {

    void sort(int[] arr) {
        //Внешний цикл каждый раз сокр. фрагмент массива, так как внутренний цикл каждый раз ставит в конец фрагмента макс. элемент
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                //Сравниваем элементы попарно, если они имеют неправильный порядок, то меняем местами
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }


    void reverse(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = reversed[i];
        }
    }


    int replaceAll(int[] arr, int numberToReplace, int newNumber) {
        int numberOfChanges = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                numberOfChanges++;
            }
        }
        return numberOfChanges;
    }


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