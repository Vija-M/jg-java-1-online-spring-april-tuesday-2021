package students.dmitrijs_matrenicevs.lesson_4.level_1.task_2;

import java.util.Scanner;

class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Напиши целое чилсо от 1 до 7: ");
        int a = scanner.nextInt();

        if (a == 1){
            System.out.print("Понедельник");
        }

        else if (a == 2){
            System.out.print("Вторник");
        }

        else if (a == 3){
            System.out.print("Среда");
        }

        else if (a == 4){
            System.out.print("Четверг");
        }

        else if (a == 5){
            System.out.print("Пятница");
        }

        else if (a == 6){
            System.out.print("Суббота");
        }

        else if (a == 7){
            System.out.print("Воскресенье");
        }
        else{
            System.out.print("Ошибка, пробуй снова ввести число от 1 до 7");
        }




    }


}
