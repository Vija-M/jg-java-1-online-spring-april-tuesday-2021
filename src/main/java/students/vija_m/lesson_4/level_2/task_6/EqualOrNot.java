package students.vija_m.lesson_4.level_2.task_6;
import java.util.Scanner;
class EqualOrNot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите два целых числа от -2147483648 до 2147483647.");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        {
            if (a == b) System.out.println("Введённые числа " + a + " равны между собой.");
            else {
                System.out.println("Число " + a + " не равно числу " + b);

            }
        }}

}