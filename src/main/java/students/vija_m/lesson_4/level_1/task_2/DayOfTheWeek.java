package students.vija_m.lesson_4.level_1.task_2;
import java.util.Scanner;
class DayOfTheWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, напишите какой сегодня по счёту день недели.");
        int a = scanner.nextInt();
        {
            if (a == 1) {
                System.out.println("Понедельник");
            } else if (a == 2) {
                System.out.println("Вторник");
            } else if (a == 3) {
                System.out.println("Среда");
            } else if (a == 4) {
                System.out.println("Четверг");
            } else if (a == 5) {
                System.out.println("Пятница");
            } else if (a == 6) {
                System.out.println("Суббота");
            } else if (a == 7) {
                System.out.println("Воскресенье");
            } else {
                System.out.println("Вы ввели неверный символ. Пожалуста, попробуйте ещё раз!");
            }
    }
}}
