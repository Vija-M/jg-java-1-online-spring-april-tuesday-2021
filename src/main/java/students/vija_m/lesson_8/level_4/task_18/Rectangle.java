package students.vija_m.lesson_8.level_4.task_18;

class Rectangle extends Shape {

    private double sideA;
    private double sideB;

    Rectangle(double sideA, double sideB) {
        super("Rectangle");
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    double calculateArea() {
        return sideA * sideB;
    }

    @Override
    double calculatePerimeter() {
        return 2 * ( sideA + sideB );
    }
}
