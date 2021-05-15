package students.arturs_arutjunovs.lesson_3.level_7.task_27;

import java.util.Scanner;

public class Circle {

    public Circle() {
    }
    double calculateArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter circle radius: ");
        double radius = scanner.nextDouble();

        double circleArea = 3.14 * (radius * radius);
        return circleArea;
    }
}

 class CircleDemo {
     public static void main(String[] args) {

         Circle circle = new Circle();
         System.out.println(circle.calculateArea());
     }
 }