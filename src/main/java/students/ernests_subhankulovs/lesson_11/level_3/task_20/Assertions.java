package students.ernests_subhankulovs.lesson_11.level_3.task_20;

import java.util.List;

class Assertions {
    public void assertTestResult(boolean expectedResult, boolean realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
            System.out.println("Actual result: " + realResult);
        }
    }

    public void assertNumericTestResult(int expectedResult, int realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
            System.out.println("Actual result: " + realResult);
        }
    }

    public void assertBookTestResult(List<Book> expectedResult, List<Book> realResult, String testName) {
        if (expectedResult.equals(realResult)) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
            System.out.println("Actual result: " + realResult);
        }
    }
}
