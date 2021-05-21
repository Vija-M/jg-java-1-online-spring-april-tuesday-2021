package students.ernests_subhankulovs.lesson_4.level_1._task_2;

import java.util.Scanner;

class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter a number between 1 and 7:");
        Scanner scanner = new Scanner(System.in);
        int numberOfDay = scanner.nextInt();

        switch(numberOfDay) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("The number is out of range.");
        }
    }
}
