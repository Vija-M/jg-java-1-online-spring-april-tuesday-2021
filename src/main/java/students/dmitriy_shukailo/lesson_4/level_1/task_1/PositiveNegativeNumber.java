package students.dmitriy_shukailo.lesson_4.level_1.task_1;

import java.util.Scanner;

class PositiveNegativeNumber {

    public static void main(String[] args) {

        System.out.print("Enter a Number: ");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Number = " + number + " and it's positive");
        }

        else if (number < 0) {
            System.out.println("Number = " + number + " and it's negative");
        }

        else {
            System.out.println("Number = " + number);
        }

    }

}