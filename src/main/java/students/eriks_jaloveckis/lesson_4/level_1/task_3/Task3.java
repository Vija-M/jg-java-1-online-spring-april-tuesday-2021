package students.eriks_jaloveckis.lesson_4.level_1.task_3;
import java.util.Scanner;
class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");

        int number = scanner.nextInt();


        if (number % 2 == 0){
            System.out.println("Число четное!");
        }

        else if (number % 2 == 1){
            System.out.println("Число неточное!");
        }
    }
}
