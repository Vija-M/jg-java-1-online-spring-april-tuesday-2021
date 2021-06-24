package students.dmitriy_shukailo.lesson_8.level_3.task_13;

abstract class Child {

    private String name;
    private int age;

    Child(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void hobby();

}