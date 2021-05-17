package students.ernests_subhankulovs.lesson_3.level_5.task_21;

import java.util.Scanner;

class DogDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the dog's name:");
        String dogsName = scanner.nextLine();
        System.out.println("Enter the dog's color:");
        String dogsColor = scanner.nextLine();
        System.out.println("Enter the dog's age:");
        int dogsAge = scanner.nextInt();

        Dog dog = new Dog(dogsName, dogsAge, dogsColor);
        System.out.println(" ");
        System.out.println("Before changing color:");
        System.out.println(" ");
        dog.voice();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Enter the dog's new color:");
        String dogsNewColor = scanner1.nextLine();
        dog.changeColor(dogsNewColor);
        System.out.println(" ");
        System.out.println("After changing color:");
        System.out.println(" ");
        dog.voice();
    }
}
