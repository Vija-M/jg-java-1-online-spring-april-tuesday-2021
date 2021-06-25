package students.dmitrijs_matrenicevs.lesson_8.level_4.task_19;

class Triangle extends Shape {

    private final double side;

    public Triangle(double side) {
        super("Triangle");
        this.side = side;
    }

    @Override
    double calculateArea() {
        return (Math.sqrt(3) / 4) * side * side;
    }

    @Override
    double calculatePerimeter() {
        return side * 3;
    }
}
