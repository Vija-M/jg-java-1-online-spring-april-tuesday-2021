package students.dmitriy_shukailo.lesson_6.level_3.task_17;

import java.util.Arrays;

class ArrayServiceTest {

    ArrayService arrayService = new ArrayService();

    public static void main(String[] args) {

        ArrayServiceTest test = new ArrayServiceTest();

        test.sortIncrease();
    }

    public void sortIncrease() {

        int[] arr = {0, -1, 3, 0, 7, -9};
        int[] expected = {-9, -1, 0, 0, 3, 7};
        arrayService.sortIncrease(arr);
        checkTest(Arrays.equals(arr, expected), "Test sort an array to increase is : ");
        System.out.println(Arrays.toString(arr));
    }

    private void checkTest(boolean condition, String test) {
        if (condition) {
            System.out.println(test + " = OK!");
        } else {
            System.out.println(test + " = FAIL!");
        }
    }

}