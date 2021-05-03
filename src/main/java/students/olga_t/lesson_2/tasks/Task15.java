package students.olga_t.lesson_2.tasks;

class Task15 {
    /*
https://www.w3resource.com/java-exercises/basic/index.php
    15. Write a Java program to swap two variables.
     */

    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        System.out.println("Before swapping : a = " + a + ", b = " + b);
        int c = a;
        a = b;
        b = c;

        System.out.println("After swapping : a = " + a + ", b = " + b);
        }

}
