package students.vija_m.lesson_8.level_4.task_16;

class Circle extends Shape {

    private double radius;

    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return 3.14 * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * 3.14 * radius;
    }
}
