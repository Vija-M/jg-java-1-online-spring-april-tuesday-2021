package students.linda_junkina.lesson_8.level_4.task_15_16_17_18_19;

class Rectangle extends Shape {
    int height;
    int width;

    public Rectangle(String title, int height, int width) {
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
