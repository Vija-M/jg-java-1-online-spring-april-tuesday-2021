package students.ernests_subhankulovs.lesson_6.level_3.task_12;

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

    private void checkTestResult(boolean expectedResult, boolean realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}
