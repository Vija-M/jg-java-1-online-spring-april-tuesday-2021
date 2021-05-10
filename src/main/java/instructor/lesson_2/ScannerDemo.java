package instructor.lesson_2;

public class ScannerDemo {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Please, enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Please, enter your age: ");
        int enteredAge = scanner.nextInt();
        int ageNextYear = enteredAge + 1;

        System.out.println("Your name is " + name + " and your age next year will be " + ageNextYear);

    }
}
