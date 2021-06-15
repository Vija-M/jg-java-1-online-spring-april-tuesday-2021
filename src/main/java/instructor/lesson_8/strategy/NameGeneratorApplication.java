package instructor.lesson_8.strategy;

import java.util.Random;
import java.util.Scanner;

class NameGeneratorApplication {

    public static void main(String[] args) {

        NameGenerator generator = promptUser();
        System.out.println("Your random name is: " + generator.next());

    }

    private static NameGenerator promptUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, select gender (m - male, f - female): ");
        String gender = scanner.nextLine();

        Random random = new Random();

        return switch (gender) {
            case "m" -> new MaleNameGenerator(random);
            case "f" -> new FemaleNameGenerator(random);
            default -> new NoopNameGenerator(random);
        };
    }
}
