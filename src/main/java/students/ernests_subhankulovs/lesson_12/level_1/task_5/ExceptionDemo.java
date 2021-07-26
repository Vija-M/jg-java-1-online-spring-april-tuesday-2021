package students.ernests_subhankulovs.lesson_12.level_1.task_5;

import java.util.Scanner;

class ExceptionDemo {

    public static void main(String[] args) throws Exception {
        Exception exception1 = new Exception();
        Exception exception2 = new Exception("Sample exception message");
        Exception exception3 = new Exception("Sample exception message. Message with a cause.", exception2);
        Exception exception4 = new Exception(exception1);
        Scanner scanner = new Scanner(System.in);
        System.out.println("1) Exception with details");
        System.out.println("2) Exception without details");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> throw exception3;
            case 2 -> throw exception4;
        }
    }
}
