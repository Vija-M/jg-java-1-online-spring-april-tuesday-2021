package students.vija_m.lesson_4.level_3.task_9;
import java.util.Scanner;
class TheGreatest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter three integer numbers from -2147483648 to 2147483647.");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        {
            if (a >= b && a > c) System.out.println(a);
            else if (b >= a && b > c) System.out.println(b);
            else {
                System.out.println(c);
                 };

        }
    }}