package students.vija_m.lesson_8.level_5.task_20_21_22_23_24_25;

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
