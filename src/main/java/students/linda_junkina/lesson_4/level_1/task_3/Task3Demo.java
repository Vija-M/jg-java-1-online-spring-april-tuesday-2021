package students.linda_junkina.lesson_4.level_1.task_3;

import java.util.Scanner;
class Task3Demo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();



        if (number % 2 == 0){
            System.out.println("It is even number.");
        }
        if (number % 2 == 1){
            System.out.println("It is odd number.");
        }
    }
}
