package students.dmitriy_shukailo.lesson_4.level_3.task_9;

import java.util.Scanner;

class MaxFromThreeNumbers {

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

        if ((numberOne > numberTwo) && (numberOne > numberThree)) {
            System.out.println("Max number is: " + numberOne);
        }

        else if ((numberOne < numberTwo) && (numberTwo > numberThree)) {
            System.out.println("Max number is: " + numberTwo);
        }

        else {
            System.out.println("Max number is: " + numberThree);
        }

    }

}