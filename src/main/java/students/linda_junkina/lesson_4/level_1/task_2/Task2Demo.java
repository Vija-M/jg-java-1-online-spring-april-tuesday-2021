package students.linda_junkina.lesson_4.level_1.task_2;

import java.util.Scanner;
class Task2Demo {
public static void main (String [] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please, enter a number: ");
    int number = scanner.nextInt();

    if (number == 1){
        System.out.println("Monday");
    }
    if (number == 2){
        System.out.println("Tuesday");
    }
    if (number == 3){
        System.out.println("Wednesday");
    }
    if (number == 4){
        System.out.println("Thursday");
    }
    if (number == 5){
        System.out.println("Friday");
    }
    if (number == 6){
        System.out.println("Saturday");
    }
    if (number == 7){
        System.out.println("Sunday");
    }
}

}
