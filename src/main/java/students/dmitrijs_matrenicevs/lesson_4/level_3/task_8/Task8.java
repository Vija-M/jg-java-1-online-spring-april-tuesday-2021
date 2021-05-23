package students.dmitrijs_matrenicevs.lesson_4.level_3.task_8;

import java.util.Scanner;

class Task8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе целое число: ");
        int b = scanner.nextInt();
        System.out.print("Введите трерье целое число: ");
        int c = scanner.nextInt();

        if (a < b && b < c){
            System.out.print("Числа возврастали!");
        }
        else if (a > b && b > c){
            System.out.print("Числа убывали!");
        }
        else {
            System.out.print("Neither!");
        }

    }

}
