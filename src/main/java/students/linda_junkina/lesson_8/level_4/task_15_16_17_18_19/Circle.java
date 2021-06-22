package students.linda_junkina.lesson_8.level_4.task_15_16_17_18_19;

class Circle extends Shape {

    private double radius;
    double pi = 3.14;

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
