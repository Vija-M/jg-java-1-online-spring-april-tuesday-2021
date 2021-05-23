package students.olga_saluna.lesson_4.level_1_task_3;
import java.util.Scanner;
class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter any integer: ");

        int x = scanner.nextInt();

        if (x % 2 == 0) {
            System.out.println ("This is an even number.");
        } else {
            System.out.println ("This is not an even number.");
        }
    }
}
