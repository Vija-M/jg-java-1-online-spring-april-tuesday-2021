package students.vija_m.lesson_3.level_5.task_20;

class Dog {
    String name;
    int age;
    String colour;

    public Dog(String name, int age, String colour) {
        this.name = name;
        this.age = age;
        this.colour = colour;
    }

    void voice() {
        System.out.println("Dog's name is " + this.name +", dog's age - " + this.age +", dog's colour - " + this.colour +".");
    }


}