package students.ernests_subhankulovs.lesson_7.level_6.task_10;

import java.util.Arrays;

class ArrayCopyTest {

    ArrayCopy arrayCopy = new ArrayCopy();

    public static void main(String[] args) {
        ArrayCopyTest test = new ArrayCopyTest();
        test.arrayCopyTestWithMultipleElements();
        test.arrayCopyTestWithHighestValue();
        test.arrayCopyTestWithLowestValue();
        test.arrayCopyTestWithNoValues();
        test.arrayCopyTestWithAllValues();
    }

    public void arrayCopyTestWithMultipleElements() {
        int[] inputArray = {1, 5, 10, 15, 20, 25};
        int[] expectedOutputArray = {10, 15, 20};
        assertTestResult(expectedOutputArray, arrayCopy.copyInRange(inputArray, 10, 20), "Array copy test with multiple elements");
    }

    public void arrayCopyTestWithHighestValue() {
        int[] inputArray = {1, 5, 10, 15, 20, 25};
        int[] expectedOutputArray = {25};
        assertTestResult(expectedOutputArray, arrayCopy.copyInRange(inputArray, 25, 30), "Array copy test with highest value");
    }

    public void arrayCopyTestWithLowestValue() {
        int[] inputArray = {1, 5, 10, 15, 20, 25};
        int[] expectedOutputArray = {1};
        assertTestResult(expectedOutputArray, arrayCopy.copyInRange(inputArray, 0, 1), "Array copy test with lowest value");
    }

    public void arrayCopyTestWithNoValues() {
        int[] inputArray = {1, 5, 10, 15, 20, 25};
        int[] expectedOutputArray = {};
        assertTestResult(expectedOutputArray, arrayCopy.copyInRange(inputArray, 26, 30), "Array copy test with no values in bounds");
    }

    public void arrayCopyTestWithAllValues() {
        int[] inputArray = {1, 5, 10, 15, 20, 25};
        int[] expectedOutputArray = {1, 5, 10, 15, 20, 25};
        assertTestResult(expectedOutputArray, arrayCopy.copyInRange(inputArray, 0, 30), "Array copy test with all values");
    }

    private void assertTestResult(int[] expectedResult, int[] realResult, String testName) {
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
        }
    }

}
