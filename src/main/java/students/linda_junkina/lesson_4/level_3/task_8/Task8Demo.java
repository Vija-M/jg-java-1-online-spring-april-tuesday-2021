package students.linda_junkina.lesson_4.level_3.task_8;

import java.util.Scanner;
class Task8Demo {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
        int numberC = scanner.nextInt();

        if (numberA < numberB && numberB < numberC) {
            System.out.println("increasing");
        } else if (numberA > numberB && numberB > numberC){
            System.out.println("decreasing");
        } else {
            System.out.println("neither");
        }
    }
}
