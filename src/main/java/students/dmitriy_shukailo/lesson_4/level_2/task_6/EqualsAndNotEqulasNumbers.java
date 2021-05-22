package students.dmitriy_shukailo.lesson_4.level_2.task_6;

import java.util.Scanner;

class EqualsAndNotEqulasNumbers {

    public static void main(String[] args) {

        System.out.print("Enter a first Number: ");
        Scanner scanner1 = new Scanner(System.in);
        int numberOne = scanner1.nextInt();

        System.out.print("Enter a second Number: ");
        Scanner scanner2 = new Scanner(System.in);
        int numberTwo = scanner2.nextInt();

        if (numberOne == numberTwo) {
            System.out.println("Numbers are equals");
        }

        else {
            System.out.println("Numbers are different");
        }

    }

}