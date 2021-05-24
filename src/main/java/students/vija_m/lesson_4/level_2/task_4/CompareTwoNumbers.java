package students.vija_m.lesson_4.level_2.task_4;
import java.util.Scanner;
class CompareTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите два целых числа от -2147483648 до 2147483647.");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        {
            if (a > b ) {
                System.out.println(a);
            } else  {
                    System.out.println(b);
            }
        }
    }}

