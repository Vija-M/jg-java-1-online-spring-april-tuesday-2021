package students.dmitrijs_matrenicevs.lesson_3.level_5.task_18;

class Dog {


    String name;
    int age;

    public Dog(String name, int age) {

        this.name = name;
        this.age = age;


    }


    void voice() {

        System.out.println("Её имя: " + this.name);
        System.out.println("Ее возраст: " + this.age + " лет");

    }


}
