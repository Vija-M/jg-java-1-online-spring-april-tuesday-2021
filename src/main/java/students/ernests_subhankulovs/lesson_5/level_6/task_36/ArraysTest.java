package students.ernests_subhankulovs.lesson_5.level_6.task_36;

class ArraysTest {

    Arrays arrays = new Arrays();

    public static void main(String[] args) {
        ArraysTest test = new ArraysTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
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
        assertArraySizeTest("Largest array element", array, 21);
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

    public void assertArraySizeTest(String testName, int[] array, int expectedResult) {
        int realResult = arrays.findMax(array);
        if (realResult == expectedResult) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }

}