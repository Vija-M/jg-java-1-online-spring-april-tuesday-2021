package students.eriks_jaloveckis.lesson_8.level_4.task_16;

class Circle extends Shape {

    private double radius;

    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return (radius * radius) * Math.PI;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
