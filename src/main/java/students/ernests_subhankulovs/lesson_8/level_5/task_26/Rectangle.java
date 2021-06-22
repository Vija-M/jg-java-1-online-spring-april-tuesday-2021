package students.ernests_subhankulovs.lesson_8.level_5.task_26;

class Rectangle extends Shape {
    private double width;
    private double height;

    Rectangle(double sideA, double sideB) {
        super("Rectangle");
        this.width = sideA;
        this.height = sideB;
    }

    @Override
    double area() {
        return width * height;
    }

    @Override
    double perimeter() {
        return 2 * (width + height);
    }
}
