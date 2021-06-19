package students.arturs_arutjunovs.lesson_8.level_4.task_16;

class Circle extends Shape {

    private double radius;

    Circle(double radius) {
        super("Circle");
        this.radius = radius;
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
