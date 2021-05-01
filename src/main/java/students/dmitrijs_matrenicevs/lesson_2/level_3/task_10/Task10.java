package students.dmitrijs_matrenicevs.lesson_2.level_3.task_10;

class Task10 {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");

        double r = scanner.nextDouble();

        //Площадь
        double rSQR = r * r;
        double S = rSQR * 3.14;

        //Периметр
        double P = r * 3.14 * 2;

        //Площадь
        System.out.println(r + " * " + r + " = " + rSQR);
        System.out.println("Area is = " + rSQR + " * " + 3.14 + " = " + S);

        //Периметр
        System.out.println("Perimeter is = " + r + " * " + 3.14 + " * " + 2 + " = " + P);


    }
}
