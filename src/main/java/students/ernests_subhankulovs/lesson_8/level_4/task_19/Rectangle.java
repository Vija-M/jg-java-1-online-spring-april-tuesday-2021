package students.ernests_subhankulovs.lesson_8.level_4.task_19;

class Rectangle extends Shape {
    private double sideA;
    private double sideB;

    Rectangle(double sideA, double sideB) {
        super("Rectangle");
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    double area() {
        return sideA * sideB;
    }

    @Override
    double perimeter() {
        return 2 * (sideA + sideB);
    }
}
