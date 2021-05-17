package students.ernests_subhankulovs.lesson_3.level_7.task_27;

import java.util.Scanner;

class CircleDemo {
    public static void main(String[] args) {
        System.out.println("Calculating area of a circle.");
        System.out.println("Enter radius of the circle:");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("Area = " + circle.calculateArea());
    }
}
