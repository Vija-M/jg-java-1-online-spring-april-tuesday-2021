package students.arturs_arutjunovs.lesson_4.level_4.task_14;

class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int mul(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;

        }
    }


    public int max(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber)
            return firstNumber;
        else return secondNumber;
    }

    public int max(int firstNumber, int secondNumber, int thirdNumber) {
        return max(max(firstNumber, secondNumber), thirdNumber);
    }
}
