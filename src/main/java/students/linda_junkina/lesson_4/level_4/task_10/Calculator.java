package students.linda_junkina.lesson_4.level_4.task_10;

class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    public int difference (int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
    public int product (int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
    public int quotient (int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }


    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public boolean maxNumberOutOfTwo (int firstNumber, int secondNumber) {
        return firstNumber >= secondNumber;
    }

    public boolean maxFirstNumber (int firstNumber, int secondNumber, int thirdNumber) {
        return firstNumber > secondNumber && firstNumber > thirdNumber;
    }
    public boolean maxSecondNumber (int firstNumber, int secondNumber, int thirdNumber) {
        return secondNumber > firstNumber && secondNumber > thirdNumber;
    }
    public boolean maxThirdNumber (int firstNumber, int secondNumber, int thirdNumber) {
        return thirdNumber > firstNumber && thirdNumber > secondNumber;
    }

    public boolean firstAndSecondEqual (int firstNumber, int secondNumber, int thirdNumber) {
        return firstNumber == secondNumber && firstNumber > thirdNumber;
    }

    public boolean allNumbersEqual (int firstNumber, int secondNumber, int thirdNumber) {
        return firstNumber == secondNumber && firstNumber == thirdNumber;
    }


    public boolean sumGreaterOrEqualsToThird (int firstNumber, int secondNumber, int thirdNumber) {
        return firstNumber + secondNumber >= thirdNumber;
    }

}
