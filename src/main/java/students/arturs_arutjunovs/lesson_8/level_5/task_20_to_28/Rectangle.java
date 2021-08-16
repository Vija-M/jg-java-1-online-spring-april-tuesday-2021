package students.arturs_arutjunovs.lesson_8.level_5.task_20_to_28;

class Rectangle extends Shape {

    private int height;
    private int width;

    public Rectangle(int height, int width) {
        super("Rectangle");
        this.height = height;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return height * width;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (height + width);
    }
}
