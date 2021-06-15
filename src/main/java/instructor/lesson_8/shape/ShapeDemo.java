package instructor.lesson_8.shape;

class ShapeDemo {

    public static void main(String[] args) {

        Square square = new Square("White", "White", 5);
        System.out.println("square.area() = " + square.area());

        Rectangle rectangle = new Rectangle("Red", "Black", 3, 7);
        System.out.println("rectangle.area() = " + rectangle.area());

        Shape something = new Square("White", "White", 5);

        Shape[] shapes = {
                new Square("Green", "Blue", 1),
                new Square("Red", "Yellow", 2),
                new Square("Pink", "Black", 4),
                new Rectangle("Black", "White", 4, 5),
                new Rectangle("Yellow", "Orange", 4, 5),
                new Rectangle("Blue", "Brown", 4, 5)
        };

        for (Shape shape : shapes) {
            printArea(shape);
        }
    }

    public static void printArea(Shape shape) {
        System.out.println(shape.name() + " 👉 " + shape.area());
    }
}
