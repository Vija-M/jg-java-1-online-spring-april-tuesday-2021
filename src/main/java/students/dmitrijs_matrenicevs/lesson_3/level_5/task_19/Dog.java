package students.dmitrijs_matrenicevs.lesson_3.level_5.task_19;

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

    void happyBirthday() {

        this.age = age + 1;

        System.out.println("И вот днюха настала и теперь тебе " + this.age + " лет");

    }


}
