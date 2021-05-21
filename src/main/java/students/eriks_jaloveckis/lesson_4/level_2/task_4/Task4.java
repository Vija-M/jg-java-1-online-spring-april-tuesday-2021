package students.eriks_jaloveckis.lesson_4.level_2.task_4;
import java.util.Scanner;
class Task4 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.print("Введите первое целое число: ");
        int number1 = scanner1.nextInt();
        System.out.print("Введите второе целое число: ");
        int number2 = scanner2.nextInt();

        if(number1 > number2){
            System.out.println(number1);
        }

        else if (number1 < number2)
            System.out.println(number2);

        else if (number1 == number2){
            System.out.println("Числа равны!");

        }

    }
}
