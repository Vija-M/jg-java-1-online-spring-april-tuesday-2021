package students.linda_junkina.lesson_6.task_12_13_14_15_16_17;

import java.util.Arrays;

class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.scenario1();
        test.scenario2();
        test.scenario3();
        test.scenario4();
        test.scenario5();
        test.scenario6();
        test.scenario7();
        test.scenario8();
    }

    public void scenario1() {
        ArrayService arrayService = new ArrayService();
        boolean contains = arrayService.contains(new int[]{0, 1, 2, 3, 4}, 0);
        checkTestResult(contains, "Contains 0");
    }

    public void scenario2() {
        ArrayService arrayService = new ArrayService();
        boolean contains = arrayService.contains(new int[]{0, -1, 2, 3, 4}, -1);
        checkTestResult(contains, "Contains -1");
    }

    public void scenario3() {
        ArrayService arrayService = new ArrayService();
        int counter = arrayService.countOccurrences(new int[]{0, 1, 2, 3, 4}, 5);
        checkTestResult(counter == 0, "Doesn't contains 5");
    }

    public void scenario4() {
        ArrayService arrayService = new ArrayService();
        int counter = arrayService.countOccurrences(new int[]{0, 1, 2, 3, 3}, 3);
        checkTestResult(counter == 0, "Contains number(3) 2 times");
    }

    public void scenario5() {
        ArrayService arrayService = new ArrayService();
        boolean replaceFirst = arrayService.replaceFirst(new int[]{0, 1, 2, 3, 4}, 0, 5);
        checkTestResult(replaceFirst, "0 replaced with 5");
    }

    public void scenario6() {
        ArrayService arrayService = new ArrayService();
        int replaceAll = arrayService.replaceAll(new int[]{0, 1, 0, 2, 0}, 0, 5);
        checkTestResult(replaceAll == 3, "All 0 replaced with 5");
    }


    public void scenario7() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {0, 1, 2, 3, 4};
        int[] expected = {4, 3, 2, 1, 0};
        arrayService.reverse(arr);
        checkTestResult(Arrays.equals(expected, arr), "Array reversed");
    }

    public void scenario8() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {1, -4, 3, 2};
        int[] expected = {-4, 1, 2, 3};
        arrayService.sort(arr);
        checkTestResult(Arrays.equals(expected, arr), "Array sorted");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}
