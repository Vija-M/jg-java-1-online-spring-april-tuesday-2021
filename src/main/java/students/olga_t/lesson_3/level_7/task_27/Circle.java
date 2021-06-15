package students.olga_t.lesson_3.level_7.task_27;

class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        double circleArea = 3.14159265 * this.radius * this.radius;
        return circleArea;

    }

}
