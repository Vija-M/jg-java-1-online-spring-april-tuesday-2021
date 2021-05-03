package students.olga_t.lesson_2.tasks;

class Task11 {
    /*
https://www.w3resource.com/java-exercises/basic/index.php
    11. Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
     */

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        double Radius = 7.5;
        double pi = 3.141592653589793238462643;

        System.out.println("Perimeter is = " + 2 * pi * Radius);
        System.out.println("Area is = " + pi * Radius * Radius);
    }
}
