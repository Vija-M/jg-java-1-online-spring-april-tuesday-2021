package students.olga_t.lesson_2.tasks;

class Task10 {
    /*
https://www.w3resource.com/java-exercises/basic/index.php
    10. Write a Java program to compute a specified formula.
Specified Formula :
4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
Expected Output
2.9760461760461765
     */

    public static void main(String[] args) {
        double x1 = 4;
        double x2 = 1;
        double x3 = 1;
        double x4 = 3;
        double x5 = 1;
        double x6 = 5;
        double x7 = 1;
        double x8 = 7;
        double x9 = 1;
        double x10 = 9;
        double x11 = 1;
        double x12 = 11;
        double result = x1 * (x2 - (x3/x4) + (x5/x6) - (x7/x8) + (x9/x10) - (x11/x12));
        System.out.println(result);
    }
}
