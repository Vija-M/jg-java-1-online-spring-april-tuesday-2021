package students.dmitrijs_matrenicevs.lesson_6.level_1.task_6;

class NumberUtilsTest {


    NumberUtils numberUtils = new NumberUtils();

    public static void main(String[] args) {

        NumberUtilsTest numberUtilsTest = new NumberUtilsTest();
        numberUtilsTest.numberUtilsOne();
        numberUtilsTest.numberUtilsTwo();

    }

    void numberUtilsOne() {
        numberResult(false, 1);
    }

    void numberUtilsTwo() {
        numberResult(true, 2);
    }

    void numberResult(boolean expectedResult, int number) {
        boolean realResult = numberUtils.isEven(number);
        if (realResult == expectedResult) {
            System.out.println(number + " = " + "OK");
        } else {
            System.out.println(number + " = " + "FAIL");
        }
    }
}
