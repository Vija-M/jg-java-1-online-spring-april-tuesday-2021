package students.vija_m.lesson_6.level_3.task_15;

import java.util.Objects;

class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.replaceAllTest1();
        test.replaceAllTest2();
        test.replaceAllTest3();
        test.occurrenceTest1();
        test.occurrenceTest2();
        test.occurrenceTest3();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
    }

    public void replaceAllTest1() {
        ArrayService service = new ArrayService();
        int replaceAll = service.replaceAll(new int[]{2, 3, 0, 6, 121, -4}, 0, 9);
        checkTestResult(replaceAll == 1, "Replaced one test");
    }

    public void replaceAllTest2() {
        ArrayService service = new ArrayService();
        int replaceAll = service.replaceAll(new int[]{2, 6, 3, 0, 6, 121, -4}, 6, 9);
        checkTestResult(replaceAll == 2, "Replaced two test");
    }

    public void replaceAllTest3() {
        ArrayService service = new ArrayService();
        int replaceAll = service.replaceAll(new int[]{2, 6, 3, 0, 6, 121, -4}, 1, 9);
        checkTestResult(replaceAll == 0, "Replaced zero test");
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