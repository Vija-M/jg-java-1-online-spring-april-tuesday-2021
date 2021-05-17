package students.ernests_subhankulovs.lesson_3.level_5.task_20;

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
        System.out.println("Before birthday:");
        dog.voice();
        System.out.println(" ");
        dog.happyBirthday();
        System.out.println("After birthday:");
        dog.voice();
    }
}
