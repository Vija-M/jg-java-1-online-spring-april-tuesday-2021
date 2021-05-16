package students.dmitriy_shukailo.lesson_3.level_2.task_9;

class StringTest {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Please, enter your name: ");
        String myName = scanner.nextLine();

        String greeting = "Hi " + myName + "!";
        System.out.println(greeting);
    }
}
