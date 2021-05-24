package students.vija_m.lesson_4.level_4.task_12_14;

class CalculatorTest { public static void main(String[] args) {
    CalculatorTest calculatorTest = new CalculatorTest();
    calculatorTest.sumTest();
    calculatorTest.subTest();
    calculatorTest.mulTest();
    calculatorTest.divTest();
    calculatorTest.isEven();
    calculatorTest.isNotEven();
    calculatorTest.maxOfTwoNumbers1();
    calculatorTest.maxOfTwoNumbers2()
}

    public void sumTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 15;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sum test      = OK");
        } else {
            System.out.println("Sum test      = FAIL");
        }
    }

    public void subTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 5;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sub test      = OK");
        } else {
            System.out.println("Sub test      = FAIL");
        }
    }

    public void mulTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 50;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.mul(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Mul test      = OK");
        } else {
            System.out.println("Mul test      = FAIL");
        }
    }

    public void divTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 2;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Div test      = OK");
        } else {
            System.out.println("Div test      = FAIL");
        }
    }


    public void isEven() {
        int number = 10;  // подготавливаем тестовые данные
        boolean expectedResult = true;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number); // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Even test     = OK");
        } else {
            System.out.println("Even test     = FAIL");
        }
    }


    public void isNotEven() {
        int number = 5;  // подготавливаем тестовые данные
        boolean expectedResult = false;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number); // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Not even test = OK");
        } else {
            System.out.println("Not even test = FAIL");
        }
    }






}
