package students.eriks_jaloveckis.lesson_2.level_3.task_9;

import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Введите целое число: ");
        int a = scanner.nextInt();

        System.out.println(a + " * 1 = "+ a);
        System.out.println(a + " * 2 = "+ a * 2);
        System.out.println(a + " * 3 = "+ a * 3);
        System.out.println(a + " * 4 = "+ a * 4);
        System.out.println(a + " * 5 = "+ a * 5);
        System.out.println(a + " * 6 = "+ a * 6);
        System.out.println(a + " * 7 = "+ a * 7);
        System.out.println(a + " * 8 = "+ a * 8);
        System.out.println(a + " * 9 = "+ a * 9);
        System.out.println(a + " * 10 = "+ a * 10);
    }


}
