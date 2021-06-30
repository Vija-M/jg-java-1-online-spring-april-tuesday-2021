package students.arturs_arutjunovs.lesson_5.level_6.task_36;

class ArraysTest {

    Arrays arrays = new Arrays();

    public static void main(String[] args) {

        ArraysTest test = new ArraysTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
    }

    public void shouldCreateArray() {
        standardLengthArrayTest();
        zeroLengthArrayTest();

    }

    public void shouldFindMaxNumber() {
        int[] array = {0, 9, 35, 10, 42};
        assertFindMaxArrayTest(array, 42, "Max array number");
    }


    public void standardLengthArrayTest() {
        assertArrayLengthTest(5, "Ordinary elements array");
    }

    public void zeroLengthArrayTest() {
        assertArrayLengthTest(0, "Zero element array");
    }


    public void assertArrayLengthTest(int expectedResult, String testName) {
        int[] array = arrays.create(expectedResult);
        int actualResult = array.length;
        if (actualResult == expectedResult) {
            System.out.println("[TEST OK]: " + testName + " passed");
        } else {
            System.out.println("[TEST FAIL]: " + testName + " not passed");
        }
    }

    public void assertFindMaxArrayTest(int[] array, int expectedResult, String testName) {
        int actualResult = arrays.findMax(array);
        if (actualResult == expectedResult) {
            System.out.println("[TEST OK]: " + testName + " passed");
        } else {
            System.out.println("[TEST FAIL]: " + testName + " not passed");
        }
    }
}
