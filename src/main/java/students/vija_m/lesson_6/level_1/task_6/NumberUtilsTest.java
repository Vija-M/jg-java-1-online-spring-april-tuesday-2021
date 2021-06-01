package students.vija_m.lesson_6.level_1.task_6;

class NumberUtilsTest {
    public static void main(String[] args) {
        NumberUtilsTest numberUtilsTest = new NumberUtilsTest();
        numberUtilsTest.test1();
        numberUtilsTest.test2();
    }

    public void test1() {
        NumberUtils numberUtils = new NumberUtils();
        assertEqualTest(numberUtils.isEven(40), true, "test1");
    }

    public void test2() {
        NumberUtils numberUtils = new NumberUtils();
        assertEqualTest(numberUtils.isEven(41), false, "test1");
    }

    void assertEqualTest(boolean result, boolean expected, String testName) {
        if (result == expected) {
            System.out.println(testName + "     = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }

    }
}
