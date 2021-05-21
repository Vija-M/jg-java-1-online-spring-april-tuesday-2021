package students.ernests_subhankulovs.lesson_4.level_4.task_12;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTestEven();
        calculatorTest.isEvenTestOdd();
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
            System.out.println("IsEven test 1 (even) = OK");
        } else {
            System.out.println("IsEven test 1 (even) = FAIL");
        }
    }

    public void isEvenTestOdd() {
        int number = 5;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        boolean expectedResult = false;
        if (realResult == expectedResult) {
            System.out.println("IsEven test 2 (odd)  = OK");
        } else {
            System.out.println("IsEven test 2 (odd)  = FAIL");
        }
    }
}

