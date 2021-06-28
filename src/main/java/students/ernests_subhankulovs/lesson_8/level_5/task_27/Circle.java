package students.ernests_subhankulovs.lesson_8.level_5.task_27;

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    String calculateArea() {
        return "Pi * (" + radius + " ^ 2) = ";
    }

    @Override
    String calculatePerimeter() {
        return "2 * Pi * " + radius + " = ";
    }
}
