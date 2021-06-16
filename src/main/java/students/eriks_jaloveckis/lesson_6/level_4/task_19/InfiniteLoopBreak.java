package students.eriks_jaloveckis.lesson_6.level_4.task_19;

import java.util.Arrays;

class InfiniteLoopBreak {
    public static void main(String[] args) {

        boolean infinite = true;
        int count = 0;
        String[] infiniteWhile = {"InfiniteWhile"};
        while (infinite) {
            System.out.println(Arrays.toString(infiniteWhile));
            count++;
            if (count == 10) {
                break;
            }
        }
        String[] infiniteFor = {"InfiniteFor"};
        int countFor = 0;
        for (; ; ) {
            System.out.println(Arrays.toString(infiniteFor));
            countFor++;
            if (countFor == 10) {
                break;
            }
        }
    }
}
