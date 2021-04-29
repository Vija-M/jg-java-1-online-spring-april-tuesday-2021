package students.arturs_arutjunovs.lesson_2.level_3.task_10;

class Radius {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Please enter circle radius: ");
        double radius = scanner.nextDouble();

        double perimeter = radius * (2 * 3.14);
        double area = 3.14 * (radius * radius);

        System.out.println("Perimeter is: " + perimeter);
        System.out.println("Area is: " + area);
    }
}
