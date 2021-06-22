package students.ernests_subhankulovs.lesson_8.level_2.task_7;

public class Employee extends Person {
    String position;
    double salary;

    public Employee(String firstName, String lastName, int age, String position, double salary) {
        super(firstName, lastName, age);
        this.position = position;
        this.salary = salary;
    }
}
