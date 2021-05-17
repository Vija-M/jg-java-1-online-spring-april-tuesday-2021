package students.vladimir_aboltins.lesson_2.level_3.task_10;

import java.util.Scanner;
import static java.lang.Math.*;
class CountPerimeterAndArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter circle radius: ");
        if (scanner.hasNextFloat()) {
            float userInput = scanner.nextFloat();
                System.out.println("Perimeter is = " + 2*PI*userInput);
            System.out.println("Area is = " + PI*Math.pow(userInput,2));
        }
    }
}