package students.ernests_subhankulovs.lesson_8.level_5.task_23;

class Triangle extends Shape {
    private double side;

    Triangle(double side) {
        super("Triangle");
        this.side = side;
    }

    @Override
    double area() {
        return (Math.sqrt(3) / 4) * Math.pow(side, 2);
    }

    @Override
    double perimeter() {
        return 3 * side;
    }
}
