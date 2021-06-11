package students.dmitriy_shukailo.lesson_6.level_3.task_15;

import java.util.Arrays;

class ArrayServiceTest {

    ArrayService arrayService = new ArrayService();

    public static void main(String[] args) {

        ArrayServiceTest test = new ArrayServiceTest();


        test.notReplace();
        test.replaceZero();
        test.replacePositive();
        test.replaceNegative();
    }

    public void notReplace() {

        int[] arr = {1, 2, 1, -7, 0};
        int[] expected = {1, 2, 1, -7, 0};
        int replaceAll = arrayService.replaceAll(arr, 3, 5);

        checkTest(replaceAll == 0, "Count of replaced number is 0 : ");
        checkTest(Arrays.equals(arr, expected), "Array hasn't changed and equals expected : ");
    }

    public void replaceZero() {

        int[] arr = {1, 2, 1, -7, 0};
        int[] expected = {1, 2, 1, -7, 5};
        int replaceAll = arrayService.replaceAll(arr, 0, 5);

        checkTest(replaceAll == 1, "Count of replaced number is 1 : ");
        checkTest(Arrays.equals(arr, expected), "Array has changed and equals expected : ");
    }

    public void replacePositive() {

        int[] arr = {1, 2, 1, -7, 0};
        int[] expected = {5, 2, 5, -7, 0};
        int replaceAll = arrayService.replaceAll(arr, 1, 5);

        checkTest(replaceAll == 2, "Count of replaced number is 2 : ");
        checkTest(Arrays.equals(arr, expected), "Array has changed and equals expected : ");
    }

    public void replaceNegative() {

        int[] arr = {1, 2, 1, -7, 0};
        int[] expected = {1, 2, 1, 5, 0};
        int replaceAll = arrayService.replaceAll(arr, -7, 5);

        checkTest(replaceAll == 1, "Count of replaced number is 1 : ");
        checkTest(Arrays.equals(arr, expected), "Array has changed and equals expected : ");
    }

    private void checkTest(boolean condition, String test) {
        if (condition) {
            System.out.println(test + " = OK!");
        } else {
            System.out.println(test + " = FAIL!");
        }
    }

}