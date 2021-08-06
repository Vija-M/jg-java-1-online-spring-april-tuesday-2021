package students.dmitrijs_matrenicevs.lesson_12.level_1.task_5;

import java.util.Scanner;

class ExceptionDemo {

    public static void main(String[] args) throws Exception {

        Exception one = new Exception();
        Exception two = new Exception();
        Exception three = new Exception(one);
        Exception four = new Exception(two);
        Scanner scanner = new Scanner(System.in);
        System.out.println("1");
        System.out.println("2");
        int selection = scanner.nextInt();
        switch (selection) {
            case 1 -> throw three;
            case 2 -> throw four;
            default -> throw new IllegalStateException("Unexpected value: " + selection);
        }
    }
}
