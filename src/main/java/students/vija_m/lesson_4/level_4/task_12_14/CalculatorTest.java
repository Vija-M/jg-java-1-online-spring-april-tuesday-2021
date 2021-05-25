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
    calculatorTest.maxOfTwoNumbers2();
    calculatorTest.maxOfTwoNumbers3();
    calculatorTest.maxOfThreeNumbers1();
    calculatorTest.maxOfThreeNumbers2();
    calculatorTest.maxOfThreeNumbers3();
    calculatorTest.maxOfThreeNumbers4();
    calculatorTest.maxOfThreeNumbers5();
    calculatorTest.maxOfThreeNumbers6();
    calculatorTest.maxOfThreeNumbers7();
    calculatorTest.maxOfThreeNumbers8();
    calculatorTest.maxOfThreeNumbers9();
    calculatorTest.maxOfThreeNumbers10();
}

    public void sumTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 15;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sum test         = OK");
        } else {
            System.out.println("Sum test         = FAIL");
        }
    }

    public void subTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 5;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sub test         = OK");
        } else {
            System.out.println("Sub test         = FAIL");
        }
    }

    public void mulTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 50;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.mul(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Mul test         = OK");
        } else {
            System.out.println("Mul test         = FAIL");
        }
    }

    public void divTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 2;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Div test         = OK");
        } else {
            System.out.println("Div test         = FAIL");
        }
    }


    public void isEven() {
        int number = 10;  // подготавливаем тестовые данные
        boolean expectedResult = true;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number); // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Even test        = OK");
        } else {
            System.out.println("Even test        = FAIL");
        }
    }


    public void isNotEven() {
        int number = 5;  // подготавливаем тестовые данные
        boolean expectedResult = false;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number); // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Not even test    = OK");
        } else {
            System.out.println("Not even test    = FAIL");
        }
    }

    public void maxOfTwoNumbers1() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 10;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Max of 2 test 1  = OK");
        } else {
            System.out.println("Max of 2 test 1  = FAIL");
        }
    }

    public void maxOfTwoNumbers2() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 11;  // подготавливаем тестовые данные
        int expectedResult = 11;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Max of 2 test 2  = OK");
        } else {
            System.out.println("Max of 2 test 2  = FAIL");
        }
    }

    public void maxOfTwoNumbers3() {
        int firstNumber = 8;  // подготавливаем тестовые данные
        int secondNumber = 8;  // подготавливаем тестовые данные
        int expectedResult = 8;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Max of 2 test 3  = OK");
        } else {
            System.out.println("Max of 2 test 3  = FAIL");
        }
    }

    public void maxOfThreeNumbers1() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int thirdNumber = -20;  // подготавливаем тестовые данные
        int expectedResult = 10;  // подготавливаем тестовые данные
       Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Max of 3 test 1  = OK");
    } else {
            System.out.println("Max of 3 test 1  = FAIL");
    }
}

    public void maxOfThreeNumbers2() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 25;  // подготавливаем тестовые данные
        int thirdNumber = 0;  // подготавливаем тестовые данные
        int expectedResult = 25;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Max of 3 test 2  = OK");
        } else {
            System.out.println("Max of 3 test 2  = FAIL");
        }
    }

    public void maxOfThreeNumbers3() {
        int firstNumber = -197;  // подготавливаем тестовые данные
        int secondNumber = 0;  // подготавливаем тестовые данные
        int thirdNumber = 40;  // подготавливаем тестовые данные
        int expectedResult = 40;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Max of 3 test 3  = OK");
        } else {
            System.out.println("Max of 3 test 3  = FAIL");
        }
    }

    public void maxOfThreeNumbers4() {
        int firstNumber = -20;  // подготавливаем тестовые данные
        int secondNumber = -20;  // подготавливаем тестовые данные
        int thirdNumber = -87;  // подготавливаем тестовые данные
        int expectedResult = -20;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Max of 3 test 4  = OK");
        } else {
            System.out.println("Max of 3 test 4  = FAIL");
        }
    }

    public void maxOfThreeNumbers5() {
        int firstNumber = -20;  // подготавливаем тестовые данные
        int secondNumber = -20;  // подготавливаем тестовые данные
        int thirdNumber = 87;  // подготавливаем тестовые данные
        int expectedResult = 87;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Max of 3 test 5  = OK");
        } else {
            System.out.println("Max of 3 test 5  = FAIL");
        }
    }

    public void maxOfThreeNumbers6() {
        int firstNumber = 87;  // подготавливаем тестовые данные
        int secondNumber = -20;  // подготавливаем тестовые данные
        int thirdNumber = 87;  // подготавливаем тестовые данные
        int expectedResult = 87;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Max of 3 test 6  = OK");
        } else {
            System.out.println("Max of 3 test 6  = FAIL");
        }
    }

    public void maxOfThreeNumbers7() {
        int firstNumber = 87;  // подготавливаем тестовые данные
        int secondNumber = 120;  // подготавливаем тестовые данные
        int thirdNumber = 87;  // подготавливаем тестовые данные
        int expectedResult = 120;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Max of 3 test 7  = OK");
        } else {
            System.out.println("Max of 3 test 7  = FAIL");
        }
    }


    public void maxOfThreeNumbers8() {
        int firstNumber = 87;  // подготавливаем тестовые данные
        int secondNumber = 120;  // подготавливаем тестовые данные
        int thirdNumber = 120;  // подготавливаем тестовые данные
        int expectedResult = 120;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Max of 3 test 8  = OK");
        } else {
            System.out.println("Max of 3 test 8  = FAIL");
        }
    }


    public void maxOfThreeNumbers9() {
        int firstNumber = 7;  // подготавливаем тестовые данные
        int secondNumber = -1;  // подготавливаем тестовые данные
        int thirdNumber = -1;  // подготавливаем тестовые данные
        int expectedResult = 7;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Max of 3 test 9  = OK");
        } else {
            System.out.println("Max of 3 test 9  = FAIL");
        }
    }


    public void maxOfThreeNumbers10() {
        int firstNumber = -4;  // подготавливаем тестовые данные
        int secondNumber = -4;  // подготавливаем тестовые данные
        int thirdNumber = -4;  // подготавливаем тестовые данные
        int expectedResult = -4;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Max of 3 test 10 = OK");
        } else {
            System.out.println("Max of 3 test 10 = FAIL");
        }
    }

}




