package students.vladimir_aboltins.lesson_2.level_3.Task_11;

import java.util.Scanner;

public class MeanValueOfThree {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {

        greatings();

        printAskFirstNumber();
        int firstNumber = getNumFromUser();// Ввод первого числа
        printAskSecondNumber();
        int secondNumber = getNumFromUser();// Ввод второго числа
        printAskThirdNumber();
        int thirdNumber = getNumFromUser();// Ввод третего числа
        float valueNumber=(firstNumber+secondNumber+thirdNumber)/3;
        System.out.println("Mean value of three is = " + valueNumber);

    }

    // Input
    public static int getNumFromUser() {

        for (int counter = 4;counter >= 1; counter--){
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) { // проверяет число на целочисленость
                int userInput = scanner.nextInt();
                return userInput;
            }
            if (counter == 1) {
                printErrorExit();
            } else if (counter > 1) {
                printEnteredNumberError();
                printRemainingAttempts(counter - 1);
            }
        }
        System.exit(0);
        return 0;
    }
    // вывод приветсвия
    public static void  greatings(){
        System.out.println("Please enter three integer numbers");
    }

    // вывод запроса первого числа
    public static void printAskFirstNumber() {
        System.out.print("Enter first number: ");
    }
    // вывод запроса второго числа
    public static void printAskSecondNumber() {
        System.out.print("Enter second number: ");
    }
    // вывод запроса третьего числа
    public static void printAskThirdNumber() {
        System.out.print("Enter third number: ");
    }
    // вывод error: достигнут лимит попыток
    public static void printErrorExit() {
        System.out.print(ANSI_RED + "ERROR" + ANSI_RESET + " You have exceeded the maximum attempts. Please restart program\n");
    }
    // вывод error: неправильный ввод
    public static void printEnteredNumberError() {
        System.out.print(ANSI_RED + "ERROR" + ANSI_RESET + " number you entered is incorrect\n");
    }
    // вывод error: остаток попыток для чисел
    public static void printRemainingAttempts(int counter) {
        System.out.print("You have left " + ANSI_RED + counter + ANSI_RESET + " attempts before the program closes\n" +
                "Enter your number: ");
    }
}
