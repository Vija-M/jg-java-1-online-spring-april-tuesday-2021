package students.dmitrijs_matrenicevs.lesson_4.level_4.task_10_14;

class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;

    }

    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;

    }

    public int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;

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

    public int maxOfTwoNumbersOne(int firstNumber, int secondNumber) {

        if (firstNumber >= secondNumber) {

            return firstNumber;
        } else {
            return secondNumber;
        }

    }

    public int numbersOneTwoTreeMore(int firstNumber, int secondNumber, int treeNumber) {

        if (firstNumber >= secondNumber && firstNumber > treeNumber) {

            return firstNumber;

        } else if (secondNumber > treeNumber && secondNumber > firstNumber) {

            return secondNumber;

        } else {

            return treeNumber;
        }

    }




}
