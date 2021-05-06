package students.antons_korenevskis.lesson_2.level_3;

class Task_10 {

    public static void main(String[] args) {

        final double PI = 3.14159265358979323846;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter radius");
        double r = scanner.nextDouble();

        System.out.println("Radius = " + r );
        System.out.println( );
        System.out.println("Perimeter is = " + (2 * PI * r ));
        System.out.println("Area is = " + (PI *(r * r)));

    }
}