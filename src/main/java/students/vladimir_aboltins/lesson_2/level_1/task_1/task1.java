package students.vladimir_aboltins.lesson_2.level_1.task_1;

import java.util.Scanner;

class task1 {

    public static void main(String[] args) {

        printGreetings();

        printAskFirstNumber();
        int firstNumber = getNumFromUser();//Ввод первого числа

        printAskSecondNumber();
        int secondNumber = getNumFromUser();//Ввод второго числа

        printAskOperation();
        int operationSymbol = getOperationSymbolFromUser();//Ввод символа операции

        int result;
        if (operationSymbol == 1) {
            char symbolEntered = '+';
            result = firstNumber + secondNumber;
            System.out.print(firstNumber + " " + symbolEntered + " " + secondNumber + " = " + result);
        } else if (operationSymbol == 2) {
            char symbolEntered = '-';
            result = firstNumber - secondNumber;
            System.out.print(firstNumber + " " + symbolEntered + " " + secondNumber + " = " + result);
        } else if (operationSymbol == 3) {
            char symbolEntered = '*';
            result = firstNumber * secondNumber;
            System.out.print(firstNumber + " " + symbolEntered + " " + secondNumber + " = " + result);
        } else if (operationSymbol == 4) {
            char symbolEntered = '/';
            if (firstNumber < secondNumber) {
                result = firstNumber / secondNumber;
                System.out.print("First number: " + firstNumber + "\nSecond number: " + secondNumber + "\nresult:" + result);
            } else {
                result = firstNumber / secondNumber;
                if (result != firstNumber * secondNumber) {
                    int resultDiv = firstNumber - secondNumber * result;//остаток от деления
                    int resultDiv2 = firstNumber % secondNumber;//остаток от деления
                    System.out.print("By dividing " + firstNumber + " on " + secondNumber + " you get incomplete number (" + result + ") and remainder of the division is (" + resultDiv + ")");
                } else
                    System.out.print(firstNumber + " " + symbolEntered + " " + secondNumber + " = " + result);
            }
        } else System.out.print("you entered number that not equal to any operation");// printAskOperation();


    }


//Output

    //вывод приветсвия
    public static void printGreetings() {
        System.out.print("Hello, please enter two integer numbers\n");
    }

    //вывод запроса первого числа
    public static void printAskFirstNumber() {
        System.out.print("Enter first number: ");
    }

    //вывод запроса второго числа
    public static void printAskSecondNumber() {
        System.out.print("Enter second number: ");
    }

    //вывод запроса операции
    public static void printAskOperation() {
        System.out.print(
                        "For (+) press 1\n" +
                        "For (-) press 2\n" +
                        "For (*) press 3\n" +
                        "For (/) press 4\n" +
                        "Enter number of operation you wish to perform and press enter.\n");
    }

    //вывод error
    public static void printEnteredNumberError() {
        System.out.print("Error, please try again");
    }

    //Input
    public static int getNumFromUser() {
        if(counter==5)
            System.exit(0);

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) { // проверяет число на целочисленость
            int userInput = scanner.nextInt();
            return userInput;
        } else {
            printEnteredNumberError();
            getNumFromUser();// рекурсия
        }return  0;

    }


    public static int getOperationSymbolFromUser() {
        Scanner scanner = new Scanner(System.in);
        int userInputOperation = scanner.nextInt();
        if (userInputOperation == 1 || userInputOperation == 2 || userInputOperation == 3 || userInputOperation == 4) {
            return userInputOperation;
        } else {
            printEnteredNumberError();
            printAskOperation();
            getOperationSymbolFromUser();// рекурсия
        }
        return userInputOperation;
    }

}





