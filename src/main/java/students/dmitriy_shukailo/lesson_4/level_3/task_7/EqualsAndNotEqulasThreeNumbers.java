package students.dmitriy_shukailo.lesson_4.level_3.task_7;

import java.util.Scanner;

class EqualsAndNotEqulasThreeNumbers {

    public static void main(String[] args) {

        System.out.print("Enter a first Number: ");
        Scanner scanner1 = new Scanner(System.in);
        int numberOne = scanner1.nextInt();

        System.out.print("Enter a second Number: ");
        Scanner scanner2 = new Scanner(System.in);
        int numberTwo = scanner2.nextInt();

        System.out.print("Enter a third Number: ");
        Scanner scanner3 = new Scanner(System.in);
        int numberThree = scanner3.nextInt();

        if ((numberOne == numberTwo) && (numberTwo == numberThree)) {
            System.out.println("All numbers are equal");
        }

        else if ((numberOne != numberTwo) && (numberOne != numberThree) && (numberTwo != numberThree)) {
            System.out.println("All numbers are different");
        }

        else {
            System.out.println("Neither all are equal or different");
        }

    }

}