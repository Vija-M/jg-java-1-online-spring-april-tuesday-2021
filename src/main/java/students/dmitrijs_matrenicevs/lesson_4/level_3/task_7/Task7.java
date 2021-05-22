package students.dmitrijs_matrenicevs.lesson_4.level_3.task_7;

import java.util.Scanner;

class Task7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе целое число: ");
        int b = scanner.nextInt();
        System.out.print("Введите трерье целое число: ");
        int c = scanner.nextInt();

        if (a == b && b == c) {
            System.out.println("All numbers are equal: " + "ВСЕ ЧИСЛА РАВНЫ!");
        } else if (a != b && b != c && c != a) {
            System.out.print("All numbers are different: " + "ВСЕ ЧИСЛА РАЗНЫЕ!");
        } else {
            System.out.print("Neither all are equal or different: ");
        }
    }
}