package students.dmitriy_shukailo.lesson_4.level_2.task_5;

import java.util.Scanner;

class LesserNumber {

    public static void main(String[] args) {

        System.out.print("Enter a first Number: ");
        Scanner scanner1 = new Scanner(System.in);
        int numberOne = scanner1.nextInt();

        System.out.print("Enter a second Number: ");
        Scanner scanner2 = new Scanner(System.in);
        int numberTwo = scanner2.nextInt();

        if (numberOne < numberTwo) {
            System.out.println("Lesser Number is " + numberOne);
        }

        else {
            System.out.println("Lesser Number is " + numberTwo);
        }

    }

}