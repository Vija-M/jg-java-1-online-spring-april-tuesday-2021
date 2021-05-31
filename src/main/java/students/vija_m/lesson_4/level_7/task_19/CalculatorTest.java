package students.vija_m.lesson_4.level_7.task_19;

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
        newCalculatorTest(calculator.sum(35, 40), 75, "sumTest");
    }

    public void subTest() {
        Calculator calculator = new Calculator();
        newCalculatorTest(calculator.sub(35, 15), 20, "subTest");
    }

    public void mulTest() {
        Calculator calculator = new Calculator();
        newCalculatorTest(calculator.mul(5, 5), 25, "mulTest");
    }

    public void divTest() {
        Calculator calculator = new Calculator();
        newCalculatorTest(calculator.div(40, 8), 5, "divTest");
    }

    public void isEvenTest1() {
        Calculator calculator = new Calculator();
        newCalculatorTest(calculator.isEven(40), true, "isEvenTest1");
    }

    public void isEvenTest2() {
        Calculator calculator = new Calculator();
        newCalculatorTest(calculator.isEven(41), false, "isEvenTest1");
    }

    void newCalculatorTest(int result, int expected, String testName) {
        if (result == expected) {
            System.out.println(testName + "     = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }

    void newCalculatorTest(boolean result, boolean expected, String testName) {
        if (result == expected) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }


}


