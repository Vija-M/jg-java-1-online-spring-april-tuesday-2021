package students.eriks_jaloveckis.lesson_6.level_3.task_15;

class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.positiveNumberIn();
        arrayServiceTest.positiveNumberOut();
        arrayServiceTest.negativeNumberIn();
        arrayServiceTest.negativeNumberOut();
        arrayServiceTest.zeroNumberIn();
        arrayServiceTest.zeroNumberOut();
        arrayServiceTest.testReplace();
        arrayServiceTest.testCount();
    }

    public void testReplace() {
        replaceAll();
        replaceAllNegative();
        replaceFirstNumber();
    }

    public void testCount() {
        twoNumbersInCount();
        noOneNumberInCount();
    }

    public void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " FAIL!");
        }
    }

    public void positiveNumberIn() {
        ArrayService arrayService = new ArrayService();
        boolean contains = arrayService.contains(new int[]{1, 2, 3, 4, 5}, 2);
        checkTestResult(contains, "Contain positive number");
    }

    public void positiveNumberOut() {
        ArrayService arrayService = new ArrayService();
        boolean contains = arrayService.contains(new int[]{1, 2, 3, 4, 5}, 6);
        checkTestResult(!contains, "Does not contain positive number");
    }

    public void negativeNumberIn() {
        ArrayService arrayService = new ArrayService();
        boolean contains = arrayService.contains(new int[]{-1, -2, -3, -4, -5}, -1);
        checkTestResult(contains, "Contain negative number");
    }

    public void negativeNumberOut() {
        ArrayService arrayService = new ArrayService();
        boolean contains = arrayService.contains(new int[]{1, 2, 3, 4, 5}, -3);
        checkTestResult(!contains, "Does not contain negative number");
    }

    public void zeroNumberIn() {
        ArrayService arrayService = new ArrayService();
        boolean contains = arrayService.contains(new int[]{0, 1, 2, 3, 4}, 0);
        checkTestResult(contains, "Contain zero");
    }

    public void zeroNumberOut() {
        ArrayService arrayService = new ArrayService();
        boolean contains = arrayService.contains(new int[]{1, 2, 3, 4, 5}, 0);
        checkTestResult(contains, "Does not contain zero");
    }


    public void twoNumbersInCount() {
        ArrayService arrayService = new ArrayService();
        int count = arrayService.countOccurrences(new int[]{1, 1, 2, 3, 4}, 1);
        checkTestResult(count == 2, "Number 1 in array is 2x");
    }

    public void noOneNumberInCount() {
        ArrayService arrayService = new ArrayService();
        int count = arrayService.countOccurrences(new int[]{1, 2, 3, 4, 5}, 6);
        checkTestResult(count == 0, "No one number is not in array");
    }

    public void replaceFirstNumber() {
        ArrayService arrayService = new ArrayService();
        arrayService.replaceFirst(new int[]{4, 2, 3, 4, 5}, 1, 6);
        checkTestResult(true, "First number is replaced to number - 6");
    }

    public void replaceAll() {
        ArrayService arrayService = new ArrayService();
        int count = arrayService.replaceAll(new int[]{1, 1, 1, 8, 4}, 1, 6);
        checkTestResult(count == 3, "Three numbers are replaced to numbers - 6");
    }

    public void replaceAllNegative() {
        ArrayService arrayService = new ArrayService();
        int count = arrayService.replaceAll(new int[]{1, 2, 3, 4, 5}, 6, 7);
        checkTestResult(count == 0, "No one numbers is not replaced");
    }
}
