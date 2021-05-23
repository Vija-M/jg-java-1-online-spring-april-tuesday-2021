package students.linda_junkina.lesson_4.level_3.task_9;

import java.util.Scanner;
class Task9Demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter 3 numbers: ");
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
        int numberC = scanner.nextInt();

        if (numberA > numberB && numberA > numberC) {
            System.out.println(numberA + " is the biggest number");
        } else if (numberB > numberA && numberB > numberC){
            System.out.println(numberB + " is the biggest number");
        } else if (numberC > numberA && numberC > numberB) {
            System.out.println(numberC + " is the biggest number");
        }
    }
}