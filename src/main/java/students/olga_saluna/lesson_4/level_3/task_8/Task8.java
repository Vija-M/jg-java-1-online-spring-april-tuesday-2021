package students.olga_saluna.lesson_4.level_3.task_8;
import java.util.Scanner;
class Task8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter X integer: ");

        int x = scanner.nextInt();

        System.out.println("Please enter Y integer: ");

        int y = scanner.nextInt();

        System.out.println("Please enter Z integer: ");

        int z = scanner.nextInt();

        if (x<y&&y<z) {System.out.println ("increasing");}
        else if (x>y&&y>z) {System.out.println ("decreasing");}
        else {System.out.println ("neither");}

    }
}
