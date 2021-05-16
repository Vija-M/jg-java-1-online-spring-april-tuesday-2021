package students.vladimir_aboltins.lesson_2.level_1.task_1;

import java.util.Scanner;

class task1 {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {

        int result;

        printGreetings();

        printAskFirstNumber();
        int firstNumber = getNumFromUser(4);// Ввод первого числа

        printAskSecondNumber();
        int secondNumber = getNumFromUser(4);// Ввод второго числа

        printAskOperation();
        char operationSymbol = getOperationSymbolFromUser();// Ввод символа операции

        switch (operationSymbol) {
            case '+' : {
                result = firstNumber + secondNumber;
                System.out.print(firstNumber + " " + operationSymbol + " " + secondNumber + " = " + result);
                break;
            }
            case '-' : {
                result = firstNumber - secondNumber;
                System.out.print(firstNumber + " " + operationSymbol + " " + secondNumber + " = " + result);
                break;
            }
            case '*' : {
                result = firstNumber * secondNumber;
                System.out.print(firstNumber + " " + operationSymbol + " " + secondNumber + " = " + result);
                break;
            }
            case '/' : {
                result = firstNumber / secondNumber;
                System.out.print(firstNumber + " " + operationSymbol + " " + secondNumber + " = " + result);
                break;
            }
            case 'a' : {
                result = firstNumber + secondNumber;
                System.out.println(firstNumber + " + " + secondNumber + " = " + result);
                result = firstNumber - secondNumber;
                System.out.println(firstNumber + " - " + secondNumber + " = " + result);
                result = firstNumber * secondNumber;
                System.out.println(firstNumber + " * " + secondNumber + " = " + result);
                result = firstNumber / secondNumber;
                System.out.println(firstNumber + " / " + secondNumber + " = " + result);
                break;
            }
        }

    }

// Output

    // вывод приветсвия
    public static void printGreetings() {
        System.out.println("Hello, please enter two integer numbers");
    }

    // вывод запроса первого числа
    public static void printAskFirstNumber() {
        System.out.print("Enter first number: ");
    }

    // вывод запроса второго числа
    public static void printAskSecondNumber() {
        System.out.print("Enter second number: ");
    }

    // вывод запроса операции
    public static void printAskOperation() {
        System.out.print("Enter symbol of operation you wish to perform and press enter.\n" +
                "Symbols that can be performed: | " + ANSI_RED + "+" + ANSI_RESET + " | " + ANSI_RED + "-" + ANSI_RESET + " | " + ANSI_RED + "*" + ANSI_RESET + " | " + ANSI_RED + "/" + ANSI_RESET + " |\n" +
                "If you wish to see result of all operations, press | " + ANSI_RED + "a" + ANSI_RESET + " | symbol and press enter: ");
    }

    // вывод error
    public static void printEnteredNumberError() {
        System.out.print(ANSI_RED +"ERROR"+ ANSI_RESET +" number you entered is incorrect\n");
    }

    public static void printErrorExit() {
        System.out.print(ANSI_RED +"ERROR"+ ANSI_RESET +", You have exceeded the maximum attempts. Please restart program\n");
    }

    public static void printRemainingAttempts(int counter) {
        System.out.print("You have left " + ANSI_RED + counter + ANSI_RESET + " attempts before the program closes\n" +
                "Enter your number: ");
    }

    public static void printRemainingAttemptsSymbol(int counter) {
        System.out.print("You have left " + ANSI_RED + counter + ANSI_RESET + " attempts before the program closes\n" +
                "Enter your symbol: ");
    }

    // Input
    public static int getNumFromUser(int counter) {
        if (counter == 0)
            System.exit(0);
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) { // проверяет число на целочисленость
            return scanner.nextInt();
        } else if (counter == 1) {
            printErrorExit();
            getNumFromUser(counter - 1);// рекурсия
        } else {
            printEnteredNumberError();
            printRemainingAttempts(counter - 1);
            getNumFromUser(counter - 1);// рекурсия
        }
        return 0;
    }

    public static char getOperationSymbolFromUser() {


            //printRemainingAttemptsSymbol();
            Scanner scanner = new Scanner(System.in);
            char userInputOperation = scanner.next().charAt(0);
            if (userInputOperation == '+' || userInputOperation == '-' || userInputOperation == '*' || userInputOperation == '/' || userInputOperation == 'a')
                return userInputOperation;

//            if (counter == 1) {
//                printErrorExit();
//                getOperationSymbolFromUser();// рекурсия
//            }
//            printEnteredNumberError();
            getOperationSymbolFromUser();// рекурсия

        System.exit(0);
        return 0;
        }
    }




