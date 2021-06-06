package students.arturs_arutjunovs.lesson_6.level_3.task_12;

import java.util.Objects;

class ArrayServiceTest {
    public static void main(String[] args) {

        ArrayServiceTest test = new ArrayServiceTest();
        test.isContains_Scenario1();
        test.isContains_Scenario2();
        test.isContains_Scenario3();
        test.isContains_Scenario4();
    }

    public void isContains_Scenario1() {
        ArrayService arrayService = new ArrayService();
        boolean contains = arrayService.contains(new int[]{7, 0, -12, 20, 133}, 7);
        checkTestResult(Objects.equals(contains, true), "Includes positive number");
    }

    public void isContains_Scenario2() {
        ArrayService arrayService = new ArrayService();
        boolean contains = arrayService.contains(new int[]{7, 0, -12, 20, 133}, -12);
        checkTestResult(Objects.equals(contains, true), "Includes negative number");
    }

    public void isContains_Scenario3() {
        ArrayService arrayService = new ArrayService();
        boolean contains = arrayService.contains(new int[]{7, 0, -12, 20, 133}, 0);
        checkTestResult(Objects.equals(contains, true), "Includes zero");
    }


    public void isContains_Scenario4() {
        ArrayService arrayService = new ArrayService();
        boolean contains = arrayService.contains(new int[]{7, 0, -12, 20, 133}, 1);
        checkTestResult(Objects.equals(contains, false), "No such number");
    }

    private void checkTestResult(boolean scenario, String testName) {
        if (scenario) {
            System.out.println("[ OK ] - " + testName);
        } else {
            System.out.println("[ FAIL ] - " + testName);
        }
    }
}