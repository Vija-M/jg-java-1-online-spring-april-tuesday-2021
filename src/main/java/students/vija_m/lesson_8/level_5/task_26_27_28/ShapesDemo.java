package students.vija_m.lesson_8.level_5.task_26_27_28;

class ShapesDemo {
    public static void main(String[] args) {
        Shapes shapes = new Shapes();

        Shape circle = shapes.createRandomCircle();
        double circleArea = shapes.area(circle);
        double circlePerimeter = shapes.perimeter(circle);
        System.out.println("Our circle perimeter = " + circlePerimeter);
        System.out.println("Our circle area = " + circleArea);
        System.out.println("");

        Shape square = shapes.createRandomSquare();
        double squareArea = shapes.area(square);
        double squarePerimeter = shapes.perimeter(square);
        System.out.println("Our square perimeter = " + squarePerimeter);
        System.out.println("Our square area = " + squareArea);
        System.out.println("");

        Shape rectangle = shapes.createRandomRectangle();
        double rectangleArea = shapes.area(rectangle);
        double rectanglePerimeter = shapes.perimeter(rectangle);
        System.out.println("Our rectangle perimeter = " + rectanglePerimeter);
        System.out.println("Our rectangle area = " + rectangleArea);
        System.out.println("");

        Shape triangle = shapes.createRandomTriangle();
        double triangleArea = shapes.area(triangle);
        double trianglePerimeter = shapes.perimeter(triangle);
        System.out.println("Our triangle perimeter = " + trianglePerimeter);
        System.out.println("Our triangle area = " + triangleArea);

    }
}
