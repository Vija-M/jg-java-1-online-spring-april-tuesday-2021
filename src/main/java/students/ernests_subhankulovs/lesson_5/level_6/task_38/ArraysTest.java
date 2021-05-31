package students.ernests_subhankulovs.lesson_5.level_6.task_38;

class ArraysTest {

    Arrays arrays = new Arrays();

    public static void main(String[] args) {
        ArraysTest test = new ArraysTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        zeroLengthArrayTest();
        singularLengthArrayTest();
        standardArrayTest();
    }

    public void zeroLengthArrayTest() {
        assertArrayLengthTest("Zero element array", 0);
    }

    public void singularLengthArrayTest() {
        assertArrayLengthTest("Single element array", 1);
    }

    public void standardArrayTest() {
        assertArrayLengthTest("10 element array", 10);
    }

    public void shouldFindMaxNumber() {
        int[] array = {3, 7, 9, 12, 21};
        int realResult = arrays.findMax(array);
        assertArraySizeTest("Largest array element",21, realResult);
    }

    public void shouldFindMinNumber() {
        int[] array = {3, 7, 9, 12, 21};
        int realResult = arrays.findMin(array);
        assertArraySizeTest("Smallest array element",3, realResult);
    }

    public void assertArrayLengthTest(String testName, int expectedResult) {
        int[] array = arrays.create(expectedResult);
        int realResult = array.length;
        if (realResult == expectedResult) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }

    public void assertArraySizeTest(String testName, int expectedResult, int realResult) {
        if (realResult == expectedResult) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }

}