package students.dmitriy_shukailo.lesson_6.level_3.task_16;

import java.util.Arrays;

public class ArrayServiceTest {

    ArrayService arrayService = new ArrayService();

    public static void main(String[] args) {

        ArrayServiceTest test = new ArrayServiceTest();

        test.revers();
    }

    public void revers() {

        int[] arr = {0, -1, 3, 7, -9};
        int[] expected = {-9, 7, 3, -1, 0};
        arrayService.reverse(arr);
        checkTest(Arrays.equals(arr, expected), "Reverse array test is : ");
    }

    private void checkTest(boolean condition, String test) {
        if (condition) {
            System.out.println(test + " = OK!");
        } else {
            System.out.println(test + " = FAIL!");
        }
    }

}