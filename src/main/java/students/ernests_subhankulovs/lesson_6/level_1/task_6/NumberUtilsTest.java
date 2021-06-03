package students.ernests_subhankulovs.lesson_6.level_1.task_6;

public class NumberUtilsTest {

    NumberUtils numberUtils = new NumberUtils();

    public static void main(String[] args) {
        NumberUtilsTest numberUtilsTest = new NumberUtilsTest();
        numberUtilsTest.oddNumberTest();
        numberUtilsTest.evenNumberTest();
    }

    void oddNumberTest() {
        assertResult("Odd number test",1,false);
    }

    void evenNumberTest() {
        assertResult("Even number test",2,true);
    }

    void assertResult(String testName, int number, boolean expectedResult) {
        boolean realResult = numberUtils.isEven(number);
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
            System.out.println("Number: " + number + "; Expected result: " + expectedResult + "; Real result: " + realResult);
        }
    }
}
