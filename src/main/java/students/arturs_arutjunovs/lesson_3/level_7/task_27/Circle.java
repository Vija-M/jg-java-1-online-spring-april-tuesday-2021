package students.arturs_arutjunovs.lesson_3.level_7.task_27;

class Circle {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return 3.14 * (radius * radius);
    }
}

class CircleDemo {
    public static void main(String[] args) {

        Circle circle = new Circle(4.3);
        System.out.println(circle.calculateArea());

    }
}