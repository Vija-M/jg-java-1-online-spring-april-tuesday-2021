package students.vija_m.lesson_4.level_3.task_7;
import java.util.Scanner;
class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter three integer numbers from -2147483648 to 2147483647.");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        { if (a == b && b == c ) System.out.println("All numbers are equal");
        else if (a != b && b != c  ) System.out.println("All numbers are different");
         else {
            System.out.println  ("Neither all are equal or different"); }
        }
        }}







