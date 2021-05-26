package students.linda_junkina.lesson_4.level_4.task_10_11_12_13_14;

class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int difference(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int product(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int quotient(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }


    public int maxNumberOutOfTwo(int firstNumber, int secondNumber) {
        if (firstNumber >= secondNumber)
            return firstNumber;
        else
            return secondNumber;
    }

    public int maxNumberOutOfThree(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber)
            return firstNumber;
        else if (secondNumber >= firstNumber && secondNumber >= thirdNumber)
            return secondNumber;
        else
            return thirdNumber;
    }

}
