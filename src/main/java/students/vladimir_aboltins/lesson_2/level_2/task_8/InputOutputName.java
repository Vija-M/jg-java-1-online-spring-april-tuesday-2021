package students.vladimir_aboltins.lesson_2.level_2.task_8;
import java.util.Scanner;
public class InputOutputName {
    public static void main(String[] args) {

        System.out.println("Please enter your name:");
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello " + scan.nextLine() + "!");

    }
}
