package students.eriks_jaloveckis.lesson_4.level_3.task_8;
import java.util.Scanner;
class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();
        System.out.print("Enter third number: ");
        int thirdNumber = scanner.nextInt();

        if (firstNumber < secondNumber && secondNumber < thirdNumber){
            System.out.println("increasing");
        }
        else if (firstNumber > secondNumber && secondNumber > thirdNumber){
            System.out.println("decreasing");
        }

        else {
            System.out.println("neither");
        }
    }
}
