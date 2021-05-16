package students.ernests_subhankulovs.lesson_3.level_5.task_17;

import java.util.Scanner;

class DogDemo {
    public static void main(String[] args) {
        System.out.println("Enter the dog's name:");
        Scanner scanner = new Scanner(System.in);
        String dogsName = scanner.nextLine();

        Dog dog = new Dog(dogsName);
        System.out.println("The dog's name 3 times:");
        dog.voice();
    }
}
