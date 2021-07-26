package students.linda_junkina.lesson_8.level_5.task_20_21_22_23_24_25_26_27_28;


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
