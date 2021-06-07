package students.vija_m.lesson_6.level_3.task_16;


import java.util.Arrays;

class ArrayServiceTest {

    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.arrayReversionTest();
        test.occurrenceTest1();
        test.occurrenceTest2();
        test.occurrenceTest3();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
    }

    public void arrayReversionTest() {
        ArrayService service = new ArrayService();
        int[] arr = {2, 3, 5, -4, 6, 121, -4};
        int[] expected = {-4, 121, 6, -4, 5, 3, 2};
        service.reverse(arr);
        checkTestResult(Arrays.equals(arr, expected), "Test array reversion");
        System.out.println(Arrays.toString(arr));
    }


    public void occurrenceTest1() {
        ArrayService service = new ArrayService();
        int countOccurrences = service.countOccurrences(new int[]{2, 3, 5, -4, 6, 121, -4}, -4);
        checkTestResult(countOccurrences == 2, "Contains twice");
    }

    public void occurrenceTest2() {
        ArrayService service = new ArrayService();
        int countOccurrences = service.countOccurrences(new int[]{2, 3, 5, -4, 6, 121, -4}, 6);
        checkTestResult(countOccurrences == 1, "Contains once");
    }

    public void occurrenceTest3() {
        ArrayService service = new ArrayService();
        int countOccurrences = service.countOccurrences(new int[]{2, 3, 5, -4, 6, 121, -4}, 1);
        checkTestResult(countOccurrences == 0, "Contains null times");
    }


    public void test1() {
        ArrayService service = new ArrayService();
        boolean contains = service.contains(new int[]{2, 3, 6, 121, -4}, -4);
        checkTestResult(contains, "Contains negative number");
    }

    public void test2() {
        ArrayService service = new ArrayService();
        boolean contains = service.contains(new int[]{2, 3, 0, 6, 121, -4}, 0);
        checkTestResult(contains == true, "Contains zero");
    }

    public void test3() {
        ArrayService service = new ArrayService();
        boolean contains = service.contains(new int[]{2, 3, 0, 6, 121, -4}, 121);
        checkTestResult(contains == true, "Contains positive number");
    }

    public void test4() {
        ArrayService service = new ArrayService();
        boolean contains = service.contains(new int[]{2, 3, 0, 6, 121, -4}, 19);
        checkTestResult(contains != true, "Doesn't contain a number");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}
