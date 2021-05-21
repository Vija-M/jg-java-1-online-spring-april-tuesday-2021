package students.ernests_subhankulovs.lesson_4.level_1.task_3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter an integer value:");
        Scanner scanner = new Scanner(System.in);
        int enteredNumber = scanner.nextInt();

        if (enteredNumber % 2 == 0) {
            System.out.println("The entered number is even.");
        }
        else {
            System.out.println("The entered number is odd.");
        }
    }
}
