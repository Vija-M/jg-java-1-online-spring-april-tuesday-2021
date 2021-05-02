package students.eriks_jaloveckis.lesson_2.level_3.task_10;

class Circle {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Введите радиус круга: ");
        double radius = scanner.nextDouble();

        double area = (radius * radius) * 3.14;
        double perimeter = 2 * 3.14 * radius;

        System.out.println("Периметр круга = " + perimeter);
        System.out.println("Площадь круга = " + area);

    }



}
