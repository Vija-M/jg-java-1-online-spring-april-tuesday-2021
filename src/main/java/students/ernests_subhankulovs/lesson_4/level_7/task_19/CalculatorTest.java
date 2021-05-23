package students.ernests_subhankulovs.lesson_4.level_7.task_19;

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
        calculatorTestAssert1(calculator.sum(35, 40),75, "Sum test");
    }

    public void subTest() {
        Calculator calculator = new Calculator();
        calculatorTestAssert1(calculator.sub(35, 15),20, "Sub test");
    }

    public void mulTest() {
        Calculator calculator = new Calculator();
        calculatorTestAssert1(calculator.mul(5, 5),25, "Mul test");
    }

    public void divTest() {
        Calculator calculator = new Calculator();
        calculatorTestAssert1(calculator.div(40, 8),5, "Div test");
    }

    public void isEvenTest1() {
        Calculator calculator = new Calculator();
        calculatorTestAssert2(calculator.isEven(40), true, "isEven test");
    }

    public void isEvenTest2() {
        Calculator calculator = new Calculator();
        calculatorTestAssert2(calculator.isEven(41), false, "isEven test");
    }

    public void calculatorTestAssert1(int realResult, int expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }

    public void calculatorTestAssert2(boolean realResult, boolean expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
