package students.linda_junkina.lesson_4.level_1.task_1;

import java.util.Scanner;

class Task1Demo {

        public static void main (String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please, enter a number: ");
            int number = scanner.nextInt();

            if (number > 0){
                System.out.println("Your number is positive");
            }
            if (number < 0){
                System.out.println("Your number is negative");
            }
            if (number == 0){
                System.out.println("Your number is 0");
            }

        }
    }

