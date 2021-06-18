package students.linda_junkina.lesson_8.level_3.task_13;

abstract class Student {
    String name;
    String program;
    double gradePointAverage;

    public Student(String name, String program, double gradePointAverage) {
        this.name = name;
        this.program = program;
        this.gradePointAverage = gradePointAverage;
    }
}
