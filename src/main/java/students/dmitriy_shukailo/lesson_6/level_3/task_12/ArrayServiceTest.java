package students.dmitriy_shukailo.lesson_6.level_3.task_12;

import java.util.Objects;

public class ArrayServiceTest {

    public static void main(String[] args) {

        ArrayServiceTest test = new ArrayServiceTest();

        test.containsPositive();
        test.containsZero();
        test.containsNegative();
        test.notContains();
    }

    public void containsPositive() {
        ArrayService arrayService = new ArrayService();
        boolean contains = arrayService.contains(new int[]{1, 2, 3, 4, 5, 0, -7}, 3);
        checkTest(Objects.equals(contains, true), "Array contains positive number");
    }

    public void containsZero() {
        ArrayService arrayService = new ArrayService();
        boolean contains = arrayService.contains(new int[]{1, 2, 3, 4, 5, 0, -7}, 0);
        checkTest(Objects.equals(contains, true), "Array contains zero");
    }

    public void containsNegative() {
        ArrayService arrayService = new ArrayService();
        boolean contains = arrayService.contains(new int[]{1, 2, 3, 4, 5, 0, -7}, -7);
        checkTest(Objects.equals(contains, true), "Array contains negative number");
    }

    public void notContains() {
        ArrayService arrayService = new ArrayService();
        boolean contains = arrayService.contains(new int[]{1, 2, 3, 4, 5, 0, -7}, 9);
        checkTest(Objects.equals(contains, false), "Array not contains needed number");
    }

    private void checkTest(boolean condition, String test) {
        if (condition) {
            System.out.println(test + " = OK!");
        } else {
            System.out.println(test + " = FAIL!");
        }
    }

}