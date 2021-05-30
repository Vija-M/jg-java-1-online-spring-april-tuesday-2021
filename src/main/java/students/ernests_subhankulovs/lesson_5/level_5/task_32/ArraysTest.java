package students.ernests_subhankulovs.lesson_5.level_5.task_32;

class ArraysTest {

    Arrays arrays = new Arrays();

    public static void main(String[] args) {
        ArraysTest test = new ArraysTest();
        test.shouldCreateArray();
    }

    public void shouldCreateArray() {
        zeroLengthArrayTest();
        singularLengthArrayTest();
        standardArrayTest();
    }

    public void zeroLengthArrayTest() {
        assertArrayTest("Zero element array", 0);
    }

    public void singularLengthArrayTest() {
        assertArrayTest("Single element array", 1);
    }

    public void standardArrayTest() {
        assertArrayTest("10 element array", 10);
    }

    public void assertArrayTest(String testName, int expectedResult) {
        int[] array = arrays.create(expectedResult);
        int realResult = array.length;
        if (realResult == expectedResult) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }
}
