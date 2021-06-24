package students.dmitrijs_matrenicevs.lesson_8.level_4.task_16;

class Circle extends Shape {

    private final double radius;

    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return radius * radius * 3.14;
    }

    @Override
    double calculatePerimeter() {
        return radius * 3.14 * 2;
    }
}
