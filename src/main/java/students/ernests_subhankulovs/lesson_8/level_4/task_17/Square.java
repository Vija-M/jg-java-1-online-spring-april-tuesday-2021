package students.ernests_subhankulovs.lesson_8.level_4.task_17;

class Square extends Shape {
    private double side;

    Square(double side) {
        super("Square");
        this.side = side;
    }

    @Override
    double area() {
        return Math.pow(side, 2);
    }

    @Override
    double perimeter() {
        return 4 * side;
    }
}
