package students.dmitrijs_matrenicevs.lesson_8.level_4.task_17;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();

}
