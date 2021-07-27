package students.linda_junkina.lesson_8.level_5.task_20_21_22_23_24_25_26_27_28;

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
