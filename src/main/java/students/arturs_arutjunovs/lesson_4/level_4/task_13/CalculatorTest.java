package students.arturs_arutjunovs.lesson_4.level_4.task_13;

class CalculatorTest {
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
            System.out.println("Sum test = FAIL");
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

        int firstNumber = 8;
        int secondNumber = 5;
        int expectedResult = firstNumber;

        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("First number \"" + firstNumber + "\" is bigger, maxOfTwoNumbers test = OK");
        } else {
            System.out.println("Second number \"" + secondNumber + "\" is bigger, maxOfTwoNumbers test = FAIL");

        }
    }

    void maxOfTwoNumbersTest_Option_2() {

        int firstNumber = 4;
        int secondNumber = 9;
        int expectedResult = secondNumber;

        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Second number \"" + secondNumber + "\" is bigger, maxOfTwoNumbers test = OK");
        } else {
            System.out.println("First number \"" + firstNumber + "\" is bigger, maxOfTwoNumbers test = FAIL");
        }
    }

    void maxOfTwoNumbersEqualTest_Option_3() {

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
}
