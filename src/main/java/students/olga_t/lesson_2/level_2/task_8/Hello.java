package students.olga_t.lesson_2.level_2.task_8;

class Hello {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String userName;

        // Enter username and press Enter
        System.out.println("Enter your name and press Enter");
        userName = scanner.nextLine();

        System.out.println("Hello, " + userName + "! ");

    }
}
