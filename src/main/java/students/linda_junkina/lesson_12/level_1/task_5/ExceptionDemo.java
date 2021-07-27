package students.linda_junkina.lesson_12.level_1.task_5;

import java.util.Scanner;

class ExceptionDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");

        try {
            int age = scanner.nextInt();
            System.out.println(age);
        } catch (Exception e) {
            System.out.println("Try again!");
        }
    }
}
