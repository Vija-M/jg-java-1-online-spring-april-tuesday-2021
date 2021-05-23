package students.eriks_jaloveckis.lesson_4.level_3.task_9;
import java.util.Scanner;
class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();
        System.out.print("Enter third number: ");
        int thirdNumber = scanner.nextInt();

        if (firstNumber > secondNumber || firstNumber >= secondNumber && firstNumber > thirdNumber || firstNumber >= thirdNumber ){
            System.out.println("Наобильшое число: " + firstNumber);
        }
        else if (secondNumber > firstNumber || secondNumber >= firstNumber && secondNumber > thirdNumber || secondNumber >= thirdNumber){
            System.out.println("Наибольшое число: " + secondNumber);
        }
        else {
            System.out.println("Наибольшое число: " + thirdNumber);
        }
    }
}
