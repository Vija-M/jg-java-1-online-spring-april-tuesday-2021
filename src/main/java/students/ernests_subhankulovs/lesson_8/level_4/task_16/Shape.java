package students.ernests_subhankulovs.lesson_8.level_4.task_16;

abstract class Shape {
    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double area();
    abstract double perimeter();
}
