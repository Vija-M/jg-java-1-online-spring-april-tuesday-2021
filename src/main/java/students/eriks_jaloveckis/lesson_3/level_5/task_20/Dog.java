package students.eriks_jaloveckis.lesson_3.level_5.task_20;

class Dog {
    String name;
    int age;
    String colour;


    Dog(String name, int age, String colour) {
        this.name = name;
        this.age = age;
        this.colour = colour;
    }

    void voice(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(colour);
    }
}

