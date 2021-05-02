package students.olga_t.lesson_2.tasks;

class Task13 {
    /*
https://www.w3resource.com/java-exercises/basic/index.php
    13. Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5

Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
     */

    public static void main(String[] args) {
        double Width = 5.6; //They have a mistake here(not 5.5, but 5.6), because in the Expected Output there are another datas
        double Height = 8.5;
        System.out.println("Area is " + Width + " * " + Height + " = " + Width * Height);
        System.out.println("Perimeter is 2 * (" + Width + " + " + Height + ") = " + 2 * (Width + Height));
/*
Area is 5.6 * 8.5 = 47.599999999999994
Perimeter is 2 * (5.6 + 8.5) = 28.2
В этос примере такой результат. Как выводить результат как функция Round в Excel?
 */
    }
}
