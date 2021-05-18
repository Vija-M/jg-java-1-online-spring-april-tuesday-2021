package students.vladimir_aboltins.lesson_2.level_3.task_9;

import java.util.Scanner;

class MultiplyOnAnyIntNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter integer number: ");
        if (scanner.hasNextInt()){int userInput = scanner.nextInt();
            for(int counter = 1; counter != 11; counter++) {
                System.out.println(userInput+" * "+ counter +" = "+ userInput*counter);
            }
        }
    }
}
