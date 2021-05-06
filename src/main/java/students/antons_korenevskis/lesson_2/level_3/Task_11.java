package students.antons_korenevskis.lesson_2.level_3;

import java.text.DecimalFormat;

public class Task_11 {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Введи первое число");
        double a = scanner.nextDouble();
        System.out.println("Введи второе");
        double b = scanner.nextDouble();
        System.out.println("И, наконец, третье");
        double c = scanner.nextDouble();

        double middle = ((a + b + c) / 3 );
        DecimalFormat df = new DecimalFormat("###.#");
        System.out.println("Среднее арифметическое для чисел это " +df.format(middle));


    }
}
