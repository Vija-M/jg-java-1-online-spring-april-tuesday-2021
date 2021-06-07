package students.ernests_subhankulovs.lesson_6.level_3.task_14;

import java.util.Arrays;

class ArrayServiceTest {

    ArrayService arrayService = new ArrayService();

    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.checkForExistingPositiveNumber();
        test.checkForNonExistingPositiveNumber();
        test.checkForExistingZero();
        test.checkForNonExistingZero();
        test.checkForExistingNegativeNumber();
        test.checkForNonExistingNegativeNumber();
        test.checkForZeroOccurrences();
        test.checkForOneOccurrence();
        test.checkForTwoOccurrence();
        test.checkForThreeOccurrence();
        test.checkForFourOccurrence();
        test.checkForReplacement();
        test.checkForNoReplacement();
    }

    public void checkForExistingPositiveNumber() {
        int[] arrayToTest = {1, 2, 3, 4};
        checkTestResult(true, arrayService.contains(arrayToTest, 1), "Test if number should be found");
    }

    public void checkForNonExistingPositiveNumber() {
        int[] arrayToTest = {1, 2, 3, 4};
        checkTestResult(false, arrayService.contains(arrayToTest, 5), "Test if number should not be found");
    }

    public void checkForExistingZero() {
        int[] arrayToTest = {-1, 0, 1, 2};
        checkTestResult(true, arrayService.contains(arrayToTest, 0), "Test if zero should be found");
    }

    public void checkForNonExistingZero() {
        int[] arrayToTest = {1, 2, 3, 4};
        checkTestResult(false, arrayService.contains(arrayToTest, 0), "Test if zero should not be found");
    }

    public void checkForExistingNegativeNumber() {
        int[] arrayToTest = {-1, 0, 1, 2};
        checkTestResult(true, arrayService.contains(arrayToTest, -1), "Test negative number should be found");
    }

    public void checkForNonExistingNegativeNumber() {
        int[] arrayToTest = {1, 2, 3, 4};
        checkTestResult(false, arrayService.contains(arrayToTest, 0), "Test if negative number not be found");
    }

    public void checkForZeroOccurrences() {
        int[] arrayToTest = {1, 2, 3, 4};
        checkNumericTestResult(0,arrayService.countOccurrences(arrayToTest, 5),"Test for 0 occurrences");
    }

    public void checkForOneOccurrence() {
        int[] arrayToTest = {1, 2, 3, 4};
        checkNumericTestResult(1,arrayService.countOccurrences(arrayToTest, 1),"Test for 1 occurrence");
    }

    public void checkForTwoOccurrence() {
        int[] arrayToTest = {1, 1, 3, 4};
        checkNumericTestResult(2,arrayService.countOccurrences(arrayToTest, 1),"Test for 2 occurrences");
    }

    public void checkForThreeOccurrence() {
        int[] arrayToTest = {1, 1, 1, 3};
        checkNumericTestResult(3,arrayService.countOccurrences(arrayToTest, 1),"Test for 3 occurrences");
    }

    public void checkForFourOccurrence() {
        int[] arrayToTest = {1, 1, 1, 1};
        checkNumericTestResult(4,arrayService.countOccurrences(arrayToTest, 1),"Test for 4 occurrences");
    }

    public void checkForReplacement() {
        int[] arrayToTest = {1, 1, 1, 1};
        int[] expectedArray = {0, 1, 1, 1};
        checkTestResult(true, arrayService.replaceFirst(arrayToTest, 1, 0), "Test for first replacement that happened");
        checkArrays(arrayToTest, expectedArray, "Test array match in case of a replacement that happened");
    }

    public void checkForNoReplacement() {
        int[] arrayToTest = {1, 2, 3, 4};
        int[] expectedArray = {1, 2, 3, 4};
        checkTestResult(false, arrayService.replaceFirst(arrayToTest, 0, 5), "Test for first replacement that did not happened");
        checkArrays(arrayToTest, expectedArray, "Test array match in case of a replacement that did not happened");
    }

    private void checkTestResult(boolean expectedResult, boolean realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

    private void checkNumericTestResult(int expectedResult, int realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

    private void checkArrays(int[] expectedArray, int[] actualArray, String testName) {
        if (Arrays.equals(expectedArray, actualArray)) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}
