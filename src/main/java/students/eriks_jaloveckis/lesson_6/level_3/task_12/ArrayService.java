package students.eriks_jaloveckis.lesson_6.level_3.task_12;

class ArrayService {
    boolean contains(int[]arr, int numberToSearch){
        for (int i = 0; i < arr.length; i++){
            if (i == numberToSearch){
                return true;
            }
        }
        return false;
    }
}
