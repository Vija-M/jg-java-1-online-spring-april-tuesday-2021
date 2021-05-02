package students.olga_t.lesson_2.tasks;

class Task5 {
    /*
https://www.w3resource.com/java-exercises/basic/index.php
    5. Write a Java program that takes two numbers as input and display the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125
     */

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Input first number: ");
        int FirstNumber = scanner.nextInt();

        System.out.println("Input second number: ");
        int SecondNumber = scanner.nextInt();

        System.out.println("The result of multiplication is: " + FirstNumber * SecondNumber);

    }

}
