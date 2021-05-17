package students.ernests_subhankulovs.lesson_3.level_2.task_9;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        System.out.println("Please enter your username:");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("Hello " + userName + "!");
    }
}
