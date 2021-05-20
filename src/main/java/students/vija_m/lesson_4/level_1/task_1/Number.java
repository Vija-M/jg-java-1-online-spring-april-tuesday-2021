package students.vija_m.lesson_4.level_1.task_1;
import java.util.Scanner;
class Number {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите целое число.");
        int a = scanner.nextInt();
        {
            if (a > 0) {
                System.out.println("Число " + a + " положительное");
            } else if (a < 0) {
                System.out.println("Число " + a + " отрицательное");
            } else {
                System.out.println("Число " + a + " равно нулю");
            }
        }
    }}


