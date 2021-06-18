package students.arturs_arutjunovs.lesson_8.level_4.task_16;

class Circle extends Shape {

    private final double radius = 2.5;

    Circle(double radius) {
        super("Circle");
    }

    @Override
    double area() {
        return (radius * radius) * 3.14;
    }

    @Override
    double perimeter() {
        return radius * (2 * 3.14);
    }
}
