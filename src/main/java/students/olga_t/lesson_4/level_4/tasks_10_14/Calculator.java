package students.olga_t.lesson_4.level_4.tasks_10_14;

class Calculator {
    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public float div(int firstNumber, int secondNumber) {
        return (float) firstNumber / secondNumber;
    }

    public int mul(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else if (firstNumber < secondNumber) {
            return secondNumber;
        } else {
            return firstNumber;
        }
    }

    public int maxOfThreeNumbers(int number1, int number2, int number3) {
        if (number3 >= number2 && number3 > number1) {
            return number3;
        } else if (number2 > number1 && number2 > number3) {
            return number2;
        } else {
            return number1;
        }
    }
}

