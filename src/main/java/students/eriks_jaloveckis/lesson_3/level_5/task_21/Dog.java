package students.eriks_jaloveckis.lesson_3.level_5.task_21;

public class Dog {
    String name;
    int age;
    String colour;
    String newColour;

    Dog(String name, int age, String colour){
        this.name = name;
        this.age = age;
        this.colour = colour;

    }

    void voice() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(colour);

    }

    void changeColor(String newColour){
        colour = newColour;
    }



    }
