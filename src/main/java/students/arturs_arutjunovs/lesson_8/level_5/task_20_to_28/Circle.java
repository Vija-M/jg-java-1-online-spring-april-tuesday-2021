package students.arturs_arutjunovs.lesson_8.level_5.task_20_to_28;

class Circle extends Shape {

    private double radius;
    private static final double pi = 3.14;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return pi * (radius * radius);
    }

    @Override
    double calculatePerimeter() {
        return pi * 2 * radius;
    }
}
