package students.olga_t.lesson_2.tasks;

class Task7 {

    /*
https://www.w3resource.com/java-exercises/basic/index.php
    7. Write a Java program that takes a number as input and prints its multiplication table upto 10.
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
     */

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Input a number: ");
        int Number = scanner.nextInt();

        System.out.println(Number + " x 1 = " + Number * 1);
        System.out.println(Number + " x 2 = " + Number * 2);
        System.out.println(Number + " x 3 = " + Number * 3);
        System.out.println(Number + " x 4 = " + Number * 4);
        System.out.println(Number + " x 5 = " + Number * 5);
        System.out.println(Number + " x 6 = " + Number * 6);
        System.out.println(Number + " x 7 = " + Number * 7);
        System.out.println(Number + " x 8 = " + Number * 8);
        System.out.println(Number + " x 9 = " + Number * 9);
        System.out.println(Number + " x 10 = " + Number * 10);

    }

}
