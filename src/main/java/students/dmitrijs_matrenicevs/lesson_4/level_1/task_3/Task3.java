package students.dmitrijs_matrenicevs.lesson_4.level_1.task_3;

import java.util.Scanner;

class Task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Напиши целое число: ");
        int a = scanner.nextInt();

        if (a % 2 == 1){
            System.out.print("Твоё чилсо " + a + " нечётное");
        }


    }


}
