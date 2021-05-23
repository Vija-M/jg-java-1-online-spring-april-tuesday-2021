package students.antons_korenevskis.lesson_4.level_4;

class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int minus(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int divide(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return (firstNumber);
        } else if (firstNumber < secondNumber) {
            return (secondNumber);
        } else {
            return (firstNumber);
        }
    }

    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            return (firstNumber);
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber)  {
            return (secondNumber);
        }  else {
            return (thirdNumber);
        }

    }
}