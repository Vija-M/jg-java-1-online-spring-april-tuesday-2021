package students.eriks_jaloveckis.lesson_4.level_1.task_2;
import java.util.Scanner;
class Week {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число от 1 до 7: ");
        int number = scanner.nextInt();

            if (number == 1){
            System.out.println("Monday!");
            }

            else if (number == 2){
            System.out.println("Tuesday!");
            }

            else if (number == 3){
            System.out.println("Wednesday!");
            }

            else if (number == 4){
                System.out.println("Thursday!");
            }

            else if (number == 5){
                System.out.println("Friday!");
            }

            else if (number == 6){
                System.out.println("Saturday!");
            }

            else if (number == 7){
                System.out.println("Sunday!");
            }

            else if (number > 7 || number < 1){
            System.out.println("Введите правильное число!");
        }



    }
}
