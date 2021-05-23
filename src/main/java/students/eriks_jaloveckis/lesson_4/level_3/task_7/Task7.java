package students.eriks_jaloveckis.lesson_4.level_3.task_7;
import java.util.Scanner;
class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int secondNumber = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int thirdNumber = scanner.nextInt();

        if (firstNumber == secondNumber && firstNumber == thirdNumber){
            System.out.print("All numbers are equal");
        }
        else if (firstNumber != secondNumber && firstNumber != thirdNumber && secondNumber != thirdNumber){
            System.out.print("All numbers are different");
        }
        else {
            System.out.print("Neither all are equal or different");
        }
    }


}
