package students.dmitriy_shukailo.lesson_2.level_3.task_10;

 public class Circle{

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Please, enter a radius of circle: ");
        double radiusCircle = scanner.nextDouble ();
        double pi = 3.1415926535;
        double perimetrCircle = 2 * pi * radiusCircle;
        double areaCircle = pi * radiusCircle * radiusCircle;

        System.out.println("Perimetr of Circle = " + perimetrCircle);
        System.out.println("Area of Circle = " + areaCircle);

    }

}