package students.olga_saluna.lesson_4.level_4.task_11;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
    }

        public void sumTest () {
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

    public void subTest () {
        int firstNumber = 45;
        int secondNumber = 12;
        int expectedResult = 33;
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sub test = OK");
        } else {
            System.out.println("Sub test = FAIL");
        }
    }
    public void mulTest () {
        int firstNumber = 12;
        int secondNumber = 3;
        int expectedResult = 36;
        Calculator calculator = new Calculator();
        int realResult = calculator.mul(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Mul test = OK");
        } else {
            System.out.println("Mul test = FAIL");
        }
    }

    public void divTest () {
        int firstNumber = 66;
        int secondNumber = 33;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Div test = OK");
        } else {
            System.out.println("div test = FAIL");
        }
    }



    }
