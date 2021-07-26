package students.eriks_jaloveckis.lesson_8.level_4.task_19;

class Triangle extends Shape {

    private double x;

    Triangle(double x) {
        super("Triangle");
        this.x = x;
    }

    @Override
    double calculateArea() {
        return (x * calculateHeight()) / 2;
    }

    @Override
    double calculatePerimeter() {
        return 3 * x;
    }

    private double calculateHeight() {
        return (x * Math.sqrt(3)) / 2;
    }
}
