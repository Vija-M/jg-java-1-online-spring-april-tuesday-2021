package students.ernests_subhankulovs.lesson_4.level_4.task_14;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTestEven();
        calculatorTest.isEvenTestOdd();
        calculatorTest.maxOfTwoNumbersTest1();
        calculatorTest.maxOfTwoNumbersTest2();
        calculatorTest.maxOfTwoNumbersTestEqual();
        calculatorTest.maxOfThreeNumbersTestA();
        calculatorTest.maxOfThreeNumbersTestB();
        calculatorTest.maxOfThreeNumbersTestC();
        calculatorTest.maxOfThreeNumbersTestAB();
        calculatorTest.maxOfThreeNumbersTestAC();
        calculatorTest.maxOfThreeNumbersTestBC();
        calculatorTest.maxOfThreeNumbersTestABC();
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

    public void divTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Div test = OK");
        } else {
            System.out.println("Div test = FAIL");
        }
    }

    public void isEvenTestEven() {
        int number = 10;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        boolean expectedResult = true;
        if (realResult == expectedResult) {
            System.out.println("isEven test 1 (even) = OK");
        } else {
            System.out.println("isEven test 1 (even) = FAIL");
        }
    }

    public void isEvenTestOdd() {
        int number = 5;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        boolean expectedResult = false;
        if (realResult == expectedResult) {
            System.out.println("isEven test 2 (odd)  = OK");
        } else {
            System.out.println("isEven test 2 (odd)  = FAIL");
        }
    }

    public void maxOfTwoNumbersTest1() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfTwoNumbers Test 1 (A > B) = OK");
        } else {
            System.out.println("maxOfTwoNumbers Test 1 (A > B) = FAIL");
        }
    }

    public void maxOfTwoNumbersTest2() {
        int firstNumber = 5;
        int secondNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfTwoNumbers Test 2 (A < B) = OK");
        } else {
            System.out.println("maxOfTwoNumbers Test 2 (A < B) = FAIL");
        }
    }

    public void maxOfTwoNumbersTestEqual() {
        int firstNumber = 5;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfTwoNumbers Test 3 (A = B) = OK");
        } else {
            System.out.println("maxOfTwoNumbers Test 3 (A = B) = FAIL");
        }
    }

    public void maxOfThreeNumbersTestA() {
        maxOfThreeNumbersAssert(15, 10, 5, 15, "1 (A > B & A > C)");
    }

    public void maxOfThreeNumbersTestB() {
        maxOfThreeNumbersAssert(10, 15, 5, 15, "2 (B > A & B > C)");
    }

    public void maxOfThreeNumbersTestC() {
        maxOfThreeNumbersAssert(10, 5, 15, 15, "3 (C > A & C > B)");
    }

    public void maxOfThreeNumbersTestAB() {
        maxOfThreeNumbersAssert(15, 15, 10, 15, "4 (A = B & A > C)");
    }

    public void maxOfThreeNumbersTestAC() {
        maxOfThreeNumbersAssert(15, 10, 15, 15, "5 (A = C & A > B)");
    }

    public void maxOfThreeNumbersTestBC() {
        maxOfThreeNumbersAssert(10, 15, 15, 15, "6 (B = C & B > A)");
    }

    public void maxOfThreeNumbersTestABC() {
        maxOfThreeNumbersAssert(15, 15, 15, 15, "7 (A = B & B = C)");
    }

    void maxOfThreeNumbersAssert(int firstNumber, int secondNumber, int thirdNumber, int expectedResult, String testMemo) {
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbers Test " + testMemo + " = OK");
        } else {
            System.out.println("maxOfThreeNumbers Test " + testMemo + " = FAIL");
        }
    }
}
