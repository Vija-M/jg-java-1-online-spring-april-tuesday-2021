package students.ernests_subhankulovs.lesson_6.level_3.task_14;

class ArrayServiceTest {
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
        ArrayService arrayService = new ArrayService();
        int[] arrayToTest = {1, 2, 3, 4};
        checkTestResult(true, arrayService.contains(arrayToTest, 1), "Test if number should be found");
    }

    public void checkForNonExistingPositiveNumber() {
        ArrayService arrayService = new ArrayService();
        int[] arrayToTest = {1, 2, 3, 4};
        checkTestResult(false, arrayService.contains(arrayToTest, 5), "Test if number should not be found");
    }

    public void checkForExistingZero() {
        ArrayService arrayService = new ArrayService();
        int[] arrayToTest = {-1, 0, 1, 2};
        checkTestResult(true, arrayService.contains(arrayToTest, 0), "Test if zero should be found");
    }

    public void checkForNonExistingZero() {
        ArrayService arrayService = new ArrayService();
        int[] arrayToTest = {1, 2, 3, 4};
        checkTestResult(false, arrayService.contains(arrayToTest, 0), "Test if zero should not be found");
    }

    public void checkForExistingNegativeNumber() {
        ArrayService arrayService = new ArrayService();
        int[] arrayToTest = {-1, 0, 1, 2};
        checkTestResult(true, arrayService.contains(arrayToTest, -1), "Test negative number should be found");
    }

    public void checkForNonExistingNegativeNumber() {
        ArrayService arrayService = new ArrayService();
        int[] arrayToTest = {1, 2, 3, 4};
        checkTestResult(false, arrayService.contains(arrayToTest, 0), "Test if negative number not be found");
    }

    public void checkForZeroOccurrences() {
        ArrayService arrayService = new ArrayService();
        int[] arrayToTest = {1, 2, 3, 4};
        checkOccurrenceTestResult(0,arrayService.countOccurrences(arrayToTest, 5),"Test for 0 occurrences");
    }

    public void checkForOneOccurrence() {
        ArrayService arrayService = new ArrayService();
        int[] arrayToTest = {1, 2, 3, 4};
        checkOccurrenceTestResult(1,arrayService.countOccurrences(arrayToTest, 1),"Test for 1 occurrence");
    }

    public void checkForTwoOccurrence() {
        ArrayService arrayService = new ArrayService();
        int[] arrayToTest = {1, 1, 3, 4};
        checkOccurrenceTestResult(2,arrayService.countOccurrences(arrayToTest, 1),"Test for 2 occurrences");
    }

    public void checkForThreeOccurrence() {
        ArrayService arrayService = new ArrayService();
        int[] arrayToTest = {1, 1, 1, 3};
        checkOccurrenceTestResult(3,arrayService.countOccurrences(arrayToTest, 1),"Test for 3 occurrences");
    }

    public void checkForFourOccurrence() {
        ArrayService arrayService = new ArrayService();
        int[] arrayToTest = {1, 1, 1, 1};
        checkOccurrenceTestResult(4,arrayService.countOccurrences(arrayToTest, 1),"Test for 4 occurrences");
    }

    public void checkForReplacement() {
        ArrayService arrayService = new ArrayService();
        int[] arrayToTest = {1, 1, 1, 1};
        checkTestResult(true, arrayService.replaceFirst(arrayToTest, 1, 0), "Test for first replacement that happened");
    }

    public void checkForNoReplacement() {
        ArrayService arrayService = new ArrayService();
        int[] arrayToTest = {1, 1, 1, 1};
        checkTestResult(false, arrayService.replaceFirst(arrayToTest, 0, 1), "Test for first replacement that did not happen");
    }

    private void checkTestResult(boolean expectedResult, boolean realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

    private void checkOccurrenceTestResult(int expectedResult, int realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}
