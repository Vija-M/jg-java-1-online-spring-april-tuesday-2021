package students.dmitrijs_matrenicevs.lesson_4.level_2.task_5;

import java.util.Scanner;

class Task5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int a = scanner.nextInt();
        System.out.print("Ввведите второе целое число: ");
        int b = scanner.nextInt();

        if (a > b){
            System.out.print("Число Б: " + b);
        }
        else if (a < b){
            System.out.print("Число А: " + a);
        }
        else {
            System.out.print("Ошибка, пробуй снова!");
        }


    }
}
