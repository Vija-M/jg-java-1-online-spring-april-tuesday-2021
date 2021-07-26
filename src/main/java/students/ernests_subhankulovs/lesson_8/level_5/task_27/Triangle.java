package students.ernests_subhankulovs.lesson_8.level_5.task_27;

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

    @Override
    String calculateArea() {
        return "((3 ^ (1 / 2)) / 4) * (" + side + " ^ 2) = ";
    }

    @Override
    String calculatePerimeter() {
        return "3 * " + side + " = ";
    }
}
