package students.olga_t.lesson_4.level_4.tasks_10_14;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.divTest();
        calculatorTest.mulTest();
        calculatorTest.evenTest();
        calculatorTest.maxOfTwoNumbers1();
        calculatorTest.maxOfTwoNumbers2();
        calculatorTest.maxOfTwoNumbers3();
        calculatorTest.maxOfThreeNumbersTest(10, 5, 1, 10, 1);
        calculatorTest.maxOfThreeNumbersTest(5, 30, 1, 30, 2);
        calculatorTest.maxOfThreeNumbersTest(2, 8, 78, 78, 3);
        calculatorTest.maxOfThreeNumbersTest(5, 5, 2, 5, 4);
        calculatorTest.maxOfThreeNumbersTest(5, 10, 10, 10, 5);
        calculatorTest.maxOfThreeNumbersTest(15, 3, 15, 15, 6);
        calculatorTest.maxOfThreeNumbersTest(3, 3, 3, 3, 7);
    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;

        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void subTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;

        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sub test = OK");
        } else {
            System.out.println("Sub test = FAIL");
        }
    }

    public void divTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        float expectedResult = 2;

        Calculator calculator = new Calculator();
        float realResult = calculator.div(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Div test = OK");
        } else {
            System.out.println("Div test = FAIL");
        }
    }

    public void mulTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;

        Calculator calculator = new Calculator();
        int realResult = calculator.mul(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Mul test = OK");
        } else {
            System.out.println("Mul test = FAIL");
        }
    }

    public void evenTest() {
        int number = 10;
        boolean expectedResult = true;

        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        if (realResult == expectedResult) {
            System.out.println("evenTest = OK");
        } else {
            System.out.println("evenTest = FAIL");
        }
    }

    public void maxOfTwoNumbers1() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = firstNumber;

        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfTwoNumbers1 = OK");
        } else {
            System.out.println("maxOfTwoNumbers1 = FAIL");
        }
    }

    public void maxOfTwoNumbers2() {
        int firstNumber = 5;
        int secondNumber = 10;
        int expectedResult = secondNumber;

        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfTwoNumbers2 = OK");
        } else {
            System.out.println("maxOfTwoNumbers2 = FAIL");
        }
    }

    public void maxOfTwoNumbers3() {
        int firstNumber = 5;
        int secondNumber = 5;
        int expectedResult = secondNumber;

        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfTwoNumbers3 = OK");
        } else {
            System.out.println("maxOfTwoNumbers3 = FAIL");
        }
    }

    public void maxOfThreeNumbersTest(int number1, int number2, int number3, int expectedResult, int testNumber) {

        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(number1, number2, number3);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbersTest" + testNumber + " = OK");
        } else {
            System.out.println("maxOfThreeNumbersTest" + testNumber + " = FAIL");
        }
    }

}
