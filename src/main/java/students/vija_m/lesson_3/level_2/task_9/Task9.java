package students.vija_m.lesson_3.level_2.task_9;

import java.util.Scanner;
 class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name, please!");
        String Name = scanner.nextLine();
        String greeting = "Hello " + Name + "!";
        System.out.println(greeting);

    }

}
