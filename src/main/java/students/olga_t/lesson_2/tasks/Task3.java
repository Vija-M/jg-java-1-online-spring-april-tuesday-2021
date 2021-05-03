package students.olga_t.lesson_2.tasks;

class Task3 {
    /*
https://www.w3resource.com/java-exercises/basic/index.php
    3. Write a Java program to divide two numbers and print on the screen.
Test Data :
50/3
Expected Output :
16
     */

    public static void main(String[] args) {
        System.out.println("Enter the first number");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int InputNumber1 = scanner.nextInt();

        System.out.println("Enter the second number");
        int InputNumber2 = scanner.nextInt();
        System.out.println("The division of the first and of the second numbers is: " + InputNumber1 / InputNumber2);
    }

}
