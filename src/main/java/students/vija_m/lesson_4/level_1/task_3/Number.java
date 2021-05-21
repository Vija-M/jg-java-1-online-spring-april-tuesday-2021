package students.vija_m.lesson_4.level_1.task_3;

import java.util.Scanner;
class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите целое число от -2147483648 до 2147483647.");
        int a = scanner.nextInt();
        {
            if (a % 2 == 1) {
                System.out.println("Число " + a + " нечётное.");
            } else {
                System.out.println("Число " + a + " чётное.");
            }

        }}}
