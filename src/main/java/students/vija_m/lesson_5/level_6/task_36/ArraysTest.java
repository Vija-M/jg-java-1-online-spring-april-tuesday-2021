package students.vija_m.lesson_5.level_6.task_36;


class ArraysTest {
    Arrays arrays = new Arrays();


    public static void main(String[] args) {
        ArraysTest test = new ArraysTest();
        test.shouldFindMaxNumber();
        test.shouldCreateArray();

    }
    void shouldFindMaxNumber() {
        maxValueTestZeroArray();
       maxValueTestNegativeNumbersArray();
       // maxValueTestLongArray();
    }

    void shouldCreateArray() {

        longArrayTest();
        shortArrayTest();
    }

    void maxValueTestZeroArray(){

        assertMaxValueTest(new int[]{0, 0, 2, 0, 0, 1}, 0, "Zero value test.");
    }

    void maxValueTestNegativeNumbersArray(){
        int[] array = {-10, -99, -8, -6, -4, -38};
        assertMaxValueTest(array, -4, "Negative value test.");
    }

    void assertMaxValueTest(int[] array, int expected, String testName) {
        int actual = arrays.findMax(array);
        if (actual == expected) {
            System.out.println("[OK]: " + testName);
        } else {
            System.out.println("[FAIL]: " + testName + " Expected " + expected + ", but was: " + actual);
        }
    }

   void longArrayTest() {

        assertArrayLengthTest(25, "25 elements array length test.");
    }


    void shortArrayTest() {

        assertArrayLengthTest(1, "One element array length test.");

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


}

