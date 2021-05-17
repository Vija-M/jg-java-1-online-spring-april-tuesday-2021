package students.dmitrijs_matrenicevs.lesson_3.level_5.task_20;

class Dog {

    String name;
    String color;
    int age;

    public Dog(String name, int age, String color) {

        this.name = name;
        this.age = age;
        this.color = color;

    }


    void voice() {

        System.out.println("Её имя: " + this.name);
        System.out.println("Её возраст: " + this.age + " лет");
        System.out.println("Её цвет: " + this.color);
    }

    void happyBirthday() {

        this.age = age + 1;

        System.out.println("И вот днюха настала и теперь тебе " + this.age + " лет");

    }



}