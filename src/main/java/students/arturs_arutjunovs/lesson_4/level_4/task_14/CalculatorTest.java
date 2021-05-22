package students.arturs_arutjunovs.lesson_4.level_4.task_14;

public class CalculatorTest {
    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();

        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest();

        calculatorTest.maxOfTwoNumbersTest_Option_1();
        calculatorTest.maxOfTwoNumbersTest_Option_2();
        calculatorTest.maxOfTwoNumbersEqualTest_Option_3();

        calculatorTest.maxOfThreeNumbersTest_Option_1();
        calculatorTest.maxOfThreeNumbersTest_Option_2();
        calculatorTest.maxOfThreeNumbersTest_Option_3();
        calculatorTest.maxOfThreeNumbersTest_Option_4();
        calculatorTest.maxOfThreeNumbersTest_Option_5();
    }

    void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;

        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Expected result " + expectedResult + " , Real result " + realResult + " Sum test = FAIL");
        }
    }

    void subTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;

        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Subtraction test = OK");
        } else {
            System.out.println("Subtraction test = FAIL");
        }
    }

    void mulTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;

        Calculator calculator = new Calculator();
        int realResult = calculator.mul(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Multiplication test = OK");
        } else {
            System.out.println("Multiplication test = FAIL");
        }
    }

    void divTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;

        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Division test = OK");
        } else {
            System.out.println("Division test = FAIL");
        }
    }

    void isEvenTest() {
        //even or odd number
        int number = 8;
        boolean expectedResult = true;

        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        if (realResult == expectedResult) {
            System.out.println("isEven test = OK");
        } else {
            System.out.println("isEven test = FAIL");
        }
    }


    void maxOfTwoNumbersTest_Option_1() {
        //first number is bigger test
        int firstNumber = 8;
        int secondNumber = 5;
        int expectedResult = firstNumber;

        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfTwoNumbersTest_Option_1 test = OK");
        } else {
            System.out.println("Expected result: " + expectedResult + ", Real result: " + realResult + ", maxOfThreeNumbersTest_Option_3 test = FAIL");

        }
    }

    void maxOfTwoNumbersTest_Option_2() {
        //second number is bigger test
        int firstNumber = 4;
        int secondNumber = 9;
        int expectedResult = secondNumber;

        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfTwoNumbersTest_Option_2 test = OK");
        } else {
            System.out.println("Expected result: " + expectedResult + ", Real result: " + realResult + ", maxOfThreeNumbersTest_Option_3 test = FAIL");
        }
    }

    void maxOfTwoNumbersEqualTest_Option_3() {
        //both numbers are equal test
        int firstNumber = 7;
        int secondNumber = 7;
        int expectedResult = firstNumber;

        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if ((realResult == expectedResult) && (expectedResult == secondNumber)) {

            System.out.println("Both numbers are equal, test = OK");
        } else {
            System.out.println("Numbers are not equal, test FAIL");
        }
    }

    void maxOfThreeNumbersTest_Option_1() {
        //first number bigger than second and third
        int firstNumber = 12;
        int secondNumber = 6;
        int thirdNumber = 10;
        int expectedResult = firstNumber;

        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbersTest_Option_1 test = OK");
        } else {
            System.out.println("Expected result: " + expectedResult + ", Real result: " + realResult + ", maxOfThreeNumbersTest_Option_1 test = FAIL");
        }
    }

    void maxOfThreeNumbersTest_Option_2() {
        //second number bigger than first and third
        int firstNumber = 5;
        int secondNumber = 9;
        int thirdNumber = 3;
        int expectedResult = secondNumber;

        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbersTest_Option_2 test = OK");
        } else {
            System.out.println("Expected result: " + expectedResult + ", Real result: " + realResult + ", maxOfThreeNumbersTest_Option_2 test = FAIL");
        }
    }

    void maxOfThreeNumbersTest_Option_3() {
        //third number is bigger than first and second
        int firstNumber = 7;
        int secondNumber = 4;
        int thirdNumber = 11;
        int expectedResult = thirdNumber;

        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbersTest_Option_3 test = OK");
        } else {
            System.out.println("Expected result: " + expectedResult + ", Real result: " + realResult + ", maxOfThreeNumbersTest_Option_3 test = FAIL");
        }
    }

    void maxOfThreeNumbersTest_Option_4() {
        //first and second are equal and more than third
        int firstNumber = 7;
        int secondNumber = 7;
        int thirdNumber = 3;
        int expectedResult = firstNumber;

        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult && expectedResult == secondNumber && thirdNumber != secondNumber) {
            System.out.println("maxOfThreeNumbersTest_Option_4 test = OK");
        } else {
            System.out.println("Expected result: " + expectedResult + ", Real result: " + realResult + ", maxOfThreeNumbersTest_Option_4 test = FAIL");
        }
    }

    void maxOfThreeNumbersTest_Option_5() {
        //all three numbers are equal
        int firstNumber = 5;
        int secondNumber = 5;
        int thirdNumber = 5;
        int expectedResult = secondNumber;


        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult && expectedResult == firstNumber) {
            System.out.println("maxOfThreeNumbersTest_Option_5 test = OK");
        } else {
            System.out.println("Expected result: " + expectedResult + ", Real result: " + realResult + ", maxOfThreeNumbersTest_Option_5 test = FAIL");
        }
    }
}
