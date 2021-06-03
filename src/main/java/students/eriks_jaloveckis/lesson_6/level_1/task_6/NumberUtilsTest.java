package students.eriks_jaloveckis.lesson_6.level_1.task_6;

public class NumberUtilsTest {
    public static void main(String[] args) {
        NumberUtilsTest numberUtilsTest = new NumberUtilsTest();
        numberUtilsTest.evenNumberTest();
        numberUtilsTest.oddNumberTest();

    }

    public void assertIsEven(String testName, int number, boolean expected) {
        NumberUtils numberUtils = new NumberUtils();
        boolean actual = numberUtils.isEven(number);
        if (actual == expected) {
            System.out.println("TEST OK - " + testName);
        } else {
            System.out.println("TEST FAIL - " + testName);
        }
    }

    public void evenNumberTest() {
        assertIsEven("Even number", 2, true);
    }

    public void oddNumberTest() {
        assertIsEven("Odd number", 1, false);
    }

}
