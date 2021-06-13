package students.sergej_pereligin.lesson_6.level_3.task_12;

public class ArrayService {

    public boolean contains(int[] arg, int numberToSearch) {
        for (int i = 0; i < arg.length; i++) {
            if (arg[i] == numberToSearch) {
                return true;
            }
        }
            return false;
    }
}