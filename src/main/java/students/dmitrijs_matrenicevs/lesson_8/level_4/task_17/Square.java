package students.dmitrijs_matrenicevs.lesson_8.level_4.task_17;

class Square extends Shape {

    private final double part;

    public Square(double part) {
        super("part");
        this.part = part;
    }

    @Override
    double calculateArea() {
        return part * part;
    }

    @Override
    double calculatePerimeter() {
        return part * 4;
    }
}
