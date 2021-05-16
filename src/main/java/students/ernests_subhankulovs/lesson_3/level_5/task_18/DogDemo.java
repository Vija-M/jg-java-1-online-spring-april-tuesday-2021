package students.ernests_subhankulovs.lesson_3.level_5.task_18;

import java.util.Scanner;

class DogDemo {
    public static void main(String[] args) {
        System.out.println("Enter the dog's name:");
        Scanner scanner = new Scanner(System.in);
        String dogsName = scanner.nextLine();
        System.out.println("Enter the dog's age:");
        int dogsAge = scanner.nextInt();

        Dog dog = new Dog(dogsName, dogsAge);
        dog.voice();
    }
}
