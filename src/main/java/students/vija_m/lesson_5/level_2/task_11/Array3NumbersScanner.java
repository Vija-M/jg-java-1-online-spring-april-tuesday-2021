package students.vija_m.lesson_5.level_2.task_11;
import java.util.Scanner;
class Array3NumbersScanner {

    public static void main(String[] args) {
        int[] numbers  = new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter 3 numbers.");

        numbers[0] = scanner.nextInt();
        numbers[1] = scanner.nextInt();
        numbers[2] = scanner.nextInt();

        System.out.println("1st numbers = " + numbers[0]);
        System.out.println("2nd numbers = " + numbers[1]);
        System.out.println("3rd numbers = " + numbers[2]);


    }

}
