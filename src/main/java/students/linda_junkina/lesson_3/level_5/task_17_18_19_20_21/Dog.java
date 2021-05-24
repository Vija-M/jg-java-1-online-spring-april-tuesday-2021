package students.linda_junkina.lesson_3.level_5.task_17_18_19_20_21;

class Dog {

    String name;
    String colour;
    int age;

    Dog(String name, String colour, int age) {
        this.name = name;
        this.colour = colour;
        this.age = age;
    }
    void voice() {
        System.out.println(name + ", " + name + ", " + name + "!");
        System.out.println("Jack is " + colour);
        System.out.println("Jack is " + age + " years old.");
    }

    void happyBirthday() {
        this.age = this.age + 1;
        System.out.println("Happy Birthday, Jack, you are now " + age + " years old!");
    }

    void changeColour(String newColour) {
        this.colour = newColour;
        System.out.println("Jack is " + newColour + " now");
    }

}




