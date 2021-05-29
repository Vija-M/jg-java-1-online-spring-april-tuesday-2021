package students.arturs_arutjunovs.lesson_4.level_7.tack_19;

class CalculatorTest {
    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest1();
        calculatorTest.isEvenTest2();

    }

    public void sumTest() {
        Calculator calculator = new Calculator();
        assertCalcCheck(calculator.sum(35, 40), 75, "sumTest");


    }

    public void subTest() {
        Calculator calculator = new Calculator();
        assertCalcCheck(calculator.sub(35, 15), 20, "subTest");
    }

    public void mulTest() {
        Calculator calculator = new Calculator();
        assertCalcCheck(calculator.mul(5, 5), 25, "mulTest");

    }

    public void divTest() {
        Calculator calculator = new Calculator();
        assertCalcCheck(calculator.div(40, 8), 5, "divTest");
    }

    public void isEvenTest1() {
        Calculator calculator = new Calculator();
        assertCalcCheck(calculator.isEven(40), true, "isEvenTest_1");

    }

    public void isEvenTest2() {
        Calculator calculator = new Calculator();
        assertCalcCheck(calculator.isEven(41), false, "isEvenTest_2");

    }

    void assertCalcCheck(int actualResult, int expectedResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println("[TEST OK]: " + testName + " passed");
        } else {
            System.out.println("[TEST FAIL]: " + testName + " not passed");

        }
    }

    void assertCalcCheck(boolean actualResult, boolean expectedResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println("[TEST OK]: " + testName + " passed");
        } else {
            System.out.println("[TEST FAIL]: " + testName + " not passed");
        }
    }
}
