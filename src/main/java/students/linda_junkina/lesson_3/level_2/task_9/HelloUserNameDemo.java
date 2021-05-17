package students.linda_junkina.lesson_3.level_2.task_9;

import java.util.Scanner;

class HelloUserNameDemo {

    public static void main(String[] args) {

        System.out.println("What is your name?");

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();


        System.out.println("Hello " + text + "!");
    }
}
