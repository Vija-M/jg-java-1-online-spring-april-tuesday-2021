package students.eriks_jaloveckis.lesson_6.level_3.task_12;

class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.positiveNumberIn();
        arrayServiceTest.positiveNumberOut();
        arrayServiceTest.negativeNumberIn();
        arrayServiceTest.negativeNumberOut();
        arrayServiceTest.zeroNumberIn();
        arrayServiceTest.zeroNumberOut();
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
}


