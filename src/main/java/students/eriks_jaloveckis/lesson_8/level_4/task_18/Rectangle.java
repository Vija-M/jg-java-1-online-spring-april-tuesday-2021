package students.eriks_jaloveckis.lesson_8.level_4.task_18;

class Rectangle extends Shape {

    private double x;
    private double y;

    public Rectangle(double x, double y) {
        super("Rectangle");
        this.x = x;
        this.y = y;
    }

    @Override
    double calculateArea() {
        return x * y;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (x + y);
    }
}
