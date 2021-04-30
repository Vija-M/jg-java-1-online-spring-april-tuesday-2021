package students.ernests_subhankulovs.lesson_2.level_3.task_10;

class Task10 {
    public static void main(String[] args) {
        double perimeter, area;
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter radius:");
        double radius = scanner.nextDouble();

        perimeter = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);

        System.out.println("Radius = " + radius);
        System.out.println("");
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);

    }
}
