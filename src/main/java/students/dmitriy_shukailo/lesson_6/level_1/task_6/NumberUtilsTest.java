package students.dmitriy_shukailo.lesson_6.level_1.task_6;

class NumberUtilsTest {

    public static void main(String[] args) {

        NumberUtilsTest numberUtilsTest = new NumberUtilsTest();
        numberUtilsTest.isEvenTestPositive();
        numberUtilsTest.isOddTestPositive();
        numberUtilsTest.isZeroTest();
        numberUtilsTest.isEvenTestNegative();
        numberUtilsTest.isOddTestNegative();
    }

    public void isEvenTestPositive() {
        int number = 10;
        boolean expectedResult = true;
        NumberUtils numberUtils = new NumberUtils();
        boolean realResult = numberUtils.isEven(number);
        if (realResult == expectedResult) {
            System.out.println("IsEvenPositive test = OK");
        } else {
            System.out.println("IsEvenPositive test = FAIL");
        }
    }

    public void isOddTestPositive() {
        int number = 11;
        boolean expectedResult = false;
        NumberUtils numberUtils = new NumberUtils();
        boolean realResult = numberUtils.isEven(number);
        if (realResult == expectedResult) {
            System.out.println("IsOddPositive test = OK");
        } else {
            System.out.println("IsOddPositive test = FAIL");
        }
    }

    public void isZeroTest() {
        int number = 0;
        boolean expectedResult = true;
        NumberUtils numberUtils = new NumberUtils();
        boolean realResult = numberUtils.isEven(number);
        if (realResult == expectedResult) {
            System.out.println("IsZero test = OK");
        } else {
            System.out.println("IsZero test = FAIL");
        }
    }

    public void isEvenTestNegative() {
        int number = -10;
        boolean expectedResult = true;
        NumberUtils numberUtils = new NumberUtils();
        boolean realResult = numberUtils.isEven(number);
        if (realResult == expectedResult) {
            System.out.println("IsEvenNegative test = OK");
        } else {
            System.out.println("IsEvenNegative test = FAIL");
        }
    }

    public void isOddTestNegative() {
        int number = -11;
        boolean expectedResult = false;
        NumberUtils numberUtils = new NumberUtils();
        boolean realResult = numberUtils.isEven(number);
        if (realResult == expectedResult) {
            System.out.println("IsOddNegative test = OK");
        } else {
            System.out.println("IsOddNegative test = FAIL");
        }
    }


}