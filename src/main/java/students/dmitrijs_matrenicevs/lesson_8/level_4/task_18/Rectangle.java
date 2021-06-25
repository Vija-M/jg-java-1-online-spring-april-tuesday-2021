package students.dmitrijs_matrenicevs.lesson_8.level_4.task_18;

class Rectangle extends Shape {

    double breadth;
    double height;

    public Rectangle(double breadth, double height){
        super("Rectangle");
        this.breadth = breadth;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return breadth * height;
    }

    @Override
    double calculatePerimeter() {
        return (breadth + height) * 2;
    }
}
