package students.olga_t.lesson_2.tasks;

class Task1 {
    /*
    https://www.w3resource.com/java-exercises/basic/index.php
    1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
Expected Output :
Hello
Alexandra Abramov
     */
    public static void main(String[] args) {
        System.out.println("Enter your name and surname.");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String username;

        username = scanner.nextLine();
        System.out.println("Hello");
        System.out.println(username);
    }


}
