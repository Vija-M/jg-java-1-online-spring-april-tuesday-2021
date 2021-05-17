package students.ernests_subhankulovs.lesson_3.level_5.task_19;

import java.util.Scanner;

class DogDemo {
    public static void main(String[] args) {
        System.out.println("Enter the dog's name:");
        Scanner scanner = new Scanner(System.in);
        String dogsName = scanner.nextLine();
        System.out.println("Enter the dog's age:");
        int dogsAge = scanner.nextInt();

        Dog dog = new Dog(dogsName, dogsAge);
        System.out.println("Before birthday:");
        dog.voice();
        System.out.println(" ");
        dog.happyBirthday();
        System.out.println("After birthday:");
        dog.voice();
    }
}
