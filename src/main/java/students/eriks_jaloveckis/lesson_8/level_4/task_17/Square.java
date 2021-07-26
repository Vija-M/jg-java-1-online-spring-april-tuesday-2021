package students.eriks_jaloveckis.lesson_8.level_4.task_17;

public class Square extends Shape {

    private double x;

    public Square(double x) {
        super("Square");
        this.x = x;
    }

    @Override
    double calculateArea() {
        return x * x;
    }

    @Override
    double calculatePerimeter() {
        return x + x + x + x;
    }
}
