package students.eriks_jaloveckis.lesson_4.level_2.task_6;
import java.util.Scanner;
class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber == secondNumber){
            System.out.println("Числа равны!");
        }
        else {
            System.out.println("Числа не равны!");
        }
    }
}

