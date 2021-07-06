package students.vija_m.lesson_5.level_6.task_37_38;

class ArraysTest {
    Arrays arrays = new Arrays();

    public static void main(String[] args) {
        ArraysTest test = new ArraysTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    void shouldCreateArray() {
        longArrayTest();
        shortArrayTest();
    }

    void shouldFindMaxNumber() {
        maxValueTestZeroArray();
        maxValueTestNegativeNumbersArray();
        maxValueTestLongArray();
    }

    void shouldFindMinNumber() {
        minValueTestZeroArray();
        minValueTestNegativeNumbersArray();
        minValueTestLongArray();
    }

    void longArrayTest() {
        assertArrayLengthTest(25, "25 elements array length test.");
    }

    void shortArrayTest() {
        assertArrayLengthTest(1, "One element array length test.");
        System.out.println("");
    }

    void assertArrayLengthTest(int expected, String testName) {
        int[] array = arrays.create(expected);
        int actual = array.length;
        if (actual == expected) {
            System.out.println("[OK]: " + testName);
        } else {
            System.out.println("[FAIL]: " + testName + " Expected " + expected + ", but was: " + actual);
        }
    }

    void maxValueTestZeroArray() {
        assertMaxValueTest(new int[]{0, 0, 0, 0, 0, 0}, 0, "Maximum value zero value test");
    }

    void maxValueTestNegativeNumbersArray() {
        int[] array = {-10, -99, -8, -6, -4, -38};
        assertMaxValueTest(array, -4, "Maximum value negative value test.");
    }

    void maxValueTestLongArray() {
        int[] array = {-10, 183, 0, 94, -4, 822, 3, 7, -6, 0, 1, 2, 1, 4, 1, -390878476, 45, -385, 48, 4, 9856, -487, 984};
        assertMaxValueTest(array, 9856, "Maximum value long mix array max value test.");
        System.out.println("");
    }

    void assertMaxValueTest(int[] array, int expected, String testName) {
        int actual = arrays.findMax(array);
        if (actual == expected) {
            System.out.println("[OK]: " + testName);
        } else {
            System.out.println("[FAIL]: " + testName + " Expected " + expected + ", but was: " + actual);
        }
    }

    void minValueTestZeroArray() {
        assertMinValueTest(new int[]{0, 0, 0, 0, 0, 0}, 0, "Minimum value zero value test.");
    }

    void minValueTestNegativeNumbersArray() {
        int[] array = {-10, -99, -8, -6, -4, -38};
        assertMinValueTest(array, -99, "Minimum value negative value test.");
    }

    void minValueTestLongArray() {
        int[] array = {-10, 183, 0, 94, -4, 822, 3, 7, -6, 0, 1, 2, 1, 4, 1, -390878476, 45, -385, 48, 4, 9856, -487, 984};
        assertMinValueTest(array, -390878476, "Minimum value long mix array max value test.");
    }

    void assertMinValueTest(int[] array, int expected, String testName) {
        int actual = arrays.findMin(array);
        if (actual == expected) {
            System.out.println("[OK]: " + testName);
        } else {
            System.out.println("[FAIL]: " + testName + " Expected " + expected + ", but was: " + actual);
        }
    }
}
