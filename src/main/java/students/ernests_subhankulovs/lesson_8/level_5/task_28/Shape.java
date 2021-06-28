package students.ernests_subhankulovs.lesson_8.level_5.task_28;

abstract class Shape {
    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double area();
    abstract double perimeter();

    abstract String calculateArea();
    abstract String calculatePerimeter();
}
