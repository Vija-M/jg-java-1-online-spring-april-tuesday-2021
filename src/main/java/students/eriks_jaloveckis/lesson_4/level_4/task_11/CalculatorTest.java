package students.eriks_jaloveckis.lesson_4.level_4.task_11;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.divTest();
        calculatorTest.mulTest();

    }

    public void sumTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 15;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void subTest(){
        int firstNumber = 20;
        int secondNumber = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);
        if (realResult == expectedResult){
            System.out.println("Sub test = OK");
        }
        else{
            System.out.println("Sub test = FAIL");
        }
    }

    public void divTest(){
        int firstNumber = 10;
        int secondNumber = 2;
        int expectedNumber = 5;
        Calculator calculator = new Calculator();
        int realNumber = calculator.div(firstNumber, secondNumber);
        if (expectedNumber == realNumber){
            System.out.println("Sub test = OK");
        }
        else{
            System.out.println("Sub test = FAIL");
        }
    }

    public void mulTest(){
        int firstNumber = 5;
        int secondNumber = 2;
        int expectedNumber = 10;
        Calculator calculator = new Calculator();
        int realNumber = calculator.mul(firstNumber, secondNumber);
        if (expectedNumber == realNumber){
            System.out.println("Mul test = OK");
        }
        else{
            System.out.println("Mul test = FAIL");
        }
    }
}
