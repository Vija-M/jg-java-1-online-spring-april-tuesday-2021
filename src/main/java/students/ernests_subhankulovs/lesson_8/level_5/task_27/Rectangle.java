package students.ernests_subhankulovs.lesson_8.level_5.task_27;

class Rectangle extends Shape {
    private double width;
    private double height;

    Rectangle(double width, double height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }

    @Override
    double perimeter() {
        return 2 * (width + height);
    }

    @Override
    String calculateArea() {
        return width + " * " + height + " = ";
    }

    @Override
    String calculatePerimeter() {
        return "2 * (" + width + " + " + height + " = ";
    }
}
