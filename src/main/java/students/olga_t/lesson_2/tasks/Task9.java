package students.olga_t.lesson_2.tasks;

class Task9 {
    /*
https://www.w3resource.com/java-exercises/basic/index.php
    9. Write a Java program to compute the specified expressions and print the output.
Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
Expected Output
2.138888888888889
     */

    public static void main(String[] args) {
        double x1 = 25.5;
        double x2 = 3.5;
        double x3 = 3.5;
        double x4 = 3.5;
        double x5 = 40.5;
        double x6 = 4.5;
        double result = ((x1 * x2 - x3 * x4) / (x5 - x6));
        System.out.println(result);
    }
}
