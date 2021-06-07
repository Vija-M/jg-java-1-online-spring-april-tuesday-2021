package students.olga_saluna.lesson_5.level_2.task_10;

import java.util.Scanner;

class Task10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st integer:  ");
        int firstInt = scanner.nextInt();
        System.out.println("Enter 2nd integer:  ");
        int secondInt = scanner.nextInt();
        System.out.println("Enter 3rd integer:  ");
        int thirdInt = scanner.nextInt();

        int[] numbers = new int[3];

        numbers[0] = firstInt;
        numbers[1] = secondInt;
        numbers[2] = thirdInt;

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
    }
}
