package students.vija_m.lesson_4.level_3.task_8;
import java.util.Scanner;
class IncreasingOrDecreasing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter three integer numbers from -2147483648 to 2147483647.");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        { if (a < b && b < c ) System.out.println("increasing");
            else if ( a > b && b > c ) System.out.println("decreasing");
            else {
            System.out.println("neither");

}
        }
    }
}
