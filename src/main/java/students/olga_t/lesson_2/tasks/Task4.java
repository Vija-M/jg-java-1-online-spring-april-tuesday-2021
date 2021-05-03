package students.olga_t.lesson_2.tasks;

class Task4 {
    /*
https://www.w3resource.com/java-exercises/basic/index.php
    4. Write a Java program to print the result of the following operations.
Test Data:
a. -5 + 8 * 6
b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3
Expected Output :
43
1
19
13
     */

    public static void main(String[] args) {
        int a1 = -5;
        int a2 = 8;
        int a3 = 6;
        int aTotal = a1 + a2 * a3;
        System.out.println(aTotal);

        int b1 = 55;
        int b2 = 9;
        int b3 = 9;
        int bTotal = (b1 + b2) % b3;
        System.out.println(bTotal);

        int c1 = 20;
        int c2 = -3;
        int c3 = 5;
        int c4 = 8;
        int cTotal = c1 + c2 * c3 / c4;
        System.out.println(cTotal);

        int d1 = 5;
        int d2 = 15;
        int d3 = 3;
        int d4 = 2;
        int d5 = 8;
        int d6 = 3;
        int dTotal = d1 + d2 / d3 * d4 - d5 % d6;
        System.out.println(dTotal);

    }
}
