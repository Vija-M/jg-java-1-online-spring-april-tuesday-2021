package students.vladimir_aboltins.lesson_3.level_2.task_9;

import java.util.Scanner;

class PrintInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        System.out.println("Hello "+scanner.nextLine()+"!");
    }
}
