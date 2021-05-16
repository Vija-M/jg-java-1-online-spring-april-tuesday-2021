package students.olga_t.lesson_3.level_2.tasks_7_9;
import java.util.Scanner;

class MyName {
    public static void main(String[] args) {
        String myName = "Olga";
        System.out.println(myName);
        String greeting = "Hi, " + myName + "!";
        System.out.println(greeting);

        System.out.println("Please, enter your name:");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
    }
    

    
}
