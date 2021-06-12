package students.olga_saluna.lesson_6.level_3.task_12;

class ArrayServiceTest {

    ArrayService arrayService = new ArrayService();

    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.ifArrayContainsNumberTrue();
        test.ifArrayContainsNumberFalse();
    }

    public void ifArrayContainsNumberTrue() {
        int[] testArr = {3, 14, 24, 555, 45, 45, -17, 0};
        checkTestResult(true, arrayService.contains(testArr, -17), "Check if array contains int");
    }

    public void ifArrayContainsNumberFalse() {
        int[] testArr = {3, 14, 24, 555, 45, 45, 0};
        checkTestResult(false, arrayService.contains(testArr, 88), "Check if array does not contain int");
    }

    private void checkTestResult(boolean expectedResult, boolean realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

}
