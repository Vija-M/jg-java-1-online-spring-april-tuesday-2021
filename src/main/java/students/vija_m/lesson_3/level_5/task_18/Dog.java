package students.vija_m.lesson_3.level_5.task_18;

class Dog {
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void voice() {
        System.out.println(this.name +", " + this.age +"." );
    }}