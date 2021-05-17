package students.ernests_subhankulovs.lesson_3.level_7.task_26;

import java.util.Scanner;

class AirplaneDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the departure airport name:");
        String startingPoint = scanner.nextLine();
        System.out.println("Enter the destination airport name:");
        String destinationPoint = scanner.nextLine();

        Airplane airplane = new Airplane(startingPoint, destinationPoint);
        System.out.println(" ");
        airplane.takeOff();
        System.out.println(" ");
        airplane.fly();
        System.out.println(" ");
        airplane.land();
    }
}
