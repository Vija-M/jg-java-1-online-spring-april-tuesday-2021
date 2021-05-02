package students.olga_t.lesson_2.tasks;

class Task6 {
    /*
https://www.w3resource.com/java-exercises/basic/index.php
    6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
     */

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Input first number: ");
        int FirstNumber = scanner.nextInt();

        System.out.println("Input second number: ");
        int SecondNumber = scanner.nextInt();

        int sum = FirstNumber + SecondNumber;
        int sub = FirstNumber - SecondNumber;
        int mul = FirstNumber * SecondNumber;
        int div = FirstNumber / SecondNumber;
        int rem = FirstNumber % SecondNumber;

        System.out.println(FirstNumber + " + " + SecondNumber + " = " + sum);
        System.out.println(FirstNumber + " - " + SecondNumber + " = " + sub);
        System.out.println(FirstNumber + " x " + SecondNumber + " = " + mul);
        System.out.println(FirstNumber + " / " + SecondNumber + " = " + div);
        System.out.println(FirstNumber + " mod " + SecondNumber + " = " + rem);
    }
}
