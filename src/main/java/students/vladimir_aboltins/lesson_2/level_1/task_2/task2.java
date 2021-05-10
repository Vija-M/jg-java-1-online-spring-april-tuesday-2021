package students.vladimir_aboltins.lesson_2.level_1.task_2;
import java.util.Scanner;

public class task2 {


    private static double userInputA;
    private static double userInputB;

    public static void main(String[] args) {

        printGreetings();

        printAskFirstNumber();
        double firstNumber = getAFromUser();//Ввод первого числа

        printAskSecondNumber();
        double secondNumber = getBFromUser();//Ввод второго числа

        printAskOperation();
        int operationSymbol = getOperationSymbolFromUser(); //Ввод символа операции
        double result;

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
//            if (firstNumber < secondNumber) {
//                System.out.print("First number must be greater then second\nFirst number: " + firstNumber + "\nSecond number: " + secondNumber);
//            } else {
                result = firstNumber / secondNumber;
//                if (result != firstNumber * secondNumber) {
//                    double resultDiv = firstNumber - secondNumber * result;//остаток от деления
//                    // int resultDiv2 = firstNumber % secondNumber;//остаток от деления
//                    System.out.print("By dividing " + firstNumber + " on " + secondNumber + " you get incomplete number (" + result + ") and remainder of the division is (" + resultDiv + ")"/*+ " " + resultDiv2*/);
//                } else
                    System.out.print(firstNumber + " " + symbolEntered + " " + secondNumber + " = " + result);
          //  }
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
        System.out.print("For (+) press 1\n For (-) press 2\n For (*) press 3\n For (/) press 4\nEnter number of operation you wish to perform and press enter\n ");
    }

    //вывод error
    public static void printEnteredNumberError() {
        System.out.print("Error, please try again");
    }

//Input

    public static double getAFromUser() {

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextDouble()) { // проверяет число
            userInputA = scanner.nextDouble();
            return userInputA;
        } else {
            printEnteredNumberError();
            printAskFirstNumber();
            getAFromUser();// рекурсия

        }
        return userInputA;
    }


    public static double getBFromUser() {

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextDouble()) { // проверяет число
            userInputB = scanner.nextDouble();
            if (userInputB > userInputA) {
                System.out.print("Second number is smaller, you will not be able to divide\n");
            }
            return userInputB;
        } else {
            printEnteredNumberError();
            getBFromUser();// рекурсия
        }
        return userInputB;
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
