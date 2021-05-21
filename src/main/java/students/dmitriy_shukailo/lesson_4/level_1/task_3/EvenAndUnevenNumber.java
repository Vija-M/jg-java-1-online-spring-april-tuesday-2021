package students.dmitriy_shukailo.lesson_4.level_1.task_3;

import java.util.Scanner;

class EvenAndUnevenNumber {

    public static void main(String[] args) {

        int x;

        System.out.print("Enter a Number: ");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        x = number % 2;

        if (x > 0) {
            System.out.println("Number = " + number + " and it's uneven");
        } else {
            System.out.println("Number = " + number + " and it's even");
        }
    }
}