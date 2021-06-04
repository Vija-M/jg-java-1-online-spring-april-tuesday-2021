package students.arturs_arutjunovs.lesson_6.level_1.task_6;

class NumberUtilsTest {
    public static void main(String[] args) {

        NumberUtilsTest numberUtilsTest = new NumberUtilsTest();
        numberUtilsTest.isEvenTest();
        numberUtilsTest.isOddTest();
        numberUtilsTest.isZeroEvenTest();
    }

    public void isEvenTest() {
        NumberUtils numberUtils = new NumberUtils();
        int number = 10;
        //boolean expectedResult = true;

        boolean actualResult = numberUtils.isEven(number);
        if (actualResult) {
            System.out.println("isEven test = OK");
        } else {
            System.out.println("isEven test = FAIL");
        }
    }

    public void isOddTest() {
        NumberUtils numberUtils = new NumberUtils();
        int number = 11;
        //boolean expectedResult = false;

        boolean actualResult = numberUtils.isEven(number);
        if (!actualResult) {
            System.out.println("isOddTest test = OK");
        } else {
            System.out.println("isOddTest  = FAIL");

        }
    }

    public void isZeroEvenTest() {
        NumberUtils numberUtils = new NumberUtils();
        int number = 0;

        boolean actualResult = numberUtils.isEven(number);
        if (actualResult) {
            System.out.println("isZeroEvenTest = OK");
        } else {
            System.out.println("isZeroEvenTest = FAIL");
        }
    }
}