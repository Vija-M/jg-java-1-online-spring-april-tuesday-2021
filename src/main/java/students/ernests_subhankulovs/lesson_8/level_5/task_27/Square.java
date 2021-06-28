package students.ernests_subhankulovs.lesson_8.level_5.task_27;

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

    @Override
    String calculateArea() {
        return side + " ^ 2 = ";
    }

    @Override
    String calculatePerimeter() {
        return "4 * " + side + " = ";
    }
}
