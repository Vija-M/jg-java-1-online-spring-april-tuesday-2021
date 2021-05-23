package students.dmitrijs_matrenicevs.lesson_4.level_2.task_4;

import java.util.Scanner;

class Task4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи первое целое число: ");
        int a = scanner.nextInt();
        System.out.print("Введи второе целое чилсо: ");
        int b = scanner.nextInt();

        if (a > b){
            System.out.print("Первое число " + a + " больше второго");
        }
        else if (a < b){
            System.out.print("Второе число " + b + " больше первого");
        }
        else {
            System.out.print("Ошибка, пробуй снова!");
        }


    }

}
