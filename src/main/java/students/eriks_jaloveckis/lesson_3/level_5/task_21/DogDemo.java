package students.eriks_jaloveckis.lesson_3.level_5.task_21;
import java.util.Scanner;

class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Kuzja", 4, "Black");

        dog.voice();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new colour: ");
        String newColour = scanner.nextLine();
        dog.changeColor(newColour);
        dog.voice();


    }
}
