package students.vija_m.lesson_6.level_3.task_17;


import java.util.Arrays;

class ArrayServiceTest {
    ArrayService service = new ArrayService();

    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.arraySortChaosTest();
        test.arrayReversionTest();
        test.arraySortIsSortedTest();
        test.arraySortIfEmptyTest();
        test.arraySortIfZeroTest();
        test.replaceAllTest1();
        test.replaceAllTest2();
        test.replaceAllTest3();
        test.replaceFirstTest1();
        test.replaceFirstTest2();
        test.occurrenceTest1();
        test.occurrenceTest2();
        test.occurrenceTest3();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
    }

    public void arraySortChaosTest() {
        int[] arr = {2, 3, 5, -4, 6, 121, -4};
        int[] expected = {-4, -4, 2, 3, 5, 6, 121};
        service.sort(arr);
        checkTestResult(Arrays.equals(arr, expected), "Test array sort if chaos");
           }

    public void arraySortIsSortedTest() {
        int[] arr = {-9, -4, 2, 3, 5, 6, 121};
        int[] expected = {-9, -4, 2, 3, 5, 6, 121};
        service.sort(arr);
        checkTestResult(Arrays.equals(arr, expected), "Test array sort if already sorted");
    }

    public void arraySortIfEmptyTest() {
        int[] arr = {};
        int[] expected = {};
        service.sort(arr);
        checkTestResult(Arrays.equals(arr, expected), "Test array sort if empty");
    }

    public void arraySortIfZeroTest() {
        int[] arr = {0};
        int[] expected = {0};
        service.sort(arr);
        checkTestResult(Arrays.equals(arr, expected), "Test array sort if contains only zero");
    }


    public void arrayReversionTest() {
        int[] arr = {2, 3, 5, -4, 6, 121, -4};
        int[] expected = {-4, 121, 6, -4, 5, 3, 2};
        service.reverse(arr);
        checkTestResult(Arrays.equals(arr, expected), "Test array reversion");
    }

    public void replaceAllTest1() {
        int[] arr = {2, 3, 0, 6, 121, -4};
        int[] expected = {2, 3, 9, 6, 121, -4};
        int replaceAll = service.replaceAll(arr, 0, 9);
        checkTestResult(replaceAll == 1, "Replaced one test (should return correct value)");
        checkTestResult(Arrays.equals(arr, expected), "Replaced one test (should modify array)");
        System.out.println(Arrays.toString(arr));
    }

    public void replaceAllTest2() {
        int[] arr = {2, 6, 3, 0, 6, 121, -4};
        int[] expected = {2, 9, 3, 0, 9, 121, -4};
        int replaceAll = service.replaceAll(arr, 6, 9);
        checkTestResult(replaceAll == 2, "Replaced two test(should return correct value)");
        checkTestResult(Arrays.equals(arr, expected), "Replaced two test (should modify array)");
    }

    public void replaceAllTest3() {
        int[] arr = {2, 6, 3, 0, 6, 121, -4};
        int[] expected = {2, 6, 3, 0, 6, 121, -4};
        int replaceAll = service.replaceAll(arr, 1, 9);
        checkTestResult(replaceAll == 0, "Replaced zero test(should return correct value)");
        checkTestResult(Arrays.equals(arr, expected), "Replaced zero test (should modify array)");
    }


    public void replaceFirstTest1() {
        int[] arr = {2, 3, 0, 6, 121, -4};
        int[] expected = {2, 3, 9, 6, 121, -4};
        boolean replaceFirst = service.replaceFirst(arr, 0, 9);
        checkTestResult(replaceFirst, "Replaced test (should return correct value)");
        checkTestResult(Arrays.equals(arr, expected), "Replaced test (should modify array)");
    }

    public void replaceFirstTest2() {
        int[] arr = {2, 3, 0, 6, 121, -4};
        int[] expected = {2, 3, 0, 6, 121, -4};
        boolean replaceFirst = service.replaceFirst(arr, 8, 9);
        checkTestResult(replaceFirst == false, "No number to replace test (should return correct value)");
        checkTestResult(Arrays.equals(arr, expected), "No number to replace test (should not modify array)");
    }


    public void occurrenceTest1() {
        int countOccurrences = service.countOccurrences(new int[]{2, 3, 5, -4, 6, 121, -4}, -4);
        checkTestResult(countOccurrences == 2, "Contains twice");
    }

    public void occurrenceTest2() {
        int countOccurrences = service.countOccurrences(new int[]{2, 3, 5, -4, 6, 121, -4}, 6);
        checkTestResult(countOccurrences == 1, "Contains once");
    }

    public void occurrenceTest3() {
        int countOccurrences = service.countOccurrences(new int[]{2, 3, 5, -4, 6, 121, -4}, 1);
        checkTestResult(countOccurrences == 0, "Contains null times");
    }


    public void test1() {
        boolean contains = service.contains(new int[]{2, 3, 6, 121, -4}, -4);
        checkTestResult(contains, "Contains negative number");
    }

    public void test2() {
        boolean contains = service.contains(new int[]{2, 3, 0, 6, 121, -4}, 0);
        checkTestResult(contains == true, "Contains zero");
    }

    public void test3() {
        boolean contains = service.contains(new int[]{2, 3, 0, 6, 121, -4}, 121);
        checkTestResult(contains == true, "Contains positive number");
    }

    public void test4() {
        boolean contains = service.contains(new int[]{2, 3, 0, 6, 121, -4}, 19);
        checkTestResult(!contains, "Doesn't contain a number");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

}



