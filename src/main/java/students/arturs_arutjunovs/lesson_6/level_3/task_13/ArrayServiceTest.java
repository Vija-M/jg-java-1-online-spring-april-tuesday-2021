package students.arturs_arutjunovs.lesson_6.level_3.task_13;

import java.util.Objects;

class ArrayServiceTest {
    public static void main(String[] args) {

        ArrayServiceTest test = new ArrayServiceTest();
        test.occurScenario1();
        test.occurScenario2();
        test.occurScenario3();
        test.isContains_Scenario1();
        test.isContains_Scenario2();
        test.isContains_Scenario3();
        test.isContains_Scenario4();
    }

    public void occurScenario1() {
        ArrayService arrayService = new ArrayService();
        int countOccurrences = arrayService.countOccurrences(new int[]{7, 0, -12, 20, 0, 0}, 0);
        checkTestResult(countOccurrences == 3, "Three times entry");
    }

    public void occurScenario2() {
        ArrayService arrayService = new ArrayService();
        int countOccurrences = arrayService.countOccurrences(new int[]{7, 0, -12, 20, 0, 0}, -12);
        checkTestResult(countOccurrences == 1, "One time entry");
    }

    public void occurScenario3() {
        ArrayService arrayService = new ArrayService();
        int countOccurrences = arrayService.countOccurrences(new int[]{7, 0, -12, 20, 0, 0}, 5);
        checkTestResult(countOccurrences == 0, "No any entries");
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

    public void checkTestResult(boolean scenario, String testName) {
        if (scenario) {
            System.out.println("[ OK ] - " + testName);
        } else {
            System.out.println("[ FAIL ] - " + testName);
        }
    }
}