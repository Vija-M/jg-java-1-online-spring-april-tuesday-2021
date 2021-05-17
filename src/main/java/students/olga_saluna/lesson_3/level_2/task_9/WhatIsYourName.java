

package students.olga_saluna.lesson_3.level_2.task_9;

import java.util.Scanner;

class WhatIsYourName {

    public static void main(String[] args) {

        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.printf("Your name is " + userName + "!");
    }
}
