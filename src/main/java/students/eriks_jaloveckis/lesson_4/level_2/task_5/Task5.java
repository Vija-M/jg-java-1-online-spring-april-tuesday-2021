package students.eriks_jaloveckis.lesson_4.level_2.task_5;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber < secondNumber){
            System.out.println("Наименьшее число: " + firstNumber);
        }

        else{
            System.out.println("Наименьшее число: " + secondNumber);
        }
    }
}
